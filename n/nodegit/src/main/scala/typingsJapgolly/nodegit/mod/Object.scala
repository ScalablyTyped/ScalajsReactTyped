package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.objectMod.Object.TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Object")
@js.native
class Object ()
  extends typingsJapgolly.nodegit.objectMod.Object

/* static members */
@JSImport("nodegit", "Object")
@js.native
object Object extends js.Object {
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    `type`: TYPE
  ): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = js.native
  def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double,
    `type`: TYPE
  ): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = js.native
  def size(`type`: TYPE): Double = js.native
  def string2Type(str: String): TYPE = js.native
  def type2String(`type`: TYPE): String = js.native
  def typeisloose(`type`: TYPE): Double = js.native
}

