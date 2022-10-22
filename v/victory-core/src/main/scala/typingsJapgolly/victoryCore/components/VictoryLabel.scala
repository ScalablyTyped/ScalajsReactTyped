package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victoryCore.esTypesCallbacksMod.CallbackArgs
import typingsJapgolly.victoryCore.esTypesCallbacksMod.NumberOrCallback
import typingsJapgolly.victoryCore.esTypesCallbacksMod.StringOrCallback
import typingsJapgolly.victoryCore.esTypesCallbacksMod.StringOrNumberOrCallback
import typingsJapgolly.victoryCore.esTypesPropTypesMod.ValueOrAccessor
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.LabelOrientationType
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.TextAnchorType
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.VictoryLabelProps
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.PaddingProps
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.VerticalAnchorType
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.VictoryLabelStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryLabel {
  
  @JSImport("victory-core/es", "VictoryLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def angle(value: StringOrNumberOrCallback): this.type = set("angle", value.asInstanceOf[js.Any])
    
    inline def angleFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("angle", js.Any.fromFunction1(value))
    
    inline def ariaLabel(value: StringOrCallback): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelFunction1(value: /* args */ CallbackArgs => String): this.type = set("ariaLabel", js.Any.fromFunction1(value))
    
    inline def backgroundComponent(value: VdomElement): this.type = set("backgroundComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def backgroundPadding(value: PaddingProps | js.Array[PaddingProps]): this.type = set("backgroundPadding", value.asInstanceOf[js.Any])
    
    inline def backgroundPaddingVarargs(value: PaddingProps*): this.type = set("backgroundPadding", js.Array(value*))
    
    inline def backgroundStyle(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): this.type = set("backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def backgroundStyleVarargs(value: VictoryLabelStyleObject*): this.type = set("backgroundStyle", js.Array(value*))
    
    inline def capHeight(value: StringOrNumberOrCallback): this.type = set("capHeight", value.asInstanceOf[js.Any])
    
    inline def capHeightFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("capHeight", js.Any.fromFunction1(value))
    
    inline def children(value: StringOrNumberOrCallback): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def datum(value: js.Object): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    
    inline def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def dx(value: StringOrNumberOrCallback): this.type = set("dx", value.asInstanceOf[js.Any])
    
    inline def dxFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dx", js.Any.fromFunction1(value))
    
    inline def dy(value: StringOrNumberOrCallback): this.type = set("dy", value.asInstanceOf[js.Any])
    
    inline def dyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dy", js.Any.fromFunction1(value))
    
    inline def events(value: DOMAttributes[Any]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: StringOrNumberOrCallback): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("id", js.Any.fromFunction1(value))
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(value: LabelOrientationType): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: StringOrNumberOrCallback | (js.Array[String | Double])): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def lineHeightFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("lineHeight", js.Any.fromFunction1(value))
    
    inline def lineHeightVarargs(value: (String | Double)*): this.type = set("lineHeight", js.Array(value*))
    
    inline def origin(value: OriginType): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    inline def renderInPortal(value: Boolean): this.type = set("renderInPortal", value.asInstanceOf[js.Any])
    
    inline def style(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleVarargs(value: VictoryLabelStyleObject*): this.type = set("style", js.Array(value*))
    
    inline def tabIndex(value: NumberOrCallback): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tabIndexFunction1(value: /* args */ CallbackArgs => Double): this.type = set("tabIndex", js.Any.fromFunction1(value))
    
    inline def text(value: js.Array[String] | StringOrNumberOrCallback): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textAnchor(value: ValueOrAccessor[TextAnchorType, CallbackArgs]): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    inline def textAnchorFunction1(value: CallbackArgs => TextAnchorType): this.type = set("textAnchor", js.Any.fromFunction1(value))
    
    inline def textComponent(value: VdomElement): this.type = set("textComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def textFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("text", js.Any.fromFunction1(value))
    
    inline def textVarargs(value: String*): this.type = set("text", js.Array(value*))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def transform(value: ValueOrAccessor[String | js.Object, CallbackArgs]): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def transformFunction1(value: CallbackArgs => String | js.Object): this.type = set("transform", js.Any.fromFunction1(value))
    
    inline def tspanComponent(value: VdomElement): this.type = set("tspanComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def verticalAnchor(value: ValueOrAccessor[VerticalAnchorType, CallbackArgs]): this.type = set("verticalAnchor", value.asInstanceOf[js.Any])
    
    inline def verticalAnchorFunction1(value: CallbackArgs => VerticalAnchorType): this.type = set("verticalAnchor", js.Any.fromFunction1(value))
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
