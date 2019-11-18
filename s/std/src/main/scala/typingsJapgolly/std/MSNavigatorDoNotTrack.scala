package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNavigatorDoNotTrack extends js.Object {
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean
  def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit
  def removeWebWideTrackingException(args: ExceptionInformation): Unit
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit
  def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit
}

object MSNavigatorDoNotTrack {
  @scala.inline
  def apply(
    confirmSiteSpecificTrackingException: ConfirmSiteSpecificExceptionsInformation => CallbackTo[scala.Boolean],
    confirmWebWideTrackingException: ExceptionInformation => CallbackTo[scala.Boolean],
    removeSiteSpecificTrackingException: ExceptionInformation => Callback,
    removeWebWideTrackingException: ExceptionInformation => Callback,
    storeSiteSpecificTrackingException: StoreSiteSpecificExceptionsInformation => Callback,
    storeWebWideTrackingException: StoreExceptionsInformation => Callback
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confirmSiteSpecificTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.ConfirmSiteSpecificExceptionsInformation) => confirmSiteSpecificTrackingException(t0).runNow()))
    __obj.updateDynamic("confirmWebWideTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.ExceptionInformation) => confirmWebWideTrackingException(t0).runNow()))
    __obj.updateDynamic("removeSiteSpecificTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.ExceptionInformation) => removeSiteSpecificTrackingException(t0).runNow()))
    __obj.updateDynamic("removeWebWideTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.ExceptionInformation) => removeWebWideTrackingException(t0).runNow()))
    __obj.updateDynamic("storeSiteSpecificTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.StoreSiteSpecificExceptionsInformation) => storeSiteSpecificTrackingException(t0).runNow()))
    __obj.updateDynamic("storeWebWideTrackingException")(js.Any.fromFunction1((t0: typingsJapgolly.std.StoreExceptionsInformation) => storeWebWideTrackingException(t0).runNow()))
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
}

