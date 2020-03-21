package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDrawer extends Widget {
  /** Gets the drawer's content. */
  def content(): dxElement = js.native
  /** Closes the drawer. */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Opens the drawer. */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Opens or closes the drawer, reversing the current state. */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

