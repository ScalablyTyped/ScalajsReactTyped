package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashableObject extends StObject {
  
  def updateHash(arg0: Hash): Unit
}
object HashableObject {
  
  inline def apply(updateHash: Hash => Callback): HashableObject = {
    val __obj = js.Dynamic.literal(updateHash = js.Any.fromFunction1((t0: Hash) => updateHash(t0).runNow()))
    __obj.asInstanceOf[HashableObject]
  }
  
  extension [Self <: HashableObject](x: Self) {
    
    inline def setUpdateHash(value: Hash => Callback): Self = StObject.set(x, "updateHash", js.Any.fromFunction1((t0: Hash) => value(t0).runNow()))
  }
}
