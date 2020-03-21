package typingsJapgolly.webpackVirtualModules.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
  * created with webpack.
  */
trait VirtualModulesPlugin extends js.Object {
  /**
    * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
    * to ensure that the virtual files are added dynamically.
    */
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  def writeModule(filePath: String, fileContents: String): Unit
}

object VirtualModulesPlugin {
  @scala.inline
  def apply(apply: Compiler_ => Callback, writeModule: (String, String) => Callback): VirtualModulesPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.Compiler_) => apply(t0).runNow()))
    __obj.updateDynamic("writeModule")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeModule(t0, t1).runNow()))
    __obj.asInstanceOf[VirtualModulesPlugin]
  }
}

