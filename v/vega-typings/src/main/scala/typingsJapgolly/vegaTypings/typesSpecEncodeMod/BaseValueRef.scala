package typingsJapgolly.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
  - typingsJapgolly.vegaTypings.anon.Value[T]
  - typingsJapgolly.vegaTypings.anon.Field
*/
trait BaseValueRef[T]
  extends StObject
     with ScaledValueRef[T]
object BaseValueRef {
  
  inline def Field(field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): typingsJapgolly.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Field]
  }
  
  inline def SignalRef(signal: String): typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef]
  }
  
  inline def Value[T](): typingsJapgolly.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal(value = null)
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Value[T]]
  }
}
