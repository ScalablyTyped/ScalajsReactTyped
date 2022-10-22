package typingsJapgolly.phonegapPluginBarcodescanner

import typingsJapgolly.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.landscape
import typingsJapgolly.phonegapPluginBarcodescanner.phonegapPluginBarcodescannerStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phonegapBarcode {
  
  trait BarcodeScanOptions extends StObject {
    
    var disableAnimations: Boolean
    
    var disableSuccessBeep: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[landscape | portrait] = js.undefined
    
    var preferFrontCamera: js.UndefOr[Boolean] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var resultDisplayDuration: js.UndefOr[Double] = js.undefined
    
    var saveHistory: js.UndefOr[Boolean] = js.undefined
    
    var showFlipCameraButton: js.UndefOr[Boolean] = js.undefined
    
    var showTorchButton: js.UndefOr[Boolean] = js.undefined
    
    var torchOn: js.UndefOr[Boolean] = js.undefined
  }
  object BarcodeScanOptions {
    
    inline def apply(disableAnimations: Boolean): BarcodeScanOptions = {
      val __obj = js.Dynamic.literal(disableAnimations = disableAnimations.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScanOptions]
    }
    
    extension [Self <: BarcodeScanOptions](x: Self) {
      
      inline def setDisableAnimations(value: Boolean): Self = StObject.set(x, "disableAnimations", value.asInstanceOf[js.Any])
      
      inline def setDisableSuccessBeep(value: Boolean): Self = StObject.set(x, "disableSuccessBeep", value.asInstanceOf[js.Any])
      
      inline def setDisableSuccessBeepUndefined: Self = StObject.set(x, "disableSuccessBeep", js.undefined)
      
      inline def setFormats(value: String): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPreferFrontCamera(value: Boolean): Self = StObject.set(x, "preferFrontCamera", value.asInstanceOf[js.Any])
      
      inline def setPreferFrontCameraUndefined: Self = StObject.set(x, "preferFrontCamera", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setResultDisplayDuration(value: Double): Self = StObject.set(x, "resultDisplayDuration", value.asInstanceOf[js.Any])
      
      inline def setResultDisplayDurationUndefined: Self = StObject.set(x, "resultDisplayDuration", js.undefined)
      
      inline def setSaveHistory(value: Boolean): Self = StObject.set(x, "saveHistory", value.asInstanceOf[js.Any])
      
      inline def setSaveHistoryUndefined: Self = StObject.set(x, "saveHistory", js.undefined)
      
      inline def setShowFlipCameraButton(value: Boolean): Self = StObject.set(x, "showFlipCameraButton", value.asInstanceOf[js.Any])
      
      inline def setShowFlipCameraButtonUndefined: Self = StObject.set(x, "showFlipCameraButton", js.undefined)
      
      inline def setShowTorchButton(value: Boolean): Self = StObject.set(x, "showTorchButton", value.asInstanceOf[js.Any])
      
      inline def setShowTorchButtonUndefined: Self = StObject.set(x, "showTorchButton", js.undefined)
      
      inline def setTorchOn(value: Boolean): Self = StObject.set(x, "torchOn", value.asInstanceOf[js.Any])
      
      inline def setTorchOnUndefined: Self = StObject.set(x, "torchOn", js.undefined)
    }
  }
  
  trait BarcodeScanResult extends StObject {
    
    var cancelled: Boolean
    
    var format: String
    
    var text: String
  }
  object BarcodeScanResult {
    
    inline def apply(cancelled: Boolean, format: String, text: String): BarcodeScanResult = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScanResult]
    }
    
    extension [Self <: BarcodeScanResult](x: Self) {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BarcodeScanner extends StObject {
    
    var Encode: EncodingType = js.native
    
    def encode(encodingType: EncodingType, data: String, success: js.Function1[/* result */ Any, Any]): Unit = js.native
    def encode(
      encodingType: EncodingType,
      data: String,
      success: js.Function1[/* result */ Any, Any],
      failure: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    
    def scan(success: js.Function1[/* result */ BarcodeScanResult, Any]): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, Any],
      failure: js.Function1[/* err */ Any, Any]
    ): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, Any],
      failure: js.Function1[/* err */ Any, Any],
      opts: BarcodeScanOptions
    ): Unit = js.native
    def scan(
      success: js.Function1[/* result */ BarcodeScanResult, Any],
      failure: Unit,
      opts: BarcodeScanOptions
    ): Unit = js.native
  }
  
  trait EncodingType extends StObject {
    
    var EMAIL_TYPE: Any
    
    var PHONE_TYPE: Any
    
    var SMS_TYPE: Any
    
    var TEXT_TYPE: Any
  }
  object EncodingType {
    
    inline def apply(EMAIL_TYPE: Any, PHONE_TYPE: Any, SMS_TYPE: Any, TEXT_TYPE: Any): EncodingType = {
      val __obj = js.Dynamic.literal(EMAIL_TYPE = EMAIL_TYPE.asInstanceOf[js.Any], PHONE_TYPE = PHONE_TYPE.asInstanceOf[js.Any], SMS_TYPE = SMS_TYPE.asInstanceOf[js.Any], TEXT_TYPE = TEXT_TYPE.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingType]
    }
    
    extension [Self <: EncodingType](x: Self) {
      
      inline def setEMAIL_TYPE(value: Any): Self = StObject.set(x, "EMAIL_TYPE", value.asInstanceOf[js.Any])
      
      inline def setPHONE_TYPE(value: Any): Self = StObject.set(x, "PHONE_TYPE", value.asInstanceOf[js.Any])
      
      inline def setSMS_TYPE(value: Any): Self = StObject.set(x, "SMS_TYPE", value.asInstanceOf[js.Any])
      
      inline def setTEXT_TYPE(value: Any): Self = StObject.set(x, "TEXT_TYPE", value.asInstanceOf[js.Any])
    }
  }
}
