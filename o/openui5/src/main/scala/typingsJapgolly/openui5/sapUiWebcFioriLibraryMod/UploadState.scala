package typingsJapgolly.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UploadState extends StObject
@JSImport("sap/ui/webc/fiori/library", "UploadState")
@js.native
object UploadState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UploadState & String] = js.native
  
  /**
    * The file has been uploaded successfully.
    */
  @js.native
  sealed trait Complete
    extends StObject
       with UploadState
  /* "Complete" */ val Complete: typingsJapgolly.openui5.sapUiWebcFioriLibraryMod.UploadState.Complete & String = js.native
  
  /**
    * The file cannot be uploaded due to an error.
    */
  @js.native
  sealed trait Error
    extends StObject
       with UploadState
  /* "Error" */ val Error: typingsJapgolly.openui5.sapUiWebcFioriLibraryMod.UploadState.Error & String = js.native
  
  /**
    * The file is awaiting an explicit command to start being uploaded.
    */
  @js.native
  sealed trait Ready
    extends StObject
       with UploadState
  /* "Ready" */ val Ready: typingsJapgolly.openui5.sapUiWebcFioriLibraryMod.UploadState.Ready & String = js.native
  
  /**
    * The file is currently being uploaded.
    */
  @js.native
  sealed trait Uploading
    extends StObject
       with UploadState
  /* "Uploading" */ val Uploading: typingsJapgolly.openui5.sapUiWebcFioriLibraryMod.UploadState.Uploading & String = js.native
}
