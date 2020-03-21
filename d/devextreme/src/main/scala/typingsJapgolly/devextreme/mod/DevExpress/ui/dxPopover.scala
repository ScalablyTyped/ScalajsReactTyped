package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.mod._Global_.JQuery
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopover extends dxOverlay {
  /** Shows the widget for a target element. */
  def show(target: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: JQuery): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: Element): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

