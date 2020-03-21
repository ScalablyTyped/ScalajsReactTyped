package typingsJapgolly.webpackBlocksWebpack.mod

import typingsJapgolly.webpackBlocksCore.mod.Block
import typingsJapgolly.webpackBlocksCore.mod.Context
import typingsJapgolly.webpackBlocksCore.mod.MatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "match")
@js.native
object `match` extends js.Object {
  def apply(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

