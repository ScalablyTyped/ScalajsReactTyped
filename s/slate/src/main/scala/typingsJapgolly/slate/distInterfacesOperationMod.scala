package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesCustomTypesMod.ExtendedType
import typingsJapgolly.slate.distInterfacesNodeMod.Node
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesRangeMod.Range
import typingsJapgolly.slate.slateStrings.insert_node
import typingsJapgolly.slate.slateStrings.insert_text
import typingsJapgolly.slate.slateStrings.merge_node
import typingsJapgolly.slate.slateStrings.move_node
import typingsJapgolly.slate.slateStrings.remove_node
import typingsJapgolly.slate.slateStrings.remove_text
import typingsJapgolly.slate.slateStrings.set_node
import typingsJapgolly.slate.slateStrings.split_node
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesOperationMod {
  
  @JSImport("slate/dist/interfaces/operation", "Operation")
  @js.native
  val Operation: OperationInterface = js.native
  type Operation = ExtendedType[typingsJapgolly.slate.slateStrings.Operation, BaseOperation]
  
  trait BaseInsertNodeOperation extends StObject {
    
    var node: Node
    
    var path: Path
    
    var `type`: insert_node
  }
  object BaseInsertNodeOperation {
    
    inline def apply(node: Node, path: Path): BaseInsertNodeOperation = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert_node")
      __obj.asInstanceOf[BaseInsertNodeOperation]
    }
    
    extension [Self <: BaseInsertNodeOperation](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: insert_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseInsertTextOperation extends StObject {
    
    var offset: Double
    
    var path: Path
    
    var text: String
    
    var `type`: insert_text
  }
  object BaseInsertTextOperation {
    
    inline def apply(offset: Double, path: Path, text: String): BaseInsertTextOperation = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("insert_text")
      __obj.asInstanceOf[BaseInsertTextOperation]
    }
    
    extension [Self <: BaseInsertTextOperation](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: insert_text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseMergeNodeOperation extends StObject {
    
    var path: Path
    
    var position: Double
    
    var properties: Partial[Node]
    
    var `type`: merge_node
  }
  object BaseMergeNodeOperation {
    
    inline def apply(path: Path, position: Double, properties: Partial[Node]): BaseMergeNodeOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("merge_node")
      __obj.asInstanceOf[BaseMergeNodeOperation]
    }
    
    extension [Self <: BaseMergeNodeOperation](x: Self) {
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Partial[Node]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: merge_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseMoveNodeOperation extends StObject {
    
    var newPath: Path
    
    var path: Path
    
    var `type`: move_node
  }
  object BaseMoveNodeOperation {
    
    inline def apply(newPath: Path, path: Path): BaseMoveNodeOperation = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("move_node")
      __obj.asInstanceOf[BaseMoveNodeOperation]
    }
    
    extension [Self <: BaseMoveNodeOperation](x: Self) {
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: Double*): Self = StObject.set(x, "newPath", js.Array(value*))
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: move_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseOperation = NodeOperation | SelectionOperation | TextOperation
  
  trait BaseRemoveNodeOperation extends StObject {
    
    var node: Node
    
    var path: Path
    
    var `type`: remove_node
  }
  object BaseRemoveNodeOperation {
    
    inline def apply(node: Node, path: Path): BaseRemoveNodeOperation = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove_node")
      __obj.asInstanceOf[BaseRemoveNodeOperation]
    }
    
    extension [Self <: BaseRemoveNodeOperation](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setType(value: remove_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseRemoveTextOperation extends StObject {
    
    var offset: Double
    
    var path: Path
    
    var text: String
    
    var `type`: remove_text
  }
  object BaseRemoveTextOperation {
    
    inline def apply(offset: Double, path: Path, text: String): BaseRemoveTextOperation = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove_text")
      __obj.asInstanceOf[BaseRemoveTextOperation]
    }
    
    extension [Self <: BaseRemoveTextOperation](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: remove_text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseSetNodeOperation extends StObject {
    
    var newProperties: Partial[Node]
    
    var path: Path
    
    var properties: Partial[Node]
    
    var `type`: set_node
  }
  object BaseSetNodeOperation {
    
    inline def apply(newProperties: Partial[Node], path: Path, properties: Partial[Node]): BaseSetNodeOperation = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_node")
      __obj.asInstanceOf[BaseSetNodeOperation]
    }
    
    extension [Self <: BaseSetNodeOperation](x: Self) {
      
      inline def setNewProperties(value: Partial[Node]): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setProperties(value: Partial[Node]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: set_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.slate.anon.NewProperties
    - typingsJapgolly.slate.anon.Properties
    - typingsJapgolly.slate.anon.Type
  */
  trait BaseSetSelectionOperation extends StObject
  object BaseSetSelectionOperation {
    
    inline def NewProperties(newProperties: Range, properties: Null): typingsJapgolly.slate.anon.NewProperties = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[typingsJapgolly.slate.anon.NewProperties]
    }
    
    inline def Properties(newProperties: Partial[Range], properties: Partial[Range]): typingsJapgolly.slate.anon.Properties = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[typingsJapgolly.slate.anon.Properties]
    }
    
    inline def Type(newProperties: Null, properties: Range): typingsJapgolly.slate.anon.Type = {
      val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("set_selection")
      __obj.asInstanceOf[typingsJapgolly.slate.anon.Type]
    }
  }
  
  trait BaseSplitNodeOperation extends StObject {
    
    var path: Path
    
    var position: Double
    
    var properties: Partial[Node]
    
    var `type`: split_node
  }
  object BaseSplitNodeOperation {
    
    inline def apply(path: Path, position: Double, properties: Partial[Node]): BaseSplitNodeOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("split_node")
      __obj.asInstanceOf[BaseSplitNodeOperation]
    }
    
    extension [Self <: BaseSplitNodeOperation](x: Self) {
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Partial[Node]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: split_node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type InsertNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.InsertNodeOperation, BaseInsertNodeOperation]
  
  type InsertTextOperation = ExtendedType[typingsJapgolly.slate.slateStrings.InsertTextOperation, BaseInsertTextOperation]
  
  type MergeNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.MergeNodeOperation, BaseMergeNodeOperation]
  
  type MoveNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.MoveNodeOperation, BaseMoveNodeOperation]
  
  type NodeOperation = InsertNodeOperation | MergeNodeOperation | MoveNodeOperation | RemoveNodeOperation | SetNodeOperation | SplitNodeOperation
  
  trait OperationInterface extends StObject {
    
    def inverse(op: typingsJapgolly.slate.distInterfacesOperationMod.Operation): typingsJapgolly.slate.distInterfacesOperationMod.Operation
    
    def isNodeOperation(value: Any): /* is slate.slate/dist/interfaces/operation.NodeOperation */ Boolean
    
    def isOperation(value: Any): /* is slate.slate/dist/interfaces/operation.Operation */ Boolean
    
    def isOperationList(value: Any): /* is std.Array<slate.slate/dist/interfaces/operation.Operation> */ Boolean
    
    def isSelectionOperation(value: Any): /* is slate.slate/dist/interfaces/operation.SelectionOperation */ Boolean
    
    def isTextOperation(value: Any): /* is slate.slate/dist/interfaces/operation.TextOperation */ Boolean
  }
  object OperationInterface {
    
    inline def apply(
      inverse: typingsJapgolly.slate.distInterfacesOperationMod.Operation => typingsJapgolly.slate.distInterfacesOperationMod.Operation,
      isNodeOperation: Any => /* is slate.slate/dist/interfaces/operation.NodeOperation */ Boolean,
      isOperation: Any => /* is slate.slate/dist/interfaces/operation.Operation */ Boolean,
      isOperationList: Any => /* is std.Array<slate.slate/dist/interfaces/operation.Operation> */ Boolean,
      isSelectionOperation: Any => /* is slate.slate/dist/interfaces/operation.SelectionOperation */ Boolean,
      isTextOperation: Any => /* is slate.slate/dist/interfaces/operation.TextOperation */ Boolean
    ): OperationInterface = {
      val __obj = js.Dynamic.literal(inverse = js.Any.fromFunction1(inverse), isNodeOperation = js.Any.fromFunction1(isNodeOperation), isOperation = js.Any.fromFunction1(isOperation), isOperationList = js.Any.fromFunction1(isOperationList), isSelectionOperation = js.Any.fromFunction1(isSelectionOperation), isTextOperation = js.Any.fromFunction1(isTextOperation))
      __obj.asInstanceOf[OperationInterface]
    }
    
    extension [Self <: OperationInterface](x: Self) {
      
      inline def setInverse(
        value: typingsJapgolly.slate.distInterfacesOperationMod.Operation => typingsJapgolly.slate.distInterfacesOperationMod.Operation
      ): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
      
      inline def setIsNodeOperation(value: Any => /* is slate.slate/dist/interfaces/operation.NodeOperation */ Boolean): Self = StObject.set(x, "isNodeOperation", js.Any.fromFunction1(value))
      
      inline def setIsOperation(value: Any => /* is slate.slate/dist/interfaces/operation.Operation */ Boolean): Self = StObject.set(x, "isOperation", js.Any.fromFunction1(value))
      
      inline def setIsOperationList(value: Any => /* is std.Array<slate.slate/dist/interfaces/operation.Operation> */ Boolean): Self = StObject.set(x, "isOperationList", js.Any.fromFunction1(value))
      
      inline def setIsSelectionOperation(value: Any => /* is slate.slate/dist/interfaces/operation.SelectionOperation */ Boolean): Self = StObject.set(x, "isSelectionOperation", js.Any.fromFunction1(value))
      
      inline def setIsTextOperation(value: Any => /* is slate.slate/dist/interfaces/operation.TextOperation */ Boolean): Self = StObject.set(x, "isTextOperation", js.Any.fromFunction1(value))
    }
  }
  
  type RemoveNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.RemoveNodeOperation, BaseRemoveNodeOperation]
  
  type RemoveTextOperation = ExtendedType[typingsJapgolly.slate.slateStrings.RemoveTextOperation, BaseRemoveTextOperation]
  
  type SelectionOperation = SetSelectionOperation
  
  type SetNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.SetNodeOperation, BaseSetNodeOperation]
  
  type SetSelectionOperation = ExtendedType[
    typingsJapgolly.slate.slateStrings.SetSelectionOperation, 
    BaseSetSelectionOperation
  ]
  
  type SplitNodeOperation = ExtendedType[typingsJapgolly.slate.slateStrings.SplitNodeOperation, BaseSplitNodeOperation]
  
  type TextOperation = InsertTextOperation | RemoveTextOperation
}
