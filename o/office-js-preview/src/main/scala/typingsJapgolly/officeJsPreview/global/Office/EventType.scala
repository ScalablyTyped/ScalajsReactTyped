package typingsJapgolly.officeJsPreview.global.Office

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
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.EventType & Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typingsJapgolly.officeJsPreview.Office.EventType.ActiveViewChanged & Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typingsJapgolly.officeJsPreview.Office.EventType.AppointmentTimeChanged & Double = js.native
  
  /* 2 */ val AttachmentsChanged: typingsJapgolly.officeJsPreview.Office.EventType.AttachmentsChanged & Double = js.native
  
  /* 3 */ val BindingDataChanged: typingsJapgolly.officeJsPreview.Office.EventType.BindingDataChanged & Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typingsJapgolly.officeJsPreview.Office.EventType.BindingSelectionChanged & Double = js.native
  
  /* 5 */ val DialogEventReceived: typingsJapgolly.officeJsPreview.Office.EventType.DialogEventReceived & Double = js.native
  
  /* 6 */ val DialogMessageReceived: typingsJapgolly.officeJsPreview.Office.EventType.DialogMessageReceived & Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typingsJapgolly.officeJsPreview.Office.EventType.DialogParentMessageReceived & Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typingsJapgolly.officeJsPreview.Office.EventType.DocumentSelectionChanged & Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typingsJapgolly.officeJsPreview.Office.EventType.EnhancedLocationsChanged & Double = js.native
  
  /* 10 */ val InfobarClicked: typingsJapgolly.officeJsPreview.Office.EventType.InfobarClicked & Double = js.native
  
  /* 11 */ val ItemChanged: typingsJapgolly.officeJsPreview.Office.EventType.ItemChanged & Double = js.native
  
  /* 12 */ val NodeDeleted: typingsJapgolly.officeJsPreview.Office.EventType.NodeDeleted & Double = js.native
  
  /* 13 */ val NodeInserted: typingsJapgolly.officeJsPreview.Office.EventType.NodeInserted & Double = js.native
  
  /* 14 */ val NodeReplaced: typingsJapgolly.officeJsPreview.Office.EventType.NodeReplaced & Double = js.native
  
  /* 15 */ val OfficeThemeChanged: typingsJapgolly.officeJsPreview.Office.EventType.OfficeThemeChanged & Double = js.native
  
  /* 16 */ val RecipientsChanged: typingsJapgolly.officeJsPreview.Office.EventType.RecipientsChanged & Double = js.native
  
  /* 17 */ val RecurrenceChanged: typingsJapgolly.officeJsPreview.Office.EventType.RecurrenceChanged & Double = js.native
  
  /* 18 */ val ResourceSelectionChanged: typingsJapgolly.officeJsPreview.Office.EventType.ResourceSelectionChanged & Double = js.native
  
  /* 19 */ val SelectedItemsChanged: typingsJapgolly.officeJsPreview.Office.EventType.SelectedItemsChanged & Double = js.native
  
  /* 20 */ val SettingsChanged: typingsJapgolly.officeJsPreview.Office.EventType.SettingsChanged & Double = js.native
  
  /* 21 */ val TaskSelectionChanged: typingsJapgolly.officeJsPreview.Office.EventType.TaskSelectionChanged & Double = js.native
  
  /* 22 */ val ViewSelectionChanged: typingsJapgolly.officeJsPreview.Office.EventType.ViewSelectionChanged & Double = js.native
}
