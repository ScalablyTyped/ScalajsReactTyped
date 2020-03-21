package typingsJapgolly.materialUiStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledStyledMod {
  type ComponentCreator[Component /* <: japgolly.scalajs.react.raw.React.ElementType */] = js.Function2[
    /* styles */ typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object] | (js.Function1[
      /* props */ typingsJapgolly.materialUiStyles.AnonTheme[typingsJapgolly.materialUiStyles.defaultThemeMod.DefaultTheme] with js.Object, 
      typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties[js.Object]
    ]), 
    /* options */ js.UndefOr[
      typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions[typingsJapgolly.materialUiStyles.defaultThemeMod.DefaultTheme]
    ], 
    typingsJapgolly.react.mod.ComponentType[
      (typingsJapgolly.materialUiTypes.mod.Omit[
        typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[Component, typingsJapgolly.react.mod.ComponentProps[Component]], 
        typingsJapgolly.materialUiStyles.materialUiStylesStrings.classes | typingsJapgolly.materialUiStyles.materialUiStylesStrings.className
      ]) with typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps[typingsJapgolly.materialUiStyles.materialUiStylesStrings.root] with typingsJapgolly.materialUiStyles.AnonClassName with (js.Object | ((typingsJapgolly.materialUiTypes.mod.Omit[js.Object, typingsJapgolly.materialUiStyles.materialUiStylesStrings.theme]) with typingsJapgolly.materialUiStyles.AnonThemeTheme[typingsJapgolly.materialUiStyles.defaultThemeMod.DefaultTheme]))
    ]
  ]
}
