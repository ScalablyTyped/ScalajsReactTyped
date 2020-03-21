package typingsJapgolly.reactJsonschemaForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Field = typingsJapgolly.react.mod.StatelessComponent[typingsJapgolly.reactJsonschemaForm.mod.FieldProps[js.Any]] | (japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactJsonschemaForm.mod.FieldProps[js.Any] with js.Object])
  type FieldError = java.lang.String
  type ISubmitEvent[T] = typingsJapgolly.reactJsonschemaForm.mod.IChangeEvent[T]
  type IdSchema[T] = typingsJapgolly.reactJsonschemaForm.reactJsonschemaFormStrings.IdSchema with js.Any with typingsJapgolly.reactJsonschemaForm.mod.FieldId
  type PathSchema[T] = typingsJapgolly.reactJsonschemaForm.reactJsonschemaFormStrings.PathSchema with js.Any with typingsJapgolly.reactJsonschemaForm.mod.FieldPath
  type Widget = typingsJapgolly.react.mod.StatelessComponent[typingsJapgolly.reactJsonschemaForm.mod.WidgetProps] | (japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactJsonschemaForm.mod.WidgetProps with js.Object])
}
