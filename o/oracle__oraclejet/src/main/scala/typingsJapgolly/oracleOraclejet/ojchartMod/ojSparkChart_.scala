package typingsJapgolly.oracleOraclejet.ojchartMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.Anon0
import typingsJapgolly.oracleOraclejet.AnonLabelAndValue
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
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
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSparkChart_[K, D] extends dvtBaseComponent[ojSparkChartSettableProperties[K, D]] {
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
  var highColor: String = js.native
  var lastColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  var lineWidth: Double = js.native
  var lowColor: String = js.native
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  var markerSize: Double = js.native
  var onAnimationDurationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDataChangeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAnimationOnDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAreaColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAreaSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAreaSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onAsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onBarGapRatioChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onBaselineScalingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDataChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFirstColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHighColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLastColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLineStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLineTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLineWidthChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLowColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerShapeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMarkerSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReferenceObjectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var tooltip: Anon0 = js.native
  @JSName("translations")
  var translations_ojSparkChart_ : AnonLabelAndValue = js.native
  var `type`: area | lineWithArea | bar | line = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDataChangeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: animationOnDisplayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: areaSvgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['areaSvgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _]
  ): Unit = js.native
  def addEventListener(
    `type`: baselineScalingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[zero | min], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _]
  ): Unit = js.native
  def addEventListener(
    `type`: lineStyleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[dotted | dashed | solid], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: lineTypeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: markerShapeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChart<K, D>['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[area | lineWithArea | bar | line], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _]
  ): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[none | auto], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationDurationChanged(
    `type`: animationDurationChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaColorChanged(
    `type`: areaColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_areaSvgClassNameChanged(
    `type`: areaSvgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_asChanged(
    `type`: asChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_barGapRatioChanged(
    `type`: barGapRatioChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorChanged(
    `type`: colorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataChanged(
    `type`: dataChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_firstColorChanged(
    `type`: firstColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highColorChanged(
    `type`: highColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lastColorChanged(
    `type`: lastColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lineWidthChanged(
    `type`: lineWidthChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lowColorChanged(
    `type`: lowColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_markerSizeChanged(
    `type`: markerSizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_referenceObjectsChanged(
    `type`: referenceObjectsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_svgClassNameChanged(
    `type`: svgClassNameChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
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
  def getProperty_tooltip(property: tooltip): Anon0 = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): area | lineWithArea | bar | line = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojSparkChartSettablePropertiesLenient[K, D]): Unit = js.native
  def setProperty(property: `type`, value: area): Unit = js.native
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: line): Unit = js.native
  def setProperty(property: `type`, value: lineWithArea): Unit = js.native
  def setProperty(property: animationOnDataChange, value: auto): Unit = js.native
  def setProperty(property: animationOnDataChange, value: none): Unit = js.native
  def setProperty(property: animationOnDisplay, value: auto): Unit = js.native
  def setProperty(property: animationOnDisplay, value: none): Unit = js.native
  def setProperty(property: baselineScaling, value: min): Unit = js.native
  def setProperty(property: baselineScaling, value: zero): Unit = js.native
  def setProperty(property: lineStyle, value: dashed): Unit = js.native
  def setProperty(property: lineStyle, value: dotted): Unit = js.native
  def setProperty(property: lineStyle, value: solid): Unit = js.native
  def setProperty(property: lineType, value: centeredSegmented): Unit = js.native
  def setProperty(property: lineType, value: centeredStepped): Unit = js.native
  def setProperty(property: lineType, value: curved): Unit = js.native
  def setProperty(property: lineType, value: none): Unit = js.native
  def setProperty(property: lineType, value: segmented): Unit = js.native
  def setProperty(property: lineType, value: stepped): Unit = js.native
  def setProperty(property: lineType, value: straight): Unit = js.native
  def setProperty(
    property: markerShape,
    value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
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
  def setProperty_markerSize(property: markerSize, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_referenceObjects(property: referenceObjects, value: js.Array[ReferenceObject]): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon0): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAndValue): Unit = js.native
}

