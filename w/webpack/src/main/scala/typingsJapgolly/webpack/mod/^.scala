package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.mod.MultiCompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler_ = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsJapgolly.webpack.mod.Compiler_.Handler
  ): typingsJapgolly.webpack.mod.Compiler_.Watching | Compiler_ = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler_ = js.native
  def apply(options: Configuration, handler: typingsJapgolly.webpack.mod.Compiler_.Handler): typingsJapgolly.webpack.mod.Compiler_.Watching | Compiler_ = js.native
}

