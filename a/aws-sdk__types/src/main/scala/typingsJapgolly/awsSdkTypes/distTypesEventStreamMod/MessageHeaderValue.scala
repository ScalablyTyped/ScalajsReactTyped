package typingsJapgolly.awsSdkTypes.distTypesEventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue
  - typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue
*/
trait MessageHeaderValue extends StObject
object MessageHeaderValue {
  
  inline def BinaryHeaderValue(value: js.typedarray.Uint8Array): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BinaryHeaderValue]
  }
  
  inline def BooleanHeaderValue(value: Boolean): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.BooleanHeaderValue]
  }
  
  inline def ByteHeaderValue(value: Double): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ByteHeaderValue]
  }
  
  inline def IntegerHeaderValue(value: Double): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.IntegerHeaderValue]
  }
  
  inline def LongHeaderValue(value: Int64): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.LongHeaderValue]
  }
  
  inline def ShortHeaderValue(value: Double): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.ShortHeaderValue]
  }
  
  inline def StringHeaderValue(value: String): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.StringHeaderValue]
  }
  
  inline def TimestampHeaderValue(value: js.Date): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.TimestampHeaderValue]
  }
  
  inline def UuidHeaderValue(value: String): typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.UuidHeaderValue]
  }
}
