package typingsJapgolly.jestDiff

import typingsJapgolly.jestDiff.jestDiffBooleans.`true`
import typingsJapgolly.jestDiff.printDiffsMod._StringDiffResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotatedDiff extends _StringDiffResult {
  var annotatedDiff: String
  var isMultiline: `true`
}

object AnonAnnotatedDiff {
  @scala.inline
  def apply(annotatedDiff: String, isMultiline: `true`): AnonAnnotatedDiff = {
    val __obj = js.Dynamic.literal(annotatedDiff = annotatedDiff.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotatedDiff]
  }
}

