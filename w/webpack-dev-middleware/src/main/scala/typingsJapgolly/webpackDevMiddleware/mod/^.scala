package typingsJapgolly.webpackDevMiddleware.mod

import typingsJapgolly.connect.mod.NextHandleFunction
import typingsJapgolly.webpack.mod.ICompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(compiler: ICompiler): WebpackDevMiddleware with NextHandleFunction = js.native
  def apply(compiler: ICompiler, options: Options): WebpackDevMiddleware with NextHandleFunction = js.native
}

