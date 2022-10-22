package typingsJapgolly.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsGetMimeTypeMod {
  
  @JSImport("playable/dist/src/utils/get-mime-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMimeByType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeByType")().asInstanceOf[String]
  inline def getMimeByType(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeByType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getMimeByUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeByUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
