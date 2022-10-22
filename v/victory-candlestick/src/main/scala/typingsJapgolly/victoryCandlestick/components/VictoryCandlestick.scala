package typingsJapgolly.victoryCandlestick.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCandlestick.anon.Close
import typingsJapgolly.victoryCandlestick.anon.Negative
import typingsJapgolly.victoryCandlestick.esMod.VictoryCandlestickLabelsType
import typingsJapgolly.victoryCandlestick.esMod.VictoryCandlestickProps
import typingsJapgolly.victoryCandlestick.esMod.VictoryCandlestickStyleInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryCandlestick {
  
  @JSImport("victory-candlestick/es", "VictoryCandlestick")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCandlestick.esMod.VictoryCandlestick] {
    
    inline def candleColors(value: Negative): this.type = set("candleColors", value.asInstanceOf[js.Any])
    
    inline def candleRatio(value: Double): this.type = set("candleRatio", value.asInstanceOf[js.Any])
    
    inline def candleWidth(value: Double | js.Function): this.type = set("candleWidth", value.asInstanceOf[js.Any])
    
    inline def close(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("close", value.asInstanceOf[js.Any])
    
    inline def closeLabelComponent(value: VdomElement): this.type = set("closeLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeLabels(value: VictoryCandlestickLabelsType): this.type = set("closeLabels", value.asInstanceOf[js.Any])
    
    inline def closeLabelsFunction1(value: /* datum */ Any => Double): this.type = set("closeLabels", js.Any.fromFunction1(value))
    
    inline def closeLabelsVarargs(value: (String | Double)*): this.type = set("closeLabels", js.Array(value*))
    
    inline def closeVarargs(value: String*): this.type = set("close", js.Array(value*))
    
    inline def eventKey(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def eventKeyVarargs(value: String*): this.type = set("eventKey", js.Array(value*))
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<'data' | 'labels' | 'open' | 'openLabels' | 'close' | 'closeLabels' | 'low' | 'lowLabels' | 'high' | 'highLabels', StringOrNumberOrCallback | Array<string>> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<'data' | 'labels' | 'open' | 'openLabels' | 'close' | 'closeLabels' | 'low' | 'lowLabels' | 'high' | 'highLabels', StringOrNumberOrCallback | Array<string>> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def high(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("high", value.asInstanceOf[js.Any])
    
    inline def highLabelComponenet(value: VdomElement): this.type = set("highLabelComponenet", value.rawElement.asInstanceOf[js.Any])
    
    inline def highLabels(value: VictoryCandlestickLabelsType): this.type = set("highLabels", value.asInstanceOf[js.Any])
    
    inline def highLabelsFunction1(value: /* datum */ Any => Double): this.type = set("highLabels", js.Any.fromFunction1(value))
    
    inline def highLabelsVarargs(value: (String | Double)*): this.type = set("highLabels", js.Array(value*))
    
    inline def highVarargs(value: String*): this.type = set("high", js.Array(value*))
    
    inline def labelOrientation(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | Close
    ): this.type = set("labelOrientation", value.asInstanceOf[js.Any])
    
    inline def low(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("low", value.asInstanceOf[js.Any])
    
    inline def lowLabelComponent(value: VdomElement): this.type = set("lowLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def lowLabels(value: VictoryCandlestickLabelsType): this.type = set("lowLabels", value.asInstanceOf[js.Any])
    
    inline def lowLabelsFunction1(value: /* datum */ Any => Double): this.type = set("lowLabels", js.Any.fromFunction1(value))
    
    inline def lowLabelsVarargs(value: (String | Double)*): this.type = set("lowLabels", js.Array(value*))
    
    inline def lowVarargs(value: String*): this.type = set("low", js.Array(value*))
    
    inline def open(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openLabelComponent(value: VdomElement): this.type = set("openLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def openLabels(value: VictoryCandlestickLabelsType): this.type = set("openLabels", value.asInstanceOf[js.Any])
    
    inline def openLabelsFunction1(value: /* datum */ Any => Double): this.type = set("openLabels", js.Any.fromFunction1(value))
    
    inline def openLabelsVarargs(value: (String | Double)*): this.type = set("openLabels", js.Array(value*))
    
    inline def openVarargs(value: String*): this.type = set("open", js.Array(value*))
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: VictoryCandlestickStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wickStrokeWidth(value: Double): this.type = set("wickStrokeWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryCandlestick.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryCandlestickProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
