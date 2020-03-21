package typingsJapgolly.ejWebAll.ej.Print_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Append the custom HTML after the selected content.
    * @Default {null}
    */
  var append: js.UndefOr[String] = js.undefined
  /** Event triggers before the document page or an element in it gets printed.
    */
  var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, Unit]] = js.undefined
  /** Prepend a docType to the document frame.
    * @Default {&lt;!doctype html&gt;}
    */
  var docType: js.UndefOr[String] = js.undefined
  /** A selector that specifies a particular element to be excluded from printing.
    * @Default {null}
    */
  var excludeSelector: js.UndefOr[String] = js.undefined
  /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
    * @Default {null}
    */
  var externalStyles: js.UndefOr[String] = js.undefined
  /** Specifies whether the global styles can be applied to the element to be printed.
    * @Default {true}
    */
  var globalStyles: js.UndefOr[Boolean] = js.undefined
  /** Sets the height of the print window.
    * @Default {454}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Prepends the custom HTML before the selected content.
    * @Default {null}
    */
  var prepend: js.UndefOr[String] = js.undefined
  /** Allows printing the content in a new window.
    * @Default {false}
    */
  var printInNewWindow: js.UndefOr[Boolean] = js.undefined
  /** Sets the period of time to wait before printing the content.
    * @Default {1000}
    */
  var timeOutPeriod: js.UndefOr[Double] = js.undefined
  /** Sets the title of the print document.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.undefined
  /** Defines the width of the print window.
    * @Default {1024}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    append: String = null,
    beforeStart: /* e */ BeforeStartEventArgs => Callback = null,
    docType: String = null,
    excludeSelector: String = null,
    externalStyles: String = null,
    globalStyles: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    prepend: String = null,
    printInNewWindow: js.UndefOr[Boolean] = js.undefined,
    timeOutPeriod: Int | Double = null,
    title: String = null,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (beforeStart != null) __obj.updateDynamic("beforeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Print_.BeforeStartEventArgs) => beforeStart(t0).runNow()))
    if (docType != null) __obj.updateDynamic("docType")(docType.asInstanceOf[js.Any])
    if (excludeSelector != null) __obj.updateDynamic("excludeSelector")(excludeSelector.asInstanceOf[js.Any])
    if (externalStyles != null) __obj.updateDynamic("externalStyles")(externalStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(globalStyles)) __obj.updateDynamic("globalStyles")(globalStyles.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    if (!js.isUndefined(printInNewWindow)) __obj.updateDynamic("printInNewWindow")(printInNewWindow.asInstanceOf[js.Any])
    if (timeOutPeriod != null) __obj.updateDynamic("timeOutPeriod")(timeOutPeriod.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

