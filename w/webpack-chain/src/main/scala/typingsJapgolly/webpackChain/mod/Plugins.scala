package typingsJapgolly.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Plugins")
@js.native
class Plugins[Parent, PluginType /* <: typingsJapgolly.tapable.mod.Tapable.Plugin */] ()
  extends typingsJapgolly.webpackChain.mod._Config.TypedChainedMap[Parent, Plugin[Parent, PluginType]] {
  /* CompleteClass */
  override def end(): Parent = js.native
}

