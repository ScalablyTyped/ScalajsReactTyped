package typingsJapgolly.adobePdfservicesNodeSdk.mod

import typingsJapgolly.adobePdfservicesNodeSdk.pdfservicesSdkMod.PdfFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProtectPDF {
  
  @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.SupportedSourceFormat")
  @js.native
  val SupportedSourceFormat: PdfFormat = js.native
  
  object options {
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.ContentEncryption")
    @js.native
    val ContentEncryption: typingsJapgolly.adobePdfservicesNodeSdk.operationOptionProtectpdfPasswordProtectOptionsMod.ContentEncryption = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.EncryptionAlgorithm")
    @js.native
    val EncryptionAlgorithm: typingsJapgolly.adobePdfservicesNodeSdk.operationOptionProtectpdfPasswordProtectOptionsMod.EncryptionAlgorithm = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.Permission")
    @js.native
    val Permission: typingsJapgolly.adobePdfservicesNodeSdk.operationOptionProtectpdfPasswordProtectOptionsMod.Permission = js.native
  }
}
