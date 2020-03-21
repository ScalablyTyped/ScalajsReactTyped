package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
class SyntaxInformationMap protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxInformationMap {
  def this(trackParents: Boolean, trackPreviousToken: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxInformationMap")
@js.native
object SyntaxInformationMap extends js.Object {
  def create(
    node: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode,
    trackParents: Boolean,
    trackPreviousToken: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.SyntaxInformationMap = js.native
}

