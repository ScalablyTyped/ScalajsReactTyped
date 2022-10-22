package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "ColorHelper")
@js.native
open class ColorHelper ()
  extends typingsJapgolly.blackEngine.utilsColorHelperMod.ColorHelper
/* static members */
object ColorHelper {
  
  @JSImport("black-engine", "ColorHelper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hex2rgb(hex: Double): typingsJapgolly.blackEngine.utilsColorHelperMod.RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("hex2rgb")(hex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.utilsColorHelperMod.RGB]
  
  inline def hexColorToString(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexColorToString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsv2rgb(hsv: typingsJapgolly.blackEngine.utilsColorHelperMod.HSV): typingsJapgolly.blackEngine.utilsColorHelperMod.RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(hsv.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.utilsColorHelperMod.RGB]
  
  inline def intToRGBA(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToRGBA")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def intToRGBA(color: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("intToRGBA")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lerpHSV(hex1: Double, hex2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpHSV")(hex1.asInstanceOf[js.Any], hex2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lerpHSV(hex1: Double, hex2: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerpHSV")(hex1.asInstanceOf[js.Any], hex2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rgb2hex(rgb: typingsJapgolly.blackEngine.utilsColorHelperMod.RGB): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hex")(rgb.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rgb2hsv(rgb: typingsJapgolly.blackEngine.utilsColorHelperMod.RGB): typingsJapgolly.blackEngine.utilsColorHelperMod.HSV = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsv")(rgb.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.utilsColorHelperMod.HSV]
}
