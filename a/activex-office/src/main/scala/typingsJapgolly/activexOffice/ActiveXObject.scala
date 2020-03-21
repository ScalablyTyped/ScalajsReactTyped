package typingsJapgolly.activexOffice

import typingsJapgolly.activexOffice.Office.CommandBarButton
import typingsJapgolly.activexOffice.Office.CommandBarComboBox
import typingsJapgolly.activexOffice.Office.CommandBars
import typingsJapgolly.activexOffice.Office.CustomTaskPane
import typingsJapgolly.activexOffice.Office.CustomXMLPart
import typingsJapgolly.activexOffice.Office.CustomXMLParts
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeParameter
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeParameter
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarsInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CommandBarsInvokeParameter
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeParameter
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeParameter
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeArgNames
import typingsJapgolly.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeParameter
import typingsJapgolly.activexOffice.Office.MsoEnvelope
import typingsJapgolly.activexOffice.activexOfficeStrings.AddRef
import typingsJapgolly.activexOffice.activexOfficeStrings.CancelDefault
import typingsJapgolly.activexOffice.activexOfficeStrings.Change
import typingsJapgolly.activexOffice.activexOfficeStrings.Click
import typingsJapgolly.activexOffice.activexOfficeStrings.Ctrl
import typingsJapgolly.activexOffice.activexOfficeStrings.CustomTaskPaneInst
import typingsJapgolly.activexOffice.activexOfficeStrings.DockPositionStateChange
import typingsJapgolly.activexOffice.activexOfficeStrings.EnvelopeHide
import typingsJapgolly.activexOffice.activexOfficeStrings.EnvelopeShow
import typingsJapgolly.activexOffice.activexOfficeStrings.GetIDsOfNames
import typingsJapgolly.activexOffice.activexOfficeStrings.GetTypeInfo
import typingsJapgolly.activexOffice.activexOfficeStrings.GetTypeInfoCount
import typingsJapgolly.activexOffice.activexOfficeStrings.InUndoRedo
import typingsJapgolly.activexOffice.activexOfficeStrings.Invoke
import typingsJapgolly.activexOffice.activexOfficeStrings.List
import typingsJapgolly.activexOffice.activexOfficeStrings.NewNode
import typingsJapgolly.activexOffice.activexOfficeStrings.NewPart
import typingsJapgolly.activexOffice.activexOfficeStrings.NodeAfterDelete
import typingsJapgolly.activexOffice.activexOfficeStrings.NodeAfterInsert
import typingsJapgolly.activexOffice.activexOfficeStrings.NodeAfterReplace
import typingsJapgolly.activexOffice.activexOfficeStrings.OldNextSibling
import typingsJapgolly.activexOffice.activexOfficeStrings.OldNode
import typingsJapgolly.activexOffice.activexOfficeStrings.OldParentNode
import typingsJapgolly.activexOffice.activexOfficeStrings.OldPart
import typingsJapgolly.activexOffice.activexOfficeStrings.OnUpdate
import typingsJapgolly.activexOffice.activexOfficeStrings.Part
import typingsJapgolly.activexOffice.activexOfficeStrings.PartAfterAdd
import typingsJapgolly.activexOffice.activexOfficeStrings.PartAfterLoad
import typingsJapgolly.activexOffice.activexOfficeStrings.PartBeforeDelete
import typingsJapgolly.activexOffice.activexOfficeStrings.QueryInterface
import typingsJapgolly.activexOffice.activexOfficeStrings.Release
import typingsJapgolly.activexOffice.activexOfficeStrings.VisibleStateChange
import typingsJapgolly.activexOffice.activexOfficeStrings.accName
import typingsJapgolly.activexOffice.activexOfficeStrings.accValue
import typingsJapgolly.activexOffice.activexOfficeStrings.cNames
import typingsJapgolly.activexOffice.activexOfficeStrings.itinfo
import typingsJapgolly.activexOffice.activexOfficeStrings.lcid
import typingsJapgolly.activexOffice.activexOfficeStrings.pctinfo
import typingsJapgolly.activexOffice.activexOfficeStrings.pptinfo
import typingsJapgolly.activexOffice.activexOfficeStrings.ppvObj
import typingsJapgolly.activexOffice.activexOfficeStrings.rgdispid
import typingsJapgolly.activexOffice.activexOfficeStrings.rgszNames
import typingsJapgolly.activexOffice.activexOfficeStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonCancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonCtrl, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonInUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonNewNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonOldNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonNewPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonOldPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarButton,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarComboBox,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBars,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomTaskPane,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLPart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLParts,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeHide(
    obj: MsoEnvelope,
    event: EnvelopeHide,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeShow(
    obj: MsoEnvelope,
    event: EnvelopeShow,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarButton,
    event: Invoke,
    argNames: CommandBarButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CommandBarButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarComboBox,
    event: Invoke,
    argNames: CommandBarComboBoxInvokeArgNames,
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ CommandBarComboBoxInvokeParameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBars,
    event: Invoke,
    argNames: CommandBarsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CommandBarsInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomTaskPane,
    event: Invoke,
    argNames: CustomTaskPaneInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CustomTaskPaneInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLPart,
    event: Invoke,
    argNames: CustomXMLPartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CustomXMLPartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLParts,
    event: Invoke,
    argNames: CustomXMLPartsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CustomXMLPartsInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnUpdate(
    obj: CommandBars,
    event: OnUpdate,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarButton,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarComboBox,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBars,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomTaskPane,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLPart,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLParts,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: CommandBarComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarButton, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarComboBox, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarButton, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarComboBox, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
}

