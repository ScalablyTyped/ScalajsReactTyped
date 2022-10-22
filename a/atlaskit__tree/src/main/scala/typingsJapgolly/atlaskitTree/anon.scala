package typingsJapgolly.atlaskitTree

import japgolly.scalajs.react.Callback
import typingsJapgolly.atlaskitTree.distTypesTypesMod.FlattenedItem
import typingsJapgolly.atlaskitTree.distTypesTypesMod.ItemId
import typingsJapgolly.atlaskitTree.distTypesTypesMod.Path
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.Array[scala.Nothing]
  }
  object Children {
    
    inline def apply(children: js.Array[scala.Nothing]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[scala.Nothing]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: scala.Nothing*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait DestinationPosition extends StObject {
    
    var destinationPosition: js.UndefOr[TreeDestinationPosition] = js.undefined
    
    var sourcePosition: TreeSourcePosition
  }
  object DestinationPosition {
    
    inline def apply(sourcePosition: TreeSourcePosition): DestinationPosition = {
      val __obj = js.Dynamic.literal(sourcePosition = sourcePosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationPosition]
    }
    
    extension [Self <: DestinationPosition](x: Self) {
      
      inline def setDestinationPosition(value: TreeDestinationPosition): Self = StObject.set(x, "destinationPosition", value.asInstanceOf[js.Any])
      
      inline def setDestinationPositionUndefined: Self = StObject.set(x, "destinationPosition", js.undefined)
      
      inline def setSourcePosition(value: TreeSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggedItemId extends StObject {
    
    var draggedItemId: js.UndefOr[ItemId] = js.undefined
    
    var flattenedTree: js.Array[FlattenedItem]
  }
  object DraggedItemId {
    
    inline def apply(flattenedTree: js.Array[FlattenedItem]): DraggedItemId = {
      val __obj = js.Dynamic.literal(flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggedItemId]
    }
    
    extension [Self <: DraggedItemId](x: Self) {
      
      inline def setDraggedItemId(value: ItemId): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      inline def setDraggedItemIdUndefined: Self = StObject.set(x, "draggedItemId", js.undefined)
      
      inline def setFlattenedTree(value: js.Array[FlattenedItem]): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTreeVarargs(value: FlattenedItem*): Self = StObject.set(x, "flattenedTree", js.Array(value*))
    }
  }
  
  trait FlatItem extends StObject {
    
    var flatItem: FlattenedItem
    
    var path: Path
    
    var provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any
    
    var snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
  }
  object FlatItem {
    
    inline def apply(
      flatItem: FlattenedItem,
      path: Path,
      provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
    ): FlatItem = {
      val __obj = js.Dynamic.literal(flatItem = flatItem.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatItem]
    }
    
    extension [Self <: FlatItem](x: Self) {
      
      inline def setFlatItem(value: FlattenedItem): Self = StObject.set(x, "flatItem", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setProvided(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any
      ): Self = StObject.set(x, "provided", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
      ): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlattenedTree extends StObject {
    
    var draggedItemId: Unit
    
    var flattenedTree: js.Array[scala.Nothing]
  }
  object FlattenedTree {
    
    inline def apply(draggedItemId: Unit, flattenedTree: js.Array[scala.Nothing]): FlattenedTree = {
      val __obj = js.Dynamic.literal(draggedItemId = draggedItemId.asInstanceOf[js.Any], flattenedTree = flattenedTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenedTree]
    }
    
    extension [Self <: FlattenedTree](x: Self) {
      
      inline def setDraggedItemId(value: Unit): Self = StObject.set(x, "draggedItemId", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTree(value: js.Array[scala.Nothing]): Self = StObject.set(x, "flattenedTree", value.asInstanceOf[js.Any])
      
      inline def setFlattenedTreeVarargs(value: scala.Nothing*): Self = StObject.set(x, "flattenedTree", js.Array(value*))
    }
  }
  
  trait IsDragEnabled extends StObject {
    
    var isDragEnabled: Boolean
    
    var isNestingEnabled: Boolean
    
    var offsetPerLevel: Double
    
    def onCollapse(): Unit
    
    def onDragEnd(): Unit
    
    def onDragStart(): Unit
    
    def onExpand(): Unit
    
    def renderItem(): Unit
    
    var tree: Children
  }
  object IsDragEnabled {
    
    inline def apply(
      isDragEnabled: Boolean,
      isNestingEnabled: Boolean,
      offsetPerLevel: Double,
      onCollapse: Callback,
      onDragEnd: Callback,
      onDragStart: Callback,
      onExpand: Callback,
      renderItem: Callback,
      tree: Children
    ): IsDragEnabled = {
      val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = onCollapse.toJsFn, onDragEnd = onDragEnd.toJsFn, onDragStart = onDragStart.toJsFn, onExpand = onExpand.toJsFn, renderItem = renderItem.toJsFn, tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDragEnabled]
    }
    
    extension [Self <: IsDragEnabled](x: Self) {
      
      inline def setIsDragEnabled(value: Boolean): Self = StObject.set(x, "isDragEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsNestingEnabled(value: Boolean): Self = StObject.set(x, "isNestingEnabled", value.asInstanceOf[js.Any])
      
      inline def setOffsetPerLevel(value: Double): Self = StObject.set(x, "offsetPerLevel", value.asInstanceOf[js.Any])
      
      inline def setOnCollapse(value: Callback): Self = StObject.set(x, "onCollapse", value.toJsFn)
      
      inline def setOnDragEnd(value: Callback): Self = StObject.set(x, "onDragEnd", value.toJsFn)
      
      inline def setOnDragStart(value: Callback): Self = StObject.set(x, "onDragStart", value.toJsFn)
      
      inline def setOnExpand(value: Callback): Self = StObject.set(x, "onExpand", value.toJsFn)
      
      inline def setRenderItem(value: Callback): Self = StObject.set(x, "renderItem", value.toJsFn)
      
      inline def setTree(value: Children): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
}
