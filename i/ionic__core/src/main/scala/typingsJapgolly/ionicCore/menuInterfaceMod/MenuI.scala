package typingsJapgolly.ionicCore.menuInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.componentsMod._Global_.HTMLIonMenuElement
import typingsJapgolly.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuI extends js.Object {
  var _isOpen: Boolean = js.native
  var backdropEl: js.UndefOr[HTMLElement] = js.native
  var contentEl: js.UndefOr[HTMLElement] = js.native
  var disabled: Boolean = js.native
  var el: HTMLIonMenuElement = js.native
  var isAnimating: Boolean = js.native
  var isEndSide: Boolean = js.native
  var menuCtrl: js.UndefOr[MenuControllerI] = js.native
  var menuId: js.UndefOr[String] = js.native
  var menuInnerEl: js.UndefOr[HTMLElement] = js.native
  var side: Side = js.native
  var width: Double = js.native
  def _setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
  def _setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  def close(): js.Promise[Boolean] = js.native
  def close(animated: Boolean): js.Promise[Boolean] = js.native
  def isActive(): js.Promise[Boolean] = js.native
  def open(): js.Promise[Boolean] = js.native
  def open(animated: Boolean): js.Promise[Boolean] = js.native
  def setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
  def setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  def toggle(): js.Promise[Boolean] = js.native
  def toggle(animated: Boolean): js.Promise[Boolean] = js.native
}

