package typingsJapgolly.oracleOraclejet.ojchartMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.LabelAndValue
import typingsJapgolly.oracleOraclejet.anon.`0`
import typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.ItemContext
import typingsJapgolly.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDuration
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationDurationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChange
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDataChangeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplay
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.animationOnDisplayChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.area
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaSvgClassName
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaSvgClassNameChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaSvgStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.areaSvgStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.as
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.back
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bar
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.barGapRatio
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.barGapRatioChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.baselineScaling
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.baselineScalingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.curved
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.data
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dataChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.front
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.highColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lastColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lastColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.line
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineType
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineTypeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWidth
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWidthChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lowColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lowColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerShape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerShapeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerSize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.markerSizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.plus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceObjects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.referenceObjectsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.segmented
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.solid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepped
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.straight
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSparkChart[K, D]
  extends StObject
     with dvtBaseComponent[ojSparkChartSettableProperties[K, D]] {
  
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
  def addEventListener(`type`: areaSvgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: lineTypeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: markerShapeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: svgStyleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: visualEffectsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(`type`: areaColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
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
  def addEventListener_barGapRatioChanged(`type`: barGapRatioChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(`type`: colorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(`type`: dataChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(`type`: firstColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(`type`: highColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(`type`: lastColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(`type`: lineWidthChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(`type`: lowColorChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(`type`: markerSizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
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
  def addEventListener_svgClassNameChanged(`type`: svgClassNameChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
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
  
  var animationDuration: Double | Null = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var areaColor: String = js.native
  
  var areaSvgClassName: String = js.native
  
  var areaSvgStyle: js.Object = js.native
  
  var as: String = js.native
  
  var barGapRatio: Double = js.native
  
  var baselineScaling: zero | min = js.native
  
  var color: String = js.native
  
  var data: (DataProvider[K, D]) | Null = js.native
  
  var firstColor: String = js.native
  
  def getDataItem(itemIndex: Double): ItemContext | Null = js.native
  
  @JSName("getProperty")
  def getProperty_animationDuration(property: animationDuration): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_animationOnDataChange(property: animationOnDataChange): auto | none = js.native
  @JSName("getProperty")
  def getProperty_animationOnDisplay(property: animationOnDisplay): auto | none = js.native
  @JSName("getProperty")
  def getProperty_areaColor(property: areaColor): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgClassName(property: areaSvgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_areaSvgStyle(property: areaSvgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_as(property: as): String = js.native
  @JSName("getProperty")
  def getProperty_barGapRatio(property: barGapRatio): Double = js.native
  @JSName("getProperty")
  def getProperty_baselineScaling(property: baselineScaling): zero | min = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_data(property: data): (DataProvider[K, D]) | Null = js.native
  @JSName("getProperty")
  def getProperty_firstColor(property: firstColor): String = js.native
  @JSName("getProperty")
  def getProperty_highColor(property: highColor): String = js.native
  @JSName("getProperty")
  def getProperty_lastColor(property: lastColor): String = js.native
  @JSName("getProperty")
  def getProperty_lineStyle(property: lineStyle): dotted | dashed | solid = js.native
  @JSName("getProperty")
  def getProperty_lineType(property: lineType): curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  @JSName("getProperty")
  def getProperty_lineWidth(property: lineWidth): Double = js.native
  @JSName("getProperty")
  def getProperty_lowColor(property: lowColor): String = js.native
  @JSName("getProperty")
  def getProperty_markerShape(property: markerShape): auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  @JSName("getProperty")
  def getProperty_markerSize(property: markerSize): Double = js.native
  @JSName("getProperty")
  def getProperty_referenceObjects(property: referenceObjects): js.Array[ReferenceObject] = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): `0` = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): area | lineWithArea | bar | line = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  
  var highColor: String = js.native
  
  var lastColor: String = js.native
  
  var lineStyle: dotted | dashed | solid = js.native
  
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  
  var lineWidth: Double = js.native
  
  var lowColor: String = js.native
  
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  
  var markerSize: Double = js.native
  
  var onAnimationDurationChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAreaColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAreaSvgClassNameChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAreaSvgStyleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onAsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onBarGapRatioChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onBaselineScalingChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onDataChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onFirstColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onHighColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLastColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLineStyleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLineTypeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLineWidthChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onLowColorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMarkerShapeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onMarkerSizeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onReferenceObjectsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSvgClassNameChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onSvgStyleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTooltipChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var onVisualEffectsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  var referenceObjects: js.Array[ReferenceObject] = js.native
  
  def setProperties(properties: ojSparkChartSettablePropertiesLenient[K, D]): Unit = js.native
  
  def setProperty(property: `type`, value: area | lineWithArea | bar | line): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto | none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto | none): Unit = js.native
  def setProperty(property: baselineScaling, value: zero | min): Unit = js.native
  def setProperty(property: lineStyle, value: dotted | dashed | solid): Unit = js.native
  def setProperty(
    property: lineType,
    value: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ): Unit = js.native
  def setProperty(
    property: markerShape,
    value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp
  ): Unit = js.native
  def setProperty(property: visualEffects, value: none | auto): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration): Unit = js.native
  @JSName("setProperty")
  def setProperty_animationDuration(property: animationDuration, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaColor(property: areaColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgClassName(property: areaSvgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_areaSvgStyle(property: areaSvgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_as(property: as, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_barGapRatio(property: barGapRatio, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data): Unit = js.native
  @JSName("setProperty")
  def setProperty_data(property: data, value: DataProvider[K, D]): Unit = js.native
  @JSName("setProperty")
  def setProperty_firstColor(property: firstColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_highColor(property: highColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lastColor(property: lastColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_lineWidth(property: lineWidth, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_lowColor(property: lowColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerShape(property: markerShape, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: `0`): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var tooltip: `0` = js.native
  
  @JSName("translations")
  var translations_ojSparkChart: LabelAndValue = js.native
  
  var `type`: area | lineWithArea | bar | line = js.native
  
  var visualEffects: none | auto = js.native
}
object ojSparkChart {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Item extends StObject {
    
    var borderColor: String
    
    var color: String
    
    var date: js.Date
    
    var high: Double
    
    var low: Double
    
    var markerDisplayed: on | off
    
    var markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String
    
    var markerSize: Double
    
    var svgClassName: String
    
    var svgStyle: js.Object
    
    var value: Double
  }
  object Item {
    
    inline def apply(
      borderColor: String,
      color: String,
      date: js.Date,
      high: Double,
      low: Double,
      markerDisplayed: on | off,
      markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String,
      markerSize: Double,
      svgClassName: String,
      svgStyle: js.Object,
      value: Double
    ): Item = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMarkerDisplayed(value: on | off): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
      
      inline def setMarkerShape(value: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
      
      inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ItemContext extends StObject {
    
    var borderColor: String
    
    var color: String
    
    var date: js.Date
    
    var high: Double
    
    var low: Double
    
    var value: Double
  }
  object ItemContext {
    
    inline def apply(borderColor: String, color: String, date: js.Date, high: Double, low: Double, value: Double): ItemContext = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContext]
    }
    
    extension [Self <: ItemContext](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait ReferenceObject extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var high: js.UndefOr[Double] = js.undefined
    
    var lineStyle: dotted | dashed | solid
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var location: front | back
    
    var low: js.UndefOr[Double] = js.undefined
    
    var svgClassName: js.UndefOr[String] = js.undefined
    
    var svgStyle: js.UndefOr[js.Object] = js.undefined
    
    var `type`: area | line
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object ReferenceObject {
    
    inline def apply(lineStyle: dotted | dashed | solid, location: front | back, `type`: area | line): ReferenceObject = {
      val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceObject]
    }
    
    extension [Self <: ReferenceObject](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setLocation(value: front | back): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
      
      inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
      
      inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      inline def setType(value: area | line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait TooltipContext extends StObject {
    
    var color: String
    
    var componentElement: Element
    
    var parentElement: Element
  }
  object TooltipContext {
    
    inline def apply(color: String, componentElement: Element, parentElement: Element): TooltipContext = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipContext]
    }
    
    extension [Self <: TooltipContext](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponentElement(value: Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
}
