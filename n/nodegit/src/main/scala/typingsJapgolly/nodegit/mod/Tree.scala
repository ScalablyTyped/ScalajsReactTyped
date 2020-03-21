package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends typingsJapgolly.nodegit.treeMod.Tree

/* static members */
@JSImport("nodegit", "Tree")
@js.native
object Tree extends js.Object {
  def entryCmp(
    tree1: typingsJapgolly.nodegit.treeEntryMod.TreeEntry,
    tree2: typingsJapgolly.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  def entryDup(
    dest: typingsJapgolly.nodegit.treeEntryMod.TreeEntry,
    source: typingsJapgolly.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.treeMod.Tree): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
  def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = js.native
}

