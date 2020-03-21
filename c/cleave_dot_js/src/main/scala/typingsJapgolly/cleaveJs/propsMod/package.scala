package typingsJapgolly.cleaveJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object propsMod {
  type ChangeEventHandler[T] = typingsJapgolly.react.mod.EventHandler[typingsJapgolly.cleaveJs.propsMod.ChangeEvent[T]]
  type InitHandler = js.Function1[/* owner */ typingsJapgolly.react.mod.ReactInstance, scala.Unit]
}
