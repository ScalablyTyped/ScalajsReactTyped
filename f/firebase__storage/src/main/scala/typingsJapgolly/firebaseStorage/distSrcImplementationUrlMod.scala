package typingsJapgolly.firebaseStorage

import typingsJapgolly.firebaseStorage.distSrcImplementationRequestinfoMod.UrlParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcImplementationUrlMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeQueryString(params: UrlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeQueryString")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeUrl(urlPart: String, host: String, protocol: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(urlPart.asInstanceOf[js.Any], host.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[String]
}
