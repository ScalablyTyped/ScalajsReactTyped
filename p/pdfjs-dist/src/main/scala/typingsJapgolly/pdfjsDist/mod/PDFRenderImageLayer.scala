package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderImageLayer extends js.Object {
  def appendImage(): Unit
  def beginLayout(): Unit
  def endLayout(): Unit
}

object PDFRenderImageLayer {
  @scala.inline
  def apply(appendImage: Callback, beginLayout: Callback, endLayout: Callback): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendImage")(appendImage.toJsFn)
    __obj.updateDynamic("beginLayout")(beginLayout.toJsFn)
    __obj.updateDynamic("endLayout")(endLayout.toJsFn)
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
}

