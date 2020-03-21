package typingsJapgolly.webpackChain.mod

import typingsJapgolly.webpackChain.webpackChainStrings.multiple
import typingsJapgolly.webpackChain.webpackChainStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Optimization")
@js.native
class Optimization ()
  extends typingsJapgolly.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  def concatenateModules(value: Boolean): this.type = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def flagIncludedChunks(value: Boolean): this.type = js.native
  def mergeDuplicateChunks(value: Boolean): this.type = js.native
  def minimize(value: Boolean): this.type = js.native
  def minimizer(name: String): Plugin[this.type, typingsJapgolly.webpack.mod.Plugin] = js.native
  def namedChunks(value: Boolean): this.type = js.native
  def namedModules(value: Boolean): this.type = js.native
  def noEmitOnErrors(value: Boolean): this.type = js.native
  def nodeEnv(value: String): this.type = js.native
  def nodeEnv(value: Boolean): this.type = js.native
  def occurrenceOrder(value: Boolean): this.type = js.native
  def portableRecords(value: Boolean): this.type = js.native
  def providedExports(value: Boolean): this.type = js.native
  def removeAvailableModules(value: Boolean): this.type = js.native
  def removeEmptyChunks(value: Boolean): this.type = js.native
  def runtimeChunk(value: Boolean): this.type = js.native
  def runtimeChunk(value: RuntimeChunk): this.type = js.native
  @JSName("runtimeChunk")
  def runtimeChunk_multiple(value: multiple): this.type = js.native
  @JSName("runtimeChunk")
  def runtimeChunk_single(value: single): this.type = js.native
  def sideEffects(value: Boolean): this.type = js.native
  def splitChunks(value: SplitChunksOptions): this.type = js.native
  def usedExports(value: Boolean): this.type = js.native
}

