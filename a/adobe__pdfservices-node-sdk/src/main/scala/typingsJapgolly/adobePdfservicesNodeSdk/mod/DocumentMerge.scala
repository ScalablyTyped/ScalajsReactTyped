package typingsJapgolly.adobePdfservicesNodeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentMerge {
  
  object SupportedSourceFormat {
    
    @JSImport("@adobe/pdfservices-node-sdk", "DocumentMerge.SupportedSourceFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "DocumentMerge.SupportedSourceFormat.docx")
    @js.native
    def docx: String = js.native
    inline def docx_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docx")(x.asInstanceOf[js.Any])
  }
  
  object options {
    
    @JSImport("@adobe/pdfservices-node-sdk", "DocumentMerge.options.DocumentMergeOptions")
    @js.native
    val DocumentMergeOptions: typingsJapgolly.adobePdfservicesNodeSdk.operationOptionDocumentmergeDocumentMergeOptionsMod.DocumentMergeOptions = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "DocumentMerge.options.OutputFormat")
    @js.native
    val OutputFormat: typingsJapgolly.adobePdfservicesNodeSdk.operationOptionDocumentmergeDocumentMergeOptionsMod.OutputFormat = js.native
  }
}
