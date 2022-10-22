package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.hippyReact.hippyReactStrings.clip
import typingsJapgolly.hippyReact.hippyReactStrings.head
import typingsJapgolly.hippyReact.hippyReactStrings.middle
import typingsJapgolly.hippyReact.hippyReactStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  var children: js.UndefOr[js.Array[String] | Node] = js.undefined
  
  /**
    * When numberOfLines is set, this prop defines how text will be truncated.
    * numberOfLines must be set in conjunction with this prop.
    * This can be one of the following values:
    *
    * * head - The line is displayed so that the end fits in the container
    *          and the missing text at the beginning of the line is indicated by an ellipsis glyph.
    *          e.g., "...wxyz
    * * middle - The line is displayed so that the beginning and
    *            end fit in the container and the missing text in the middle is indicated
    *            by an ellipsis glyph.
    *            e.g., "ab...yz"
    * * tail - The line is displayed so that the beginning fits in the container
    *          and the missing text at the end of the line is indicated by an ellipsis glyph.
    *          e.g., "abcd..."
    * * clip - Lines are not drawn past the edge of the text container.
    *
    * The default is `tail`.
    */
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  
  /**
    * Used to truncate the text with an ellipsis after computing the text layout,
    * including line wrapping, such that the total number of lines does not exceed this number.
    * This prop is commonly used with `ellipsizeMode`.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines what the opacity of the wrapped view.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[TextStyleProp] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object TextProps {
  
  inline def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  extension [Self <: TextProps](x: Self) {
    
    inline def setChildren(value: js.Array[String] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (japgolly.scalajs.react.facade.React.Element | Empty | JsNumber | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStyle(value: TextStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: TextStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
