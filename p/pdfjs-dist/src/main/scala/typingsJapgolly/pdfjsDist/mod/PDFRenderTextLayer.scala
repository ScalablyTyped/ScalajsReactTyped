package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderTextLayer extends js.Object {
  def appendText(): Unit
  def beginLayout(): Unit
  def endLayout(): Unit
}

object PDFRenderTextLayer {
  @scala.inline
  def apply(appendText: Callback, beginLayout: Callback, endLayout: Callback): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendText")(appendText.toJsFn)
    __obj.updateDynamic("beginLayout")(beginLayout.toJsFn)
    __obj.updateDynamic("endLayout")(endLayout.toJsFn)
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
}

