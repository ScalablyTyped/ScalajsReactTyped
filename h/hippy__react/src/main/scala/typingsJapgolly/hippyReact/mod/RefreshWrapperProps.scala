package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshWrapperProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  var bounceTime: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var getRefresh: js.UndefOr[js.Function0[japgolly.scalajs.react.facade.React.Element]] = js.undefined
  
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object RefreshWrapperProps {
  
  inline def apply(): RefreshWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshWrapperProps]
  }
  
  extension [Self <: RefreshWrapperProps](x: Self) {
    
    inline def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
    
    inline def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGetRefresh(value: CallbackTo[japgolly.scalajs.react.facade.React.Element]): Self = StObject.set(x, "getRefresh", value.toJsFn)
    
    inline def setGetRefreshUndefined: Self = StObject.set(x, "getRefresh", js.undefined)
    
    inline def setOnRefresh(value: Callback): Self = StObject.set(x, "onRefresh", value.toJsFn)
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
