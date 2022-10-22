package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.LinearSRGBColorSpace
import typingsJapgolly.three.srcConstantsMod.SRGBColorSpace
import typingsJapgolly.three.srcMathColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathColorManagementMod {
  
  @JSImport("three/src/math/ColorManagement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ColorManagement {
    
    @JSImport("three/src/math/ColorManagement", "ColorManagement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert(color: Color, sourceColorSpace: LinearSRGBColorSpace, targetColorSpace: LinearSRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(color: Color, sourceColorSpace: LinearSRGBColorSpace, targetColorSpace: SRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(color: Color, sourceColorSpace: SRGBColorSpace, targetColorSpace: LinearSRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def convert(color: Color, sourceColorSpace: SRGBColorSpace, targetColorSpace: SRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    inline def fromWorkingColorSpace(color: Color, targetColorSpace: LinearSRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def fromWorkingColorSpace(color: Color, targetColorSpace: SRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWorkingColorSpace")(color.asInstanceOf[js.Any], targetColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    
    inline def toWorkingColorSpace(color: Color, sourceColorSpace: LinearSRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
    inline def toWorkingColorSpace(color: Color, sourceColorSpace: SRGBColorSpace): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("toWorkingColorSpace")(color.asInstanceOf[js.Any], sourceColorSpace.asInstanceOf[js.Any])).asInstanceOf[Color]
  }
  
  inline def LinearToSRGB(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LinearToSRGB")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def SRGBToLinear(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("SRGBToLinear")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
}
