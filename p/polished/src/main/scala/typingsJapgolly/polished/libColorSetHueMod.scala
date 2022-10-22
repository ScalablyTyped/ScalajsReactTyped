package typingsJapgolly.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorSetHueMod {
  
  @JSImport("polished/lib/color/setHue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hue: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(hue: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hue.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(hue: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(hue: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hue.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
