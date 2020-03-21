package typingsJapgolly.reactSimpleMaps.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGPathElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.reactSimpleMaps.mod.AnnotationProps
import typingsJapgolly.reactSimpleMaps.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Annotation {
  def apply(
    connectorProps: SVGProps[SVGPathElement],
    ClassAttributes: ClassAttributes[SVGGElement] = null,
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    curve: Int | Double = null,
    subject: Point = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnnotationProps, 
    MountedWithRawType[AnnotationProps, js.Object, RawMounted[AnnotationProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(connectorProps = connectorProps.asInstanceOf[js.Any])
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.AnnotationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.AnnotationProps])(children: _*)
  }
  @JSImport("react-simple-maps", "Annotation")
  @js.native
  object componentImport extends js.Object
  
}

