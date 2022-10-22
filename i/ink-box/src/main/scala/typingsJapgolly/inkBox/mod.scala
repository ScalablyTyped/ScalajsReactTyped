package typingsJapgolly.inkBox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.inkBox.anon.Bottom
import typingsJapgolly.inkBox.anon.BottomLeft
import typingsJapgolly.inkBox.inkBoxStrings.classic
import typingsJapgolly.inkBox.inkBoxStrings.double
import typingsJapgolly.inkBox.inkBoxStrings.doubleSingle
import typingsJapgolly.inkBox.inkBoxStrings.round
import typingsJapgolly.inkBox.inkBoxStrings.single
import typingsJapgolly.inkBox.inkBoxStrings.singleDouble
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-box", JSImport.Namespace)
  @js.native
  val ^ : FC[BoxProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inkBox.inkBoxStrings.right
    - typingsJapgolly.inkBox.inkBoxStrings.center
    - typingsJapgolly.inkBox.inkBoxStrings.left
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def center: typingsJapgolly.inkBox.inkBoxStrings.center = "center".asInstanceOf[typingsJapgolly.inkBox.inkBoxStrings.center]
    
    inline def left: typingsJapgolly.inkBox.inkBoxStrings.left = "left".asInstanceOf[typingsJapgolly.inkBox.inkBoxStrings.left]
    
    inline def right: typingsJapgolly.inkBox.inkBoxStrings.right = "right".asInstanceOf[typingsJapgolly.inkBox.inkBoxStrings.right]
  }
  
  trait BoxProps extends StObject {
    
    var align: js.UndefOr[Alignment] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderStyle: js.UndefOr[single | double | round | singleDouble | doubleSingle | classic | BottomLeft] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var dimBorder: js.UndefOr[Boolean] = js.undefined
    
    var float: js.UndefOr[Alignment] = js.undefined
    
    var margin: js.UndefOr[Spacing] = js.undefined
    
    var padding: js.UndefOr[Spacing] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    extension [Self <: BoxProps](x: Self) {
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderStyle(value: single | double | round | singleDouble | doubleSingle | classic | BottomLeft): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      inline def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      inline def setFloat(value: Alignment): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setMargin(value: Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type Spacing = Double | Bottom
  
  type _To = FC[BoxProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[BoxProps] = ^
}
