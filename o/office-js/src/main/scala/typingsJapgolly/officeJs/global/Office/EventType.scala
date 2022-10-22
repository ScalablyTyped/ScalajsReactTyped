package typingsJapgolly.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the kind of event that was raised. Returned by the `type` property of an `*EventArgs` object.
  *
  * Add-ins for Project support the `Office.EventType.ResourceSelectionChanged`, `Office.EventType.TaskSelectionChanged`, and
  * `Office.EventType.ViewSelectionChanged` event types.
  *
  * Only task pane add-ins for Outlook support Mailbox API set event types.
  *
  * @remarks
  *
  * **`BindingDataChanged` and `BindingSelectionChanged` applications**: Excel, Word.
  *
  */
@JSGlobal("Office.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJs.Office.EventType & Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typingsJapgolly.officeJs.Office.EventType.ActiveViewChanged & Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typingsJapgolly.officeJs.Office.EventType.AppointmentTimeChanged & Double = js.native
  
  /* 2 */ val AttachmentsChanged: typingsJapgolly.officeJs.Office.EventType.AttachmentsChanged & Double = js.native
  
  /* 3 */ val BindingDataChanged: typingsJapgolly.officeJs.Office.EventType.BindingDataChanged & Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typingsJapgolly.officeJs.Office.EventType.BindingSelectionChanged & Double = js.native
  
  /* 5 */ val DialogEventReceived: typingsJapgolly.officeJs.Office.EventType.DialogEventReceived & Double = js.native
  
  /* 6 */ val DialogMessageReceived: typingsJapgolly.officeJs.Office.EventType.DialogMessageReceived & Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typingsJapgolly.officeJs.Office.EventType.DialogParentMessageReceived & Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typingsJapgolly.officeJs.Office.EventType.DocumentSelectionChanged & Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typingsJapgolly.officeJs.Office.EventType.EnhancedLocationsChanged & Double = js.native
  
  /* 10 */ val InfobarClicked: typingsJapgolly.officeJs.Office.EventType.InfobarClicked & Double = js.native
  
  /* 11 */ val ItemChanged: typingsJapgolly.officeJs.Office.EventType.ItemChanged & Double = js.native
  
  /* 12 */ val NodeDeleted: typingsJapgolly.officeJs.Office.EventType.NodeDeleted & Double = js.native
  
  /* 13 */ val NodeInserted: typingsJapgolly.officeJs.Office.EventType.NodeInserted & Double = js.native
  
  /* 14 */ val NodeReplaced: typingsJapgolly.officeJs.Office.EventType.NodeReplaced & Double = js.native
  
  /* 15 */ val RecipientsChanged: typingsJapgolly.officeJs.Office.EventType.RecipientsChanged & Double = js.native
  
  /* 16 */ val RecurrenceChanged: typingsJapgolly.officeJs.Office.EventType.RecurrenceChanged & Double = js.native
  
  /* 17 */ val ResourceSelectionChanged: typingsJapgolly.officeJs.Office.EventType.ResourceSelectionChanged & Double = js.native
  
  /* 18 */ val SettingsChanged: typingsJapgolly.officeJs.Office.EventType.SettingsChanged & Double = js.native
  
  /* 19 */ val TaskSelectionChanged: typingsJapgolly.officeJs.Office.EventType.TaskSelectionChanged & Double = js.native
  
  /* 20 */ val ViewSelectionChanged: typingsJapgolly.officeJs.Office.EventType.ViewSelectionChanged & Double = js.native
}
