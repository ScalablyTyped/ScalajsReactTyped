package typingsJapgolly.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form[T]
  extends Component[FormProps[T], js.Object, Any] {
  
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  
  def onChange(formData: T, newErrorSchema: ErrorSchema): Unit = js.native
  
  def submit(): Unit = js.native
  
  def validate(formData: T): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: Unit, additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: Unit,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: Unit,
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(formData: T, schema: JSONSchema6, additionalMetaSchemas: js.UndefOr[js.Array[js.Object]]): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: js.UndefOr[js.Array[js.Object]],
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
  def validate(
    formData: T,
    schema: JSONSchema6,
    additionalMetaSchemas: Unit,
    customFormats: js.UndefOr[
      StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
    ]
  ): typingsJapgolly.reactJsonschemaForm.anon.ErrorSchema = js.native
}
