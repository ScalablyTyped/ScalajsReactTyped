package typingsJapgolly.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecEncodeMod.BaseValueRef[T]
  - typingsJapgolly.vegaTypings.anon.Scale
  - typingsJapgolly.vegaTypings.anon.FieldScale
  - typingsJapgolly.vegaTypings.anon.Band
  - typingsJapgolly.vegaTypings.anon.Range
*/
trait ScaledValueRef[T] extends StObject
object ScaledValueRef {
  
  inline def Band(band: Boolean | Double, scale: Field): typingsJapgolly.vegaTypings.anon.Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Band]
  }
  
  inline def Field(field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): typingsJapgolly.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Field]
  }
  
  inline def FieldScale(field: Field, scale: Field): typingsJapgolly.vegaTypings.anon.FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.FieldScale]
  }
  
  inline def Range(range: Double | Boolean, scale: Field): typingsJapgolly.vegaTypings.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Range]
  }
  
  inline def Scale(scale: Field): typingsJapgolly.vegaTypings.anon.Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.Scale]
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
