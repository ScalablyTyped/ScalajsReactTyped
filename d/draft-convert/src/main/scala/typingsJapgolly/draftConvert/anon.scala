package typingsJapgolly.draftConvert

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.draftConvert.mod.EntityKey
import typingsJapgolly.draftConvert.mod._Tag
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftBlockType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[B /* <: DraftBlockType */] extends StObject {
    
    var data: js.Object
    
    var `type`: B
  }
  object Data {
    
    inline def apply[B /* <: DraftBlockType */](data: js.Object, `type`: B): Data[B] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[B]]
    }
    
    extension [Self <: Data[?], B /* <: DraftBlockType */](x: Self & Data[B]) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: B): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with _Tag {
    
    var element: Node
    
    var empty: js.UndefOr[Node] = js.undefined
  }
  object Element {
    
    inline def apply(): Element = {
      val __obj = js.Dynamic.literal(element = null)
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setElement(value: VdomNode): Self = StObject.set(x, "element", value.rawNode.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setElementVarargs(
        value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
      ): Self = StObject.set(x, "element", js.Array(value*))
      
      inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEmpty(value: VdomNode): Self = StObject.set(x, "empty", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyNull: Self = StObject.set(x, "empty", null)
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setEmptyVarargs(
        value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
      ): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setEmptyVdomElement(value: VdomElement): Self = StObject.set(x, "empty", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Empty
    extends StObject
       with _Tag {
    
    var empty: js.UndefOr[String] = js.undefined
    
    var end: String
    
    var start: String
  }
  object Empty {
    
    inline def apply(end: String, start: String): Empty = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty]
    }
    
    extension [Self <: Empty](x: Self) {
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entity extends StObject {
    
    var entity: EntityKey
    
    var length: Double
    
    var offset: Double
    
    var result: js.UndefOr[String] = js.undefined
  }
  object Entity {
    
    inline def apply(entity: EntityKey, length: Double, offset: Double): Entity = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    extension [Self <: Entity](x: Self) {
      
      inline def setEntity(value: EntityKey): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
