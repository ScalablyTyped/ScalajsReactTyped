package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: ElementType | js.Array[Element]
  
  var elementType: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])
  
  var index: Double
  
  var key: String
  
  var props: Record[String, Any]
  
  var ref: typingsJapgolly.react.mod.Ref[Any]
  
  var `type`: NodeType
}
object Content {
  
  inline def apply(
    content: ElementType | js.Array[Element],
    elementType: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object]),
    index: Double,
    key: String,
    props: Record[String, Any],
    `type`: NodeType
  ): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: ElementType | js.Array[Element]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: Element*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setElementType(value: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
