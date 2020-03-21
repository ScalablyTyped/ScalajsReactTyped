package typingsJapgolly.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6Definition
import typingsJapgolly.reactJsonschemaForm.mod.PathSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "toPathSchema")
@js.native
object toPathSchema extends js.Object {
  def apply[T](
    schema: JSONSchema6Definition,
    name: js.UndefOr[scala.Nothing],
    definitions: StringDictionary[js.Any]
  ): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  def apply[T](
    schema: JSONSchema6Definition,
    name: js.UndefOr[scala.Nothing],
    definitions: StringDictionary[js.Any],
    formData: T
  ): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  def apply[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[js.Any]): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  def apply[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[js.Any], formData: T): PathSchema[_] | js.Array[PathSchema[_]] = js.native
}

