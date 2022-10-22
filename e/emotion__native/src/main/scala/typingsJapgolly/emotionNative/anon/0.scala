package typingsJapgolly.emotionNative.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[C /* <: ComponentClassP[Any & js.Object] */] extends StObject {
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[InstanceType[C]]] = js.undefined
}
object `0` {
  
  inline def apply[C /* <: ComponentClassP[Any & js.Object] */](): `0`[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[C]]
  }
  
  extension [Self <: `0`[?], C /* <: ComponentClassP[Any & js.Object] */](x: Self & `0`[C]) {
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[InstanceType[C]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: InstanceType[C] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: InstanceType[C] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
