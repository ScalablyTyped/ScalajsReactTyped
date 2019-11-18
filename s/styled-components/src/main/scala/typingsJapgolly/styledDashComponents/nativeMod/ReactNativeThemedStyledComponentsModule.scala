package typingsJapgolly.styledDashComponents.nativeMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.react.reactMod.Consumer
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.react.reactMod.ForwardRefExoticComponent
import typingsJapgolly.styledDashComponents.WithOptionalThemeComponentPropsWithRefCT
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.ThemedCssFunction
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.WithThemeFnInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  var ThemeConsumer: Consumer[T]
  var ThemeContext: Context[T]
  var ThemeProvider: ComponentClassP[
    (ThemeProviderProps[
      typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T], 
      typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[U]
    ]) with js.Object
  ]
  var css: ThemedCssFunction[T]
  var default: ReactNativeStyledInterface[T]
  // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
  var isStyledComponent: js.Function1[
    /* target */ js.Any, 
    /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
  ]
  var withTheme: WithThemeFnInterface[T]
}

object ReactNativeThemedStyledComponentsModule {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](
    ThemeConsumer: Consumer[T],
    ThemeContext: Context[T],
    ThemeProvider: ComponentClassP[
      (ThemeProviderProps[
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T], 
        typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[U]
      ]) with js.Object
    ],
    css: ThemedCssFunction[T],
    default: ReactNativeStyledInterface[T],
    isStyledComponent: /* target */ js.Any => CallbackTo[
      /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean
    ],
    withTheme: /* component */ ComponentType[js.Any] => CallbackTo[
      ForwardRefExoticComponent[
        WithOptionalThemeComponentPropsWithRefCT[typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[T]]
      ]
    ]
  ): ReactNativeThemedStyledComponentsModule[T, U] = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("isStyledComponent")(js.Any.fromFunction1((t0: /* target */ js.Any) => isStyledComponent(t0).runNow()))
    __obj.updateDynamic("withTheme")(js.Any.fromFunction1((t0: /* component */ typingsJapgolly.react.reactMod.ComponentType[js.Any]) => withTheme(t0).runNow()))
    __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
  }
}

