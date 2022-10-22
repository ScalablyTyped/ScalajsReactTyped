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
import typingsJapgolly.activexOffice.anon.CNames
import typingsJapgolly.activexOffice.anon.Itinfo
import typingsJapgolly.activexOffice.anon.Pctinfo
import typingsJapgolly.activexOffice.anon.PpvObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: CommandBarButton,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[
      /* this */ CommandBarButton, 
      /* parameter */ typingsJapgolly.activexOffice.anon.CancelDefault, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ typingsJapgolly.activexOffice.anon.Ctrl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: AddRef | OnUpdate | Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange | VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[
      /* this */ CustomTaskPane, 
      /* parameter */ typingsJapgolly.activexOffice.anon.CustomTaskPaneInst, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ CustomXMLPart, 
      /* parameter */ typingsJapgolly.activexOffice.anon.InUndoRedo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ CustomXMLPart, 
      /* parameter */ typingsJapgolly.activexOffice.anon.NewNode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ CustomXMLPart, 
      /* parameter */ typingsJapgolly.activexOffice.anon.OldNode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[
      /* this */ CustomXMLParts, 
      /* parameter */ typingsJapgolly.activexOffice.anon.NewPart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[
      /* this */ CustomXMLParts, 
      /* parameter */ typingsJapgolly.activexOffice.anon.Part, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[
      /* this */ CustomXMLParts, 
      /* parameter */ typingsJapgolly.activexOffice.anon.OldPart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: MsoEnvelope,
    event: EnvelopeHide | EnvelopeShow,
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
  
  def set(
    obj: CommandBarButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: CommandBarComboBox,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_List(
    obj: CommandBarComboBox,
    propertyName: typingsJapgolly.activexOffice.activexOfficeStrings.List,
    parameterTypes: js.Array[Double],
    newValue: String
  ): Unit = js.native
}
