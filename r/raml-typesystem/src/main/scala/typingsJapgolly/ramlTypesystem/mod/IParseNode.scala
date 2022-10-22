package typingsJapgolly.ramlTypesystem.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParseNode extends StObject {
  
  /**
    * child with a given key
    * @param k
    */
  def childWithKey(k: String): IParseNode
  
  /**
    * node children
    */
  def children(): js.Array[IParseNode]
  
  /**
    * node key
    */
  def key(): String
  
  /**
    * kind of the node
    */
  def kind(): NodeKind
  
  /**
    * node value
    */
  def value(): Any
}
object IParseNode {
  
  inline def apply(
    childWithKey: String => IParseNode,
    children: CallbackTo[js.Array[IParseNode]],
    key: CallbackTo[String],
    kind: CallbackTo[NodeKind],
    value: CallbackTo[Any]
  ): IParseNode = {
    val __obj = js.Dynamic.literal(childWithKey = js.Any.fromFunction1(childWithKey), children = children.toJsFn, key = key.toJsFn, kind = kind.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[IParseNode]
  }
  
  extension [Self <: IParseNode](x: Self) {
    
    inline def setChildWithKey(value: String => IParseNode): Self = StObject.set(x, "childWithKey", js.Any.fromFunction1(value))
    
    inline def setChildren(value: CallbackTo[js.Array[IParseNode]]): Self = StObject.set(x, "children", value.toJsFn)
    
    inline def setKey(value: CallbackTo[String]): Self = StObject.set(x, "key", value.toJsFn)
    
    inline def setKind(value: CallbackTo[NodeKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
