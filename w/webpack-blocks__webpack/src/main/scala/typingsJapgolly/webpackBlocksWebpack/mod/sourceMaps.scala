package typingsJapgolly.webpackBlocksWebpack.mod

import typingsJapgolly.webpack.mod.Options.Devtool
import typingsJapgolly.webpackBlocksCore.mod.Block
import typingsJapgolly.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "sourceMaps")
@js.native
object sourceMaps extends js.Object {
  def apply(): Block[Context] = js.native
  def apply(devtool: Devtool): Block[Context] = js.native
}

