package typingsJapgolly.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "hasWidget")
@js.native
object hasWidget extends js.Object {
  def apply(schema: JSONSchema6, widget: Widget): Boolean = js.native
  def apply(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
}

