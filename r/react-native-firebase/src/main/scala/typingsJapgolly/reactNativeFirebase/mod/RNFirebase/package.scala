package typingsJapgolly.reactNativeFirebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RNFirebase {
  type ErrorHandler = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.Handler[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.RnError]
  type Handler[T] = js.Function1[/* value */ T, scala.Unit]
}
