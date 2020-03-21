package typingsJapgolly.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetKosState[T] = js.Function0[T]
  type KosDispatch = js.Function1[/* action */ typingsJapgolly.kosCore.mod.Action[js.Any], scala.Unit]
  type ReactComponent[P, S] = japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]
}
