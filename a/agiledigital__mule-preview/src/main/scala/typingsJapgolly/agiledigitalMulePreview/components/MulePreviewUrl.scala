package typingsJapgolly.agiledigitalMulePreview.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewUrlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewUrl {
  def apply(
    contentRoot: String,
    contentUrl: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MulePreviewUrlProps, 
    MountedWithRawType[MulePreviewUrlProps, js.Object, RawMounted[MulePreviewUrlProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewUrlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewUrlProps])(children: _*)
  }
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  object componentImport extends js.Object
  
}

