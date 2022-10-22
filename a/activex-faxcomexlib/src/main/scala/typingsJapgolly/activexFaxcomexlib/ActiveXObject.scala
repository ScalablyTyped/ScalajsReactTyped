package typingsJapgolly.activexFaxcomexlib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeArgNames
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeParameter
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeArgNames
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeParameter
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeArgNames
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeParameter
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.AddRef
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.GetIDsOfNames
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfo
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfoCount
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.Invoke
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnActivityLoggingConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnDeviceStatusChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnDevicesConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnEventLoggingConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnGeneralServerConfigChanged
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingArchiveConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobAdded
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobChanged
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobRemoved
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageAdded
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageRemoved
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnNewCall
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingGroupsConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingRulesConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingArchiveConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobAdded
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobChanged
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobRemoved
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageAdded
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageRemoved
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingQueueConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnQueuesStatusChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnReceiptOptionsChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnSecurityConfigChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerActivityChange
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerShutDown
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.QueryInterface
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.Release
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bIncomingQueueBlocked
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueueBlocked
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueuePaused
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bstrCallerId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bstrJobId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bstrMessageId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.cNames
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.fAddedToReceiveFolder
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.fRemovedFromReceiveFolder
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.itinfo
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lCallId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lIncomingMessages
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lOutgoingMessages
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lQueuedMessages
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lRoutingMessages
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lcid
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxAccount
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pJobStatus
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pctinfo
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pptinfo
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.ppvObj
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.rgdispid
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.rgszNames
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.riid
import typingsJapgolly.activexFaxcomexlib.anon.BIncomingQueueBlocked
import typingsJapgolly.activexFaxcomexlib.anon.BstrCallerId
import typingsJapgolly.activexFaxcomexlib.anon.BstrJobId
import typingsJapgolly.activexFaxcomexlib.anon.BstrJobIdPFaxServer
import typingsJapgolly.activexFaxcomexlib.anon.BstrMessageId
import typingsJapgolly.activexFaxcomexlib.anon.BstrMessageIdPFaxAccount
import typingsJapgolly.activexFaxcomexlib.anon.BstrMessageIdPFaxServer
import typingsJapgolly.activexFaxcomexlib.anon.CNames
import typingsJapgolly.activexFaxcomexlib.anon.FRemovedFromReceiveFolder
import typingsJapgolly.activexFaxcomexlib.anon.Itinfo
import typingsJapgolly.activexFaxcomexlib.anon.LIncomingMessages
import typingsJapgolly.activexFaxcomexlib.anon.PFaxAccount
import typingsJapgolly.activexFaxcomexlib.anon.PFaxServer
import typingsJapgolly.activexFaxcomexlib.anon.PJobStatus
import typingsJapgolly.activexFaxcomexlib.anon.Pctinfo
import typingsJapgolly.activexFaxcomexlib.anon.PpvObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: FaxAccount,
    event: OnIncomingJobAdded | OnIncomingJobRemoved | OnOutgoingJobAdded | OnOutgoingJobRemoved | OnOutgoingMessageAdded | OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId | bstrMessageId],
    handler: js.ThisFunction1[
      /* this */ FaxAccount, 
      (/* parameter */ BstrJobId) | (/* parameter */ BstrMessageIdPFaxAccount), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobChanged | OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fAddedToReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrMessageId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fRemovedFromReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FRemovedFromReceiveFolder, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnActivityLoggingConfigChange | OnDevicesConfigChange | OnEventLoggingConfigChange | OnGeneralServerConfigChanged | OnIncomingArchiveConfigChange | OnOutboundRoutingGroupsConfigChange | OnOutboundRoutingRulesConfigChange | OnOutgoingArchiveConfigChange | OnOutgoingQueueConfigChange | OnReceiptOptionsChange | OnSecurityConfigChange | OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobAdded | OnIncomingJobRemoved | OnIncomingMessageAdded | OnIncomingMessageRemoved | OnOutgoingJobAdded | OnOutgoingJobRemoved | OnOutgoingMessageAdded | OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId | bstrMessageId],
    handler: js.ThisFunction1[
      /* this */ FaxServer, 
      (/* parameter */ BstrJobIdPFaxServer) | (/* parameter */ BstrMessageIdPFaxServer), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobChanged | OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnNewCall,
    argNames: js.Tuple4[pFaxServer, lCallId, lDeviceId, bstrCallerId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrCallerId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnQueuesStatusChange,
    argNames: js.Tuple4[pFaxServer, bOutgoingQueueBlocked, bOutgoingQueuePaused, bIncomingQueueBlocked],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BIncomingQueueBlocked, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnServerActivityChange,
    argNames: js.Tuple5[pFaxServer, lIncomingMessages, lRoutingMessages, lOutgoingMessages, lQueuedMessages],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ LIncomingMessages, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxAccount,
    event: Invoke,
    argNames: FaxAccountInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FaxAccountInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxServer,
    event: Invoke,
    argNames: FaxServerInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnDeviceStatusChange(
    obj: FaxServer,
    event: OnDeviceStatusChange,
    argNames: FaxServerOnDeviceStatusChangeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerOnDeviceStatusChangeParameter, Unit]
  ): Unit = js.native
}
