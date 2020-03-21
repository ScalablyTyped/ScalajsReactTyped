package typingsJapgolly.nodegit.treeMod.Tree

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeEntryMod.TreeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
object ^ extends js.Object {
  def entryCmp(tree1: TreeEntry, tree2: TreeEntry): Double = js.native
  def entryDup(dest: TreeEntry, source: TreeEntry): Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: Repository, id: String): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid, callback: js.Function): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typingsJapgolly.nodegit.treeMod.Tree): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typingsJapgolly.nodegit.treeMod.Tree, callback: js.Function): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
}

