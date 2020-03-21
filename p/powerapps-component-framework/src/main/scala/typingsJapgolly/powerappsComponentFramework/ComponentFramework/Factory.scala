package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.factory
	 */
trait Factory extends js.Object {
  /**
  		 * Gets the popup service which help create Popup and manage Popup easily
  		 */
  def getPopupService(): PopupService
  /**
  		 * Requests re-rendering of the control with updated data.
  		 */
  def requestRender(): Unit
}

object Factory {
  @scala.inline
  def apply(getPopupService: CallbackTo[PopupService], requestRender: Callback): Factory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPopupService")(getPopupService.toJsFn)
    __obj.updateDynamic("requestRender")(requestRender.toJsFn)
    __obj.asInstanceOf[Factory]
  }
}

