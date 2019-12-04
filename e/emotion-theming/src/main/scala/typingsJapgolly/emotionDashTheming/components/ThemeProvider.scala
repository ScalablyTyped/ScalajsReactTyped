package typingsJapgolly.emotionDashTheming.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply[Theme](
    theme: Partial[Theme] | (js.Function1[Theme, Theme]),
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ThemeProviderProps[Theme], 
    MountedWithRawType[
      ThemeProviderProps[Theme], 
      js.Object, 
      RawMounted[ThemeProviderProps[Theme], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps[Theme], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps[Theme]])(children: _*)
  }
  @JSImport("emotion-theming", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

