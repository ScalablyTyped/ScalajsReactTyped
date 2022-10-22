package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.NotebookDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.BusinessNotebook")
@js.native
open class BusinessNotebook () extends StObject {
  def this(args: NotebookDescription) = this()
  
  var notebookDescription: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  
  var recommended: js.UndefOr[Boolean] = js.native
}
