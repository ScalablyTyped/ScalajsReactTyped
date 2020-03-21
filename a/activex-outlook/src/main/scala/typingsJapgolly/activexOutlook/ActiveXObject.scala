package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.AccountSelector
import typingsJapgolly.activexOutlook.Outlook.Accounts
import typingsJapgolly.activexOutlook.Outlook.Application
import typingsJapgolly.activexOutlook.Outlook.AppointmentItem
import typingsJapgolly.activexOutlook.Outlook.ContactItem
import typingsJapgolly.activexOutlook.Outlook.DistListItem
import typingsJapgolly.activexOutlook.Outlook.DocumentItem
import typingsJapgolly.activexOutlook.Outlook.Explorer
import typingsJapgolly.activexOutlook.Outlook.Explorers
import typingsJapgolly.activexOutlook.Outlook.Folders
import typingsJapgolly.activexOutlook.Outlook.FormRegion
import typingsJapgolly.activexOutlook.Outlook.Inspector
import typingsJapgolly.activexOutlook.Outlook.Inspectors
import typingsJapgolly.activexOutlook.Outlook.Items
import typingsJapgolly.activexOutlook.Outlook.JournalItem
import typingsJapgolly.activexOutlook.Outlook.MailItem
import typingsJapgolly.activexOutlook.Outlook.MeetingItem
import typingsJapgolly.activexOutlook.Outlook.MobileItem
import typingsJapgolly.activexOutlook.Outlook.NameSpace
import typingsJapgolly.activexOutlook.Outlook.NavigationGroups
import typingsJapgolly.activexOutlook.Outlook.NavigationPane
import typingsJapgolly.activexOutlook.Outlook.OlkBusinessCardControl
import typingsJapgolly.activexOutlook.Outlook.OlkCategory
import typingsJapgolly.activexOutlook.Outlook.OlkCheckBox
import typingsJapgolly.activexOutlook.Outlook.OlkComboBox
import typingsJapgolly.activexOutlook.Outlook.OlkCommandButton
import typingsJapgolly.activexOutlook.Outlook.OlkContactPhoto
import typingsJapgolly.activexOutlook.Outlook.OlkDateControl
import typingsJapgolly.activexOutlook.Outlook.OlkInfoBar
import typingsJapgolly.activexOutlook.Outlook.OlkLabel
import typingsJapgolly.activexOutlook.Outlook.OlkListBox
import typingsJapgolly.activexOutlook.Outlook.OlkOptionButton
import typingsJapgolly.activexOutlook.Outlook.OlkSenderPhoto
import typingsJapgolly.activexOutlook.Outlook.OlkTextBox
import typingsJapgolly.activexOutlook.Outlook.OlkTimeControl
import typingsJapgolly.activexOutlook.Outlook.OlkTimeZoneControl
import typingsJapgolly.activexOutlook.Outlook.OutlookBarGroups
import typingsJapgolly.activexOutlook.Outlook.OutlookBarPane
import typingsJapgolly.activexOutlook.Outlook.OutlookBarShortcuts
import typingsJapgolly.activexOutlook.Outlook.PostItem
import typingsJapgolly.activexOutlook.Outlook.Reminders
import typingsJapgolly.activexOutlook.Outlook.RemoteItem
import typingsJapgolly.activexOutlook.Outlook.ReportItem
import typingsJapgolly.activexOutlook.Outlook.Results
import typingsJapgolly.activexOutlook.Outlook.SharingItem
import typingsJapgolly.activexOutlook.Outlook.Stores
import typingsJapgolly.activexOutlook.Outlook.SyncObject
import typingsJapgolly.activexOutlook.Outlook.TaskItem
import typingsJapgolly.activexOutlook.Outlook.TaskRequestAcceptItem
import typingsJapgolly.activexOutlook.Outlook.TaskRequestDeclineItem
import typingsJapgolly.activexOutlook.Outlook.TaskRequestItem
import typingsJapgolly.activexOutlook.Outlook.TaskRequestUpdateItem
import typingsJapgolly.activexOutlook.Outlook.Views
import typingsJapgolly.activexOutlook.activexOutlookStrings.Account
import typingsJapgolly.activexOutlook.activexOutlookStrings.Action
import typingsJapgolly.activexOutlook.activexOutlookStrings.Activate
import typingsJapgolly.activexOutlook.activexOutlookStrings.ActivePageName
import typingsJapgolly.activexOutlook.activexOutlookStrings.AdvancedSearchComplete
import typingsJapgolly.activexOutlook.activexOutlookStrings.AdvancedSearchStopped
import typingsJapgolly.activexOutlook.activexOutlookStrings.AfterUpdate
import typingsJapgolly.activexOutlook.activexOutlookStrings.AfterWrite
import typingsJapgolly.activexOutlook.activexOutlookStrings.Attachment
import typingsJapgolly.activexOutlook.activexOutlookStrings.AttachmentAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.AttachmentContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.AttachmentRead
import typingsJapgolly.activexOutlook.activexOutlookStrings.AttachmentRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.AttachmentSelectionChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Attachments
import typingsJapgolly.activexOutlook.activexOutlookStrings.AutoDiscoverComplete
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAttachmentAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAttachmentPreview
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAttachmentRead
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAttachmentSave
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAttachmentWriteToTempFile
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeAutoSave
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeCheckNames
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeDelete
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeFolderMove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeFolderSharingDialog
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeFolderSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeGroupAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeGroupRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeGroupSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeItemCopy
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeItemCut
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeItemMove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeItemPaste
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeMaximize
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeMinimize
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeMove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeNavigate
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeRead
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeReminderShow
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeShortcutAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeShortcutRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeSize
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeStoreRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeUpdate
import typingsJapgolly.activexOutlook.activexOutlookStrings.BeforeViewSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.Button
import typingsJapgolly.activexOutlook.activexOutlookStrings.Cancel
import typingsJapgolly.activexOutlook.activexOutlookStrings.Change
import typingsJapgolly.activexOutlook.activexOutlookStrings.Click
import typingsJapgolly.activexOutlook.activexOutlookStrings.ClipboardContent
import typingsJapgolly.activexOutlook.activexOutlookStrings.Close
import typingsJapgolly.activexOutlook.activexOutlookStrings.Code
import typingsJapgolly.activexOutlook.activexOutlookStrings.CommandBar
import typingsJapgolly.activexOutlook.activexOutlookStrings.ContextMenu
import typingsJapgolly.activexOutlook.activexOutlookStrings.ContextMenuClose
import typingsJapgolly.activexOutlook.activexOutlookStrings.CurrentModule
import typingsJapgolly.activexOutlook.activexOutlookStrings.CustomAction
import typingsJapgolly.activexOutlook.activexOutlookStrings.CustomPropertyChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Deactivate
import typingsJapgolly.activexOutlook.activexOutlookStrings.Description
import typingsJapgolly.activexOutlook.activexOutlookStrings.DoubleClick
import typingsJapgolly.activexOutlook.activexOutlookStrings.DropButtonClick
import typingsJapgolly.activexOutlook.activexOutlookStrings.Enter
import typingsJapgolly.activexOutlook.activexOutlookStrings.EntryIDCollection
import typingsJapgolly.activexOutlook.activexOutlookStrings.Exit
import typingsJapgolly.activexOutlook.activexOutlookStrings.Expand
import typingsJapgolly.activexOutlook.activexOutlookStrings.Expanded
import typingsJapgolly.activexOutlook.activexOutlookStrings.Folder
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.FolderToShare
import typingsJapgolly.activexOutlook.activexOutlookStrings.Forward
import typingsJapgolly.activexOutlook.activexOutlookStrings.Group
import typingsJapgolly.activexOutlook.activexOutlookStrings.GroupAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.Item
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemLoad
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.ItemSend
import typingsJapgolly.activexOutlook.activexOutlookStrings.KeyAscii
import typingsJapgolly.activexOutlook.activexOutlookStrings.KeyCode
import typingsJapgolly.activexOutlook.activexOutlookStrings.KeyDown
import typingsJapgolly.activexOutlook.activexOutlookStrings.KeyPress
import typingsJapgolly.activexOutlook.activexOutlookStrings.KeyUp
import typingsJapgolly.activexOutlook.activexOutlookStrings.MAPILogonComplete
import typingsJapgolly.activexOutlook.activexOutlookStrings.Max
import typingsJapgolly.activexOutlook.activexOutlookStrings.ModuleSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.MouseDown
import typingsJapgolly.activexOutlook.activexOutlookStrings.MouseMove
import typingsJapgolly.activexOutlook.activexOutlookStrings.MouseUp
import typingsJapgolly.activexOutlook.activexOutlookStrings.MoveTo
import typingsJapgolly.activexOutlook.activexOutlookStrings.Name
import typingsJapgolly.activexOutlook.activexOutlookStrings.NavigationFolder
import typingsJapgolly.activexOutlook.activexOutlookStrings.NavigationFolderAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.NavigationFolderRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewExplorer
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewFolder
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewGroup
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewInspector
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewMail
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewMailEx
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewShortcut
import typingsJapgolly.activexOutlook.activexOutlookStrings.NewView
import typingsJapgolly.activexOutlook.activexOutlookStrings.OnError
import typingsJapgolly.activexOutlook.activexOutlookStrings.Open
import typingsJapgolly.activexOutlook.activexOutlookStrings.OptionsPagesAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.PageChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Pages
import typingsJapgolly.activexOutlook.activexOutlookStrings.Progress
import typingsJapgolly.activexOutlook.activexOutlookStrings.PropertyChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Quit
import typingsJapgolly.activexOutlook.activexOutlookStrings.Read
import typingsJapgolly.activexOutlook.activexOutlookStrings.Reminder
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReminderAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReminderChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReminderFire
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReminderObject
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReminderRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.Reply
import typingsJapgolly.activexOutlook.activexOutlookStrings.ReplyAll
import typingsJapgolly.activexOutlook.activexOutlookStrings.Response
import typingsJapgolly.activexOutlook.activexOutlookStrings.SearchObject
import typingsJapgolly.activexOutlook.activexOutlookStrings.SelectedAccount
import typingsJapgolly.activexOutlook.activexOutlookStrings.SelectedAccountChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.SelectedChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Selection
import typingsJapgolly.activexOutlook.activexOutlookStrings.SelectionChange
import typingsJapgolly.activexOutlook.activexOutlookStrings.Send
import typingsJapgolly.activexOutlook.activexOutlookStrings.Shift
import typingsJapgolly.activexOutlook.activexOutlookStrings.Shortcut
import typingsJapgolly.activexOutlook.activexOutlookStrings.ShortcutAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.ShortcutContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.Snooze
import typingsJapgolly.activexOutlook.activexOutlookStrings.Startup
import typingsJapgolly.activexOutlook.activexOutlookStrings.State
import typingsJapgolly.activexOutlook.activexOutlookStrings.Store
import typingsJapgolly.activexOutlook.activexOutlookStrings.StoreAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.StoreContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.SyncEnd
import typingsJapgolly.activexOutlook.activexOutlookStrings.SyncStart
import typingsJapgolly.activexOutlook.activexOutlookStrings.Target
import typingsJapgolly.activexOutlook.activexOutlookStrings.ToGroup
import typingsJapgolly.activexOutlook.activexOutlookStrings.Unload
import typingsJapgolly.activexOutlook.activexOutlookStrings.Value
import typingsJapgolly.activexOutlook.activexOutlookStrings.View
import typingsJapgolly.activexOutlook.activexOutlookStrings.ViewAdd
import typingsJapgolly.activexOutlook.activexOutlookStrings.ViewContextMenuDisplay
import typingsJapgolly.activexOutlook.activexOutlookStrings.ViewRemove
import typingsJapgolly.activexOutlook.activexOutlookStrings.ViewSwitch
import typingsJapgolly.activexOutlook.activexOutlookStrings.Write
import typingsJapgolly.activexOutlook.activexOutlookStrings.X
import typingsJapgolly.activexOutlook.activexOutlookStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: AccountSelector,
    event: SelectedAccountChange,
    argNames: js.Array[SelectedAccount],
    handler: js.ThisFunction1[/* this */ AccountSelector, /* parameter */ AnonSelectedAccount, Unit]
  ): Unit = js.native
  def on(
    obj: Accounts,
    event: AutoDiscoverComplete,
    argNames: js.Array[Account],
    handler: js.ThisFunction1[/* this */ Accounts, /* parameter */ AnonAccount, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchComplete,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSearchObject, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchStopped,
    argNames: js.Array[SearchObject],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSearchObject, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AttachmentContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Attachments],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonAttachments, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: BeforeFolderSharingDialog,
    argNames: js.Tuple2[FolderToShare, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ContextMenuClose,
    argNames: js.Array[ContextMenu],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonContextMenu, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: FolderContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Folder],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCommandBar, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Selection],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSelection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemLoad,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemSend,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewMailEx,
    argNames: js.Array[EntryIDCollection],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonEntryIDCollection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: OptionsPagesAdd,
    argNames: js.Array[Pages],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPages, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: Reminder,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ShortcutContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Shortcut],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: StoreContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Store],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonStore, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ViewContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, View],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonView, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeFolderSwitch,
    argNames: js.Tuple2[NewFolder, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonNewFolder, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCopy,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCut,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemPaste,
    argNames: js.Tuple3[ClipboardContent, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonClipboardContent, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeViewSwitch,
    argNames: js.Tuple2[NewView, Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ AnonNewView, Unit]
  ): Unit = js.native
  def on(
    obj: Explorers,
    event: NewExplorer,
    argNames: js.Array[typingsJapgolly.activexOutlook.activexOutlookStrings.Explorer],
    handler: js.ThisFunction1[/* this */ Explorers, /* parameter */ AnonExplorer, Unit]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexOutlook.Outlook.Folder,
    event: BeforeFolderMove,
    argNames: js.Tuple2[MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexOutlook.Outlook.Folder, 
      /* parameter */ AnonMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexOutlook.Outlook.Folder,
    event: BeforeItemMove,
    argNames: js.Tuple3[Item, MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexOutlook.Outlook.Folder, 
      /* parameter */ AnonItemMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderAdd,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ AnonFolder, Unit]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderChange,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ AnonFolder, Unit]
  ): Unit = js.native
  def on(
    obj: FormRegion,
    event: Expanded,
    argNames: js.Array[Expand],
    handler: js.ThisFunction1[/* this */ FormRegion, /* parameter */ AnonExpand, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMaximize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMinimize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMove,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: PageChange,
    argNames: js.Array[ActivePageName],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ AnonActivePageName, Unit]
  ): Unit = js.native
  def on(
    obj: Inspectors,
    event: NewInspector,
    argNames: js.Array[typingsJapgolly.activexOutlook.activexOutlookStrings.Inspector],
    handler: js.ThisFunction1[/* this */ Inspectors, /* parameter */ AnonInspector, Unit]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: NameSpace,
    event: OptionsPagesAdd,
    argNames: js.Tuple2[Pages, Folder],
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ AnonFolderPages, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: NavigationFolderAdd,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ AnonNavigationFolder, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: SelectedChange,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ AnonNavigationFolder, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationPane,
    event: ModuleSwitch,
    argNames: js.Array[CurrentModule],
    handler: js.ThisFunction1[/* this */ NavigationPane, /* parameter */ AnonCurrentModule, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ Anon0, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupRemove,
    argNames: js.Tuple2[Group, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ AnonGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: GroupAdd,
    argNames: js.Array[NewGroup],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ AnonNewGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeGroupSwitch,
    argNames: js.Tuple2[ToGroup, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ AnonToGroup, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeNavigate,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ AnonCancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutRemove,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ AnonCancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: ShortcutAdd,
    argNames: js.Array[NewShortcut],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ AnonNewShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: BeforeReminderShow,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderAdd,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ AnonReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderChange,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ AnonReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderFire,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ AnonReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: Snooze,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ AnonReminderObject, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemAdd,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ AnonItem, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: BeforeStoreRemove,
    argNames: js.Tuple2[Store, Cancel],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ AnonCancelStore, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: StoreAdd,
    argNames: js.Array[Store],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ AnonStoreStore, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: OnError,
    argNames: js.Tuple2[Code, Description],
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: Progress,
    argNames: js.Tuple4[State, Description, Value, Max],
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ AnonDescription, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentAdd,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRead,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentRemove,
    argNames: js.Array[Attachment],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachment, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentAdd,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentPreview,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentRead,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentSave,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentWriteToTempFile,
    argNames: js.Tuple2[Attachment, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAttachmentCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAutoSave,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeCheckNames,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Close,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonAction, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomPropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonForward, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: PropertyChange,
    argNames: js.Array[Name],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonName, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: ReplyAll,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Reply,
    argNames: js.Tuple2[Response, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Send,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Write,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewAdd,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ AnonViewView, Unit]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewRemove,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ AnonViewView, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Explorer,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Inspector,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkCheckBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkComboBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkCommandButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkDateControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkListBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkOptionButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTextBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTimeControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OlkTimeZoneControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: AppointmentItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: ContactItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: DistListItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: DocumentItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: JournalItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MailItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MeetingItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: MobileItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: PostItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: RemoteItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: ReportItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: SharingItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestAcceptItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestDeclineItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterWrite(
    obj: TaskRequestUpdateItem,
    event: AfterWrite,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: Explorer,
    event: AttachmentSelectionChange,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentSelectionChange(
    obj: Inspector,
    event: AttachmentSelectionChange,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AutoDiscoverComplete(
    obj: NameSpace,
    event: AutoDiscoverComplete,
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: AppointmentItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: ContactItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: DistListItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: DocumentItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: JournalItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MailItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MeetingItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: MobileItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: PostItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: RemoteItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: ReportItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: SharingItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestAcceptItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestDeclineItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeRead(
    obj: TaskRequestUpdateItem,
    event: BeforeRead,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkCategory,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkCheckBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkContactPhoto,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkDateControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkListBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkOptionButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkSenderPhoto,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTimeControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OlkTimeZoneControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkBusinessCardControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCategory,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkCommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkContactPhoto,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkDateControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkInfoBar,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkLabel,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkOptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkSenderPhoto,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTextBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTimeControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OlkTimeZoneControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: Explorer,
    event: Close,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: FormRegion,
    event: Close,
    handler: js.ThisFunction1[/* this */ FormRegion, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: Inspector,
    event: Close,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Explorer,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Inspector,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkBusinessCardControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCategory,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCheckBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkComboBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkCommandButton,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkContactPhoto,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkDateControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkInfoBar,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkLabel,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkListBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkOptionButton,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkSenderPhoto,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTextBox,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTimeControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DoubleClick(
    obj: OlkTimeZoneControl,
    event: DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkComboBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkDateControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkTimeControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: OlkTimeZoneControl,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCategory,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCheckBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkComboBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkCommandButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkContactPhoto,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkDateControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkListBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkOptionButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTextBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTimeControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OlkTimeZoneControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FolderRemove(
    obj: Folders,
    event: FolderRemove,
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FolderSwitch(
    obj: Explorer,
    event: FolderSwitch,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: Items,
    event: ItemRemove,
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ItemRemove(
    obj: Results,
    event: ItemRemove,
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_MAPILogonComplete(
    obj: Application,
    event: MAPILogonComplete,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_NavigationFolderRemove(
    obj: NavigationGroups,
    event: NavigationFolderRemove,
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_NewMail(
    obj: Application,
    event: NewMail,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: Application,
    event: Quit,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: AppointmentItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: ContactItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: DistListItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: DocumentItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: JournalItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MailItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MeetingItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: MobileItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: PostItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: RemoteItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: ReportItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: SharingItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestAcceptItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestDeclineItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Read(
    obj: TaskRequestUpdateItem,
    event: Read,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ReminderRemove(
    obj: Reminders,
    event: ReminderRemove,
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SelectionChange(
    obj: Explorer,
    event: SelectionChange,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Startup(
    obj: Application,
    event: Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SyncEnd(
    obj: SyncObject,
    event: SyncEnd,
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SyncStart(
    obj: SyncObject,
    event: SyncStart,
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: AppointmentItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: ContactItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: DistListItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: DocumentItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: JournalItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MailItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MeetingItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: MobileItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: PostItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: RemoteItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: ReportItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: SharingItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestAcceptItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestDeclineItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Unload(
    obj: TaskRequestUpdateItem,
    event: Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ViewSwitch(
    obj: Explorer,
    event: ViewSwitch,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

