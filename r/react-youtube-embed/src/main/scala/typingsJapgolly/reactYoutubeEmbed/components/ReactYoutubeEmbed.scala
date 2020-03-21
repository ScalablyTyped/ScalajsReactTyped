package typingsJapgolly.reactYoutubeEmbed.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactYoutubeEmbed.mod.YouTubeEmbedProps
import typingsJapgolly.reactYoutubeEmbed.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactYoutubeEmbed {
  def apply(
    id: String,
    appendSrc: String = null,
    aspectRatio: String = null,
    prependSrc: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[YouTubeEmbedProps, default, Unit, YouTubeEmbedProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (appendSrc != null) __obj.updateDynamic("appendSrc")(appendSrc.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (prependSrc != null) __obj.updateDynamic("prependSrc")(prependSrc.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactYoutubeEmbed.mod.YouTubeEmbedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactYoutubeEmbed.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactYoutubeEmbed.mod.YouTubeEmbedProps])(children: _*)
  }
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

