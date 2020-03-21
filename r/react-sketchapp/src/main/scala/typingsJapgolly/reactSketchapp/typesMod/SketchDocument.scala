package typingsJapgolly.reactSketchapp.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDocument extends js.Object {
  def documentData(): SketchDocumentData
  def showMessage(message: String): Unit
}

object SketchDocument {
  @scala.inline
  def apply(documentData: CallbackTo[SketchDocumentData], showMessage: String => Callback): SketchDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("documentData")(documentData.toJsFn)
    __obj.updateDynamic("showMessage")(js.Any.fromFunction1((t0: java.lang.String) => showMessage(t0).runNow()))
    __obj.asInstanceOf[SketchDocument]
  }
}

