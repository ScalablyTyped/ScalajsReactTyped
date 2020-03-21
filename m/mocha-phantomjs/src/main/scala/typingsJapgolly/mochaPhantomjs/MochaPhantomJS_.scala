package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJS_ extends js.Object {
  var columns: Double
  var mochaStartWait: Double
  var output: js.Any
  var startTime: js.Date
  var url: String
  def customizeMocha(options: MochaPhantomJSOptions): Unit
  def run(): Unit
}

object MochaPhantomJS_ {
  @scala.inline
  def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Callback,
    mochaStartWait: Double,
    output: js.Any,
    run: Callback,
    startTime: js.Date,
    url: String
  ): MochaPhantomJS_ = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("customizeMocha")(js.Any.fromFunction1((t0: typingsJapgolly.mochaPhantomjs.MochaPhantomJSOptions) => customizeMocha(t0).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[MochaPhantomJS_]
  }
}

