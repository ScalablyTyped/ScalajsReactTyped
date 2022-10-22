package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesDragAndDropDraggableMod.DraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableGridBaseMod {
  
  @JSImport("wix-style-react/dist/types/SortableGridBase", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SortableGridBaseProps, js.Object, Any]
  
  type SortableGridBase = PureComponent[SortableGridBaseProps, js.Object, Any]
  
  trait SortableGridBaseProps
    extends StObject
       with DraggableProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragPreview: js.UndefOr[Boolean] = js.undefined
    
    var endFixedElement: js.UndefOr[Node] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var startFixedElement: js.UndefOr[Node] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object SortableGridBaseProps {
    
    inline def apply(): SortableGridBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableGridBaseProps]
    }
    
    extension [Self <: SortableGridBaseProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragPreview(value: Boolean): Self = StObject.set(x, "dragPreview", value.asInstanceOf[js.Any])
      
      inline def setDragPreviewUndefined: Self = StObject.set(x, "dragPreview", js.undefined)
      
      inline def setEndFixedElement(value: VdomNode): Self = StObject.set(x, "endFixedElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndFixedElementNull: Self = StObject.set(x, "endFixedElement", null)
      
      inline def setEndFixedElementUndefined: Self = StObject.set(x, "endFixedElement", js.undefined)
      
      inline def setEndFixedElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endFixedElement", js.Array(value*))
      
      inline def setEndFixedElementVdomElement(value: VdomElement): Self = StObject.set(x, "endFixedElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setStartFixedElement(value: VdomNode): Self = StObject.set(x, "startFixedElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartFixedElementNull: Self = StObject.set(x, "startFixedElement", null)
      
      inline def setStartFixedElementUndefined: Self = StObject.set(x, "startFixedElement", js.undefined)
      
      inline def setStartFixedElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startFixedElement", js.Array(value*))
      
      inline def setStartFixedElementVdomElement(value: VdomElement): Self = StObject.set(x, "startFixedElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
}
