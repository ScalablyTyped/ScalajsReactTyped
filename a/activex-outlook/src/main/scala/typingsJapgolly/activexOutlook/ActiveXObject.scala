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
import typingsJapgolly.activexOutlook.anon.AttachmentCancel
import typingsJapgolly.activexOutlook.anon.CancelBoolean
import typingsJapgolly.activexOutlook.anon.CancelItem
import typingsJapgolly.activexOutlook.anon.CancelShortcut
import typingsJapgolly.activexOutlook.anon.CancelStore
import typingsJapgolly.activexOutlook.anon.FolderPages
import typingsJapgolly.activexOutlook.anon.ItemMoveTo
import typingsJapgolly.activexOutlook.anon.StoreStore
import typingsJapgolly.activexOutlook.anon.ViewView
import typingsJapgolly.activexOutlook.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: AccountSelector,
    event: SelectedAccountChange,
    argNames: js.Array[SelectedAccount],
    handler: js.ThisFunction1[
      /* this */ AccountSelector, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.SelectedAccount, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Accounts,
    event: AutoDiscoverComplete,
    argNames: js.Array[Account],
    handler: js.ThisFunction1[
      /* this */ Accounts, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Account, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AdvancedSearchComplete | AdvancedSearchStopped | ItemLoad | Reminder,
    argNames: js.Array[Item | SearchObject],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Item) | (/* parameter */ typingsJapgolly.activexOutlook.anon.SearchObject), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MAPILogonComplete | NewMail | Quit | Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AttachmentContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Attachments],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Attachments, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: BeforeFolderSharingDialog,
    argNames: js.Tuple2[FolderToShare, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ContextMenuClose,
    argNames: js.Array[ContextMenu],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.ContextMenu, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: FolderContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Folder],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.CommandBar, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Selection],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Selection, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ItemSend,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewMailEx,
    argNames: js.Array[EntryIDCollection],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.EntryIDCollection, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: OptionsPagesAdd,
    argNames: js.Array[Pages],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Pages, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ShortcutContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Shortcut],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Shortcut, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: StoreContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, Store],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Store, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ViewContextMenuDisplay,
    argNames: js.Tuple2[CommandBar, View],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.View, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ AppointmentItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: AppointmentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ AppointmentItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ContactItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ContactItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ ContactItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DistListItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DistListItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ DistListItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ DocumentItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: DocumentItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ DocumentItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemCopy | BeforeItemCut | BeforeMaximize | BeforeMinimize | BeforeMove | BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: Activate | AttachmentSelectionChange | Close | Deactivate | FolderSwitch | SelectionChange | ViewSwitch,
    handler: js.ThisFunction1[/* this */ Explorer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeFolderSwitch,
    argNames: js.Tuple2[NewFolder, Cancel],
    handler: js.ThisFunction1[
      /* this */ Explorer, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.NewFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeItemPaste,
    argNames: js.Tuple3[ClipboardContent, Target, Cancel],
    handler: js.ThisFunction1[
      /* this */ Explorer, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.ClipboardContent, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorer,
    event: BeforeViewSwitch,
    argNames: js.Tuple2[NewView, Cancel],
    handler: js.ThisFunction1[
      /* this */ Explorer, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.NewView, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Explorers,
    event: NewExplorer,
    argNames: js.Array[typingsJapgolly.activexOutlook.activexOutlookStrings.Explorer],
    handler: js.ThisFunction1[
      /* this */ Explorers, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Explorer, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexOutlook.Outlook.Folder,
    event: BeforeFolderMove,
    argNames: js.Tuple2[MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexOutlook.Outlook.Folder, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.MoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: typingsJapgolly.activexOutlook.Outlook.Folder,
    event: BeforeItemMove,
    argNames: js.Tuple3[Item, MoveTo, Cancel],
    handler: js.ThisFunction1[
      /* this */ typingsJapgolly.activexOutlook.Outlook.Folder, 
      /* parameter */ ItemMoveTo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Folders,
    event: FolderAdd | FolderChange,
    argNames: js.Array[Folder],
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ typingsJapgolly.activexOutlook.anon.Folder, Unit]
  ): Unit = js.native
  def on(
    obj: FormRegion,
    event: Expanded,
    argNames: js.Array[Expand],
    handler: js.ThisFunction1[
      /* this */ FormRegion, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Expand, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: BeforeMaximize | BeforeMinimize | BeforeMove | BeforeSize,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: Activate | AttachmentSelectionChange | Close | Deactivate,
    handler: js.ThisFunction1[/* this */ Inspector, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Inspector,
    event: PageChange,
    argNames: js.Array[ActivePageName],
    handler: js.ThisFunction1[
      /* this */ Inspector, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.ActivePageName, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Inspectors,
    event: NewInspector,
    argNames: js.Array[typingsJapgolly.activexOutlook.activexOutlookStrings.Inspector],
    handler: js.ThisFunction1[
      /* this */ Inspectors, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Inspector, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Items,
    event: ItemAdd | ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Items, /* parameter */ typingsJapgolly.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ JournalItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: JournalItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ JournalItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MailItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MailItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ MailItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MeetingItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MeetingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ MeetingItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ MobileItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MobileItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ MobileItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NameSpace,
    event: OptionsPagesAdd,
    argNames: js.Tuple2[Pages, Folder],
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ FolderPages, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationGroups,
    event: NavigationFolderAdd | SelectedChange,
    argNames: js.Array[NavigationFolder],
    handler: js.ThisFunction1[
      /* this */ NavigationGroups, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.NavigationFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: NavigationPane,
    event: ModuleSwitch,
    argNames: js.Array[CurrentModule],
    handler: js.ThisFunction1[
      /* this */ NavigationPane, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.CurrentModule, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkBusinessCardControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkBusinessCardControl,
    event: Click | DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkBusinessCardControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCategory, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCategory,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCategory, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: AfterUpdate | Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkCheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCheckBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: AfterUpdate | Change | Click | DoubleClick | DropButtonClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkComboBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: AfterUpdate | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkCommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkCommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkCommandButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkContactPhoto, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkContactPhoto,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkContactPhoto, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: AfterUpdate | Change | Click | DoubleClick | DropButtonClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkDateControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkDateControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkDateControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkInfoBar, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkInfoBar,
    event: Click | DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkInfoBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkLabel, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkLabel,
    event: Click | DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkLabel, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: AfterUpdate | Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkListBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: AfterUpdate | Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkOptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkOptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkOptionButton, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkSenderPhoto, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkSenderPhoto,
    event: Change | Click | DoubleClick,
    handler: js.ThisFunction1[/* this */ OlkSenderPhoto, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: AfterUpdate | Change | Click | DoubleClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkTextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTextBox, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: AfterUpdate | Change | Click | DoubleClick | DropButtonClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTimeControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: BeforeUpdate | Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyDown | KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: MouseDown | MouseMove | MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: AfterUpdate | Change | Click | DoubleClick | DropButtonClick | Enter,
    handler: js.ThisFunction1[/* this */ OlkTimeZoneControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: OlkTimeZoneControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OlkTimeZoneControl, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarGroups, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: BeforeGroupRemove,
    argNames: js.Tuple2[Group, Cancel],
    handler: js.ThisFunction1[
      /* this */ OutlookBarGroups, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Group, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarGroups,
    event: GroupAdd,
    argNames: js.Array[NewGroup],
    handler: js.ThisFunction1[
      /* this */ OutlookBarGroups, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.NewGroup, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeGroupSwitch,
    argNames: js.Tuple2[ToGroup, Cancel],
    handler: js.ThisFunction1[
      /* this */ OutlookBarPane, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.ToGroup, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OutlookBarPane,
    event: BeforeNavigate,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarPane, /* parameter */ CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutAdd,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: BeforeShortcutRemove,
    argNames: js.Tuple2[Shortcut, Cancel],
    handler: js.ThisFunction1[/* this */ OutlookBarShortcuts, /* parameter */ CancelShortcut, Unit]
  ): Unit = js.native
  def on(
    obj: OutlookBarShortcuts,
    event: ShortcutAdd,
    argNames: js.Array[NewShortcut],
    handler: js.ThisFunction1[
      /* this */ OutlookBarShortcuts, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.NewShortcut, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ PostItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: PostItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ PostItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: ReminderAdd | ReminderChange | ReminderFire | Snooze,
    argNames: js.Array[ReminderObject],
    handler: js.ThisFunction1[
      /* this */ Reminders, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.ReminderObject, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Reminders,
    event: BeforeReminderShow,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ RemoteItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: RemoteItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ RemoteItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ ReportItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReportItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ ReportItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Results,
    event: ItemAdd | ItemChange,
    argNames: js.Array[Item],
    handler: js.ThisFunction1[/* this */ Results, /* parameter */ typingsJapgolly.activexOutlook.anon.Item, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ SharingItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SharingItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ SharingItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: BeforeStoreRemove,
    argNames: js.Tuple2[Store, Cancel],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ CancelStore, Unit]
  ): Unit = js.native
  def on(
    obj: Stores,
    event: StoreAdd,
    argNames: js.Array[Store],
    handler: js.ThisFunction1[/* this */ Stores, /* parameter */ StoreStore, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: SyncEnd | SyncStart,
    handler: js.ThisFunction1[/* this */ SyncObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: OnError,
    argNames: js.Tuple2[Code, Description],
    handler: js.ThisFunction1[
      /* this */ SyncObject, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Code, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SyncObject,
    event: Progress,
    argNames: js.Tuple4[State, Description, Value, Max],
    handler: js.ThisFunction1[
      /* this */ SyncObject, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Description, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestAcceptItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestAcceptItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestAcceptItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestDeclineItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestDeclineItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestDeclineItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AttachmentAdd | AttachmentRead | AttachmentRemove | BeforeAutoSave | BeforeCheckNames | Close | CustomPropertyChange | Open | PropertyChange | Send | Write,
    argNames: js.Array[Attachment | Cancel | Name],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      (/* parameter */ typingsJapgolly.activexOutlook.anon.Attachment) | (/* parameter */ CancelBoolean) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Name), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeAttachmentAdd | BeforeAttachmentPreview | BeforeAttachmentRead | BeforeAttachmentSave | BeforeAttachmentWriteToTempFile | Reply | ReplyAll,
    argNames: js.Tuple2[Attachment | Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      (/* parameter */ AttachmentCancel) | (/* parameter */ typingsJapgolly.activexOutlook.anon.Response), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: AfterWrite | BeforeRead | Read | Unload,
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: BeforeDelete,
    argNames: js.Tuple2[Item, Cancel],
    handler: js.ThisFunction1[/* this */ TaskRequestUpdateItem, /* parameter */ CancelItem, Unit]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: CustomAction,
    argNames: js.Tuple3[Action, Response, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Action, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TaskRequestUpdateItem,
    event: Forward,
    argNames: js.Tuple2[Forward, Cancel],
    handler: js.ThisFunction1[
      /* this */ TaskRequestUpdateItem, 
      /* parameter */ typingsJapgolly.activexOutlook.anon.Forward, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Views,
    event: ViewAdd | ViewRemove,
    argNames: js.Array[View],
    handler: js.ThisFunction1[/* this */ Views, /* parameter */ ViewView, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AutoDiscoverComplete(
    obj: NameSpace,
    event: AutoDiscoverComplete,
    handler: js.ThisFunction1[/* this */ NameSpace, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: FormRegion,
    event: Close,
    handler: js.ThisFunction1[/* this */ FormRegion, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FolderRemove(
    obj: Folders,
    event: FolderRemove,
    handler: js.ThisFunction1[/* this */ Folders, /* parameter */ js.Object, Unit]
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
  def on_NavigationFolderRemove(
    obj: NavigationGroups,
    event: NavigationFolderRemove,
    handler: js.ThisFunction1[/* this */ NavigationGroups, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ReminderRemove(
    obj: Reminders,
    event: ReminderRemove,
    handler: js.ThisFunction1[/* this */ Reminders, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
