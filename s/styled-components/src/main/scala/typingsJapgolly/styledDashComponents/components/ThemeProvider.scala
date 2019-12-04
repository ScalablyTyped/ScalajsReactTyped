package typingsJapgolly.styledDashComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeProvider {
  def apply(
    theme: AnyIfEmpty[AnyIfEmpty[DefaultTheme]] | (js.Function1[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]),
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]], 
    typingsJapgolly.styledDashComponents.macroMod.ThemeProvider, 
    Unit, 
    ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]
  ] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps[
    typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ], 
    typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
      typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]
    ]
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledDashComponents.macroMod.ThemeProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps[
  typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
    typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]
  ], 
  typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[
    typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]
  ]]])(children: _*)
  }
  @JSImport("styled-components/macro", "ThemeProvider")
  @js.native
  object componentImport extends js.Object
  
}

