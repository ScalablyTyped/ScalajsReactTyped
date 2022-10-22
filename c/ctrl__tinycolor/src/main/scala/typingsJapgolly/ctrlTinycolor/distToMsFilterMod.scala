package typingsJapgolly.ctrlTinycolor

import typingsJapgolly.ctrlTinycolor.distMod.ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToMsFilterMod {
  
  @JSImport("@ctrl/tinycolor/dist/to-ms-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMsFilter(firstColor: ColorInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMsFilter")(firstColor.asInstanceOf[js.Any], secondColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
