package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.FontStyle
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.FontWeight
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecUtilMod.Vector2
import typingsJapgolly.vegaTypings.typesSpecUtilMod.Vector7
import typingsJapgolly.vegaTypings.vegaTypingsStrings.wordcloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordcloudTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.undefined
  
  var font: js.UndefOr[String | TransformField] = js.undefined
  
  var fontSize: js.UndefOr[Double | TransformField] = js.undefined
  
  var fontSizeRange: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle | TransformField] = js.undefined
  
  var fontWeight: js.UndefOr[FontWeight | TransformField] = js.undefined
  
  var padding: js.UndefOr[Double | TransformField] = js.undefined
  
  var rotate: js.UndefOr[Double | TransformField] = js.undefined
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var spiral: js.UndefOr[WordcloudSpiral | SignalRef] = js.undefined
  
  var text: js.UndefOr[String | TransformField] = js.undefined
  
  var `type`: wordcloud
}
object WordcloudTransform {
  
  inline def apply(): WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wordcloud")
    __obj.asInstanceOf[WordcloudTransform]
  }
  
  extension [Self <: WordcloudTransform](x: Self) {
    
    inline def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setFont(value: String | TransformField): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double | TransformField): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeRange(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "fontSizeRange", value.asInstanceOf[js.Any])
    
    inline def setFontSizeRangeUndefined: Self = StObject.set(x, "fontSizeRange", js.undefined)
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle | TransformField): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontWeight(value: FontWeight | TransformField): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setPadding(value: Double | TransformField): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRotate(value: Double | TransformField): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpiral(value: WordcloudSpiral | SignalRef): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
    
    inline def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
    
    inline def setText(value: String | TransformField): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: wordcloud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
