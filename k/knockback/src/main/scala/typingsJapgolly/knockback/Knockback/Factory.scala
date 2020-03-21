package typingsJapgolly.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.Factory")
@js.native
class Factory protected () extends js.Object {
  def this(parent_factory: js.Any) = this()
  def addPathMapping(path: String, create_info: js.Any): js.Any = js.native
  def addPathMappings(factories: js.Any, owner_path: String): js.Any = js.native
  def creatorForPath(obj: js.Any, path: String): js.Any = js.native
  def hasPath(path: String): Boolean = js.native
  def hasPathMappings(factories: js.Any, owner_path: String): Boolean = js.native
}

/* static members */
@JSGlobal("Knockback.Factory")
@js.native
object Factory extends js.Object {
  def useOptionsOrCreate(options: FactoryOptions, obj: js.Any, owner_path: String): js.Any = js.native
}

