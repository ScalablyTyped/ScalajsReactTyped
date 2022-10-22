package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opencl {
  
  trait OpenCLDevice extends StObject {
    
    /** The driver version as returned by OpenCL */
    var Driver: String
    
    /** The name of the device as returned by OpenCL */
    var Name: String
    
    /** The vendor of the device as returned by OpenCL */
    var Vendor: String
  }
  object OpenCLDevice {
    
    inline def apply(Driver: String, Name: String, Vendor: String): OpenCLDevice = {
      val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCLDevice]
    }
    
    extension [Self <: OpenCLDevice](x: Self) {
      
      inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenCLPlatform extends StObject {
    
    var Devices: SafeArray[OpenCLDevice]
    
    /** The name of the platform as returned by OpenCL */
    var Name: String
    
    var Vendor: String
  }
  object OpenCLPlatform {
    
    inline def apply(Devices: SafeArray[OpenCLDevice], Name: String, Vendor: String): OpenCLPlatform = {
      val __obj = js.Dynamic.literal(Devices = Devices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Vendor = Vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCLPlatform]
    }
    
    extension [Self <: OpenCLPlatform](x: Self) {
      
      inline def setDevices(value: SafeArray[OpenCLDevice]): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait XOpenCLSelection
    extends StObject
       with XInterface {
    
    /**
      * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
      * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
      */
    val DeviceID: Double
    
    var FormulaCellNumberLimit: Double
    
    /** lists all OpenCL devices and platforms */
    val OpenCLPlatforms: SafeArray[OpenCLPlatform]
    
    /**
      * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
      * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
      */
    val PlatformID: Double
    
    /** Disables automatic OpenCL Device Selection */
    def disableAutomaticDeviceSelection(): Unit
    
    def disableOpcodeSubsetTest(): Unit
    
    /**
      * Enables automatic OpenCL Device Selection
      * @param force forces a new evaluation of the best device
      */
    def enableAutomaticDeviceSelection(force: Boolean): Unit
    
    def enableOpcodeSubsetTest(): Unit
    
    /**
      * Enables or disables use of OpenCL for calculations. When using this API to enable OpenCL the configuration parameters are set to their built-in
      * default values, not ones read from the installation of user-specific configuration.
      */
    def enableOpenCL(enable: Boolean): Unit
    
    /**
      * returns the index of the currently selected device. This is an index into the sequence of devices in the OpenCLPLatform object the device is part of
      * in the current instance of LibreOffice (and not some a priori defined identifier for a specific model of device accessed through a specific platform).
      */
    def getDeviceID(): Double
    
    def getFormulaCellNumberLimit(): Double
    
    /** lists all OpenCL devices and platforms */
    def getOpenCLPlatforms(): SafeArray[OpenCLPlatform]
    
    /**
      * returns the index of the platform of the currently selected device. This is an index into the sequence that getOpenCLPlatforms returns in the current
      * instance of LibreOffice (and not some a priori defined identifier for an OpenCL platform).
      */
    def getPlatformID(): Double
    
    def isOpcodeSubsetTested(): Boolean
    
    /**
      * Returns true if calculation with OpenCL is enabled (at all). The actual use of OpenCL for a formula is also affected by the configuration settings
      * specifying whether OpenCL is used for all opcodes or just for a subset, and the black- and whitelists of OpenCL implementations that are in use.
      */
    def isOpenCLEnabled(): Boolean
    
    /**
      * Select the OpenCL device with the given platform and device number. The platform number corresponds to an index into the sequence returned by
      * getOpenCLPlatforms, and the device number corresponds to an index into the sequence of devices in that platform.
      */
    def selectOpenCLDevice(platform: Double, device: Double): Unit
    
    def setFormulaCellNumberLimit(number: Double): Unit
  }
  object XOpenCLSelection {
    
    inline def apply(
      DeviceID: Double,
      FormulaCellNumberLimit: Double,
      OpenCLPlatforms: SafeArray[OpenCLPlatform],
      PlatformID: Double,
      acquire: Callback,
      disableAutomaticDeviceSelection: Callback,
      disableOpcodeSubsetTest: Callback,
      enableAutomaticDeviceSelection: Boolean => Callback,
      enableOpcodeSubsetTest: Callback,
      enableOpenCL: Boolean => Callback,
      getDeviceID: CallbackTo[Double],
      getFormulaCellNumberLimit: CallbackTo[Double],
      getOpenCLPlatforms: CallbackTo[SafeArray[OpenCLPlatform]],
      getPlatformID: CallbackTo[Double],
      isOpcodeSubsetTested: CallbackTo[Boolean],
      isOpenCLEnabled: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      selectOpenCLDevice: (Double, Double) => Callback,
      setFormulaCellNumberLimit: Double => Callback
    ): XOpenCLSelection = {
      val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], FormulaCellNumberLimit = FormulaCellNumberLimit.asInstanceOf[js.Any], OpenCLPlatforms = OpenCLPlatforms.asInstanceOf[js.Any], PlatformID = PlatformID.asInstanceOf[js.Any], acquire = acquire.toJsFn, disableAutomaticDeviceSelection = disableAutomaticDeviceSelection.toJsFn, disableOpcodeSubsetTest = disableOpcodeSubsetTest.toJsFn, enableAutomaticDeviceSelection = js.Any.fromFunction1((t0: Boolean) => enableAutomaticDeviceSelection(t0).runNow()), enableOpcodeSubsetTest = enableOpcodeSubsetTest.toJsFn, enableOpenCL = js.Any.fromFunction1((t0: Boolean) => enableOpenCL(t0).runNow()), getDeviceID = getDeviceID.toJsFn, getFormulaCellNumberLimit = getFormulaCellNumberLimit.toJsFn, getOpenCLPlatforms = getOpenCLPlatforms.toJsFn, getPlatformID = getPlatformID.toJsFn, isOpcodeSubsetTested = isOpcodeSubsetTested.toJsFn, isOpenCLEnabled = isOpenCLEnabled.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectOpenCLDevice = js.Any.fromFunction2((t0: Double, t1: Double) => (selectOpenCLDevice(t0, t1)).runNow()), setFormulaCellNumberLimit = js.Any.fromFunction1((t0: Double) => setFormulaCellNumberLimit(t0).runNow()))
      __obj.asInstanceOf[XOpenCLSelection]
    }
    
    extension [Self <: XOpenCLSelection](x: Self) {
      
      inline def setDeviceID(value: Double): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
      
      inline def setDisableAutomaticDeviceSelection(value: Callback): Self = StObject.set(x, "disableAutomaticDeviceSelection", value.toJsFn)
      
      inline def setDisableOpcodeSubsetTest(value: Callback): Self = StObject.set(x, "disableOpcodeSubsetTest", value.toJsFn)
      
      inline def setEnableAutomaticDeviceSelection(value: Boolean => Callback): Self = StObject.set(x, "enableAutomaticDeviceSelection", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setEnableOpcodeSubsetTest(value: Callback): Self = StObject.set(x, "enableOpcodeSubsetTest", value.toJsFn)
      
      inline def setEnableOpenCL(value: Boolean => Callback): Self = StObject.set(x, "enableOpenCL", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setFormulaCellNumberLimit(value: Double): Self = StObject.set(x, "FormulaCellNumberLimit", value.asInstanceOf[js.Any])
      
      inline def setGetDeviceID(value: CallbackTo[Double]): Self = StObject.set(x, "getDeviceID", value.toJsFn)
      
      inline def setGetFormulaCellNumberLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getFormulaCellNumberLimit", value.toJsFn)
      
      inline def setGetOpenCLPlatforms(value: CallbackTo[SafeArray[OpenCLPlatform]]): Self = StObject.set(x, "getOpenCLPlatforms", value.toJsFn)
      
      inline def setGetPlatformID(value: CallbackTo[Double]): Self = StObject.set(x, "getPlatformID", value.toJsFn)
      
      inline def setIsOpcodeSubsetTested(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpcodeSubsetTested", value.toJsFn)
      
      inline def setIsOpenCLEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpenCLEnabled", value.toJsFn)
      
      inline def setOpenCLPlatforms(value: SafeArray[OpenCLPlatform]): Self = StObject.set(x, "OpenCLPlatforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformID(value: Double): Self = StObject.set(x, "PlatformID", value.asInstanceOf[js.Any])
      
      inline def setSelectOpenCLDevice(value: (Double, Double) => Callback): Self = StObject.set(x, "selectOpenCLDevice", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSetFormulaCellNumberLimit(value: Double => Callback): Self = StObject.set(x, "setFormulaCellNumberLimit", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
