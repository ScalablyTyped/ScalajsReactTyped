package typingsJapgolly.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateStyledComponentExtrinsic[Tag /* <: typingsJapgolly.react.mod.ComponentType[_] */, ExtraProps, Theme /* <: js.Object */] = typingsJapgolly.emotionStyledBase.mod.CreateStyledComponentBase[typingsJapgolly.emotionStyledBase.helperMod.PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: java.lang.String */, ExtraProps, Theme /* <: js.Object */] = typingsJapgolly.emotionStyledBase.mod.CreateStyledComponentBase[
    /* import warning: importer.ImportType#apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = typingsJapgolly.react.mod._Global_.JSX.IntrinsicElements
  type ReactClassPropKeys = java.lang.String
  type WithTheme[P, T] = (P with typingsJapgolly.emotionStyledBase.AnonThemeT[T]) | (P with typingsJapgolly.emotionStyledBase.AnonThemeExclude)
}
