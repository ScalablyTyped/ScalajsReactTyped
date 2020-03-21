package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.mod.ICompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait ICompiler_ extends js.Object {
  def run(handler: Handler): Unit
  def watch(watchOptions: typingsJapgolly.webpack.mod.ICompiler.WatchOptions, handler: Handler): Watching
}

object ICompiler_ {
  @scala.inline
  def apply(
    run: Handler => Callback,
    watch: (typingsJapgolly.webpack.mod.ICompiler.WatchOptions, Handler) => CallbackTo[Watching]
  ): ICompiler_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.ICompiler.Handler) => run(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction2((t0: typingsJapgolly.webpack.mod.ICompiler.WatchOptions, t1: typingsJapgolly.webpack.mod.ICompiler.Handler) => watch(t0, t1).runNow()))
    __obj.asInstanceOf[ICompiler_]
  }
}

