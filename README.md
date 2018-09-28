# Servlets and JSP

## HTTP 2.0

To enable HTTP 2.0 add the following configuration to Tomcat server.xml:

```
<Connector 
  port="8443"
  protocol="org.apache.coyote.http11.Http11AprProtocol"
  maxThreads="150" 
  SSLEnabled="true"
>
    <UpgradeProtocol className="org.apache.coyote.http2.Http2Protocol"/>
    <SSLHostConfig honorCipherOrder="false">
        <Certificate 
          certificateKeyFile="path/to/cert.key"
          certificateFile="path/to/cert.crt"
        />
    </SSLHostConfig>
</Connector>
```
