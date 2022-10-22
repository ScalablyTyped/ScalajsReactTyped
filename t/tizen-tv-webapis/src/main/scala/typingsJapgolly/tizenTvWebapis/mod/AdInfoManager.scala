package typingsJapgolly.tizenTvWebapis.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdInfoManager extends StObject {
  
  /**
    * TIFA is a randomized, non-persistent, and resettable Samsung Smart TV device identifier.
    * The personal information collected for the purpose of providing advertisement is linked to TIFA (collectively "TIFA Information").
    * TIFA shall be collected and used only for the following purposes. Any other purpose is prohibited.
    * - In-app advertisements
    * - Installation of other applications through your in-app advertisement
    * - Running another application (including apps already installed on the Samsung Smart TV), web browser or video player through your in-app advertisement.
    * - Collecting the app usage data related to the in-app advertisement (e.g. in-app subscription, in-app contents purchasement, or etc.) for the purpose of analyzing in-app advertisement attribution.
    * TIFA will be newly generated whenever user resets the TIFA, and you shall agree not to map any previous TIFA with the newly generated TIFA ("mapping" means tracking and identifying any previous TIFA with the newly generated TIFA).
    * The encrypted protocol (e.g: https) shall be used when the TIFA is sent outside of the device.
    * TIFA shall not be connected to personally-identifiable information or associated with any persistent device identifier (e.g. DUID, MAC address, etc).
    * The collection and use of the TIFA Information shall be in compliance with all applicable privacy and data protection laws and regulations including getting prior consent from the user.
    *
    * @returns ID For Advertising
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/adinfo
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, If the application call this method when the PSID is a null value.
    *
    * @version 1.0
    *
    * @since 2.4
    */
  def getTIFA(): String
  
  /**
    * Retrieves the plugin version number.
    *
    * @returns Plugin version
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/adinfo
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @version 1.0
    *
    * @since 2.4
    */
  def getVersion(): String
  
  /**
    * Checks whether the device has limited ad tracking.
    *
    * @returns boolean value value to indicate whether limited ad tracking is set.
    * - true: Limit Ad Tracking
    * - false: Not Limit Ad Tracking
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/adinfo
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @version 1.0
    *
    * @since 2.4
    */
  def isLATEnabled(): Boolean
}
object AdInfoManager {
  
  inline def apply(getTIFA: CallbackTo[String], getVersion: CallbackTo[String], isLATEnabled: CallbackTo[Boolean]): AdInfoManager = {
    val __obj = js.Dynamic.literal(getTIFA = getTIFA.toJsFn, getVersion = getVersion.toJsFn, isLATEnabled = isLATEnabled.toJsFn)
    __obj.asInstanceOf[AdInfoManager]
  }
  
  extension [Self <: AdInfoManager](x: Self) {
    
    inline def setGetTIFA(value: CallbackTo[String]): Self = StObject.set(x, "getTIFA", value.toJsFn)
    
    inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
    
    inline def setIsLATEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLATEnabled", value.toJsFn)
  }
}
