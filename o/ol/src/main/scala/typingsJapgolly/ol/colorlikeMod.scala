package typingsJapgolly.ol

import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import typingsJapgolly.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorlikeMod {
  
  @JSImport("ol/colorlike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asColorLike(color: Color): ColorLike = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike]
  inline def asColorLike(color: ColorLike): ColorLike = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike]
  
  type ColorLike = String | CanvasPattern | CanvasGradient
}
