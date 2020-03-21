package typingsJapgolly.styledComponents.styledComponentsMod

import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseThemedCssFunction[T /* <: js.Object */] extends js.Object {
  def apply(first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[js.Object, T]])*): FlattenInterpolation[ThemedStyledProps[js.Object, T]] = js.native
  def apply(first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[js.Object, T]])*): FlattenInterpolation[ThemedStyledProps[js.Object, T]] = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledProps[js.Object, T]],
    interpolations: (Interpolation[ThemedStyledProps[js.Object, T]])*
  ): FlattenInterpolation[ThemedStyledProps[js.Object, T]] = js.native
}

