package typingsJapgolly.adobePdfservicesNodeSdk

import typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.HIGH
import typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.LOW
import typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.MEDIUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionCompresspdfCompressPdfOptionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/compresspdf/compress-pdf-options", "CompressPDFOptions")
  @js.native
  open class CompressPDFOptions protected () extends StObject {
    def this(builder: Any) = this()
    
    var compressionLevel: Any = js.native
    
    def validate(): Any = js.native
  }
  
  trait CompressionLevel extends StObject {
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 100 dpi to 72 dpi (dots per inch).
      * This option uses JPEG medium quality compression.
      * Output pdf will not contain hidden layers, document structure, metadata, javascript, user properties and print settings.
      */
    var HIGH: typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.HIGH
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 250 dpi to 200 dpi (dots per inch).
      * This option uses JP2K high quality compression.
      */
    var LOW: typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.LOW
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 200 dpi to 144 dpi (dots per inch).
      * This option uses JP2K medium quality compression.
      */
    var MEDIUM: typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.MEDIUM
  }
  object CompressionLevel {
    
    inline def apply(): CompressionLevel = {
      val __obj = js.Dynamic.literal(HIGH = "HIGH", LOW = "LOW", MEDIUM = "MEDIUM")
      __obj.asInstanceOf[CompressionLevel]
    }
    
    extension [Self <: CompressionLevel](x: Self) {
      
      inline def setHIGH(value: HIGH): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      inline def setLOW(value: LOW): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: MEDIUM): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    }
  }
}
