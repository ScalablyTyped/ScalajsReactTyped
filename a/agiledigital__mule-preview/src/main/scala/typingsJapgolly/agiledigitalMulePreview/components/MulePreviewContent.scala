package typingsJapgolly.agiledigitalMulePreview.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewContent {
  def apply(
    contentRoot: String,
    contentString: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MulePreviewContentProps, 
    MountedWithRawType[MulePreviewContentProps, js.Object, RawMounted[MulePreviewContentProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewContentProps])(children: _*)
  }
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  object componentImport extends js.Object
  
}

