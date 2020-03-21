package typingsJapgolly.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.jsonSchema.mod.JSONSchema6Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "getDefaultFormState")
@js.native
object getDefaultFormState extends js.Object {
  def apply[T](schema: JSONSchema6, formData: T): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  def apply[T](schema: JSONSchema6, formData: T, definitions: StringDictionary[js.Any]): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  def apply[T](
    schema: JSONSchema6,
    formData: T,
    definitions: StringDictionary[js.Any],
    includeUndefinedValues: Boolean
  ): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
}

