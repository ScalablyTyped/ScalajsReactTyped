package typingsJapgolly.mongodb.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.mongodb.mod.MongoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  def open(mongoClient: MongoClient): Unit
}
object Open {
  
  inline def apply(open: MongoClient => Callback): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction1((t0: MongoClient) => open(t0).runNow()))
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: MongoClient => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: MongoClient) => value(t0).runNow()))
  }
}
