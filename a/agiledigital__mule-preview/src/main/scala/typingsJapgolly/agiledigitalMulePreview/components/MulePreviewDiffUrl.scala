package typingsJapgolly.agiledigitalMulePreview.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffUrlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewDiffUrl {
  def apply(
    contentRoot: String,
    contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MulePreviewDiffUrlProps, 
    MountedWithRawType[MulePreviewDiffUrlProps, js.Object, RawMounted[MulePreviewDiffUrlProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffUrlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffUrlProps])(children: _*)
  }
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  object componentImport extends js.Object
  
}

