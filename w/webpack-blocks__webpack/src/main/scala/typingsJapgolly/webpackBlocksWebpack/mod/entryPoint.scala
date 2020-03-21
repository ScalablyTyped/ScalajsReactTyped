package typingsJapgolly.webpackBlocksWebpack.mod

import typingsJapgolly.webpack.mod.Entry
import typingsJapgolly.webpackBlocksCore.mod.Block
import typingsJapgolly.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "entryPoint")
@js.native
object entryPoint extends js.Object {
  def apply(entry: String): Block[Context] = js.native
  def apply(entry: js.Array[String]): Block[Context] = js.native
  def apply(entry: Entry): Block[Context] = js.native
}

