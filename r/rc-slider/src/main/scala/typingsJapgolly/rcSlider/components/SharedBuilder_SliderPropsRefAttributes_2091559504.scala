package typingsJapgolly.rcSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSlider.libInterfaceMod.AriaValueFormat
import typingsJapgolly.rcSlider.libMarksMod.MarkObj
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SliderPropsRefAttributes_2091559504[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activeDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
  
  inline def activeDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): this.type = set("activeDotStyle", js.Any.fromFunction1(value))
  
  inline def allowCross(value: Boolean): this.type = set("allowCross", value.asInstanceOf[js.Any])
  
  inline def ariaLabelForHandle(value: String | js.Array[String]): this.type = set("ariaLabelForHandle", value.asInstanceOf[js.Any])
  
  inline def ariaLabelForHandleVarargs(value: String*): this.type = set("ariaLabelForHandle", js.Array(value*))
  
  inline def ariaLabelledByForHandle(value: String | js.Array[String]): this.type = set("ariaLabelledByForHandle", value.asInstanceOf[js.Any])
  
  inline def ariaLabelledByForHandleVarargs(value: String*): this.type = set("ariaLabelledByForHandle", js.Array(value*))
  
  inline def ariaValueTextFormatterForHandle(value: AriaValueFormat | js.Array[AriaValueFormat]): this.type = set("ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
  
  inline def ariaValueTextFormatterForHandleFunction1(value: /* value */ Double => String): this.type = set("ariaValueTextFormatterForHandle", js.Any.fromFunction1(value))
  
  inline def ariaValueTextFormatterForHandleVarargs(value: AriaValueFormat*): this.type = set("ariaValueTextFormatterForHandle", js.Array(value*))
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: Double | js.Array[Double]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueVarargs(value: Double*): this.type = set("defaultValue", js.Array(value*))
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def dotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): this.type = set("dotStyle", value.asInstanceOf[js.Any])
  
  inline def dotStyleFunction1(value: /* dotValue */ Double => CSSProperties): this.type = set("dotStyle", js.Any.fromFunction1(value))
  
  inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
  
  inline def draggableTrack(value: Boolean): this.type = set("draggableTrack", value.asInstanceOf[js.Any])
  
  inline def handleRender(
    value: /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
  ): this.type = set("handleRender", value.asInstanceOf[js.Any])
  
  inline def handleStyle(value: CSSProperties | js.Array[CSSProperties]): this.type = set("handleStyle", value.asInstanceOf[js.Any])
  
  inline def handleStyleVarargs(value: CSSProperties*): this.type = set("handleStyle", js.Array(value*))
  
  inline def included(value: Boolean): this.type = set("included", value.asInstanceOf[js.Any])
  
  inline def marks(value: Record[String | Double, Node | MarkObj]): this.type = set("marks", value.asInstanceOf[js.Any])
  
  inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
  
  inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
  
  inline def onAfterChange(value: Double | js.Array[Double] => Callback): this.type = set("onAfterChange", js.Any.fromFunction1((t0: Double | js.Array[Double]) => value(t0).runNow()))
  
  inline def onBeforeChange(value: Double | js.Array[Double] => Callback): this.type = set("onBeforeChange", js.Any.fromFunction1((t0: Double | js.Array[Double]) => value(t0).runNow()))
  
  inline def onBlur(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onChange(value: Double | js.Array[Double] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: Double | js.Array[Double]) => value(t0).runNow()))
  
  inline def onFocus(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def pushable(value: Boolean | Double): this.type = set("pushable", value.asInstanceOf[js.Any])
  
  inline def railStyle(value: CSSProperties): this.type = set("railStyle", value.asInstanceOf[js.Any])
  
  inline def range(value: Boolean): this.type = set("range", value.asInstanceOf[js.Any])
  
  inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
  
  inline def startPoint(value: Double): this.type = set("startPoint", value.asInstanceOf[js.Any])
  
  inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  
  inline def stepNull: this.type = set("step", null)
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double | js.Array[Double]): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def tabIndexVarargs(value: Double*): this.type = set("tabIndex", js.Array(value*))
  
  inline def trackStyle(value: CSSProperties | js.Array[CSSProperties]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
  
  inline def trackStyleVarargs(value: CSSProperties*): this.type = set("trackStyle", js.Array(value*))
  
  inline def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: Double*): this.type = set("value", js.Array(value*))
  
  inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
}
