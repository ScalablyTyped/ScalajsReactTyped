package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceService extends js.Object {
  /**
  		* Returns the Cordova version.
  		* @see https://github.com/apache/cordova-plugin-device#devicecordova
  		* @returns {String} The Cordova version.
  		*/
  def getCordova(): String
  /**
  		* Returns the whole device object.
  		* @see https://github.com/apache/cordova-plugin-device
  		* @returns {Object} The device object.
  		*/
  def getDevice(): IDeviceInfo
  /**
  		* Returns the device manufacturer.
  		* @returns {String}
  		*/
  def getManufacturer(): String
  /**
  		* Returns the name of the device's model or product.
  		* @see https://github.com/apache/cordova-plugin-device#devicemodel
  		* @returns {String} The name of the device's model or product.
  		*/
  def getModel(): String
  /**
  		* @deprecated device.name is deprecated as of version 2.3.0. Use device.model instead.
  		* @returns {String}
  		*/
  def getName(): String
  /**
  		* Returns the device's operating system name.
  		* @see https://github.com/apache/cordova-plugin-device#deviceplatform
  		* @returns {String} The device's operating system name.
  		*/
  def getPlatform(): String
  /**
  		* Returns the device's Universally Unique Identifier.
  		* @see https://github.com/apache/cordova-plugin-device#deviceuuid
  		* @returns {String} The device's Universally Unique Identifier
  		*/
  def getUUID(): String
  /**
  		* Returns the operating system version.
  		* @see https://github.com/apache/cordova-plugin-device#deviceversion
  		* @returns {String}
  		*/
  def getVersion(): String
}

object IDeviceService {
  @scala.inline
  def apply(
    getCordova: CallbackTo[String],
    getDevice: CallbackTo[IDeviceInfo],
    getManufacturer: CallbackTo[String],
    getModel: CallbackTo[String],
    getName: CallbackTo[String],
    getPlatform: CallbackTo[String],
    getUUID: CallbackTo[String],
    getVersion: CallbackTo[String]
  ): IDeviceService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCordova")(getCordova.toJsFn)
    __obj.updateDynamic("getDevice")(getDevice.toJsFn)
    __obj.updateDynamic("getManufacturer")(getManufacturer.toJsFn)
    __obj.updateDynamic("getModel")(getModel.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPlatform")(getPlatform.toJsFn)
    __obj.updateDynamic("getUUID")(getUUID.toJsFn)
    __obj.updateDynamic("getVersion")(getVersion.toJsFn)
    __obj.asInstanceOf[IDeviceService]
  }
}

