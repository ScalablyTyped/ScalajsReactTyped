package typingsJapgolly.proxyAddr

import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(req: IncomingMessage, trust: js.Array[Address]): String = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): String = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(req: IncomingMessage, trust: Address): String = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("proxy-addr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(req: IncomingMessage): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(req.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def all(req: IncomingMessage, trust: js.Array[Address]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def all(req: IncomingMessage, trust: js.Function2[/* addr */ String, /* i */ Double, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def all(req: IncomingMessage, trust: Address): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(req.asInstanceOf[js.Any], trust.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def compile(`val`: js.Array[Address]): js.Function2[/* addr */ String, /* i */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* addr */ String, /* i */ Double, Boolean]]
  inline def compile(`val`: Address): js.Function2[/* addr */ String, /* i */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* addr */ String, /* i */ Double, Boolean]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.proxyAddr.proxyAddrStrings.loopback
    - typingsJapgolly.proxyAddr.proxyAddrStrings.linklocal
    - typingsJapgolly.proxyAddr.proxyAddrStrings.uniquelocal
    - java.lang.String
  */
  type Address = _Address | String
  
  trait _Address extends StObject
}
