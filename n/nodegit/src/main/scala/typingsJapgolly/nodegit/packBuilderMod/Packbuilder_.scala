package typingsJapgolly.nodegit.packBuilderMod

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.revWalkMod.Revwalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/pack-builder", "Packbuilder")
@js.native
class Packbuilder_ () extends js.Object {
  def free(): Unit = js.native
  def hash(): Oid = js.native
  def insert(id: Oid, name: String): Double = js.native
  def insertCommit(id: Oid): Double = js.native
  def insertRecur(id: Oid, name: String): Double = js.native
  def insertTree(id: Oid): Double = js.native
  def insertWalk(walk: Revwalk): Double = js.native
  def objectCount(): Double = js.native
  def setThreads(n: Double): Double = js.native
  def written(): Double = js.native
}

