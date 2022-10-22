package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the states of an email attachment download. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachmentDownloadState")
@js.native
object EmailAttachmentDownloadState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState & Double
  ] = js.native
  
  /* 2 */ val downloaded: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloaded & Double = js.native
  
  /* 1 */ val downloading: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloading & Double = js.native
  
  /* 3 */ val failed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.failed & Double = js.native
  
  /* 0 */ val notDownloaded: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.notDownloaded & Double = js.native
}
