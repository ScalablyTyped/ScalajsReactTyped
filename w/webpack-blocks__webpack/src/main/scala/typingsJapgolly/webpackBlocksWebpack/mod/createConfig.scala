package typingsJapgolly.webpackBlocksWebpack.mod

import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpackBlocksCore.mod.Block
import typingsJapgolly.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "createConfig")
@js.native
object createConfig extends js.Object {
  def apply(configSetters: js.Array[Block[Context]]): Configuration = js.native
  def apply(configSetters: Block[Context]): Configuration = js.native
}

