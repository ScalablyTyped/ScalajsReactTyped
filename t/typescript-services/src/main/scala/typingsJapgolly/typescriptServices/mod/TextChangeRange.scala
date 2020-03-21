package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typingsJapgolly.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typingsJapgolly.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typingsJapgolly.typescriptServices.TypeScript.TextChangeRange]): typingsJapgolly.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typingsJapgolly.typescriptServices.TypeScript.TextChangeRange]): typingsJapgolly.typescriptServices.TypeScript.TextChangeRange = js.native
}

