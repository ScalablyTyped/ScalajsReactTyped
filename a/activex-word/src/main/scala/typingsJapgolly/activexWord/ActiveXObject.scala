package typingsJapgolly.activexWord

import typingsJapgolly.activexWord.Word.Application
import typingsJapgolly.activexWord.Word.Document
import typingsJapgolly.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExArgNames
import typingsJapgolly.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExParameter
import typingsJapgolly.activexWord.Word.EventHelperTypes.ApplicationInvokeArgNames
import typingsJapgolly.activexWord.Word.EventHelperTypes.ApplicationInvokeParameter
import typingsJapgolly.activexWord.Word.OLEControl
import typingsJapgolly.activexWord.Word.System
import typingsJapgolly.activexWord.Word.WdCompatibility
import typingsJapgolly.activexWord.activexWordStrings.ActiveWritingStyle
import typingsJapgolly.activexWord.activexWordStrings.AddRef
import typingsJapgolly.activexWord.activexWordStrings.BlockType
import typingsJapgolly.activexWord.activexWordStrings.BuildingBlockInsert
import typingsJapgolly.activexWord.activexWordStrings.Cancel
import typingsJapgolly.activexWord.activexWordStrings.Category
import typingsJapgolly.activexWord.activexWordStrings.Close
import typingsJapgolly.activexWord.activexWordStrings.CloseReason
import typingsJapgolly.activexWord.activexWordStrings.Compatibility
import typingsJapgolly.activexWord.activexWordStrings.Content
import typingsJapgolly.activexWord.activexWordStrings.ContentControl
import typingsJapgolly.activexWord.activexWordStrings.ContentControlAfterAdd
import typingsJapgolly.activexWord.activexWordStrings.ContentControlBeforeContentUpdate
import typingsJapgolly.activexWord.activexWordStrings.ContentControlBeforeDelete
import typingsJapgolly.activexWord.activexWordStrings.ContentControlBeforeStoreUpdate
import typingsJapgolly.activexWord.activexWordStrings.ContentControlOnEnter
import typingsJapgolly.activexWord.activexWordStrings.ContentControlOnExit
import typingsJapgolly.activexWord.activexWordStrings.DeletedRange
import typingsJapgolly.activexWord.activexWordStrings.Doc
import typingsJapgolly.activexWord.activexWordStrings.DocResult
import typingsJapgolly.activexWord.activexWordStrings.DocumentBeforeClose
import typingsJapgolly.activexWord.activexWordStrings.DocumentBeforePrint
import typingsJapgolly.activexWord.activexWordStrings.DocumentBeforeSave
import typingsJapgolly.activexWord.activexWordStrings.DocumentChange
import typingsJapgolly.activexWord.activexWordStrings.DocumentOpen
import typingsJapgolly.activexWord.activexWordStrings.DocumentSync
import typingsJapgolly.activexWord.activexWordStrings.EPostageInsert
import typingsJapgolly.activexWord.activexWordStrings.EPostageInsertEx
import typingsJapgolly.activexWord.activexWordStrings.EPostagePropertyDialog
import typingsJapgolly.activexWord.activexWordStrings.EndRecord
import typingsJapgolly.activexWord.activexWordStrings.FromState
import typingsJapgolly.activexWord.activexWordStrings.GetIDsOfNames
import typingsJapgolly.activexWord.activexWordStrings.GetTypeInfo
import typingsJapgolly.activexWord.activexWordStrings.GetTypeInfoCount
import typingsJapgolly.activexWord.activexWordStrings.GotFocus
import typingsJapgolly.activexWord.activexWordStrings.Handled
import typingsJapgolly.activexWord.activexWordStrings.InUndoRedo
import typingsJapgolly.activexWord.activexWordStrings.Invoke
import typingsJapgolly.activexWord.activexWordStrings.LostFocus
import typingsJapgolly.activexWord.activexWordStrings.MailMergeAfterMerge
import typingsJapgolly.activexWord.activexWordStrings.MailMergeAfterRecordMerge
import typingsJapgolly.activexWord.activexWordStrings.MailMergeBeforeMerge
import typingsJapgolly.activexWord.activexWordStrings.MailMergeBeforeRecordMerge
import typingsJapgolly.activexWord.activexWordStrings.MailMergeDataSourceLoad
import typingsJapgolly.activexWord.activexWordStrings.MailMergeDataSourceValidate
import typingsJapgolly.activexWord.activexWordStrings.MailMergeDataSourceValidate2
import typingsJapgolly.activexWord.activexWordStrings.MailMergeWizardSendToCustom
import typingsJapgolly.activexWord.activexWordStrings.MailMergeWizardStateChange
import typingsJapgolly.activexWord.activexWordStrings.Name
import typingsJapgolly.activexWord.activexWordStrings.New
import typingsJapgolly.activexWord.activexWordStrings.NewContentControl
import typingsJapgolly.activexWord.activexWordStrings.NewDocument
import typingsJapgolly.activexWord.activexWordStrings.NewXMLNode
import typingsJapgolly.activexWord.activexWordStrings.OldContentControl
import typingsJapgolly.activexWord.activexWordStrings.OldXMLNode
import typingsJapgolly.activexWord.activexWordStrings.Open
import typingsJapgolly.activexWord.activexWordStrings.PrivateProfileString
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowActivate
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowBeforeClose
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowBeforeEdit
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowDeactivate
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowOpen
import typingsJapgolly.activexWord.activexWordStrings.ProtectedViewWindowSize
import typingsJapgolly.activexWord.activexWordStrings.PvWindow
import typingsJapgolly.activexWord.activexWordStrings.QueryInterface
import typingsJapgolly.activexWord.activexWordStrings.Quit
import typingsJapgolly.activexWord.activexWordStrings.Range
import typingsJapgolly.activexWord.activexWordStrings.Reason
import typingsJapgolly.activexWord.activexWordStrings.Release
import typingsJapgolly.activexWord.activexWordStrings.SaveAsUI
import typingsJapgolly.activexWord.activexWordStrings.Sel
import typingsJapgolly.activexWord.activexWordStrings.StartRecord
import typingsJapgolly.activexWord.activexWordStrings.Startup
import typingsJapgolly.activexWord.activexWordStrings.Sync
import typingsJapgolly.activexWord.activexWordStrings.SyncEventType
import typingsJapgolly.activexWord.activexWordStrings.Template
import typingsJapgolly.activexWord.activexWordStrings.ToState
import typingsJapgolly.activexWord.activexWordStrings.WindowActivate
import typingsJapgolly.activexWord.activexWordStrings.WindowBeforeDoubleClick
import typingsJapgolly.activexWord.activexWordStrings.WindowBeforeRightClick
import typingsJapgolly.activexWord.activexWordStrings.WindowDeactivate
import typingsJapgolly.activexWord.activexWordStrings.WindowSelectionChange
import typingsJapgolly.activexWord.activexWordStrings.WindowSize
import typingsJapgolly.activexWord.activexWordStrings.Wn
import typingsJapgolly.activexWord.activexWordStrings.XMLAfterInsert
import typingsJapgolly.activexWord.activexWordStrings.XMLBeforeDelete
import typingsJapgolly.activexWord.activexWordStrings.XMLNode
import typingsJapgolly.activexWord.activexWordStrings.XMLSelectionChange
import typingsJapgolly.activexWord.activexWordStrings.XMLValidationError
import typingsJapgolly.activexWord.activexWordStrings.cNames
import typingsJapgolly.activexWord.activexWordStrings.itinfo
import typingsJapgolly.activexWord.activexWordStrings.lcid
import typingsJapgolly.activexWord.activexWordStrings.pctinfo
import typingsJapgolly.activexWord.activexWordStrings.pptinfo
import typingsJapgolly.activexWord.activexWordStrings.ppvObj
import typingsJapgolly.activexWord.activexWordStrings.rgdispid
import typingsJapgolly.activexWord.activexWordStrings.rgszNames
import typingsJapgolly.activexWord.activexWordStrings.riid
import typingsJapgolly.activexWord.anon.CNames
import typingsJapgolly.activexWord.anon.CancelContentControl
import typingsJapgolly.activexWord.anon.CancelPvWindow
import typingsJapgolly.activexWord.anon.DocDocument
import typingsJapgolly.activexWord.anon.DocHandled
import typingsJapgolly.activexWord.anon.InUndoRedoNewXMLNode
import typingsJapgolly.activexWord.anon.Itinfo
import typingsJapgolly.activexWord.anon.Pctinfo
import typingsJapgolly.activexWord.anon.PpvObj
import typingsJapgolly.activexWord.anon.SelSelection
import typingsJapgolly.activexWord.anon.SyncEventTypeMsoSyncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: DocumentOpen | EPostageInsert | EPostagePropertyDialog | MailMergeAfterRecordMerge | MailMergeDataSourceLoad | MailMergeWizardSendToCustom | NewDocument | ProtectedViewWindowActivate | ProtectedViewWindowDeactivate | ProtectedViewWindowOpen | ProtectedViewWindowSize,
    argNames: js.Array[Doc | PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ DocDocument) | (/* parameter */ typingsJapgolly.activexWord.anon.PvWindow), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeClose | DocumentBeforePrint | MailMergeBeforeRecordMerge | WindowActivate | WindowBeforeDoubleClick | WindowBeforeRightClick | WindowDeactivate | WindowSize,
    argNames: js.Tuple2[Doc | Sel, Cancel | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typingsJapgolly.activexWord.anon.Cancel) | (/* parameter */ typingsJapgolly.activexWord.anon.Sel) | (/* parameter */ typingsJapgolly.activexWord.anon.Wn), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AddRef | DocumentChange | Quit | Release | Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeSave,
    argNames: js.Tuple3[Doc, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsJapgolly.activexWord.anon.Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentSync,
    argNames: js.Tuple2[Doc, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeAfterMerge,
    argNames: js.Tuple2[Doc, DocResult],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.DocResult, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeMerge,
    argNames: js.Tuple4[Doc, StartRecord, EndRecord, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.EndRecord, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate2,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocHandled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.Handled, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardStateChange,
    argNames: js.Tuple4[Doc, FromState, ToState, Handled],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.FromState, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[PvWindow, CloseReason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.CloseReason, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[PvWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelPvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLSelectionChange,
    argNames: js.Tuple4[Sel, OldXMLNode, NewXMLNode, Reason],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.NewXMLNode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLValidationError,
    argNames: js.Array[XMLNode],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsJapgolly.activexWord.anon.XMLNode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeContentUpdate | ContentControlBeforeStoreUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typingsJapgolly.activexWord.anon.Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Close | New | Open,
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: BuildingBlockInsert,
    argNames: js.Tuple5[Range, Name, Category, BlockType, Template],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsJapgolly.activexWord.anon.BlockType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlAfterAdd,
    argNames: js.Tuple2[NewContentControl, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsJapgolly.activexWord.anon.InUndoRedo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeDelete,
    argNames: js.Tuple2[OldContentControl, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsJapgolly.activexWord.anon.OldContentControl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnEnter,
    argNames: js.Array[ContentControl],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsJapgolly.activexWord.anon.ContentControl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnExit,
    argNames: js.Tuple2[ContentControl, Cancel],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ CancelContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLAfterInsert,
    argNames: js.Tuple2[NewXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ InUndoRedoNewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLBeforeDelete,
    argNames: js.Tuple3[DeletedRange, OldXMLNode, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsJapgolly.activexWord.anon.DeletedRange, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OLEControl,
    event: GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EPostageInsertEx(
    obj: Application,
    event: EPostageInsertEx,
    argNames: ApplicationEPostageInsertExArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationEPostageInsertExParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
  ): Unit = js.native
  
  @JSName("set")
  def set_ActiveWritingStyle(obj: Document, propertyName: ActiveWritingStyle, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  @JSName("set")
  def set_Compatibility(
    obj: Document,
    propertyName: Compatibility,
    parameterTypes: js.Array[WdCompatibility],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_PrivateProfileString(
    obj: System,
    propertyName: PrivateProfileString,
    parameterTypes: js.Tuple3[String, String, String],
    newValue: String
  ): Unit = js.native
}
