package typingsJapgolly.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expandable {
  type rowExpandedStateChangedHandler[TEntity] = js.Function1[/* row */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], scala.Unit]
}
