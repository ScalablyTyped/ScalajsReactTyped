package typingsJapgolly.markdownPdf.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration options */
trait Options extends js.Object {
  /** Path to custom CSS file, relative to current directory. */
  var cssPath: js.UndefOr[String] = js.undefined
  /** Current working directory. */
  var cwd: js.UndefOr[String] = js.undefined
  /** Path to custorm highlight CSS file (for code highlighting with highlight.js), relative to the current directory. */
  var highlightCssPath: js.UndefOr[String] = js.undefined
  /** If renderDelay option isn't set, this is the timeout (in ms) before the page is rendered in case the page.onLoadFinished event doesn't fire. */
  var loadTimeout: js.UndefOr[Double] = js.undefined
  /** Supported dimension units are: 'mm', 'cm', 'in', 'px' */
  var paperBorder: js.UndefOr[String] = js.undefined
  var paperFormat: js.UndefOr[PaperFormat] = js.undefined
  var paperOrientation: js.UndefOr[PaperOrientation] = js.undefined
  /** Path to the phantomjs library. */
  var phantomPath: js.UndefOr[String] = js.undefined
  /** A function that returns a through2 stream that transforms the HTML before it is converted to PDF. */
  var preProcessHtml: js.UndefOr[js.Function0[_]] = js.undefined
  /** A function that returns a through2 stream that transforms the markdown before it is converted to HTML. */
  var preProcessMd: js.UndefOr[js.Function0[_]] = js.undefined
  /** A config object that is passed to remarkable, the underlying markdown parser */
  var remarkable: js.UndefOr[js.Any] = js.undefined
  /** Delay (in ms) before the PDF is rendered. */
  var renderDelay: js.UndefOr[Double] = js.undefined
  /** Path to CommonJS module which sets the page header and footer (see runnings.js). */
  var runningsPath: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cssPath: String = null,
    cwd: String = null,
    highlightCssPath: String = null,
    loadTimeout: Int | Double = null,
    paperBorder: String = null,
    paperFormat: PaperFormat = null,
    paperOrientation: PaperOrientation = null,
    phantomPath: String = null,
    preProcessHtml: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    preProcessMd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    remarkable: js.Any = null,
    renderDelay: Int | Double = null,
    runningsPath: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cssPath != null) __obj.updateDynamic("cssPath")(cssPath.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (highlightCssPath != null) __obj.updateDynamic("highlightCssPath")(highlightCssPath.asInstanceOf[js.Any])
    if (loadTimeout != null) __obj.updateDynamic("loadTimeout")(loadTimeout.asInstanceOf[js.Any])
    if (paperBorder != null) __obj.updateDynamic("paperBorder")(paperBorder.asInstanceOf[js.Any])
    if (paperFormat != null) __obj.updateDynamic("paperFormat")(paperFormat.asInstanceOf[js.Any])
    if (paperOrientation != null) __obj.updateDynamic("paperOrientation")(paperOrientation.asInstanceOf[js.Any])
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath.asInstanceOf[js.Any])
    preProcessHtml.foreach(p => __obj.updateDynamic("preProcessHtml")(p.toJsFn))
    preProcessMd.foreach(p => __obj.updateDynamic("preProcessMd")(p.toJsFn))
    if (remarkable != null) __obj.updateDynamic("remarkable")(remarkable.asInstanceOf[js.Any])
    if (renderDelay != null) __obj.updateDynamic("renderDelay")(renderDelay.asInstanceOf[js.Any])
    if (runningsPath != null) __obj.updateDynamic("runningsPath")(runningsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

