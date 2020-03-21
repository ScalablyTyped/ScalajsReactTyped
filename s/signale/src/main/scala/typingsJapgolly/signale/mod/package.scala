package typingsJapgolly.signale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type Signale[TTypes /* <: java.lang.String */] = typingsJapgolly.signale.mod.SignaleBase[TTypes] with (typingsJapgolly.std.Record[TTypes, typingsJapgolly.signale.mod.LoggerFunc]) with typingsJapgolly.signale.RecordDefaultMethodsLogge
}
