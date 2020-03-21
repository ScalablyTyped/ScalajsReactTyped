package typingsJapgolly.node.moduleMod

import typingsJapgolly.node.NodeRequire
import typingsJapgolly.node.TypeofModule
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("module", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typingsJapgolly.node.NodeJS.Module {
  def this(id: String) = this()
  def this(id: String, parent: Module) = this()
}

@JSImport("module", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Module: TypeofModule = js.native
  var builtinModules: js.Array[String] = js.native
  def createRequire(path: String): NodeRequire = js.native
  def createRequire(path: URL_): NodeRequire = js.native
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  def createRequireFromPath(path: String): NodeRequire = js.native
  def runMain(): Unit = js.native
  def wrap(code: String): String = js.native
}

