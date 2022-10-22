package typingsJapgolly.lesgo

import typingsJapgolly.lesgo.lesgoStrings.`enum`
import typingsJapgolly.lesgo.lesgoStrings.`object`
import typingsJapgolly.lesgo.lesgoStrings.array
import typingsJapgolly.lesgo.lesgoStrings.decimal
import typingsJapgolly.lesgo.lesgoStrings.email
import typingsJapgolly.lesgo.lesgoStrings.number
import typingsJapgolly.lesgo.lesgoStrings.string
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsValidateFieldsMod {
  
  @JSImport("lesgo/utils/validateFields", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TParams /* <: Record[String, Any] */](
    params: Partial[Record[/* keyof TParams */ String, Any]],
    validFields: js.Array[Validation[String]]
  ): Partial[Record[/* keyof TParams */ String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], validFields.asInstanceOf[js.Any])).asInstanceOf[Partial[Record[/* keyof TParams */ String, Any]]]
  
  trait Validation[T] extends StObject {
    
    var key: T
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: string | `object` | number | decimal | email | array | `enum` | String
  }
  object Validation {
    
    inline def apply[T](key: T, `type`: string | `object` | number | decimal | email | array | `enum` | String): Validation[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validation[T]]
    }
    
    extension [Self <: Validation[?], T](x: Self & Validation[T]) {
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: string | `object` | number | decimal | email | array | `enum` | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
