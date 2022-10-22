package typingsJapgolly.reactWidgets.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactWidgets.esmListMod.ListHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: typingsJapgolly.react.mod.Ref[ListHandle]
}
object Ref {
  
  inline def apply(): Ref = {
    val __obj = js.Dynamic.literal(ref = null)
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[ListHandle]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: ListHandle | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ListHandle | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
