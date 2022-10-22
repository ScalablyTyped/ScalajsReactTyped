package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceFolder extends StObject {
  
  val Application: Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(DeleteEventIfFolderContainsFiles: Boolean): Unit = js.native
  
  val FolderName: String = js.native
  
  /* private */ @JSName("Office.SharedWorkspaceFolder_typekey")
  var OfficeDotSharedWorkspaceFolder_typekey: SharedWorkspaceFolder = js.native
  
  val Parent: Any = js.native
}
