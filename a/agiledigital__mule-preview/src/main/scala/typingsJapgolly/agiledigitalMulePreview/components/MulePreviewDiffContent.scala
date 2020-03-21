package typingsJapgolly.agiledigitalMulePreview.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewDiffContent {
  def apply(
    contentRoot: String,
    contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MulePreviewDiffContentProps, 
    MountedWithRawType[
      MulePreviewDiffContentProps, 
      js.Object, 
      RawMounted[MulePreviewDiffContentProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffContentProps])(children: _*)
  }
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  object componentImport extends js.Object
  
}

