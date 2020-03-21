package typingsJapgolly.webpackBlocksCore.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.Plugin
import typingsJapgolly.webpack.mod.RuleSetRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def addLoader(loaderDefinition: RuleSetRule): js.Function0[Configuration]
  def addPlugin(plugin: Plugin): js.Function0[Configuration]
  def merge(configSnippet: Configuration): js.Function0[Configuration]
}

object Util {
  @scala.inline
  def apply(
    addLoader: RuleSetRule => CallbackTo[js.Function0[Configuration]],
    addPlugin: Plugin => CallbackTo[js.Function0[Configuration]],
    merge: Configuration => CallbackTo[js.Function0[Configuration]]
  ): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLoader")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.RuleSetRule) => addLoader(t0).runNow()))
    __obj.updateDynamic("addPlugin")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.Plugin) => addPlugin(t0).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.Configuration) => merge(t0).runNow()))
    __obj.asInstanceOf[Util]
  }
}

