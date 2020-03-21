package typingsJapgolly.storybookTheming.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emotionUtils.mod.EmotionCache
import typingsJapgolly.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CacheProvider {
  def apply(
    value: EmotionCache,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[EmotionCache], 
    MountedWithRawType[
      ProviderProps[EmotionCache], 
      js.Object, 
      RawMounted[ProviderProps[EmotionCache], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.emotionUtils.mod.EmotionCache], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.emotionUtils.mod.EmotionCache]])(children: _*)
  }
  @JSImport("@storybook/theming", "CacheProvider")
  @js.native
  object componentImport extends js.Object
  
}

