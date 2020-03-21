package typingsJapgolly.reactLatexNext.latexMod

import typingsJapgolly.reactLatexNext.typesMod.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatexProps extends js.Object {
  var children: String
  var delimiters: js.UndefOr[js.Array[Delimiter]] = js.undefined
}

object LatexProps {
  @scala.inline
  def apply(children: String, delimiters: js.Array[Delimiter] = null): LatexProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatexProps]
  }
}

