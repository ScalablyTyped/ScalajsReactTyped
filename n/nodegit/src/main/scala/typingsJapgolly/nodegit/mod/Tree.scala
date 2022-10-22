package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tree")
@js.native
open class Tree ()
  extends typingsJapgolly.nodegit.treeMod.Tree
/* static members */
object Tree {
  
  @JSImport("nodegit", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def entryCmp(
    tree1: typingsJapgolly.nodegit.treeEntryMod.TreeEntry,
    tree2: typingsJapgolly.nodegit.treeEntryMod.TreeEntry
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryCmp")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def entryDup(
    dest: typingsJapgolly.nodegit.treeEntryMod.TreeEntry,
    source: typingsJapgolly.nodegit.treeEntryMod.TreeEntry
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("entryDup")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Retrieves the tree pointed to by the oid
    */
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.treeMod.Tree): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
  
  inline def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.treeMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeMod.Tree]]
}
