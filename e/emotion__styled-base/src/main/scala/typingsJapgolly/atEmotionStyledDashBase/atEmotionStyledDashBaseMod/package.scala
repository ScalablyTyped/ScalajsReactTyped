package typingsJapgolly.atEmotionStyledDashBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atEmotionStyledDashBaseMod {
  import typingsJapgolly.atEmotionStyledDashBase.Anon_ThemeAny
  import typingsJapgolly.atEmotionStyledDashBase.Anon_ThemeT
  import typingsJapgolly.atEmotionStyledDashBase.typesHelperMod.PropsOf
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.react.reactMod._Global_.JSX.IntrinsicElements

  type CreateStyledComponentExtrinsic[Tag /* <: ComponentType[_] */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: String */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[
    /* import warning: importer.ImportType#apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = IntrinsicElements
  type ReactClassPropKeys = String
  type WithTheme[P, T] = (P with Anon_ThemeT[T]) | (P with Anon_ThemeAny)
}
