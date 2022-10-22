package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsTable.anon.PreventDefault
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.IDragHandler
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsDraggableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
  @js.native
  open class Draggable protected ()
    extends PureComponent[IDraggableProps, js.Object, Any] {
    def this(props: IDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDraggableProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDraggable(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDraggable(prevProps: IDraggableProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggable(): Unit = js.native
    
    /* private */ var events: Any = js.native
  }
  /* static members */
  object Draggable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/draggable", "Draggable.defaultProps")
    @js.native
    def defaultProps: PreventDefault = js.native
    inline def defaultProps_=(x: PreventDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDraggableProps
    extends StObject
       with IProps
       with IDragHandler {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object IDraggableProps {
    
    inline def apply(): IDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDraggableProps]
    }
    
    extension [Self <: IDraggableProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
