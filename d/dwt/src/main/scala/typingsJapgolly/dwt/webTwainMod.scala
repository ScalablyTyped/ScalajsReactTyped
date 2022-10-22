package typingsJapgolly.dwt

import typingsJapgolly.dwt.addonDotBarcodeReaderMod.BarcodeReader
import typingsJapgolly.dwt.addonDotCameraMod.Camera
import typingsJapgolly.dwt.addonDotOCRMod.OCR
import typingsJapgolly.dwt.addonDotOCRProMod.OCRPro
import typingsJapgolly.dwt.addonDotPDFMod.PDF
import typingsJapgolly.dwt.addonDotWebcamMod.Webcam
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTBorderStyle
import typingsJapgolly.dwt.webTwainDotViewerMod.WebTwainViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainMod {
  
  trait Addon extends StObject {
    
    var BarcodeReader: typingsJapgolly.dwt.addonDotBarcodeReaderMod.BarcodeReader
    
    var Camera: typingsJapgolly.dwt.addonDotCameraMod.Camera
    
    var OCR: typingsJapgolly.dwt.addonDotOCRMod.OCR
    
    var OCRPro: typingsJapgolly.dwt.addonDotOCRProMod.OCRPro
    
    var PDF: typingsJapgolly.dwt.addonDotPDFMod.PDF
    
    var Webcam: typingsJapgolly.dwt.addonDotWebcamMod.Webcam
  }
  object Addon {
    
    inline def apply(BarcodeReader: BarcodeReader, Camera: Camera, OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): Addon = {
      val __obj = js.Dynamic.literal(BarcodeReader = BarcodeReader.asInstanceOf[js.Any], Camera = Camera.asInstanceOf[js.Any], OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addon]
    }
    
    extension [Self <: Addon](x: Self) {
      
      inline def setBarcodeReader(value: BarcodeReader): Self = StObject.set(x, "BarcodeReader", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "Camera", value.asInstanceOf[js.Any])
      
      inline def setOCR(value: OCR): Self = StObject.set(x, "OCR", value.asInstanceOf[js.Any])
      
      inline def setOCRPro(value: OCRPro): Self = StObject.set(x, "OCRPro", value.asInstanceOf[js.Any])
      
      inline def setPDF(value: PDF): Self = StObject.set(x, "PDF", value.asInstanceOf[js.Any])
      
      inline def setWebcam(value: Webcam): Self = StObject.set(x, "Webcam", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTwain
    extends StObject
       with WebTwainViewer {
    
    /**
      * Addons to WebTwain instances.
      */
    var Addon: typingsJapgolly.dwt.webTwainMod.Addon = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AllowMultiSelect: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AllowPluginAuthentication: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AsyncMode: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var BorderStyle: EnumDWTBorderStyle | Double = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var BrokerProcessType: Double = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var EnableInteractiveZoom: Boolean = js.native
    
    /**
      * Return whether a WebTwain instance is ready to use.
      */
    val bReady: Boolean = js.native
  }
}
