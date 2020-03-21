package typingsJapgolly.reactSimpleMaps.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactSimpleMaps.mod.ComposableMapProps
import typingsJapgolly.reactSimpleMaps.mod.ProjectionConfig
import typingsJapgolly.reactSimpleMaps.mod.ProjectionFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComposableMap {
  def apply(
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    height: Int | Double = null,
    projection: String | ProjectionFunction = null,
    projectionConfig: ProjectionConfig = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ComposableMapProps, 
    MountedWithRawType[ComposableMapProps, js.Object, RawMounted[ComposableMapProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (projectionConfig != null) __obj.updateDynamic("projectionConfig")(projectionConfig.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.ComposableMapProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.ComposableMapProps])(children: _*)
  }
  @JSImport("react-simple-maps", "ComposableMap")
  @js.native
  object componentImport extends js.Object
  
}

