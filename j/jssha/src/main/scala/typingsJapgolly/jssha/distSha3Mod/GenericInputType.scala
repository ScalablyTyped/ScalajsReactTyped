package typingsJapgolly.jssha.distSha3Mod

import typingsJapgolly.jssha.jsshaStrings.B64
import typingsJapgolly.jssha.jsshaStrings.BYTES
import typingsJapgolly.jssha.jsshaStrings.HEX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jssha.anon.ValueString
  - typingsJapgolly.jssha.anon.Value
  - typingsJapgolly.jssha.anon.FormatValue
  - typingsJapgolly.jssha.anon.ValueUint8Array
*/
trait GenericInputType extends StObject
object GenericInputType {
  
  inline def FormatValue(value: js.typedarray.ArrayBuffer): typingsJapgolly.jssha.anon.FormatValue = {
    val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssha.anon.FormatValue]
  }
  
  inline def Value(format: B64 | HEX | BYTES, value: String): typingsJapgolly.jssha.anon.Value = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssha.anon.Value]
  }
  
  inline def ValueString(value: String): typingsJapgolly.jssha.anon.ValueString = {
    val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssha.anon.ValueString]
  }
  
  inline def ValueUint8Array(value: js.typedarray.Uint8Array): typingsJapgolly.jssha.anon.ValueUint8Array = {
    val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jssha.anon.ValueUint8Array]
  }
}
