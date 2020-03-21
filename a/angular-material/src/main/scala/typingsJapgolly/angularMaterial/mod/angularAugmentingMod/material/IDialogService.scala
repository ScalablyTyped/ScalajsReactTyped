package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogService
  extends // indexer used to call preset dialog created with $mdDialogProvider
// see: https://material.angularjs.org/latest/api/service/$mdDialog#custom-presets
// tslint:disable-next-line:ban-types
/* presetName */ StringDictionary[Function] {
  def alert(): IAlertDialog = js.native
  def cancel(): Unit = js.native
  def cancel(response: js.Any): Unit = js.native
  def confirm(): IConfirmDialog = js.native
  def hide(): IPromise[_] = js.native
  def hide(response: js.Any): IPromise[_] = js.native
  def prompt(): IPromptDialog = js.native
  def show(dialog: IAlertDialog): IPromise[_] = js.native
  def show(dialog: IConfirmDialog): IPromise[_] = js.native
  def show(dialog: IDialogOptions): IPromise[_] = js.native
  def show(dialog: IPromptDialog): IPromise[_] = js.native
}

