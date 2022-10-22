package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonContextMenuTargetWrapperMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  open class ContextMenuTargetWrapper protected ()
    extends PureComponent[IContextMenuTargetWrapper, js.Object, Any] {
    def this(props: IContextMenuTargetWrapper) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IContextMenuTargetWrapper, context: Any) = this()
    
    def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element] = js.native
  }
  
  trait IContextMenuTargetWrapper
    extends StObject
       with IProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): js.UndefOr[Element]
    
    var style: CSSProperties
  }
  object IContextMenuTargetWrapper {
    
    inline def apply(renderContextMenu: ReactMouseEventFrom[HTMLElement] => js.UndefOr[Element], style: CSSProperties): IContextMenuTargetWrapper = {
      val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextMenuTargetWrapper]
    }
    
    extension [Self <: IContextMenuTargetWrapper](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderContextMenu(value: ReactMouseEventFrom[HTMLElement] => js.UndefOr[Element]): Self = StObject.set(x, "renderContextMenu", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
