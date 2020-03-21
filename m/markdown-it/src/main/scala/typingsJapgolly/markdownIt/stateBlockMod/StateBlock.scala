package typingsJapgolly.markdownIt.stateBlockMod

import typingsJapgolly.markdownIt.markdownItStrings.blockquote
import typingsJapgolly.markdownIt.markdownItStrings.list
import typingsJapgolly.markdownIt.markdownItStrings.paragraph
import typingsJapgolly.markdownIt.markdownItStrings.reference
import typingsJapgolly.markdownIt.markdownItStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateBlock
  extends typingsJapgolly.markdownIt.stateCoreMod.^ {
  var bMarks: js.Array[Double] = js.native
  var blkIndent: Double = js.native
  var bsCount: js.Array[Double] = js.native
  var ddIndent: Double = js.native
  var eMarks: js.Array[Double] = js.native
  var line: Double = js.native
  var lineMax: Double = js.native
  /** Used in lists to determine if they interrupt a paragraph */
  var parentType: blockquote | list | root | paragraph | reference = js.native
  var sCount: js.Array[Double] = js.native
  var tShift: js.Array[Double] = js.native
  var tight: Boolean = js.native
}

