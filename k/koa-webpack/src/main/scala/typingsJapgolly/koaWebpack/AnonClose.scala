package typingsJapgolly.koaWebpack

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpackHotClient.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var options: Options
  var server: js.Any
  def close(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: Callback, options: Options, server: js.Any): AnonClose = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[AnonClose]
  }
}

