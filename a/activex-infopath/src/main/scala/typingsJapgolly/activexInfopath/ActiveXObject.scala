package typingsJapgolly.activexInfopath

import typingsJapgolly.activexInfopath.InfoPath.ApplicationEvents
import typingsJapgolly.activexInfopath.InfoPath.Button
import typingsJapgolly.activexInfopath.InfoPath.DataDOM
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeArgNames
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeParameter
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeArgNames
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeParameter
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeArgNames
import typingsJapgolly.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeParameter
import typingsJapgolly.activexInfopath.InfoPath.XDocument
import typingsJapgolly.activexInfopath.activexInfopathStrings.AddRef
import typingsJapgolly.activexInfopath.activexInfopathStrings.GetIDsOfNames
import typingsJapgolly.activexInfopath.activexInfopathStrings.GetTypeInfo
import typingsJapgolly.activexInfopath.activexInfopathStrings.GetTypeInfoCount
import typingsJapgolly.activexInfopath.activexInfopathStrings.Invoke
import typingsJapgolly.activexInfopath.activexInfopathStrings.NewXDocument
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnAfterChange
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnAfterImport
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnBeforeChange
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnClick
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnContextChange
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnLoad
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnMergeRequest
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnSaveRequest
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnSign
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnSubmitRequest
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnSwitchView
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnValidate
import typingsJapgolly.activexInfopath.activexInfopathStrings.OnVersionUpgrade
import typingsJapgolly.activexInfopath.activexInfopathStrings.QueryInterface
import typingsJapgolly.activexInfopath.activexInfopathStrings.Quit
import typingsJapgolly.activexInfopath.activexInfopathStrings.Release
import typingsJapgolly.activexInfopath.activexInfopathStrings.WindowActivate
import typingsJapgolly.activexInfopath.activexInfopathStrings.WindowDeactivate
import typingsJapgolly.activexInfopath.activexInfopathStrings.WindowSize
import typingsJapgolly.activexInfopath.activexInfopathStrings.XDocumentBeforeClose
import typingsJapgolly.activexInfopath.activexInfopathStrings.XDocumentBeforePrint
import typingsJapgolly.activexInfopath.activexInfopathStrings.XDocumentBeforeSave
import typingsJapgolly.activexInfopath.activexInfopathStrings.XDocumentChange
import typingsJapgolly.activexInfopath.activexInfopathStrings.XDocumentOpen
import typingsJapgolly.activexInfopath.activexInfopathStrings.cNames
import typingsJapgolly.activexInfopath.activexInfopathStrings.itinfo
import typingsJapgolly.activexInfopath.activexInfopathStrings.lcid
import typingsJapgolly.activexInfopath.activexInfopathStrings.pDataDOMEvent
import typingsJapgolly.activexInfopath.activexInfopathStrings.pDocument
import typingsJapgolly.activexInfopath.activexInfopathStrings.pEvent
import typingsJapgolly.activexInfopath.activexInfopathStrings.pWindow
import typingsJapgolly.activexInfopath.activexInfopathStrings.pctinfo
import typingsJapgolly.activexInfopath.activexInfopathStrings.pfCancel
import typingsJapgolly.activexInfopath.activexInfopathStrings.pptinfo
import typingsJapgolly.activexInfopath.activexInfopathStrings.ppvObj
import typingsJapgolly.activexInfopath.activexInfopathStrings.rgdispid
import typingsJapgolly.activexInfopath.activexInfopathStrings.rgszNames
import typingsJapgolly.activexInfopath.activexInfopathStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: ApplicationEvents,
    event: NewXDocument,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowDeactivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowSize,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeClose,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforePrint,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnBeforeChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnLoad,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSubmitRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Button,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: DataDOM,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: XDocument,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Button,
    event: Invoke,
    argNames: ButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ ButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: DataDOM,
    event: Invoke,
    argNames: DataDOMInvokeArgNames,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ DataDOMInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: XDocument,
    event: Invoke,
    argNames: XDocumentInvokeArgNames,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ XDocumentInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: ApplicationEvents,
    event: Quit,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Button,
    event: Release,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: DataDOM,
    event: Release,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: XDocument,
    event: Release,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_XDocumentChange(
    obj: ApplicationEvents,
    event: XDocumentChange,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

