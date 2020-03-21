package typingsJapgolly.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFTreeNode extends js.Object {
  var bold: Boolean
  var color: js.Array[Double]
   // [r,g,b]
  var dest: js.Any
  var italic: Boolean
  var items: js.Array[PDFTreeNode]
  var title: String
}

object PDFTreeNode {
  @scala.inline
  def apply(
    bold: Boolean,
    color: js.Array[Double],
    dest: js.Any,
    italic: Boolean,
    items: js.Array[PDFTreeNode],
    title: String
  ): PDFTreeNode = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFTreeNode]
  }
}

