package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.Asset.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a text rendering texture. Can be accessed through the main rendering pass on a Label component. The properties here mirror those on Label. Lens Studio v1.7.0+ */
trait TextProvider
  extends StObject
     with TextureProvider {
  
  /** The font used for rendering text. */
  var fontAsset: Font
  
  /** The color used for the outline effect. */
  var outlineColor: vec4
  
  /** The strength of the outline effect. */
  var outlineSize: Double
  
  /** The color used for dropshadow. */
  var shadowColor: vec4
  
  /** The horizontal and vertical offset used for dropshadow. */
  var shadowOffset: vec2
  
  /** The font size being used. */
  var size: Double
  
  /** The text being rendered. */
  var text: String
  
  /** The color for rendering text. */
  var textColor: vec4
  
  /** If enabled, adds a dropshadow to the text. */
  var useDropshadow: Boolean
  
  /** If enabled, renders an outline around the text. */
  var useOutline: Boolean
}
object TextProvider {
  
  inline def apply(
    fontAsset: Font,
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean,
    outlineColor: vec4,
    outlineSize: Double,
    shadowColor: vec4,
    shadowOffset: vec2,
    size: Double,
    text: String,
    textColor: vec4,
    useDropshadow: Boolean,
    useOutline: Boolean
  ): TextProvider = {
    val __obj = js.Dynamic.literal(fontAsset = fontAsset.asInstanceOf[js.Any], getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType), outlineColor = outlineColor.asInstanceOf[js.Any], outlineSize = outlineSize.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], useDropshadow = useDropshadow.asInstanceOf[js.Any], useOutline = useOutline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProvider]
  }
  
  extension [Self <: TextProvider](x: Self) {
    
    inline def setFontAsset(value: Font): Self = StObject.set(x, "fontAsset", value.asInstanceOf[js.Any])
    
    inline def setOutlineColor(value: vec4): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    inline def setOutlineSize(value: Double): Self = StObject.set(x, "outlineSize", value.asInstanceOf[js.Any])
    
    inline def setShadowColor(value: vec4): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffset(value: vec2): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: vec4): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setUseDropshadow(value: Boolean): Self = StObject.set(x, "useDropshadow", value.asInstanceOf[js.Any])
    
    inline def setUseOutline(value: Boolean): Self = StObject.set(x, "useOutline", value.asInstanceOf[js.Any])
  }
}
