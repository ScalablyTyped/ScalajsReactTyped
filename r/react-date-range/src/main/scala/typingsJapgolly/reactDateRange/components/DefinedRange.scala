package typingsJapgolly.reactDateRange.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDateRange.mod.DefinedRangeProps
import typingsJapgolly.reactDateRange.mod.InputRange
import typingsJapgolly.reactDateRange.mod.Preview
import typingsJapgolly.reactDateRange.mod.Range
import typingsJapgolly.reactDateRange.mod.RangeFocus
import typingsJapgolly.reactDateRange.mod.RangeKeyDict
import typingsJapgolly.reactDateRange.mod.StaticRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinedRange {
  
  @JSImport("react-date-range", "DefinedRange")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDateRange.mod.DefinedRange] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def focusedRange(value: RangeFocus): this.type = set("focusedRange", value.asInstanceOf[js.Any])
    
    inline def footerContent(value: VdomNode): this.type = set("footerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerContentNull: this.type = set("footerContent", null)
    
    inline def footerContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footerContent", js.Array(value*))
    
    inline def footerContentVdomElement(value: VdomElement): this.type = set("footerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def headerContent(value: VdomNode): this.type = set("headerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def headerContentNull: this.type = set("headerContent", null)
    
    inline def headerContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerContent", js.Array(value*))
    
    inline def headerContentVdomElement(value: VdomElement): this.type = set("headerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputRanges(value: js.Array[InputRange]): this.type = set("inputRanges", value.asInstanceOf[js.Any])
    
    inline def inputRangesVarargs(value: InputRange*): this.type = set("inputRanges", js.Array(value*))
    
    inline def onChange(value: /* rangesByKey */ RangeKeyDict => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* rangesByKey */ RangeKeyDict) => value(t0).runNow()))
    
    inline def onPreviewChange(value: /* preview */ js.UndefOr[Preview] => Callback): this.type = set("onPreviewChange", js.Any.fromFunction1((t0: /* preview */ js.UndefOr[Preview]) => value(t0).runNow()))
    
    inline def rangeColors(value: js.Array[String]): this.type = set("rangeColors", value.asInstanceOf[js.Any])
    
    inline def rangeColorsVarargs(value: String*): this.type = set("rangeColors", js.Array(value*))
    
    inline def ranges(value: js.Array[Range]): this.type = set("ranges", value.asInstanceOf[js.Any])
    
    inline def rangesVarargs(value: Range*): this.type = set("ranges", js.Array(value*))
    
    inline def renderStaticRangeLabel(value: /* staticRange */ StaticRange => Node): this.type = set("renderStaticRangeLabel", js.Any.fromFunction1(value))
    
    inline def staticRanges(value: js.Array[StaticRange]): this.type = set("staticRanges", value.asInstanceOf[js.Any])
    
    inline def staticRangesVarargs(value: StaticRange*): this.type = set("staticRanges", js.Array(value*))
  }
  
  implicit def make(companion: DefinedRange.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefinedRangeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
