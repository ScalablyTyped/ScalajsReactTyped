package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlay extends Widget {
  /** Gets the widget's content. */
  def content(): dxElement = js.native
  /** Hides the widget. */
  def hide(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** Shows the widget. */
  def show(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** Shows or hides the widget depending on the argument. */
  def toggle(showing: Boolean): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

