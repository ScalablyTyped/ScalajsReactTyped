package typingsJapgolly.webpackServe

import typingsJapgolly.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilerStats extends js.Object {
  var compiler: Compiler_
  var stats: js.Any
}

object AnonCompilerStats {
  @scala.inline
  def apply(compiler: Compiler_, stats: js.Any): AnonCompilerStats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompilerStats]
  }
}

