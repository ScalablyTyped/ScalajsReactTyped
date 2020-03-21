package typingsJapgolly.docxTemplates.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.docxTemplates.AnonModifiedSandbox
import typingsJapgolly.docxTemplates.docxTemplatesStrings.JS
import typingsJapgolly.docxTemplates.docxTemplatesStrings.XML
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptions[T] extends js.Object {
  var _probe: js.UndefOr[JS | XML] = js.undefined
  var additionalJsContext: js.UndefOr[js.Any] = js.undefined
  var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  var data: js.UndefOr[ReportData | QueryResolver] = js.undefined
  var literalXmlDelimiter: js.UndefOr[String] = js.undefined
  var noSandbox: js.UndefOr[Boolean] = js.undefined
  var output: js.UndefOr[T] = js.undefined
  var processLineBreaks: js.UndefOr[Boolean] = js.undefined
  var queryVars: js.UndefOr[js.Any] = js.undefined
  var runJs: js.UndefOr[js.Function1[/* runJSOptions */ runJSOptions, AnonModifiedSandbox]] = js.undefined
  var template: String | scala.scalajs.js.typedarray.ArrayBuffer | Buffer
}

object UserOptions {
  @scala.inline
  def apply[T](
    template: String | scala.scalajs.js.typedarray.ArrayBuffer | Buffer,
    _probe: JS | XML = null,
    additionalJsContext: js.Any = null,
    cmdDelimiter: String | (js.Tuple2[String, String]) = null,
    data: ReportData | QueryResolver = null,
    literalXmlDelimiter: String = null,
    noSandbox: js.UndefOr[Boolean] = js.undefined,
    output: T = null,
    processLineBreaks: js.UndefOr[Boolean] = js.undefined,
    queryVars: js.Any = null,
    runJs: /* runJSOptions */ runJSOptions => CallbackTo[AnonModifiedSandbox] = null
  ): UserOptions[T] = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (_probe != null) __obj.updateDynamic("_probe")(_probe.asInstanceOf[js.Any])
    if (additionalJsContext != null) __obj.updateDynamic("additionalJsContext")(additionalJsContext.asInstanceOf[js.Any])
    if (cmdDelimiter != null) __obj.updateDynamic("cmdDelimiter")(cmdDelimiter.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (literalXmlDelimiter != null) __obj.updateDynamic("literalXmlDelimiter")(literalXmlDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(noSandbox)) __obj.updateDynamic("noSandbox")(noSandbox.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(processLineBreaks)) __obj.updateDynamic("processLineBreaks")(processLineBreaks.asInstanceOf[js.Any])
    if (queryVars != null) __obj.updateDynamic("queryVars")(queryVars.asInstanceOf[js.Any])
    if (runJs != null) __obj.updateDynamic("runJs")(js.Any.fromFunction1((t0: /* runJSOptions */ typingsJapgolly.docxTemplates.mod.runJSOptions) => runJs(t0).runNow()))
    __obj.asInstanceOf[UserOptions[T]]
  }
}

