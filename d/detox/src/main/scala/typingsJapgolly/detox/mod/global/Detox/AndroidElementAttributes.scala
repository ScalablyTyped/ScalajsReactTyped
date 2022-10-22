package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.detoxStrings.gone
import typingsJapgolly.detox.detoxStrings.invisible
import typingsJapgolly.detox.detoxStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Android Specific Attributes
trait AndroidElementAttributes
  extends StObject
     with ElementAttributes {
  
  /**
    * Alpha value for the element.
    */
  var alpha: Double
  
  /**
    * Elevation of the element.
    */
  var elevation: Double
  
  /**
    * Whether the element is the one currently in focus.
    */
  var focused: Boolean
  
  /**
    * Height of the element, in pixels.
    */
  var height: Double
  
  /**
    * The length of the text element (character count).
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The text size for the text element.
    */
  var textSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The OS visibility type associated with the element: visible, invisible or gone.
    */
  var visibility: visible | invisible | gone
  
  /**
    * Width of the element, in pixels.
    */
  var width: Double
}
object AndroidElementAttributes {
  
  inline def apply(
    alpha: Double,
    elevation: Double,
    enabled: Boolean,
    focused: Boolean,
    height: Double,
    identifier: String,
    visibility: visible | invisible | gone,
    visible: Boolean,
    width: Double
  ): AndroidElementAttributes = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidElementAttributes]
  }
  
  extension [Self <: AndroidElementAttributes](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    inline def setVisibility(value: visible | invisible | gone): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
