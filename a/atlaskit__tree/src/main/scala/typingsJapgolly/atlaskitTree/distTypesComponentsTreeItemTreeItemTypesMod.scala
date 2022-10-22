package typingsJapgolly.atlaskitTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.atlaskitTree.atlaskitTreeStrings.none
import typingsJapgolly.atlaskitTree.distTypesTypesMod.ItemId
import typingsJapgolly.atlaskitTree.distTypesTypesMod.Path
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTreeItemTreeItemTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsJapgolly.atlaskitTree.atlaskitTreeStrings.mouse
    - typingsJapgolly.atlaskitTree.atlaskitTreeStrings.key
    - typingsJapgolly.atlaskitTree.atlaskitTreeStrings.touch
  */
  type DragActionType = _DragActionType | Null
  
  @js.native
  trait Props extends StObject {
    
    var item: TreeItem = js.native
    
    def itemRef(itemId: ItemId): Unit = js.native
    def itemRef(itemId: ItemId, element: HTMLElement): Unit = js.native
    
    var offsetPerLevel: Double = js.native
    
    def onCollapse(itemId: ItemId, path: Path): Unit = js.native
    
    def onExpand(itemId: ItemId, path: Path): Unit = js.native
    
    var path: Path = js.native
    
    var provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any = js.native
    
    def renderItem(item: RenderItemParams): Node = js.native
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any = js.native
  }
  
  trait RenderItemParams extends StObject {
    
    var depth: Double
    
    var item: TreeItem
    
    def onCollapse(itemId: ItemId): Unit
    
    def onExpand(itemId: ItemId): Unit
    
    var provided: TreeDraggableProvided
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
  }
  object RenderItemParams {
    
    inline def apply(
      depth: Double,
      item: TreeItem,
      onCollapse: ItemId => Callback,
      onExpand: ItemId => Callback,
      provided: TreeDraggableProvided,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): RenderItemParams = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1((t0: ItemId) => onCollapse(t0).runNow()), onExpand = js.Any.fromFunction1((t0: ItemId) => onExpand(t0).runNow()), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItemParams]
    }
    
    extension [Self <: RenderItemParams](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setItem(value: TreeItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnCollapse(value: ItemId => Callback): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1((t0: ItemId) => value(t0).runNow()))
      
      inline def setOnExpand(value: ItemId => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction1((t0: ItemId) => value(t0).runNow()))
      
      inline def setProvided(value: TreeDraggableProvided): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
      ): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeDraggableProvided extends StObject {
    
    var dragHandleProps: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvidedDragHandleProps */ Any) | Null = js.native
    
    var draggableProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvidedDraggableProps */ Any = js.native
    
    def innerRef(): Unit = js.native
    def innerRef(el: HTMLElement): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggingStyle * / any */ trait TreeDraggingStyle extends StObject {
    
    var paddingLeft: Double
    
    var transition: none | String
  }
  object TreeDraggingStyle {
    
    inline def apply(paddingLeft: Double, transition: none | String): TreeDraggingStyle = {
      val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDraggingStyle]
    }
    
    extension [Self <: TreeDraggingStyle](x: Self) {
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: none | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait _DragActionType extends StObject
}
