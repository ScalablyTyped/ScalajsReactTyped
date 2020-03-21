package typingsJapgolly.materialDialog.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialDialog.materialDialogStrings.MDCDialogColonaccept
import typingsJapgolly.materialDialog.materialDialogStrings.MDCDialogColoncancel
import typingsJapgolly.materialDialog.materialDialogStrings.`Dotmdc-dialog--open`
import typingsJapgolly.materialDialog.materialDialogStrings.`Dotmdc-dialog__footer__button--accept`
import typingsJapgolly.materialDialog.materialDialogStrings.`Dotmdc-dialog__surface`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACCEPT_EVENT: MDCDialogColonaccept
  var ACCEPT_SELECTOR: `Dotmdc-dialog__footer__button--accept`
  var CANCEL_EVENT: MDCDialogColoncancel
  var DIALOG_SURFACE_SELECTOR: `Dotmdc-dialog__surface`
  var OPEN_DIALOG_SELECTOR: `Dotmdc-dialog--open`
}

object strings {
  @scala.inline
  def apply(
    ACCEPT_EVENT: MDCDialogColonaccept,
    ACCEPT_SELECTOR: `Dotmdc-dialog__footer__button--accept`,
    CANCEL_EVENT: MDCDialogColoncancel,
    DIALOG_SURFACE_SELECTOR: `Dotmdc-dialog__surface`,
    OPEN_DIALOG_SELECTOR: `Dotmdc-dialog--open`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACCEPT_EVENT = ACCEPT_EVENT.asInstanceOf[js.Any], ACCEPT_SELECTOR = ACCEPT_SELECTOR.asInstanceOf[js.Any], CANCEL_EVENT = CANCEL_EVENT.asInstanceOf[js.Any], DIALOG_SURFACE_SELECTOR = DIALOG_SURFACE_SELECTOR.asInstanceOf[js.Any], OPEN_DIALOG_SELECTOR = OPEN_DIALOG_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

