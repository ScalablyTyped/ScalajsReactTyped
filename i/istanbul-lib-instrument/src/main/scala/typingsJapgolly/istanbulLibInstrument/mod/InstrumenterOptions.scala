package typingsJapgolly.istanbulLibInstrument.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstrumenterOptions extends js.Object {
  var autoWrap: Boolean
  var compact: Boolean
  var coverageVariable: String
  var debug: Boolean
  var esModules: Boolean
  var preserveComments: Boolean
  var produceSourceMap: Boolean
  def sourceMapUrlCallback(filename: String, url: String): Unit
}

object InstrumenterOptions {
  @scala.inline
  def apply(
    autoWrap: Boolean,
    compact: Boolean,
    coverageVariable: String,
    debug: Boolean,
    esModules: Boolean,
    preserveComments: Boolean,
    produceSourceMap: Boolean,
    sourceMapUrlCallback: (String, String) => Callback
  ): InstrumenterOptions = {
    val __obj = js.Dynamic.literal(autoWrap = autoWrap.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], coverageVariable = coverageVariable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], esModules = esModules.asInstanceOf[js.Any], preserveComments = preserveComments.asInstanceOf[js.Any], produceSourceMap = produceSourceMap.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceMapUrlCallback")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sourceMapUrlCallback(t0, t1).runNow()))
    __obj.asInstanceOf[InstrumenterOptions]
  }
}

