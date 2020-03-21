package typingsJapgolly.storybookAddonNotes.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddonNotes.giphyMod.Props
import typingsJapgolly.storybookAddonNotes.giphyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Giphy {
  def apply(
    query: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookAddonNotes.giphyMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookAddonNotes.giphyMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonNotes.giphyMod.Props])(children: _*)
  }
  @JSImport("@storybook/addon-notes/dist/giphy", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

