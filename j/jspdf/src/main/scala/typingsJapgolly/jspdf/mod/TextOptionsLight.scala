package typingsJapgolly.jspdf.mod

import typingsJapgolly.jspdf.anon.Autoencode
import typingsJapgolly.jspdf.jspdfInts.`0`
import typingsJapgolly.jspdf.jspdfInts.`1`
import typingsJapgolly.jspdf.jspdfStrings.addToPathForClipping
import typingsJapgolly.jspdf.jspdfStrings.alphabetic
import typingsJapgolly.jspdf.jspdfStrings.bottom
import typingsJapgolly.jspdf.jspdfStrings.center
import typingsJapgolly.jspdf.jspdfStrings.fill
import typingsJapgolly.jspdf.jspdfStrings.fillAndAddForClipping
import typingsJapgolly.jspdf.jspdfStrings.fillThenStroke
import typingsJapgolly.jspdf.jspdfStrings.fillThenStrokeAndAddToPathForClipping
import typingsJapgolly.jspdf.jspdfStrings.hanging
import typingsJapgolly.jspdf.jspdfStrings.ideographic
import typingsJapgolly.jspdf.jspdfStrings.invisible
import typingsJapgolly.jspdf.jspdfStrings.justify
import typingsJapgolly.jspdf.jspdfStrings.left
import typingsJapgolly.jspdf.jspdfStrings.middle
import typingsJapgolly.jspdf.jspdfStrings.right
import typingsJapgolly.jspdf.jspdfStrings.stroke
import typingsJapgolly.jspdf.jspdfStrings.strokeAndAddPathForClipping
import typingsJapgolly.jspdf.jspdfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptionsLight extends StObject {
  
  var align: js.UndefOr[left | center | right | justify] = js.undefined
  
  var angle: js.UndefOr[Double | Matrix] = js.undefined
  
  var baseline: js.UndefOr[alphabetic | ideographic | bottom | top | middle | hanging] = js.undefined
  
  var charSpace: js.UndefOr[Double] = js.undefined
  
  var flags: js.UndefOr[Autoencode] = js.undefined
  
  var horizontalScale: js.UndefOr[Double] = js.undefined
  
  var isInputRtl: js.UndefOr[Boolean] = js.undefined
  
  var isInputVisual: js.UndefOr[Boolean] = js.undefined
  
  var isOutputRtl: js.UndefOr[Boolean] = js.undefined
  
  var isOutputVisual: js.UndefOr[Boolean] = js.undefined
  
  var isSymmetricSwapping: js.UndefOr[Boolean] = js.undefined
  
  var lineHeightFactor: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var renderingMode: js.UndefOr[
    fill | stroke | fillThenStroke | invisible | fillAndAddForClipping | strokeAndAddPathForClipping | fillThenStrokeAndAddToPathForClipping | addToPathForClipping
  ] = js.undefined
  
  var rotationDirection: js.UndefOr[`0` | `1`] = js.undefined
}
object TextOptionsLight {
  
  inline def apply(): TextOptionsLight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptionsLight]
  }
  
  extension [Self <: TextOptionsLight](x: Self) {
    
    inline def setAlign(value: left | center | right | justify): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAngle(value: Double | Matrix): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBaseline(value: alphabetic | ideographic | bottom | top | middle | hanging): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setCharSpace(value: Double): Self = StObject.set(x, "charSpace", value.asInstanceOf[js.Any])
    
    inline def setCharSpaceUndefined: Self = StObject.set(x, "charSpace", js.undefined)
    
    inline def setFlags(value: Autoencode): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHorizontalScale(value: Double): Self = StObject.set(x, "horizontalScale", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScaleUndefined: Self = StObject.set(x, "horizontalScale", js.undefined)
    
    inline def setIsInputRtl(value: Boolean): Self = StObject.set(x, "isInputRtl", value.asInstanceOf[js.Any])
    
    inline def setIsInputRtlUndefined: Self = StObject.set(x, "isInputRtl", js.undefined)
    
    inline def setIsInputVisual(value: Boolean): Self = StObject.set(x, "isInputVisual", value.asInstanceOf[js.Any])
    
    inline def setIsInputVisualUndefined: Self = StObject.set(x, "isInputVisual", js.undefined)
    
    inline def setIsOutputRtl(value: Boolean): Self = StObject.set(x, "isOutputRtl", value.asInstanceOf[js.Any])
    
    inline def setIsOutputRtlUndefined: Self = StObject.set(x, "isOutputRtl", js.undefined)
    
    inline def setIsOutputVisual(value: Boolean): Self = StObject.set(x, "isOutputVisual", value.asInstanceOf[js.Any])
    
    inline def setIsOutputVisualUndefined: Self = StObject.set(x, "isOutputVisual", js.undefined)
    
    inline def setIsSymmetricSwapping(value: Boolean): Self = StObject.set(x, "isSymmetricSwapping", value.asInstanceOf[js.Any])
    
    inline def setIsSymmetricSwappingUndefined: Self = StObject.set(x, "isSymmetricSwapping", js.undefined)
    
    inline def setLineHeightFactor(value: Double): Self = StObject.set(x, "lineHeightFactor", value.asInstanceOf[js.Any])
    
    inline def setLineHeightFactorUndefined: Self = StObject.set(x, "lineHeightFactor", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setRenderingMode(
      value: fill | stroke | fillThenStroke | invisible | fillAndAddForClipping | strokeAndAddPathForClipping | fillThenStrokeAndAddToPathForClipping | addToPathForClipping
    ): Self = StObject.set(x, "renderingMode", value.asInstanceOf[js.Any])
    
    inline def setRenderingModeUndefined: Self = StObject.set(x, "renderingMode", js.undefined)
    
    inline def setRotationDirection(value: `0` | `1`): Self = StObject.set(x, "rotationDirection", value.asInstanceOf[js.Any])
    
    inline def setRotationDirectionUndefined: Self = StObject.set(x, "rotationDirection", js.undefined)
  }
}
