package typingsJapgolly.adobePdfservicesNodeSdk

import typingsJapgolly.adobePdfservicesNodeSdk.anon.JPEG
import typingsJapgolly.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typingsJapgolly.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationExportPdfToImagesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/export-pdf-to-images-operation", "ExportPDFToImagesOperation")
  @js.native
  open class ExportPDFToImagesOperation protected () extends StObject {
    def this(targetFormat: Any) = this()
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resultant files may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[js.Array[FileRef]] = js.native
    
    /**
      * Sets an input PDF file (media type "application/pdf").
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    var targetFormat: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object ExportPDFToImagesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/export-pdf-to-images-operation", "ExportPDFToImagesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs an {@link ExportPDFToImagesOperation} instance.
      */
    inline def createNew(targetFormat: JPEG): ExportPDFToImagesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")(targetFormat.asInstanceOf[js.Any]).asInstanceOf[ExportPDFToImagesOperation]
    
    inline def getTargetFormats(): JPEG = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFormats")().asInstanceOf[JPEG]
  }
}
