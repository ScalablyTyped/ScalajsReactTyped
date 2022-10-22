package typingsJapgolly.pg.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Submittable extends StObject {
  
  def submit(connection: Connection): Unit
}
object Submittable {
  
  inline def apply(submit: Connection => Callback): Submittable = {
    val __obj = js.Dynamic.literal(submit = js.Any.fromFunction1((t0: Connection) => submit(t0).runNow()))
    __obj.asInstanceOf[Submittable]
  }
  
  extension [Self <: Submittable](x: Self) {
    
    inline def setSubmit(value: Connection => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction1((t0: Connection) => value(t0).runNow()))
  }
}
