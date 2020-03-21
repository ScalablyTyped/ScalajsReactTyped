package typingsJapgolly.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Adapter = js.Object
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.waterline.mod.StringAttribute
    - typingsJapgolly.waterline.mod.EmailAttribute
    - typingsJapgolly.waterline.mod.IntegerAttribute
    - typingsJapgolly.waterline.mod.FloatAttribute
    - typingsJapgolly.waterline.mod.DateAttribute
    - typingsJapgolly.waterline.mod.TimeAttribute
    - typingsJapgolly.waterline.mod.DatetimeAttribute
    - typingsJapgolly.waterline.mod.BooleanAttribute
    - typingsJapgolly.waterline.mod.BinaryAttribute
    - typingsJapgolly.waterline.mod.ArrayAttribute
    - typingsJapgolly.waterline.mod.JsonAttribute
    - typingsJapgolly.waterline.mod.OneToOneAttribute
    - typingsJapgolly.waterline.mod.OneToManyAttribute
    - typingsJapgolly.waterline.mod.ManyToManyAttribute
    - typingsJapgolly.waterline.mod.FunctionAttribute
  */
  type Attribute = typingsJapgolly.waterline.mod._Attribute | java.lang.String | typingsJapgolly.waterline.mod.FunctionAttribute
  type AttributeValidation[T] = T | typingsJapgolly.waterline.mod.AttributeValidationSyncFn[T] | typingsJapgolly.waterline.mod.AttributeValidationAsyncFn[T]
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type CollectionClass = js.Function0[typingsJapgolly.waterline.mod.Collection]
  type DefaultsToFn[T] = js.Function0[T]
  type FunctionAttribute = js.Function0[js.Any]
}
