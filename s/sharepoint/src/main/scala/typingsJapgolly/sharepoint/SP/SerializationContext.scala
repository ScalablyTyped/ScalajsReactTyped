package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationContext extends StObject {
  
  def addClientObject(obj: ClientObject): Unit
  
  def addObjectPath(path: ObjectPath): Unit
}
object SerializationContext {
  
  inline def apply(addClientObject: ClientObject => Callback, addObjectPath: ObjectPath => Callback): SerializationContext = {
    val __obj = js.Dynamic.literal(addClientObject = js.Any.fromFunction1((t0: ClientObject) => addClientObject(t0).runNow()), addObjectPath = js.Any.fromFunction1((t0: ObjectPath) => addObjectPath(t0).runNow()))
    __obj.asInstanceOf[SerializationContext]
  }
  
  extension [Self <: SerializationContext](x: Self) {
    
    inline def setAddClientObject(value: ClientObject => Callback): Self = StObject.set(x, "addClientObject", js.Any.fromFunction1((t0: ClientObject) => value(t0).runNow()))
    
    inline def setAddObjectPath(value: ObjectPath => Callback): Self = StObject.set(x, "addObjectPath", js.Any.fromFunction1((t0: ObjectPath) => value(t0).runNow()))
  }
}
