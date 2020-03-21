package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookReactNative.storyListViewMod.Props
import typingsJapgolly.storybookReactNative.storyListViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StoryListView {
  def apply(
    stories: js.Any,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.storyListViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.storyListViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.storyListViewMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/StoryListView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

