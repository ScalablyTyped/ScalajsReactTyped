package typingsJapgolly.node.moduleMod

import typingsJapgolly.node.NodeJS.Module
import typingsJapgolly.node.NodeRequireFunction
import typingsJapgolly.node.TypeofClassModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
class ^ protected () extends Module {
  def this(id: java.lang.String) = this()
  def this(id: java.lang.String, parent: Module) = this()
}

@JSImport("module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Module: TypeofClassModule = js.native
  var builtinModules: js.Array[java.lang.String] = js.native
  def createRequire(path: java.lang.String): NodeRequireFunction = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: java.lang.String): NodeRequireFunction = js.native
  def runMain(): Unit = js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
}

