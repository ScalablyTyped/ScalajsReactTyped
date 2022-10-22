package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod

import typingsJapgolly.vscodeLanguageserverProtocol.anon.Cells
import typingsJapgolly.vscodeLanguageserverProtocol.anon.Notebook
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookDocumentSyncRegistrationOptions
  extends StObject
     with NotebookDocumentSyncOptions
     with StaticRegistrationOptions
object NotebookDocumentSyncRegistrationOptions {
  
  inline def apply(notebookSelector: js.Array[Cells | Notebook]): NotebookDocumentSyncRegistrationOptions = {
    val __obj = js.Dynamic.literal(notebookSelector = notebookSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookDocumentSyncRegistrationOptions]
  }
}
