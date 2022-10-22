package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesDragAndDropDraggableMod.DraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableListBaseMod {
  
  @JSImport("wix-style-react/dist/types/SortableListBase", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SortableListBaseProps, js.Object, Any]
  
  type SortableListBase = PureComponent[SortableListBaseProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.any
  */
  trait SortableListBaseInsertPosition extends StObject
  object SortableListBaseInsertPosition {
    
    inline def any: typingsJapgolly.wixStyleReact.wixStyleReactStrings.any = "any".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.any]
    
    inline def end: typingsJapgolly.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait SortableListBaseProps
    extends StObject
       with DraggableProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragPreview: js.UndefOr[Boolean] = js.undefined
    
    var insertPosition: js.UndefOr[SortableListBaseInsertPosition] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object SortableListBaseProps {
    
    inline def apply(): SortableListBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableListBaseProps]
    }
    
    extension [Self <: SortableListBaseProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragPreview(value: Boolean): Self = StObject.set(x, "dragPreview", value.asInstanceOf[js.Any])
      
      inline def setDragPreviewUndefined: Self = StObject.set(x, "dragPreview", js.undefined)
      
      inline def setInsertPosition(value: SortableListBaseInsertPosition): Self = StObject.set(x, "insertPosition", value.asInstanceOf[js.Any])
      
      inline def setInsertPositionUndefined: Self = StObject.set(x, "insertPosition", js.undefined)
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
}
