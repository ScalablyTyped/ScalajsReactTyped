package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLProjectItem extends StObject {
  
  val Application: Any = js.native
  
  val Creator: Double = js.native
  
  val IsOpen: Boolean = js.native
  
  def LoadFromFile(FileName: String): Unit = js.native
  
  val Name: String = js.native
  
  /* private */ @JSName("Office.HTMLProjectItem_typekey")
  var OfficeDotHTMLProjectItem_typekey: HTMLProjectItem = js.native
  
  /** @param OpenKind [OpenKind=0] */
  def Open(): Unit = js.native
  def Open(OpenKind: MsoHTMLProjectOpen): Unit = js.native
  
  val Parent: Any = js.native
  
  def SaveCopyAs(FileName: String): Unit = js.native
  
  var Text: String = js.native
}
