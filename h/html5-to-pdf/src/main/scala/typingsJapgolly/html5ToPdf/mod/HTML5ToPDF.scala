package typingsJapgolly.html5ToPdf.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML5ToPDF extends js.Object {
  def build(): js.Promise[Buffer]
  def close(): js.Promise[Unit]
  def includeAssets(): js.Promise[Unit]
  def parseOptions(options: Options): ParsedOptions
  def start(): js.Promise[Page]
}

object HTML5ToPDF {
  @scala.inline
  def apply(
    build: CallbackTo[js.Promise[Buffer]],
    close: CallbackTo[js.Promise[Unit]],
    includeAssets: CallbackTo[js.Promise[Unit]],
    parseOptions: Options => CallbackTo[ParsedOptions],
    start: CallbackTo[js.Promise[Page]]
  ): HTML5ToPDF = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("includeAssets")(includeAssets.toJsFn)
    __obj.updateDynamic("parseOptions")(js.Any.fromFunction1((t0: typingsJapgolly.html5ToPdf.mod.Options) => parseOptions(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[HTML5ToPDF]
  }
}

