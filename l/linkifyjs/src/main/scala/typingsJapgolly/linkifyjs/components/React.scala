package typingsJapgolly.linkifyjs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linkifyjs.mod.Options
import typingsJapgolly.linkifyjs.reactMod.LinkifyProps
import typingsJapgolly.linkifyjs.reactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object React {
  def apply(
    options: Options = null,
    tagName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinkifyProps, default, Unit, LinkifyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linkifyjs.reactMod.LinkifyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linkifyjs.reactMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linkifyjs.reactMod.LinkifyProps])(children: _*)
  }
  @JSImport("linkifyjs/react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

