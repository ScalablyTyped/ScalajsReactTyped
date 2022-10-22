package typingsJapgolly.gsi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gsi.gsiStrings.auto_cancel
import typingsJapgolly.gsi.gsiStrings.browser_not_supported
import typingsJapgolly.gsi.gsiStrings.cancel_called
import typingsJapgolly.gsi.gsiStrings.credential_returned
import typingsJapgolly.gsi.gsiStrings.dismissed
import typingsJapgolly.gsi.gsiStrings.display
import typingsJapgolly.gsi.gsiStrings.flow_restarted
import typingsJapgolly.gsi.gsiStrings.invalid_client
import typingsJapgolly.gsi.gsiStrings.issuing_failed
import typingsJapgolly.gsi.gsiStrings.missing_client_id
import typingsJapgolly.gsi.gsiStrings.opt_out_or_no_session
import typingsJapgolly.gsi.gsiStrings.secure_http_required
import typingsJapgolly.gsi.gsiStrings.skipped
import typingsJapgolly.gsi.gsiStrings.suppressed_by_user
import typingsJapgolly.gsi.gsiStrings.tap_outside
import typingsJapgolly.gsi.gsiStrings.unknown_reason
import typingsJapgolly.gsi.gsiStrings.unregistered_origin
import typingsJapgolly.gsi.gsiStrings.user_cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMomentNotification extends StObject {
  
  /** The detailed reason for the dismissal. */
  def getDismissedReason(): credential_returned | cancel_called | flow_restarted
  
  /** Return a string for the moment type. */
  def getMomentType(): display | skipped | dismissed
  
  /** The detailed reason why the UI isn't displayed. */
  def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
  
  /** The detailed reason for the skipped moment. */
  def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed
  
  /** Is this notification for a dismissed moment? */
  def isDismissedMoment(): Boolean
  
  /** Is this notification for a display moment? */
  def isDisplayMoment(): Boolean
  
  /** Is this notification for a display moment, and the UI is displayed? */
  def isDisplayed(): Boolean
  
  /** Is this notification for a display moment, and the UI isn't displayed? */
  def isNotDisplayed(): Boolean
  
  /** Is this notification for a skipped moment? */
  def isSkippedMoment(): Boolean
}
object PromptMomentNotification {
  
  inline def apply(
    getDismissedReason: CallbackTo[credential_returned | cancel_called | flow_restarted],
    getMomentType: CallbackTo[display | skipped | dismissed],
    getNotDisplayedReason: CallbackTo[
      browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
    ],
    getSkippedReason: CallbackTo[auto_cancel | user_cancel | tap_outside | issuing_failed],
    isDismissedMoment: CallbackTo[Boolean],
    isDisplayMoment: CallbackTo[Boolean],
    isDisplayed: CallbackTo[Boolean],
    isNotDisplayed: CallbackTo[Boolean],
    isSkippedMoment: CallbackTo[Boolean]
  ): PromptMomentNotification = {
    val __obj = js.Dynamic.literal(getDismissedReason = getDismissedReason.toJsFn, getMomentType = getMomentType.toJsFn, getNotDisplayedReason = getNotDisplayedReason.toJsFn, getSkippedReason = getSkippedReason.toJsFn, isDismissedMoment = isDismissedMoment.toJsFn, isDisplayMoment = isDisplayMoment.toJsFn, isDisplayed = isDisplayed.toJsFn, isNotDisplayed = isNotDisplayed.toJsFn, isSkippedMoment = isSkippedMoment.toJsFn)
    __obj.asInstanceOf[PromptMomentNotification]
  }
  
  extension [Self <: PromptMomentNotification](x: Self) {
    
    inline def setGetDismissedReason(value: CallbackTo[credential_returned | cancel_called | flow_restarted]): Self = StObject.set(x, "getDismissedReason", value.toJsFn)
    
    inline def setGetMomentType(value: CallbackTo[display | skipped | dismissed]): Self = StObject.set(x, "getMomentType", value.toJsFn)
    
    inline def setGetNotDisplayedReason(
      value: CallbackTo[
          browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
        ]
    ): Self = StObject.set(x, "getNotDisplayedReason", value.toJsFn)
    
    inline def setGetSkippedReason(value: CallbackTo[auto_cancel | user_cancel | tap_outside | issuing_failed]): Self = StObject.set(x, "getSkippedReason", value.toJsFn)
    
    inline def setIsDismissedMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDismissedMoment", value.toJsFn)
    
    inline def setIsDisplayMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayMoment", value.toJsFn)
    
    inline def setIsDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayed", value.toJsFn)
    
    inline def setIsNotDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotDisplayed", value.toJsFn)
    
    inline def setIsSkippedMoment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSkippedMoment", value.toJsFn)
  }
}
