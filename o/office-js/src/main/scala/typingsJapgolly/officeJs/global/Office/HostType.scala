package typingsJapgolly.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the Office application in which the add-in is running.
  * 
  * @remarks
  * **Important**: In Outlook, this enum is available from Mailbox requirement set 1.5.
  */
@JSGlobal("Office.HostType")
@js.native
object HostType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJs.Office.HostType & Double] = js.native
  
  /* 6 */ val Access: typingsJapgolly.officeJs.Office.HostType.Access & Double = js.native
  
  /* 1 */ val Excel: typingsJapgolly.officeJs.Office.HostType.Excel & Double = js.native
  
  /* 4 */ val OneNote: typingsJapgolly.officeJs.Office.HostType.OneNote & Double = js.native
  
  /* 3 */ val Outlook: typingsJapgolly.officeJs.Office.HostType.Outlook & Double = js.native
  
  /* 2 */ val PowerPoint: typingsJapgolly.officeJs.Office.HostType.PowerPoint & Double = js.native
  
  /* 5 */ val Project: typingsJapgolly.officeJs.Office.HostType.Project & Double = js.native
  
  /* 0 */ val Word: typingsJapgolly.officeJs.Office.HostType.Word & Double = js.native
}
