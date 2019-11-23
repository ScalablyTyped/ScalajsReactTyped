package typingsJapgolly.atStorybookTheming.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typingsJapgolly.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CacheProvider {
  def apply(
    value: EmotionCache,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
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
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.reactMod.ProviderProps[typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.EmotionCache], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.atStorybookTheming.atStorybookThemingMod.CacheProvider)
    f(__obj.asInstanceOf[typingsJapgolly.react.reactMod.ProviderProps[typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.EmotionCache]])(children: _*)
  }
}

