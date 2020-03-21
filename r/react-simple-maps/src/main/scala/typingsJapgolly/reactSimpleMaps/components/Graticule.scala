package typingsJapgolly.reactSimpleMaps.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGPathElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactSimpleMaps.mod.GraticuleProps
import typingsJapgolly.reactSimpleMaps.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Graticule {
  def apply(
    ClassAttributes: ClassAttributes[SVGPathElement] = null,
    SVGAttributes: SVGAttributes[SVGPathElement] = null,
    step: Point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    GraticuleProps, 
    MountedWithRawType[GraticuleProps, js.Object, RawMounted[GraticuleProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.GraticuleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.GraticuleProps])(children: _*)
  }
  @JSImport("react-simple-maps", "Graticule")
  @js.native
  object componentImport extends js.Object
  
}

