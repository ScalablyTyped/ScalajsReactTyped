package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var ErrorBoundary: js.UndefOr[Any] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var contentHeight: js.UndefOr[Double | String] = js.undefined
  
  var hasHeader: Boolean
  
  var hasPageContainer: js.UndefOr[Double] = js.undefined
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  
  var location: js.UndefOr[Any] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Children {
  
  inline def apply(hasHeader: Boolean): Children = {
    val __obj = js.Dynamic.literal(hasHeader = hasHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContentHeight(value: Double | String): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
    
    inline def setErrorBoundary(value: Any): Self = StObject.set(x, "ErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def setErrorBoundaryUndefined: Self = StObject.set(x, "ErrorBoundary", js.undefined)
    
    inline def setHasHeader(value: Boolean): Self = StObject.set(x, "hasHeader", value.asInstanceOf[js.Any])
    
    inline def setHasPageContainer(value: Double): Self = StObject.set(x, "hasPageContainer", value.asInstanceOf[js.Any])
    
    inline def setHasPageContainerUndefined: Self = StObject.set(x, "hasPageContainer", js.undefined)
    
    inline def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    inline def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
