package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.grommet.clockMod.ClockProps
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Clock {
  def apply(
    props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]) with js.Object, 
    typingsJapgolly.grommet.mod.Clock, 
    Unit, 
    ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.clockMod.ClockProps with ((typingsJapgolly.react.mod.DetailedHTMLProps[
    typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
    org.scalajs.dom.raw.HTMLDivElement
  ]) | typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]) with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.grommet.mod.Clock](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.clockMod.ClockProps with ((typingsJapgolly.react.mod.DetailedHTMLProps[
  typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
  org.scalajs.dom.raw.HTMLDivElement]) | typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]) with js.Object])(children: _*)
  }
  @JSImport("grommet", "Clock")
  @js.native
  object componentImport extends js.Object
  
}

