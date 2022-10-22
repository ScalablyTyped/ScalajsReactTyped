package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.baseline
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.end
import typingsJapgolly.gestalt.gestaltStrings.grow
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.shrink
import typingsJapgolly.gestalt.gestaltStrings.start
import typingsJapgolly.gestalt.gestaltStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexItemProps extends StObject {
  
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  
  var flexBasis: js.UndefOr[String | Double] = js.undefined
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
}
object FlexItemProps {
  
  inline def apply(): FlexItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexItemProps]
  }
  
  extension [Self <: FlexItemProps](x: Self) {
    
    inline def setAlignSelf(value: auto | start | end | center | baseline | stretch): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFlex(value: grow | shrink | none): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexBasis(value: String | Double): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
