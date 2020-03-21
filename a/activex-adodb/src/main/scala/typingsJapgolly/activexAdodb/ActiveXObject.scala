package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.Connection
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteArgNames
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteParameter
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectArgNames
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectParameter
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteArgNames
import typingsJapgolly.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteParameter
import typingsJapgolly.activexAdodb.ADODB.Recordset
import typingsJapgolly.activexAdodb.activexAdodbStrings.BeginTransComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.Collect
import typingsJapgolly.activexAdodb.activexAdodbStrings.CommitTransComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.ConnectComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.Disconnect
import typingsJapgolly.activexAdodb.activexAdodbStrings.EndOfRecordset
import typingsJapgolly.activexAdodb.activexAdodbStrings.ExecuteComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.FetchComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.FetchProgress
import typingsJapgolly.activexAdodb.activexAdodbStrings.FieldChangeComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.Fields
import typingsJapgolly.activexAdodb.activexAdodbStrings.InfoMessage
import typingsJapgolly.activexAdodb.activexAdodbStrings.MaxProgress
import typingsJapgolly.activexAdodb.activexAdodbStrings.MoveComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.Progress
import typingsJapgolly.activexAdodb.activexAdodbStrings.RecordChangeComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.RecordsetChangeComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.RollbackTransComplete
import typingsJapgolly.activexAdodb.activexAdodbStrings.TransactionLevel
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillChangeField
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillChangeRecord
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillChangeRecordset
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillConnect
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillExecute
import typingsJapgolly.activexAdodb.activexAdodbStrings.WillMove
import typingsJapgolly.activexAdodb.activexAdodbStrings.adReason
import typingsJapgolly.activexAdodb.activexAdodbStrings.adStatus
import typingsJapgolly.activexAdodb.activexAdodbStrings.cFields
import typingsJapgolly.activexAdodb.activexAdodbStrings.cRecords
import typingsJapgolly.activexAdodb.activexAdodbStrings.fMoreData
import typingsJapgolly.activexAdodb.activexAdodbStrings.pConnection
import typingsJapgolly.activexAdodb.activexAdodbStrings.pError
import typingsJapgolly.activexAdodb.activexAdodbStrings.pRecordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Connection,
    event: BeginTransComplete,
    argNames: js.Tuple4[TransactionLevel, pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: CommitTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: ConnectComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: Disconnect,
    argNames: js.Tuple2[adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonAdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: InfoMessage,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: RollbackTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AnonPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: EndOfRecordset,
    argNames: js.Tuple3[fMoreData, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonFMoreData, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchComplete,
    argNames: js.Tuple3[pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonPError, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchProgress,
    argNames: js.Tuple4[Progress, MaxProgress, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonMaxProgress, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FieldChangeComplete,
    argNames: js.Tuple5[cFields, Fields, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonCFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: MoveComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonAdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordChangeComplete,
    argNames: js.Tuple5[adReason, cRecords, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonCRecords, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordsetChangeComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonAdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeField,
    argNames: js.Tuple4[cFields, Fields, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecord,
    argNames: js.Tuple4[adReason, cRecords, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonPRecordset, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecordset,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonAdReasonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillMove,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AnonAdReasonAdStatus, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: Connection,
    event: ExecuteComplete,
    argNames: ConnectionExecuteCompleteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionExecuteCompleteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: Connection,
    event: WillConnect,
    argNames: ConnectionWillConnectArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillConnectParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: Connection,
    event: WillExecute,
    argNames: ConnectionWillExecuteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillExecuteParameter, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Collect(obj: Recordset, propertyName: Collect, parameterTypes: js.Array[_], newValue: js.Any): Unit = js.native
}

