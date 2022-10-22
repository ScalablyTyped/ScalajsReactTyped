package typingsJapgolly.rcFieldForm.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[Values] extends StObject {
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[FormInstance[Values]]] = js.undefined
}
object Ref {
  
  inline def apply[Values](): Ref[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[Values]]
  }
  
  extension [Self <: Ref[?], Values](x: Self & Ref[Values]) {
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: FormInstance[Values] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: FormInstance[Values] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
