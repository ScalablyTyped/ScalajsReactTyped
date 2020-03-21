package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeEntryMod.TreeEntry
import typingsJapgolly.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree-builder", JSImport.Namespace)
@js.native
object treeBuilderMod extends js.Object {
  @js.native
  class Treebuilder () extends js.Object {
    def clear(): Unit = js.native
    def entrycount(): Double = js.native
    def free(): Unit = js.native
    def get(filename: String): TreeEntry = js.native
    def insert(filename: String, id: Oid, filemode: Double): js.Promise[TreeEntry] = js.native
    def remove(filename: String): Double = js.native
    def write(): js.Promise[Oid] = js.native
  }
  
  /* static members */
  @js.native
  object Treebuilder extends js.Object {
    def create(repo: Repository): js.Promise[Treebuilder] = js.native
    def create(repo: Repository, source: Tree): js.Promise[Treebuilder] = js.native
  }
  
}

