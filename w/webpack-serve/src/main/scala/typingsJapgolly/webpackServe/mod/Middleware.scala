package typingsJapgolly.webpackServe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /** Function to call to add koa-static */
  def content(): Unit
  /** Function to call to add the webpack-dev-middleware */
  def webpack(): Unit
}

object Middleware {
  @scala.inline
  def apply(content: Callback, webpack: Callback): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content.toJsFn)
    __obj.updateDynamic("webpack")(webpack.toJsFn)
    __obj.asInstanceOf[Middleware]
  }
}

