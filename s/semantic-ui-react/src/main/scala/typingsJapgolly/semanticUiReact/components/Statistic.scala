package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticGroupMod.StatisticGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticLabelMod.StatisticLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
import typingsJapgolly.semanticUiReact.distCommonjsViewsStatisticStatisticValueMod.StatisticValueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Statistic {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Statistic.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_StatisticGroupProps_195426480 = new SharedBuilder_StatisticGroupProps_195426480(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticGroupProps): SharedBuilder_StatisticGroupProps_195426480 = new SharedBuilder_StatisticGroupProps_195426480(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Label {
    
    @JSImport("semantic-ui-react", "Statistic.Label")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Label.type): SharedBuilder_StatisticLabelProps1818481181 = new SharedBuilder_StatisticLabelProps1818481181(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticLabelProps): SharedBuilder_StatisticLabelProps1818481181 = new SharedBuilder_StatisticLabelProps1818481181(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Value {
    
    @JSImport("semantic-ui-react", "Statistic.Value")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Value.type): SharedBuilder_StatisticValueProps_789803088 = new SharedBuilder_StatisticValueProps_789803088(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticValueProps): SharedBuilder_StatisticValueProps_789803088 = new SharedBuilder_StatisticValueProps_789803088(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Statistic")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def label(value: SemanticShorthandContent): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: StatisticSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def text(value: Boolean): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def value(value: SemanticShorthandContent): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("value", js.Array(value*))
    
    inline def valueVdomElement(value: VdomElement): this.type = set("value", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Statistic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatisticProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
