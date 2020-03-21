package typingsJapgolly.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.oracleOraclejet.Anon8
import typingsJapgolly.oracleOraclejet.AnonText
import typingsJapgolly.oracleOraclejet.AnonTextType
import typingsJapgolly.oracleOraclejet.mod.JetElementCustomEvent
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderColor
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.borderColorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.color
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.colorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.label
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.max
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.metricLabel
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.metricLabelChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rotation
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rotationChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.size
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sizeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassName
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgClassNameChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.svgStyleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLedGauge_ extends dvtBaseGauge[ojLedGaugeSettableProperties] {
  var borderColor: String = js.native
  var color: String = js.native
  var label: AnonText = js.native
  var max: Double = js.native
  var metricLabel: AnonTextType = js.native
  var min: Double = js.native
  var onBorderColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onColorChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMetricLabelChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onRotationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgClassNameChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSvgStyleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onThresholdsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var rotation: `90` | `180` | `270` | `0` = js.native
  var size: Double = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: Anon8 = js.native
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(
    `type`: rotationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[`90` | `180` | `270` | `0`], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rotationChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[`90` | `180` | `270` | `0`], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: svgStyleChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[arrow | diamond | square | rectangle | triangle | star | human | circle], 
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
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_borderColorChanged(
    `type`: borderColorChanged,
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
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelChanged(
    `type`: labelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metricLabelChanged(
    `type`: metricLabelChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: sizeChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sizeChanged(
    `type`: sizeChanged,
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
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
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
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getMetricLabel(): String = js.native
  @JSName("getProperty")
  def getProperty_borderColor(property: borderColor): String = js.native
  @JSName("getProperty")
  def getProperty_color(property: color): String = js.native
  @JSName("getProperty")
  def getProperty_label(property: label): AnonText = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_metricLabel(property: metricLabel): AnonTextType = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_rotation(property: rotation): `90` | `180` | `270` | `0` = js.native
  @JSName("getProperty")
  def getProperty_size(property: size): Double = js.native
  @JSName("getProperty")
  def getProperty_svgClassName(property: svgClassName): String = js.native
  @JSName("getProperty")
  def getProperty_svgStyle(property: svgStyle): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGauge['svgStyle'] */ js.Any = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon8 = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): arrow | diamond | square | rectangle | triangle | star | human | circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojLedGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: `type`, value: arrow): Unit = js.native
  def setProperty(property: `type`, value: circle): Unit = js.native
  def setProperty(property: `type`, value: diamond): Unit = js.native
  def setProperty(property: `type`, value: human): Unit = js.native
  def setProperty(property: `type`, value: rectangle): Unit = js.native
  def setProperty(property: `type`, value: square): Unit = js.native
  def setProperty(property: `type`, value: star): Unit = js.native
  def setProperty(property: `type`, value: triangle): Unit = js.native
  def setProperty(property: rotation, value: `0`): Unit = js.native
  def setProperty(property: rotation, value: `180`): Unit = js.native
  def setProperty(property: rotation, value: `270`): Unit = js.native
  def setProperty(property: rotation, value: `90`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_borderColor(property: borderColor, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_color(property: color, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_label(property: label, value: AnonText): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_metricLabel(property: metricLabel, value: AnonTextType): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_size(property: size, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgClassName(property: svgClassName, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_svgStyle(property: svgStyle, value: js.Object): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon8): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

