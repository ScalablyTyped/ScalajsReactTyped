package typingsJapgolly.omelette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* obj */ typingsJapgolly.omelette.mod.CallbackValue, scala.Unit]
  type CallbackAsync = js.Function1[/* obj */ typingsJapgolly.omelette.mod.CallbackAsyncValue, js.Promise[scala.Unit]]
  type Choices = js.Array[java.lang.String]
  type ReplyFn[T] = js.Function1[/* value */ T, scala.Unit]
  type TemplatePrimativeValue = java.lang.String | typingsJapgolly.omelette.mod.Choices
  type TemplateValue = typingsJapgolly.omelette.mod.TemplatePrimativeValue | typingsJapgolly.omelette.mod.Callback
  type TreeValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.omelette.mod.Choices]
}
