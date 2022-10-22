package typingsJapgolly.soap

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.soap.libSecurityWssecurityMod.IWSSecurityOptions
import typingsJapgolly.soap.libSecurityWssecuritycertMod.IWSSecurityCertOptions
import typingsJapgolly.soap.libServerMod.ServerType
import typingsJapgolly.soap.libTypesMod.IOptions
import typingsJapgolly.soap.libTypesMod.IServerOptions
import typingsJapgolly.soap.libTypesMod.IServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("soap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("soap", "BasicAuthSecurity")
  @js.native
  open class BasicAuthSecurity protected ()
    extends typingsJapgolly.soap.libSecurityMod.BasicAuthSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: Any) = this()
  }
  
  @JSImport("soap", "BearerSecurity")
  @js.native
  open class BearerSecurity protected ()
    extends typingsJapgolly.soap.libSecurityMod.BearerSecurity {
    def this(token: String) = this()
    def this(token: String, defaults: Any) = this()
  }
  
  @JSImport("soap", "Client")
  @js.native
  open class Client protected ()
    extends typingsJapgolly.soap.libClientMod.Client {
    def this(wsdl: typingsJapgolly.soap.libWsdlMod.WSDL) = this()
    def this(wsdl: typingsJapgolly.soap.libWsdlMod.WSDL, endpoint: String) = this()
    def this(wsdl: typingsJapgolly.soap.libWsdlMod.WSDL, endpoint: String, options: IOptions) = this()
    def this(wsdl: typingsJapgolly.soap.libWsdlMod.WSDL, endpoint: Unit, options: IOptions) = this()
  }
  
  @JSImport("soap", "ClientSSLSecurity")
  @js.native
  open class ClientSSLSecurity protected ()
    extends typingsJapgolly.soap.libSecurityMod.ClientSSLSecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, ca: String) = this()
    def this(key: String, cert: String, ca: js.Array[Any]) = this()
    def this(key: String, cert: String, ca: Any) = this()
    def this(key: String, cert: String, ca: Buffer) = this()
    def this(key: String, cert: Buffer, ca: String) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: String, cert: Buffer, ca: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer) = this()
    def this(key: Buffer, cert: String, ca: String) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: String, ca: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer) = this()
    def this(key: Buffer, cert: Buffer, ca: String) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: Buffer, ca: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
    def this(key: String, cert: String, ca: String, defaults: Any) = this()
    def this(key: String, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: String, ca: Any, defaults: Any) = this()
    def this(key: String, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: Any) = this()
  }
  
  @JSImport("soap", "ClientSSLSecurityPFX")
  @js.native
  open class ClientSSLSecurityPFX protected ()
    extends typingsJapgolly.soap.libSecurityMod.ClientSSLSecurityPFX {
    def this(pfx: String) = this()
    def this(pfx: Buffer) = this()
    def this(pfx: String, defaults: Any) = this()
    def this(pfx: String, passphrase: String) = this()
    def this(pfx: Buffer, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String) = this()
    def this(pfx: String, passphrase: String, defaults: Any) = this()
    def this(pfx: Buffer, passphrase: String, defaults: Any) = this()
  }
  
  @JSImport("soap", "HttpClient")
  @js.native
  open class HttpClient ()
    extends typingsJapgolly.soap.libHttpMod.HttpClient {
    def this(options: IOptions) = this()
  }
  
  @JSImport("soap", "NTLMSecurity")
  @js.native
  open class NTLMSecurity protected ()
    extends typingsJapgolly.soap.libSecurityMod.NTLMSecurity {
    def this(defaults: Any) = this()
  }
  
  @JSImport("soap", "Server")
  @js.native
  open class Server protected ()
    extends typingsJapgolly.soap.libServerMod.Server {
    def this(server: ServerType, path: String, services: IServices, wsdl: typingsJapgolly.soap.libWsdlMod.WSDL) = this()
    def this(
      server: ServerType,
      path: js.RegExp,
      services: IServices,
      wsdl: typingsJapgolly.soap.libWsdlMod.WSDL
    ) = this()
    def this(
      server: ServerType,
      path: String,
      services: IServices,
      wsdl: typingsJapgolly.soap.libWsdlMod.WSDL,
      options: IServerOptions
    ) = this()
    def this(
      server: ServerType,
      path: js.RegExp,
      services: IServices,
      wsdl: typingsJapgolly.soap.libWsdlMod.WSDL,
      options: IServerOptions
    ) = this()
  }
  
  @JSImport("soap", "WSDL")
  @js.native
  open class WSDL protected ()
    extends typingsJapgolly.soap.libWsdlMod.WSDL {
    def this(definition: Any, uri: String, options: IOptions) = this()
  }
  
  @JSImport("soap", "WSSecurity")
  @js.native
  open class WSSecurity protected ()
    extends typingsJapgolly.soap.libSecurityMod.WSSecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, options: String) = this()
    def this(username: String, password: String, options: IWSSecurityOptions) = this()
  }
  
  @JSImport("soap", "WSSecurityCert")
  @js.native
  open class WSSecurityCert protected ()
    extends typingsJapgolly.soap.libSecurityMod.WSSecurityCert {
    def this(privatePEM: Any, publicP12PEM: Any, password: Any) = this()
    def this(privatePEM: Any, publicP12PEM: Any, password: Any, options: IWSSecurityCertOptions) = this()
  }
  
  inline def createClient(url: String, callback: CreateClientCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createClient(url: String, callback: CreateClientCallback, endpoint: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createClient(url: String, options: IOptions, callback: CreateClientCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createClient(url: String, options: IOptions, callback: CreateClientCallback, endpoint: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createClientAsync(url: String): js.Promise[typingsJapgolly.soap.libClientMod.Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.soap.libClientMod.Client]]
  inline def createClientAsync(url: String, options: Unit, endpoint: String): js.Promise[typingsJapgolly.soap.libClientMod.Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientAsync")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.soap.libClientMod.Client]]
  inline def createClientAsync(url: String, options: IOptions): js.Promise[typingsJapgolly.soap.libClientMod.Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientAsync")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.soap.libClientMod.Client]]
  inline def createClientAsync(url: String, options: IOptions, endpoint: String): js.Promise[typingsJapgolly.soap.libClientMod.Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientAsync")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.soap.libClientMod.Client]]
  
  inline def listen(server: ServerType, options: IServerOptions): typingsJapgolly.soap.libServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.soap.libServerMod.Server]
  inline def listen(server: ServerType, path: String, services: IServices, wsdl: String): typingsJapgolly.soap.libServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], path.asInstanceOf[js.Any], services.asInstanceOf[js.Any], wsdl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.soap.libServerMod.Server]
  inline def listen(
    server: ServerType,
    path: String,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ Any, /* res */ Any, Unit]
  ): typingsJapgolly.soap.libServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], path.asInstanceOf[js.Any], services.asInstanceOf[js.Any], wsdl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.soap.libServerMod.Server]
  inline def listen(server: ServerType, path: js.RegExp, services: IServices, wsdl: String): typingsJapgolly.soap.libServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], path.asInstanceOf[js.Any], services.asInstanceOf[js.Any], wsdl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.soap.libServerMod.Server]
  inline def listen(
    server: ServerType,
    path: js.RegExp,
    services: IServices,
    wsdl: String,
    callback: js.Function2[/* err */ Any, /* res */ Any, Unit]
  ): typingsJapgolly.soap.libServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], path.asInstanceOf[js.Any], services.asInstanceOf[js.Any], wsdl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.soap.libServerMod.Server]
  
  inline def passwordDigest(nonce: String, created: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("passwordDigest")(nonce.asInstanceOf[js.Any], created.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object security {
    
    @JSImport("soap", "security")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("soap", "security.BasicAuthSecurity")
    @js.native
    def BasicAuthSecurity: Instantiable3[
        /* username */ String, 
        /* password */ String, 
        /* defaults */ js.UndefOr[Any], 
        typingsJapgolly.soap.libSecurityMod.BasicAuthSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.BasicAuthSecurity")
    @js.native
    open class BasicAuthSecurityCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.BasicAuthSecurity {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, defaults: Any) = this()
    }
    
    inline def BasicAuthSecurity_=(
      x: Instantiable3[
          /* username */ String, 
          /* password */ String, 
          /* defaults */ js.UndefOr[Any], 
          typingsJapgolly.soap.libSecurityMod.BasicAuthSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BasicAuthSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.BearerSecurity")
    @js.native
    def BearerSecurity: Instantiable2[
        /* token */ String, 
        /* defaults */ js.UndefOr[Any], 
        typingsJapgolly.soap.libSecurityMod.BearerSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.BearerSecurity")
    @js.native
    open class BearerSecurityCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.BearerSecurity {
      def this(token: String) = this()
      def this(token: String, defaults: Any) = this()
    }
    
    inline def BearerSecurity_=(
      x: Instantiable2[
          /* token */ String, 
          /* defaults */ js.UndefOr[Any], 
          typingsJapgolly.soap.libSecurityMod.BearerSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BearerSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.ClientSSLSecurity")
    @js.native
    def ClientSSLSecurity: Instantiable4[
        /* key */ String | Buffer, 
        /* cert */ String | Buffer, 
        /* ca */ js.UndefOr[Buffer | String | js.Array[Any] | Any], 
        /* defaults */ js.UndefOr[Any], 
        typingsJapgolly.soap.libSecurityMod.ClientSSLSecurity
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.ClientSSLSecurity")
    @js.native
    open class ClientSSLSecurityCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.ClientSSLSecurity {
      def this(key: String, cert: String) = this()
      def this(key: String, cert: Buffer) = this()
      def this(key: Buffer, cert: String) = this()
      def this(key: Buffer, cert: Buffer) = this()
      def this(key: String, cert: String, ca: String) = this()
      def this(key: String, cert: String, ca: js.Array[Any]) = this()
      def this(key: String, cert: String, ca: Any) = this()
      def this(key: String, cert: String, ca: Buffer) = this()
      def this(key: String, cert: Buffer, ca: String) = this()
      def this(key: String, cert: Buffer, ca: js.Array[Any]) = this()
      def this(key: String, cert: Buffer, ca: Any) = this()
      def this(key: String, cert: Buffer, ca: Buffer) = this()
      def this(key: Buffer, cert: String, ca: String) = this()
      def this(key: Buffer, cert: String, ca: js.Array[Any]) = this()
      def this(key: Buffer, cert: String, ca: Any) = this()
      def this(key: Buffer, cert: String, ca: Buffer) = this()
      def this(key: Buffer, cert: Buffer, ca: String) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Array[Any]) = this()
      def this(key: Buffer, cert: Buffer, ca: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
      def this(key: String, cert: String, ca: String, defaults: Any) = this()
      def this(key: String, cert: String, ca: js.Array[Any], defaults: Any) = this()
      def this(key: String, cert: String, ca: Any, defaults: Any) = this()
      def this(key: String, cert: String, ca: Unit, defaults: Any) = this()
      def this(key: String, cert: String, ca: Buffer, defaults: Any) = this()
      def this(key: String, cert: Buffer, ca: String, defaults: Any) = this()
      def this(key: String, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
      def this(key: String, cert: Buffer, ca: Any, defaults: Any) = this()
      def this(key: String, cert: Buffer, ca: Unit, defaults: Any) = this()
      def this(key: String, cert: Buffer, ca: Buffer, defaults: Any) = this()
      def this(key: Buffer, cert: String, ca: String, defaults: Any) = this()
      def this(key: Buffer, cert: String, ca: js.Array[Any], defaults: Any) = this()
      def this(key: Buffer, cert: String, ca: Any, defaults: Any) = this()
      def this(key: Buffer, cert: String, ca: Unit, defaults: Any) = this()
      def this(key: Buffer, cert: String, ca: Buffer, defaults: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: String, defaults: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: Any, defaults: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: Unit, defaults: Any) = this()
      def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: Any) = this()
    }
    
    @JSImport("soap", "security.ClientSSLSecurityPFX")
    @js.native
    def ClientSSLSecurityPFX: Instantiable2[
        /* pfx */ String | Buffer, 
        /* defaults */ js.UndefOr[Any], 
        typingsJapgolly.soap.libSecurityMod.ClientSSLSecurityPFX
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.ClientSSLSecurityPFX")
    @js.native
    open class ClientSSLSecurityPFXCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.ClientSSLSecurityPFX {
      def this(pfx: String) = this()
      def this(pfx: Buffer) = this()
      def this(pfx: String, defaults: Any) = this()
      def this(pfx: Buffer, defaults: Any) = this()
    }
    
    inline def ClientSSLSecurityPFX_=(
      x: Instantiable2[
          /* pfx */ String | Buffer, 
          /* defaults */ js.UndefOr[Any], 
          typingsJapgolly.soap.libSecurityMod.ClientSSLSecurityPFX
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientSSLSecurityPFX")(x.asInstanceOf[js.Any])
    
    inline def ClientSSLSecurity_=(
      x: Instantiable4[
          /* key */ String | Buffer, 
          /* cert */ String | Buffer, 
          /* ca */ js.UndefOr[Buffer | String | js.Array[Any] | Any], 
          /* defaults */ js.UndefOr[Any], 
          typingsJapgolly.soap.libSecurityMod.ClientSSLSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientSSLSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.NTLMSecurity")
    @js.native
    def NTLMSecurity: Instantiable1[/* defaults */ Any, typingsJapgolly.soap.libSecurityMod.NTLMSecurity] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.NTLMSecurity")
    @js.native
    open class NTLMSecurityCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.NTLMSecurity {
      def this(defaults: Any) = this()
    }
    
    inline def NTLMSecurity_=(x: Instantiable1[/* defaults */ Any, typingsJapgolly.soap.libSecurityMod.NTLMSecurity]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NTLMSecurity")(x.asInstanceOf[js.Any])
    
    @JSImport("soap", "security.WSSecurity")
    @js.native
    def WSSecurity: Instantiable3[
        /* username */ String, 
        /* password */ String, 
        /* options */ js.UndefOr[String | IWSSecurityOptions], 
        typingsJapgolly.soap.libSecurityMod.WSSecurity
      ] = js.native
    
    @JSImport("soap", "security.WSSecurityCert")
    @js.native
    def WSSecurityCert: Instantiable4[
        /* privatePEM */ Any, 
        /* publicP12PEM */ Any, 
        /* password */ Any, 
        /* options */ js.UndefOr[IWSSecurityCertOptions], 
        typingsJapgolly.soap.libSecurityMod.WSSecurityCert
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.WSSecurityCert")
    @js.native
    open class WSSecurityCertCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.WSSecurityCert {
      def this(privatePEM: Any, publicP12PEM: Any, password: Any) = this()
      def this(privatePEM: Any, publicP12PEM: Any, password: Any, options: IWSSecurityCertOptions) = this()
    }
    
    inline def WSSecurityCert_=(
      x: Instantiable4[
          /* privatePEM */ Any, 
          /* publicP12PEM */ Any, 
          /* password */ Any, 
          /* options */ js.UndefOr[IWSSecurityCertOptions], 
          typingsJapgolly.soap.libSecurityMod.WSSecurityCert
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WSSecurityCert")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("soap", "security.WSSecurity")
    @js.native
    open class WSSecurityCls protected ()
      extends typingsJapgolly.soap.libSecurityMod.WSSecurity {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, options: String) = this()
      def this(username: String, password: String, options: IWSSecurityOptions) = this()
    }
    
    inline def WSSecurity_=(
      x: Instantiable3[
          /* username */ String, 
          /* password */ String, 
          /* options */ js.UndefOr[String | IWSSecurityOptions], 
          typingsJapgolly.soap.libSecurityMod.WSSecurity
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WSSecurity")(x.asInstanceOf[js.Any])
  }
  
  type CreateClientCallback = js.Function2[/* err */ Any, /* client */ typingsJapgolly.soap.libClientMod.Client, Unit]
}
