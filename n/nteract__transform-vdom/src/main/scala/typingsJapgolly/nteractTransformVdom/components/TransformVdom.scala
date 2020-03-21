package typingsJapgolly.nteractTransformVdom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nteractTransformVdom.PartialProps
import typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsJapgolly.nteractTransformVdom.mod.default
import typingsJapgolly.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsJapgolly.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransformVdom {
  def apply(
    data: VDOMEl = null,
    mediaType: applicationSlashvdomDotv1Plussignjson = null,
    onVDOMEvent: (/* targetName */ String, /* event */ SerializedEvent[js.Any]) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PartialProps, default, Unit, PartialProps] = {
    val __obj = js.Dynamic.literal()
  
      if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (onVDOMEvent != null) __obj.updateDynamic("onVDOMEvent")(js.Any.fromFunction2((t0: /* targetName */ java.lang.String, t1: /* event */ typingsJapgolly.nteractTransformVdom.eventToObjectMod.SerializedEvent[js.Any]) => onVDOMEvent(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nteractTransformVdom.PartialProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nteractTransformVdom.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nteractTransformVdom.PartialProps])(children: _*)
  }
  @JSImport("@nteract/transform-vdom", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

