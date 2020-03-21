package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PositionedElement")
@js.native
class PositionedElement protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PositionedElement {
  def this(
    parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PositionedElement")
@js.native
object PositionedElement extends js.Object {
  def create(
    parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    element: ISyntaxElement,
    fullStart: Double
  ): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = js.native
}

