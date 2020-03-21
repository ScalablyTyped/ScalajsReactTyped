package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonChildren
import typingsJapgolly.astTypes.kindsMod.JSXClosingFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXElementKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXTextKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragmentBuilder extends js.Object {
  def apply(openingElement: JSXOpeningFragmentKind, closingElement: JSXClosingFragmentKind): JSXFragment = js.native
  def apply(
    openingElement: JSXOpeningFragmentKind,
    closingElement: JSXClosingFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXFragment = js.native
  def from(params: AnonChildren): JSXFragment = js.native
}

