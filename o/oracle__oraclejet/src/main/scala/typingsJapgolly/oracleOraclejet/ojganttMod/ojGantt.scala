package typingsJapgolly.oracleOraclejet.ojganttMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.AccessibleDependencyInfo
import typingsJapgolly.oracleOraclejet.anon.Baseline
import typingsJapgolly.oracleOraclejet.anon.BaselineDate
import typingsJapgolly.oracleOraclejet.anon.End
import typingsJapgolly.oracleOraclejet.anon.Index
import typingsJapgolly.oracleOraclejet.anon.MaxWidth
import typingsJapgolly.oracleOraclejet.anon.Move
import typingsJapgolly.oracleOraclejet.anon.OffsetY
import typingsJapgolly.oracleOraclejet.anon.RowIndex
import typingsJapgolly.oracleOraclejet.anon.Scale
import typingsJapgolly.oracleOraclejet.anon.Value
import typingsJapgolly.oracleOraclejet.anon.Vertical
import typingsJapgolly.oracleOraclejet.anon.`8`
import typingsJapgolly.oracleOraclejet.anon.`9`
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typingsJapgolly.oracleOraclejet.ojtimeBaseMod.dvtTimeComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.axisPosition
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.axisPositionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dependencyData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dependencyDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.finishStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlines
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.gridlinesChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.majorAxis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.majorAxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.milestone
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minorAxis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minorAxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.normal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojMove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojViewportChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowAxis
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowAxisChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rowDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPosition
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scrollPositionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selection
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionMode
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.selectionModeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startFinish
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.summary
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.taskData
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.taskDataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.taskDefaults
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.taskDefaultsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueFormats
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueFormatsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.viewportEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.viewportEndChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.viewportStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.viewportStartChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojGantt[K1, K2, D1, D2]
  extends StObject
     with dvtTimeComponent[ojGanttSettableProperties[K1, K2, D1, D2]] {
  
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: axisPositionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: axisPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: selectionModeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: selectionModeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(`type`: asChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dependencyDataChanged(
    `type`: dependencyDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dependencyDataChanged(
    `type`: dependencyDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(`type`: dndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dndChanged(
    `type`: dndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(`type`: gridlinesChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gridlinesChanged(
    `type`: gridlinesChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(`type`: majorAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_majorAxisChanged(
    `type`: majorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(`type`: minorAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minorAxisChanged(
    `type`: minorAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(`type`: ojMove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojMove(
    `type`: ojMove,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(`type`: ojViewportChange, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojViewportChange(
    `type`: ojViewportChange,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(`type`: rowAxisChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowAxisChanged(
    `type`: rowAxisChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(`type`: rowDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowDefaultsChanged(
    `type`: rowDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scrollPositionChanged(
    `type`: scrollPositionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(`type`: selectionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionChanged(
    `type`: selectionChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(`type`: taskDataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDataChanged(
    `type`: taskDataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(`type`: taskDefaultsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskDefaultsChanged(
    `type`: taskDefaultsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(`type`: valueFormatsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueFormatsChanged(
    `type`: valueFormatsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(`type`: viewportEndChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportEndChanged(
    `type`: viewportEndChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(`type`: viewportStartChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_viewportStartChanged(
    `type`: viewportStartChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var as: String = js.native
  
  var axisPosition: bottom | top = js.native
  
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.native
  
  var dnd: Move = js.native
  
  var end: String = js.native
  
  def getContextByNode(node: Element): Index | RowIndex | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_axisPosition(property: axisPosition): bottom | top = js.native
  @JSName("getProperty")
  def getProperty_dependencyData(property: dependencyData): js.UndefOr[DataProvider[K1, D1]] = js.native
  @JSName("getProperty")
  def getProperty_dnd(property: dnd): Move = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_gridlines(property: gridlines): Vertical = js.native
  @JSName("getProperty")
  def getProperty_majorAxis(property: majorAxis): Scale = js.native
  @JSName("getProperty")
  def getProperty_minorAxis(property: minorAxis): Scale = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_rowAxis(property: rowAxis): MaxWidth[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_rowDefaults(property: rowDefaults): `8` = js.native
  @JSName("getProperty")
  def getProperty_scrollPosition(property: scrollPosition): OffsetY = js.native
  @JSName("getProperty")
  def getProperty_selection(property: selection): js.Array[K2] = js.native
  @JSName("getProperty")
  def getProperty_selectionMode(property: selectionMode): single | multiple | none = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  @JSName("getProperty")
  def getProperty_taskData(property: taskData): js.UndefOr[DataProvider[K2, D2]] = js.native
  @JSName("getProperty")
  def getProperty_taskDefaults(property: taskDefaults): Baseline = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `9`[K2, D2] = js.native
  @JSName("getProperty")
  def getProperty_valueFormats(property: valueFormats): BaselineDate = js.native
  @JSName("getProperty")
  def getProperty_viewportEnd(property: viewportEnd): String = js.native
  @JSName("getProperty")
  def getProperty_viewportStart(property: viewportStart): String = js.native
  
  var gridlines: Vertical = js.native
  
  var majorAxis: Scale = js.native
  
  var minorAxis: Scale = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAxisPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDependencyDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onEndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onGridlinesChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMajorAxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMinorAxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjMove: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onOjViewportChange: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onReferenceObjectsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRowAxisChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onRowDefaultsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onScrollPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSelectionModeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onStartChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTaskDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTaskDefaultsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onValueFormatsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onViewportEndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onViewportStartChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var referenceObjects: js.Array[ReferenceObject] = js.native
  
  var rowAxis: MaxWidth[K2, D2] = js.native
  
  var rowDefaults: `8` = js.native
  
  var scrollPosition: OffsetY = js.native
  
  var selection: js.Array[K2] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  def setProperties(properties: ojGanttSettablePropertiesLenient[K1, K2, D1, D2]): Unit = js.native
  
  def setProperty(property: animationOnDataChange, value: auto | none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto | none): Unit = js.native
  def setProperty(property: axisPosition, value: bottom | top): Unit = js.native
  def setProperty(property: selectionMode, value: single | multiple | none): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(property: dependencyData): Unit = js.native
  @JSName("setProperty")
  def setProperty_dependencyData(property: dependencyData, value: DataProvider[K1, D1]): Unit = js.native
  @JSName("setProperty")
  def setProperty_dnd(property: dnd, value: Move): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_gridlines(property: gridlines, value: Vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_majorAxis(property: majorAxis, value: Scale): Unit = js.native
  @JSName("setProperty")
  def setProperty_minorAxis(property: minorAxis, value: Scale): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowAxis(property: rowAxis, value: MaxWidth[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_rowDefaults(property: rowDefaults, value: `8`): Unit = js.native
  @JSName("setProperty")
  def setProperty_scrollPosition(property: scrollPosition, value: OffsetY): Unit = js.native
  @JSName("setProperty")
  def setProperty_selection(property: selection, value: js.Array[K2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskData(property: taskData, value: DataProvider[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_taskDefaults(property: taskDefaults, value: Baseline): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `9`[K2, D2]): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AccessibleDependencyInfo): Unit = js.native
  @JSName("setProperty")
  def setProperty_valueFormats(property: valueFormats, value: BaselineDate): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportEnd(property: viewportEnd, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_viewportStart(property: viewportStart, value: String): Unit = js.native
  
  var start: String = js.native
  
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.native
  
  var taskDefaults: Baseline = js.native
  
  var tooltip: `9`[K2, D2] = js.native
  
  @JSName("translations")
  var translations_ojGantt: AccessibleDependencyInfo = js.native
  
  var valueFormats: BaselineDate = js.native
  
  var viewportEnd: String = js.native
  
  var viewportStart: String = js.native
}
object ojGantt {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Dependency[K1, K2] extends StObject {
    
    var id: K1
    
    var predecessorTaskId: K2
    
    var shortDesc: js.UndefOr[String] = js.undefined
    
    var successorTaskId: K2
    
    var svgClassName: js.UndefOr[String] = js.undefined
    
    var svgStyle: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[startStart | startFinish | finishFinish | finishStart] = js.undefined
  }
  object Dependency {
    
    inline def apply[K1, K2](id: K1, predecessorTaskId: K2, successorTaskId: K2): Dependency[K1, K2] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependency[K1, K2]]
    }
    
    extension [Self <: Dependency[?, ?], K1, K2](x: Self & (Dependency[K1, K2])) {
      
      inline def setId(value: K1): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPredecessorTaskId(value: K2): Self = StObject.set(x, "predecessorTaskId", value.asInstanceOf[js.Any])
      
      inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
      
      inline def setSuccessorTaskId(value: K2): Self = StObject.set(x, "successorTaskId", value.asInstanceOf[js.Any])
      
      inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      inline def setType(value: startStart | startFinish | finishFinish | finishStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ReferenceObject extends StObject {
    
    var svgClassName: js.UndefOr[String] = js.undefined
    
    var svgStyle: js.UndefOr[js.Object] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ReferenceObject {
    
    inline def apply(): ReferenceObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferenceObject]
    }
    
    extension [Self <: ReferenceObject](x: Self) {
      
      inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait Row[K2] extends StObject {
    
    var id: js.UndefOr[Any] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelStyle: js.UndefOr[js.Object] = js.undefined
    
    var tasks: js.UndefOr[js.Array[RowTask[K2]]] = js.undefined
  }
  object Row {
    
    inline def apply[K2](): Row[K2] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Row[K2]]
    }
    
    extension [Self <: Row[?], K2](x: Self & Row[K2]) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTasks(value: js.Array[RowTask[K2]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      inline def setTasksVarargs(value: RowTask[K2]*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RowAxisLabelRendererContext[K2, D2] extends StObject {
    
    var componentElement: Element
    
    var itemData: js.Array[D2]
    
    var maxHeight: Double
    
    var maxWidth: Double
    
    var parentElement: Element
    
    var rowData: Row[K2]
  }
  object RowAxisLabelRendererContext {
    
    inline def apply[K2, D2](
      componentElement: Element,
      itemData: js.Array[D2],
      maxHeight: Double,
      maxWidth: Double,
      parentElement: Element,
      rowData: Row[K2]
    ): RowAxisLabelRendererContext[K2, D2] = {
      val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowAxisLabelRendererContext[K2, D2]]
    }
    
    extension [Self <: RowAxisLabelRendererContext[?, ?], K2, D2](x: Self & (RowAxisLabelRendererContext[K2, D2])) {
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: js.Array[D2]): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataVarargs(value: D2*): Self = StObject.set(x, "itemData", js.Array(value*))
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RowTask[K2] extends StObject {
    
    var baseline: js.UndefOr[End] = js.undefined
    
    var borderRadius: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: K2
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelPosition: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var labelStyle: js.UndefOr[js.Object] = js.undefined
    
    var progress: js.UndefOr[Value] = js.undefined
    
    var shortDesc: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
    
    var svgClassName: js.UndefOr[String] = js.undefined
    
    var svgStyle: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[normal | milestone | summary | auto] = js.undefined
  }
  object RowTask {
    
    inline def apply[K2](id: K2): RowTask[K2] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowTask[K2]]
    }
    
    extension [Self <: RowTask[?], K2](x: Self & RowTask[K2]) {
      
      inline def setBaseline(value: End): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: K2): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: String | js.Array[String]): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelPositionVarargs(value: String*): Self = StObject.set(x, "labelPosition", js.Array(value*))
      
      inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
      
      inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      inline def setType(value: normal | milestone | summary | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext[K2, D2] extends StObject {
    
    var color: String
    
    var componentElement: Element
    
    var data: RowTask[K2]
    
    var itemData: D2
    
    var parentElement: Element
    
    var rowData: Row[K2]
  }
  object TooltipContext {
    
    inline def apply[K2, D2](
      color: String,
      componentElement: Element,
      data: RowTask[K2],
      itemData: D2,
      parentElement: Element,
      rowData: Row[K2]
    ): TooltipContext[K2, D2] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext[K2, D2]]
    }
    
    extension [Self <: TooltipContext[?, ?], K2, D2](x: Self & (TooltipContext[K2, D2])) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setData(value: RowTask[K2]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: D2): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
      
      inline def setRowData(value: Row[K2]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    }
  }
  
  type ojMove[K2, D2] = CustomEvent
  
  type ojViewportChange = CustomEvent
}
