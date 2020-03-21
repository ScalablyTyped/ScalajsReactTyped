package typingsJapgolly.theming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultTheme = js.Object | scala.Null
  type ThemeProviderFactory[Theme] = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.theming.mod.ThemeProviderProps[Theme]]
  type UseThemeFactory[Theme] = js.Function0[Theme]
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ typingsJapgolly.react.mod.ComponentType[typingsJapgolly.theming.AnonTheme[Theme]], 
    typingsJapgolly.react.mod.ComponentType[
      typingsJapgolly.theming.AnonTheme[Theme] with typingsJapgolly.theming.AnonThemeNonNullable[Theme]
    ]
  ]
}
