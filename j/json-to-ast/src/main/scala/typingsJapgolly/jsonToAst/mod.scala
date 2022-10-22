package typingsJapgolly.jsonToAst

import typingsJapgolly.jsonToAst.jsonToAstStrings.Array
import typingsJapgolly.jsonToAst.jsonToAstStrings.Identifier
import typingsJapgolly.jsonToAst.jsonToAstStrings.Literal
import typingsJapgolly.jsonToAst.jsonToAstStrings.Object
import typingsJapgolly.jsonToAst.jsonToAstStrings.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(json: String): ValueNode = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[ValueNode]
  inline def apply(json: String, settings: Options): ValueNode = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[ValueNode]
  
  @JSImport("json-to-ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ASTNode extends StObject {
    
    var loc: js.UndefOr[Location] = js.undefined
    
    var `type`: String
  }
  object ASTNode {
    
    inline def apply(`type`: String): ASTNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    extension [Self <: ASTNode](x: Self) {
      
      inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArrayNode
    extends StObject
       with ASTNode
       with ValueNode {
    
    var children: js.Array[ValueNode]
    
    @JSName("type")
    var type_ArrayNode: Array
  }
  object ArrayNode {
    
    inline def apply(children: js.Array[ValueNode]): ArrayNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[ArrayNode]
    }
    
    extension [Self <: ArrayNode](x: Self) {
      
      inline def setChildren(value: js.Array[ValueNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ValueNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: Array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentifierNode
    extends StObject
       with ASTNode {
    
    var raw: String
    
    @JSName("type")
    var type_IdentifierNode: Identifier
    
    var value: String
  }
  object IdentifierNode {
    
    inline def apply(raw: String, value: String): IdentifierNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Identifier")
      __obj.asInstanceOf[IdentifierNode]
    }
    
    extension [Self <: IdentifierNode](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiteralNode
    extends StObject
       with ASTNode
       with ValueNode {
    
    var raw: String
    
    @JSName("type")
    var type_LiteralNode: Literal
    
    var value: String | Double | Boolean | Null
  }
  object LiteralNode {
    
    inline def apply(raw: String): LiteralNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("Literal")
      __obj.asInstanceOf[LiteralNode]
    }
    
    extension [Self <: LiteralNode](x: Self) {
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setType(value: Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait Location extends StObject {
    
    var end: Position
    
    var source: String | Null
    
    var start: Position
  }
  object Location {
    
    inline def apply(end: Position, start: Position): Location = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], source = null)
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectNode
    extends StObject
       with ASTNode
       with ValueNode {
    
    var children: js.Array[PropertyNode]
    
    @JSName("type")
    var type_ObjectNode: Object
  }
  object ObjectNode {
    
    inline def apply(children: js.Array[PropertyNode]): ObjectNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Object")
      __obj.asInstanceOf[ObjectNode]
    }
    
    extension [Self <: ObjectNode](x: Self) {
      
      inline def setChildren(value: js.Array[PropertyNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PropertyNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Appends location information.
      *
      * @default true
      */
    var loc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Appends source information to node’s location.
      *
      * @default null
      */
    var source: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object Position {
    
    inline def apply(column: Double, line: Double, offset: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyNode
    extends StObject
       with ASTNode {
    
    var key: IdentifierNode
    
    @JSName("type")
    var type_PropertyNode: Property
    
    var value: ValueNode
  }
  object PropertyNode {
    
    inline def apply(key: IdentifierNode, value: ValueNode): PropertyNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Property")
      __obj.asInstanceOf[PropertyNode]
    }
    
    extension [Self <: PropertyNode](x: Self) {
      
      inline def setKey(value: IdentifierNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ValueNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonToAst.mod.ObjectNode
    - typingsJapgolly.jsonToAst.mod.ArrayNode
    - typingsJapgolly.jsonToAst.mod.LiteralNode
  */
  trait ValueNode extends StObject
  object ValueNode {
    
    inline def ArrayNode(children: js.Array[ValueNode]): typingsJapgolly.jsonToAst.mod.ArrayNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Array")
      __obj.asInstanceOf[typingsJapgolly.jsonToAst.mod.ArrayNode]
    }
    
    inline def LiteralNode(raw: String): typingsJapgolly.jsonToAst.mod.LiteralNode = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = null)
      __obj.updateDynamic("type")("Literal")
      __obj.asInstanceOf[typingsJapgolly.jsonToAst.mod.LiteralNode]
    }
    
    inline def ObjectNode(children: js.Array[PropertyNode]): typingsJapgolly.jsonToAst.mod.ObjectNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Object")
      __obj.asInstanceOf[typingsJapgolly.jsonToAst.mod.ObjectNode]
    }
  }
}
