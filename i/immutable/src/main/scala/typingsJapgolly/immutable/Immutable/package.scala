package typingsJapgolly.immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Immutable {
  type RecordOf[TProps /* <: js.Object */] = typingsJapgolly.immutable.Immutable.Record[TProps] with TProps
}
