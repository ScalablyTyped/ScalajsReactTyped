package typingsJapgolly.webpackHotMiddleware.mod

import typingsJapgolly.connect.mod.NextHandleFunction
import typingsJapgolly.webpack.mod.ICompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-hot-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(compiler: ICompiler): NextHandleFunction with EventStream = js.native
  def apply(compiler: ICompiler, options: Options): NextHandleFunction with EventStream = js.native
}

