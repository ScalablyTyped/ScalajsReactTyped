package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipProps extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var containerElement: js.UndefOr[Node | String] = js.undefined
  
  var deleteIconStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var labelColor: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Component[ChipProps & js.Object, js.Object]]] = js.undefined
  
  var onRequestDelete: js.UndefOr[TouchEventHandler[Component[ChipProps & js.Object, js.Object]]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ChipProps {
  
  inline def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  
  extension [Self <: ChipProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainerElement(value: Node | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    inline def setContainerElementNull: Self = StObject.set(x, "containerElement", null)
    
    inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    inline def setContainerElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "containerElement", js.Array(value*))
    
    inline def setContainerElementVdomElement(value: VdomElement): Self = StObject.set(x, "containerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDeleteIconStyle(value: CSSProperties): Self = StObject.set(x, "deleteIconStyle", value.asInstanceOf[js.Any])
    
    inline def setDeleteIconStyleUndefined: Self = StObject.set(x, "deleteIconStyle", js.undefined)
    
    inline def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setOnClick(
      value: ReactMouseEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element] => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnRequestDelete(
      value: ReactTouchEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element] => Callback
    ): Self = StObject.set(x, "onRequestDelete", js.Any.fromFunction1((t0: ReactTouchEventFrom[(Component[ChipProps & js.Object, js.Object]) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRequestDeleteUndefined: Self = StObject.set(x, "onRequestDelete", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
