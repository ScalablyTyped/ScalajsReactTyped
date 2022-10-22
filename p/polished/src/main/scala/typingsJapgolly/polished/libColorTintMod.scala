package typingsJapgolly.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorTintMod {
  
  @JSImport("polished/lib/color/tint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(percentage: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(percentage: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(percentage: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(percentage: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(percentage.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
