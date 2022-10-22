package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANDeviceProfile extends StObject {
  
  /**
    * The ClassBTimeout value.
    */
  var ClassBTimeout: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.ClassBTimeout] = js.undefined
  
  /**
    * The ClassCTimeout value.
    */
  var ClassCTimeout: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.ClassCTimeout] = js.undefined
  
  /**
    * The list of values that make up the FactoryPresetFreqs value.
    */
  var FactoryPresetFreqsList: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.FactoryPresetFreqsList] = js.undefined
  
  /**
    * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
    */
  var MacVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MacVersion] = js.undefined
  
  /**
    * The MaxDutyCycle value.
    */
  var MaxDutyCycle: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MaxDutyCycle] = js.undefined
  
  /**
    * The MaxEIRP value.
    */
  var MaxEirp: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.MaxEirp] = js.undefined
  
  /**
    * The PingSlotDR value.
    */
  var PingSlotDr: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.PingSlotDr] = js.undefined
  
  /**
    * The PingSlotFreq value.
    */
  var PingSlotFreq: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.PingSlotFreq] = js.undefined
  
  /**
    * The PingSlotPeriod value.
    */
  var PingSlotPeriod: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.PingSlotPeriod] = js.undefined
  
  /**
    * The version of regional parameters.
    */
  var RegParamsRevision: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RegParamsRevision] = js.undefined
  
  /**
    * The frequency band (RFRegion) value.
    */
  var RfRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RfRegion] = js.undefined
  
  /**
    * The RXDataRate2 value.
    */
  var RxDataRate2: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RxDataRate2] = js.undefined
  
  /**
    * The RXDelay1 value.
    */
  var RxDelay1: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RxDelay1] = js.undefined
  
  /**
    * The RXDROffset1 value.
    */
  var RxDrOffset1: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RxDrOffset1] = js.undefined
  
  /**
    * The RXFreq2 value.
    */
  var RxFreq2: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.RxFreq2] = js.undefined
  
  /**
    * The Supports32BitFCnt value.
    */
  var Supports32BitFCnt: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.Supports32BitFCnt] = js.undefined
  
  /**
    * The SupportsClassB value.
    */
  var SupportsClassB: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.SupportsClassB] = js.undefined
  
  /**
    * The SupportsClassC value.
    */
  var SupportsClassC: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.SupportsClassC] = js.undefined
  
  /**
    * The SupportsJoin value.
    */
  var SupportsJoin: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.SupportsJoin] = js.undefined
}
object LoRaWANDeviceProfile {
  
  inline def apply(): LoRaWANDeviceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANDeviceProfile]
  }
  
  extension [Self <: LoRaWANDeviceProfile](x: Self) {
    
    inline def setClassBTimeout(value: ClassBTimeout): Self = StObject.set(x, "ClassBTimeout", value.asInstanceOf[js.Any])
    
    inline def setClassBTimeoutUndefined: Self = StObject.set(x, "ClassBTimeout", js.undefined)
    
    inline def setClassCTimeout(value: ClassCTimeout): Self = StObject.set(x, "ClassCTimeout", value.asInstanceOf[js.Any])
    
    inline def setClassCTimeoutUndefined: Self = StObject.set(x, "ClassCTimeout", js.undefined)
    
    inline def setFactoryPresetFreqsList(value: FactoryPresetFreqsList): Self = StObject.set(x, "FactoryPresetFreqsList", value.asInstanceOf[js.Any])
    
    inline def setFactoryPresetFreqsListUndefined: Self = StObject.set(x, "FactoryPresetFreqsList", js.undefined)
    
    inline def setFactoryPresetFreqsListVarargs(value: PresetFreq*): Self = StObject.set(x, "FactoryPresetFreqsList", js.Array(value*))
    
    inline def setMacVersion(value: MacVersion): Self = StObject.set(x, "MacVersion", value.asInstanceOf[js.Any])
    
    inline def setMacVersionUndefined: Self = StObject.set(x, "MacVersion", js.undefined)
    
    inline def setMaxDutyCycle(value: MaxDutyCycle): Self = StObject.set(x, "MaxDutyCycle", value.asInstanceOf[js.Any])
    
    inline def setMaxDutyCycleUndefined: Self = StObject.set(x, "MaxDutyCycle", js.undefined)
    
    inline def setMaxEirp(value: MaxEirp): Self = StObject.set(x, "MaxEirp", value.asInstanceOf[js.Any])
    
    inline def setMaxEirpUndefined: Self = StObject.set(x, "MaxEirp", js.undefined)
    
    inline def setPingSlotDr(value: PingSlotDr): Self = StObject.set(x, "PingSlotDr", value.asInstanceOf[js.Any])
    
    inline def setPingSlotDrUndefined: Self = StObject.set(x, "PingSlotDr", js.undefined)
    
    inline def setPingSlotFreq(value: PingSlotFreq): Self = StObject.set(x, "PingSlotFreq", value.asInstanceOf[js.Any])
    
    inline def setPingSlotFreqUndefined: Self = StObject.set(x, "PingSlotFreq", js.undefined)
    
    inline def setPingSlotPeriod(value: PingSlotPeriod): Self = StObject.set(x, "PingSlotPeriod", value.asInstanceOf[js.Any])
    
    inline def setPingSlotPeriodUndefined: Self = StObject.set(x, "PingSlotPeriod", js.undefined)
    
    inline def setRegParamsRevision(value: RegParamsRevision): Self = StObject.set(x, "RegParamsRevision", value.asInstanceOf[js.Any])
    
    inline def setRegParamsRevisionUndefined: Self = StObject.set(x, "RegParamsRevision", js.undefined)
    
    inline def setRfRegion(value: RfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
    
    inline def setRxDataRate2(value: RxDataRate2): Self = StObject.set(x, "RxDataRate2", value.asInstanceOf[js.Any])
    
    inline def setRxDataRate2Undefined: Self = StObject.set(x, "RxDataRate2", js.undefined)
    
    inline def setRxDelay1(value: RxDelay1): Self = StObject.set(x, "RxDelay1", value.asInstanceOf[js.Any])
    
    inline def setRxDelay1Undefined: Self = StObject.set(x, "RxDelay1", js.undefined)
    
    inline def setRxDrOffset1(value: RxDrOffset1): Self = StObject.set(x, "RxDrOffset1", value.asInstanceOf[js.Any])
    
    inline def setRxDrOffset1Undefined: Self = StObject.set(x, "RxDrOffset1", js.undefined)
    
    inline def setRxFreq2(value: RxFreq2): Self = StObject.set(x, "RxFreq2", value.asInstanceOf[js.Any])
    
    inline def setRxFreq2Undefined: Self = StObject.set(x, "RxFreq2", js.undefined)
    
    inline def setSupports32BitFCnt(value: Supports32BitFCnt): Self = StObject.set(x, "Supports32BitFCnt", value.asInstanceOf[js.Any])
    
    inline def setSupports32BitFCntUndefined: Self = StObject.set(x, "Supports32BitFCnt", js.undefined)
    
    inline def setSupportsClassB(value: SupportsClassB): Self = StObject.set(x, "SupportsClassB", value.asInstanceOf[js.Any])
    
    inline def setSupportsClassBUndefined: Self = StObject.set(x, "SupportsClassB", js.undefined)
    
    inline def setSupportsClassC(value: SupportsClassC): Self = StObject.set(x, "SupportsClassC", value.asInstanceOf[js.Any])
    
    inline def setSupportsClassCUndefined: Self = StObject.set(x, "SupportsClassC", js.undefined)
    
    inline def setSupportsJoin(value: SupportsJoin): Self = StObject.set(x, "SupportsJoin", value.asInstanceOf[js.Any])
    
    inline def setSupportsJoinUndefined: Self = StObject.set(x, "SupportsJoin", js.undefined)
  }
}
