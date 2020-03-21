package typingsJapgolly.reactPdf.outlineMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pdfjsDist.mod.PDFTreeNode
import typingsJapgolly.reactPdf.AnonPageNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Outline'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ AnonPageNumber, Unit]] = js.undefined
  /**
    * Function called in case of an error while retrieving the outline.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when the outline is successfully retrieved.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* outline */ js.Array[PDFTreeNode], Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String | js.Array[String] = null,
    onItemClick: /* hasPageNumber */ AnonPageNumber => Callback = null,
    onLoadError: /* error */ js.Error => Callback = null,
    onLoadSuccess: /* outline */ js.Array[PDFTreeNode] => Callback = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* hasPageNumber */ typingsJapgolly.reactPdf.AnonPageNumber) => onItemClick(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onLoadError(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* outline */ js.Array[typingsJapgolly.pdfjsDist.mod.PDFTreeNode]) => onLoadSuccess(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

