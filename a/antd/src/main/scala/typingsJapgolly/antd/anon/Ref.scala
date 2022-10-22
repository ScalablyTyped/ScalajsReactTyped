package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libCascaderMod.CascaderRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[CascaderRef]] = js.undefined
}
object Ref {
  
  inline def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[CascaderRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: CascaderRef | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: CascaderRef | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
