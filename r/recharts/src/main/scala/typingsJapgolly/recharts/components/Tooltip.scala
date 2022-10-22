package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.recharts.mod.AllowEscapeViewBox
import typingsJapgolly.recharts.mod.AnimationEasingType
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.Coordinate
import typingsJapgolly.recharts.mod.RechartsFunction
import typingsJapgolly.recharts.mod.TooltipPayload
import typingsJapgolly.recharts.mod.TooltipProps
import typingsJapgolly.recharts.mod.ViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("recharts", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.recharts.mod.Tooltip] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def allowEscapeViewBox(value: AllowEscapeViewBox): this.type = set("allowEscapeViewBox", value.asInstanceOf[js.Any])
    
    inline def animationBegin(value: Double): this.type = set("animationBegin", value.asInstanceOf[js.Any])
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def animationEasing(value: AnimationEasingType): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    
    inline def animationId(value: Double): this.type = set("animationId", value.asInstanceOf[js.Any])
    
    inline def content(value: Element | FunctionComponent[Any] | ContentRenderer[TooltipProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentFunction1(value: TooltipProps => Node): this.type = set("content", js.Any.fromFunction1(value))
    
    inline def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def coordinate(value: Coordinate): this.type = set("coordinate", value.asInstanceOf[js.Any])
    
    inline def cursor(value: Boolean | js.Object | Element | FunctionComponent[Any]): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def cursorVdomElement(value: VdomElement): this.type = set("cursor", value.rawElement.asInstanceOf[js.Any])
    
    inline def filterNull(value: Boolean): this.type = set("filterNull", value.asInstanceOf[js.Any])
    
    inline def formatter(
      value: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => Node
    ): this.type = set("formatter", js.Any.fromFunction4(value))
    
    inline def isAnimationActive(value: Boolean): this.type = set("isAnimationActive", value.asInstanceOf[js.Any])
    
    inline def isUpdateAnimationActive(value: Boolean): this.type = set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    inline def itemSorter(value: (TooltipPayload, TooltipPayload) => Double): this.type = set("itemSorter", js.Any.fromFunction2(value))
    
    inline def itemStyle(value: js.Object): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    inline def label(value: String | Double): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFormatter(value: /* label */ String | Double => Node): this.type = set("labelFormatter", js.Any.fromFunction1(value))
    
    inline def labelStyle(value: js.Object): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: RechartsFunction): this.type = set("onAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def onAnimationStart(value: RechartsFunction): this.type = set("onAnimationStart", value.asInstanceOf[js.Any])
    
    inline def payload(value: js.Array[TooltipPayload]): this.type = set("payload", value.asInstanceOf[js.Any])
    
    inline def payloadVarargs(value: TooltipPayload*): this.type = set("payload", js.Array(value*))
    
    inline def position(value: Coordinate): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
    
    inline def useTranslate3d(value: Boolean): this.type = set("useTranslate3d", value.asInstanceOf[js.Any])
    
    inline def viewBox(value: ViewBox): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: js.Object): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
