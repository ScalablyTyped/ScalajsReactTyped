package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbSdtSettings extends StObject {
  
  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconvertMod.OutputSdt] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var SdtInterval: js.UndefOr[integerMin25Max2000] = js.undefined
  
  /**
    * The service name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[stringMin1Max256] = js.undefined
  
  /**
    * The service provider name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[stringMin1Max256] = js.undefined
}
object DvbSdtSettings {
  
  inline def apply(): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSdtSettings]
  }
  
  extension [Self <: DvbSdtSettings](x: Self) {
    
    inline def setOutputSdt(value: OutputSdt): Self = StObject.set(x, "OutputSdt", value.asInstanceOf[js.Any])
    
    inline def setOutputSdtUndefined: Self = StObject.set(x, "OutputSdt", js.undefined)
    
    inline def setSdtInterval(value: integerMin25Max2000): Self = StObject.set(x, "SdtInterval", value.asInstanceOf[js.Any])
    
    inline def setSdtIntervalUndefined: Self = StObject.set(x, "SdtInterval", js.undefined)
    
    inline def setServiceName(value: stringMin1Max256): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceProviderName(value: stringMin1Max256): Self = StObject.set(x, "ServiceProviderName", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderNameUndefined: Self = StObject.set(x, "ServiceProviderName", js.undefined)
  }
}
