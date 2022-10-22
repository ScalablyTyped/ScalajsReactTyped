package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.typesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipCallbacks[TType /* <: ChartType */, Model, Item] extends StObject {
  
  def afterBody(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def afterFooter(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def afterLabel(tooltipItem: Item): String | js.Array[String]
  
  def afterTitle(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def beforeBody(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def beforeFooter(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def beforeLabel(tooltipItem: Item): String | js.Array[String]
  
  def beforeTitle(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def footer(tooltipItems: js.Array[Item]): String | js.Array[String]
  
  def label(tooltipItem: Item): String | js.Array[String]
  
  def labelColor(tooltipItem: Item): TooltipLabelStyle
  
  def labelPointStyle(tooltipItem: Item): typingsJapgolly.chartJs.anon.PointStyle
  
  def labelTextColor(tooltipItem: Item): Color
  
  def title(tooltipItems: js.Array[Item]): String | js.Array[String]
}
object TooltipCallbacks {
  
  inline def apply[TType /* <: ChartType */, Model, Item](
    afterBody: js.Array[Item] => String | js.Array[String],
    afterFooter: js.Array[Item] => String | js.Array[String],
    afterLabel: Item => String | js.Array[String],
    afterTitle: js.Array[Item] => String | js.Array[String],
    beforeBody: js.Array[Item] => String | js.Array[String],
    beforeFooter: js.Array[Item] => String | js.Array[String],
    beforeLabel: Item => String | js.Array[String],
    beforeTitle: js.Array[Item] => String | js.Array[String],
    footer: js.Array[Item] => String | js.Array[String],
    label: Item => String | js.Array[String],
    labelColor: Item => TooltipLabelStyle,
    labelPointStyle: Item => typingsJapgolly.chartJs.anon.PointStyle,
    labelTextColor: Item => Color,
    title: js.Array[Item] => String | js.Array[String]
  ): TooltipCallbacks[TType, Model, Item] = {
    val __obj = js.Dynamic.literal(afterBody = js.Any.fromFunction1(afterBody), afterFooter = js.Any.fromFunction1(afterFooter), afterLabel = js.Any.fromFunction1(afterLabel), afterTitle = js.Any.fromFunction1(afterTitle), beforeBody = js.Any.fromFunction1(beforeBody), beforeFooter = js.Any.fromFunction1(beforeFooter), beforeLabel = js.Any.fromFunction1(beforeLabel), beforeTitle = js.Any.fromFunction1(beforeTitle), footer = js.Any.fromFunction1(footer), label = js.Any.fromFunction1(label), labelColor = js.Any.fromFunction1(labelColor), labelPointStyle = js.Any.fromFunction1(labelPointStyle), labelTextColor = js.Any.fromFunction1(labelTextColor), title = js.Any.fromFunction1(title))
    __obj.asInstanceOf[TooltipCallbacks[TType, Model, Item]]
  }
  
  extension [Self <: TooltipCallbacks[?, ?, ?], TType /* <: ChartType */, Model, Item](x: Self & (TooltipCallbacks[TType, Model, Item])) {
    
    inline def setAfterBody(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "afterBody", js.Any.fromFunction1(value))
    
    inline def setAfterFooter(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "afterFooter", js.Any.fromFunction1(value))
    
    inline def setAfterLabel(value: Item => String | js.Array[String]): Self = StObject.set(x, "afterLabel", js.Any.fromFunction1(value))
    
    inline def setAfterTitle(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "afterTitle", js.Any.fromFunction1(value))
    
    inline def setBeforeBody(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "beforeBody", js.Any.fromFunction1(value))
    
    inline def setBeforeFooter(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "beforeFooter", js.Any.fromFunction1(value))
    
    inline def setBeforeLabel(value: Item => String | js.Array[String]): Self = StObject.set(x, "beforeLabel", js.Any.fromFunction1(value))
    
    inline def setBeforeTitle(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "beforeTitle", js.Any.fromFunction1(value))
    
    inline def setFooter(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setLabel(value: Item => String | js.Array[String]): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelColor(value: Item => TooltipLabelStyle): Self = StObject.set(x, "labelColor", js.Any.fromFunction1(value))
    
    inline def setLabelPointStyle(value: Item => typingsJapgolly.chartJs.anon.PointStyle): Self = StObject.set(x, "labelPointStyle", js.Any.fromFunction1(value))
    
    inline def setLabelTextColor(value: Item => Color): Self = StObject.set(x, "labelTextColor", js.Any.fromFunction1(value))
    
    inline def setTitle(value: js.Array[Item] => String | js.Array[String]): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
  }
}
