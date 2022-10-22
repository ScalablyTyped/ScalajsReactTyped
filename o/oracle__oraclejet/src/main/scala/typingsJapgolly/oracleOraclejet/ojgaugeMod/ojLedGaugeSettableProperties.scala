package typingsJapgolly.oracleOraclejet.ojgaugeMod

import typingsJapgolly.oracleOraclejet.anon.LabelAndValue
import typingsJapgolly.oracleOraclejet.anon.Text
import typingsJapgolly.oracleOraclejet.anon.TextType
import typingsJapgolly.oracleOraclejet.anon.`10`
import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`0`
import typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`180`
import typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`270`
import typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`90`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.circle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.human
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.square
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.star
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojLedGaugeSettableProperties
  extends StObject
     with dvtBaseGaugeSettableProperties {
  
  var borderColor: String
  
  var color: String
  
  var label: Text
  
  var max: Double
  
  var metricLabel: TextType
  
  var min: Double
  
  var rotation: `90` | `180` | `270` | `0`
  
  var size: Double
  
  var svgClassName: String
  
  var svgStyle: js.Object
  
  var thresholds: js.Array[Threshold]
  
  var tooltip: `10`
  
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle
  
  var value: Double | Null
  
  var visualEffects: none | auto
}
object ojLedGaugeSettableProperties {
  
  inline def apply(
    borderColor: String,
    color: String,
    label: Text,
    max: Double,
    metricLabel: TextType,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: `10`,
    trackResize: on | off,
    translations: LabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
  
  extension [Self <: ojLedGaugeSettableProperties](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMetricLabel(value: TextType): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: `90` | `180` | `270` | `0`): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTooltip(value: `10`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setType(value: arrow | diamond | square | rectangle | triangle | star | human | circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}
