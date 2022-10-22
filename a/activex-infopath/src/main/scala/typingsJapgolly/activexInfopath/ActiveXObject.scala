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
import typingsJapgolly.activexInfopath.anon.CNames
import typingsJapgolly.activexInfopath.anon.Itinfo
import typingsJapgolly.activexInfopath.anon.PDataDOMEvent
import typingsJapgolly.activexInfopath.anon.PDocument
import typingsJapgolly.activexInfopath.anon.PEvent
import typingsJapgolly.activexInfopath.anon.PEventDocContextChangeEventObject
import typingsJapgolly.activexInfopath.anon.PEventDocEventObject
import typingsJapgolly.activexInfopath.anon.PEventDocReturnEventObject
import typingsJapgolly.activexInfopath.anon.PEventMergeEventObject
import typingsJapgolly.activexInfopath.anon.PEventSaveEventObject
import typingsJapgolly.activexInfopath.anon.PEventSignEventObject
import typingsJapgolly.activexInfopath.anon.PEventVersionUpgradeEventObject
import typingsJapgolly.activexInfopath.anon.PWindow
import typingsJapgolly.activexInfopath.anon.Pctinfo
import typingsJapgolly.activexInfopath.anon.PfCancel
import typingsJapgolly.activexInfopath.anon.PpvObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: ApplicationEvents,
    event: NewXDocument | XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate | WindowDeactivate | WindowSize | XDocumentBeforeClose | XDocumentBeforePrint | XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pWindow | pfCancel],
    handler: js.ThisFunction1[
      /* this */ ApplicationEvents, 
      (/* parameter */ PWindow) | (/* parameter */ PfCancel), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: Quit | XDocumentChange,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ PEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange | OnBeforeChange | OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport | OnLoad | OnSubmitRequest | OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[
      /* this */ XDocument, 
      (/* parameter */ PEventDocEventObject) | (/* parameter */ PEventDocReturnEventObject), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PpvObj, Unit]
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
}
