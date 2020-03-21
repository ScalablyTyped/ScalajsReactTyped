package typingsJapgolly.reduxCablecar

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxCablecar.mod.CableCar
import typingsJapgolly.reduxCablecar.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnect extends js.Object {
  def connect(store: Store[_, AnyAction], channel: String): CableCar = js.native
  def connect(store: Store[_, AnyAction], channel: String, options: Options): CableCar = js.native
  def setProvider(actionCableProvider: String): Unit = js.native
}

