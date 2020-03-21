package typingsJapgolly.webpackChain.mod

import typingsJapgolly.webpackChain.webpackChainStrings.error
import typingsJapgolly.webpackChain.webpackChainStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Performance")
@js.native
class Performance ()
  extends typingsJapgolly.webpackChain.mod._Config.TypedChainedMap[Config, js.Any] {
  def assetFilter(value: js.Function1[/* assetFilename */ String, Boolean]): this.type = js.native
  /* CompleteClass */
  override def end(): Config = js.native
  def hints(value: Boolean): this.type = js.native
  @JSName("hints")
  def hints_error(value: error): this.type = js.native
  @JSName("hints")
  def hints_warning(value: warning): this.type = js.native
  def maxAssetSize(value: Double): this.type = js.native
  def maxEntrypointSize(value: Double): this.type = js.native
}

