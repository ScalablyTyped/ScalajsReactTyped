package typingsJapgolly.nodegit.treeMod

import typingsJapgolly.nodegit.EventEmitterstartvoid
import typingsJapgolly.nodegit.diffFileMod.DiffFile
import typingsJapgolly.nodegit.objectMod.Object
import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeBuilderMod.Treebuilder
import typingsJapgolly.nodegit.treeEntryMod.TreeEntry
import typingsJapgolly.nodegit.treeUpdateMod.TreeUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
class Tree_ () extends js.Object {
  def _entryByIndex(idx: Double): TreeEntry = js.native
  def _entryByName(filename: String): TreeEntry = js.native
  /**
    * Make builder. This is helpful for modifying trees.
    */
  def builder(): Treebuilder = js.native
  def createUpdated(repo: Repository, nUpdates: Double, updates: TreeUpdate): js.Promise[Oid] = js.native
  /**
    * Diff two trees
    */
  def diff(tree: Tree): js.Promise[js.Array[DiffFile]] = js.native
  def diff(tree: Tree, callback: js.Function): js.Promise[js.Array[DiffFile]] = js.native
  /**
    * Diff two trees with options
    */
  def diffWithOptions(tree: Tree): js.Promise[js.Array[DiffFile]] = js.native
  def diffWithOptions(tree: Tree, options: Object): js.Promise[js.Array[DiffFile]] = js.native
  def diffWithOptions(tree: Tree, options: Object, callback: js.Function): js.Promise[js.Array[DiffFile]] = js.native
  def dup(): js.Promise[Tree] = js.native
  /**
    * Return an array of the entries in this tree (excluding its children).
    */
  def entries(): js.Array[TreeEntry] = js.native
  def entryById(id: Oid): TreeEntry = js.native
  /**
    * Get an entry at the ith position.
    */
  def entryByIndex(i: Double): TreeEntry = js.native
  /**
    * Get an entry by name; if the tree is a directory, the name is the filename.
    */
  def entryByName(name: String): TreeEntry = js.native
  def entryByPath(path: String): js.Promise[TreeEntry] = js.native
  def entryCount(): Double = js.native
  def free(): Unit = js.native
  /**
    * Get an entry at a path. Unlike by name, this takes a fully qualified path, like /foo/bar/baz.javascript
    */
  def getEntry(filePath: String): js.Promise[TreeEntry] = js.native
  def id(): Oid = js.native
  def owner(): Repository = js.native
  /**
    * Return the path of this tree, like /lib/foo/bar
    *
    *
    */
  def path(): String = js.native
  /**
    * Recursively walk the tree in breadth-first order. Fires an event for each entry.
    */
  def walk(): EventEmitterstartvoid = js.native
  def walk(blobsOnly: Boolean): EventEmitterstartvoid = js.native
}

