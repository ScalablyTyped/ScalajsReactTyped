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
import typingsJapgolly.reactSimpleMaps.mod.SphereProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sphere {
  def apply(
    fill: String,
    id: String,
    stroke: String,
    strokeWidth: Double,
    ClassAttributes: ClassAttributes[SVGPathElement] = null,
    SVGAttributes: SVGAttributes[SVGPathElement] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SphereProps, 
    MountedWithRawType[SphereProps, js.Object, RawMounted[SphereProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.SphereProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.SphereProps])(children: _*)
  }
  @JSImport("react-simple-maps", "Sphere")
  @js.native
  object componentImport extends js.Object
  
}

