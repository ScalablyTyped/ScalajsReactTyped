package typingsJapgolly.parse.mod.global.Parse

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Parse.Op is an atomic operation that can be applied to a field in a
  * Parse.Object. For example, calling <code>object.set("foo", "bar")</code>
  * is an example of a Parse.Op.Set. Calling <code>object.unset("foo")</code>
  * is a Parse.Op.Unset. These operations are stored in a Parse.Object and
  * sent to the server as part of <code>object.save()</code> operations.
  * Instances of Parse.Op should be immutable.
  *
  * You should not create subclasses of Parse.Op or instantiate Parse.Op
  * directly.
  */
object Op {
  
  trait Add
    extends StObject
       with BaseOperation {
    
    def toJSON(): Any
  }
  object Add {
    
    inline def apply(objects: CallbackTo[js.Array[Any]], toJSON: CallbackTo[Any]): Add = {
      val __obj = js.Dynamic.literal(objects = objects.toJsFn, toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Add]
    }
    
    extension [Self <: Add](x: Self) {
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  trait AddUnique
    extends StObject
       with BaseOperation {
    
    def toJSON(): Any
  }
  object AddUnique {
    
    inline def apply(objects: CallbackTo[js.Array[Any]], toJSON: CallbackTo[Any]): AddUnique = {
      val __obj = js.Dynamic.literal(objects = objects.toJsFn, toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[AddUnique]
    }
    
    extension [Self <: AddUnique](x: Self) {
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  trait BaseOperation extends StObject {
    
    def objects(): js.Array[Any]
  }
  object BaseOperation {
    
    inline def apply(objects: CallbackTo[js.Array[Any]]): BaseOperation = {
      val __obj = js.Dynamic.literal(objects = objects.toJsFn)
      __obj.asInstanceOf[BaseOperation]
    }
    
    extension [Self <: BaseOperation](x: Self) {
      
      inline def setObjects(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "objects", value.toJsFn)
    }
  }
  
  trait Increment extends StObject {
    
    var amount: Double
    
    def toJSON(): Any
  }
  object Increment {
    
    inline def apply(amount: Double, toJSON: CallbackTo[Any]): Increment = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Increment]
    }
    
    extension [Self <: Increment](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  trait Relation extends StObject {
    
    def added(): js.Array[Object[Attributes]]
    
    var removed: js.Array[Object[Attributes]]
    
    def toJSON(): Any
  }
  object Relation {
    
    inline def apply(
      added: CallbackTo[js.Array[Object[Attributes]]],
      removed: js.Array[Object[Attributes]],
      toJSON: CallbackTo[Any]
    ): typingsJapgolly.parse.mod.global.Parse.Op.Relation = {
      val __obj = js.Dynamic.literal(added = added.toJsFn, removed = removed.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.parse.mod.global.Parse.Op.Relation]
    }
    
    extension [Self <: typingsJapgolly.parse.mod.global.Parse.Op.Relation](x: Self) {
      
      inline def setAdded(value: CallbackTo[js.Array[Object[Attributes]]]): Self = StObject.set(x, "added", value.toJsFn)
      
      inline def setRemoved(value: js.Array[Object[Attributes]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: Object[Attributes]*): Self = StObject.set(x, "removed", js.Array(value*))
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  trait Set extends StObject {
    
    def toJSON(): Any
    
    def value(): Any
  }
  object Set {
    
    inline def apply(toJSON: CallbackTo[Any], value: CallbackTo[Any]): Set = {
      val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn, value = value.toJsFn)
      __obj.asInstanceOf[Set]
    }
    
    extension [Self <: Set](x: Self) {
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
    }
  }
  
  trait Unset extends StObject {
    
    def toJSON(): Any
  }
  object Unset {
    
    inline def apply(toJSON: CallbackTo[Any]): Unset = {
      val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Unset]
    }
    
    extension [Self <: Unset](x: Self) {
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
}
