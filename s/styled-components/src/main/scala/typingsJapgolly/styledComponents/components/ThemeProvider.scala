package typingsJapgolly.styledComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme
import typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    theme: AnyIfEmpty[AnyIfEmpty[DefaultTheme]] | (js.Function1[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]),
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
    typingsJapgolly.styledComponents.styledComponentsMod.ThemeProvider, 
    Unit, 
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps[
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[
      typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
    ], 
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[
      typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
    ]
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledComponents.styledComponentsMod.ThemeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styledComponents.styledComponentsMod.ThemeProviderProps[
  typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
  ], 
  typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
  ]]])(children: _*)
  }
  @JSImport("styled-components", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

