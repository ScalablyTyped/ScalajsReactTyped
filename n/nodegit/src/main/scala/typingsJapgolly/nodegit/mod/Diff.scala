package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.diffOptionsMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Diff")
@js.native
open class Diff ()
  extends typingsJapgolly.nodegit.diffMod.Diff
/* static members */
object Diff {
  
  @JSImport("nodegit", "Diff")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  inline def blobToBuffer(
    oldBlob: js.UndefOr[typingsJapgolly.nodegit.blobMod.Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobToBuffer")(oldBlob.asInstanceOf[js.Any], oldAsPath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], bufferAsPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fileCb.asInstanceOf[js.Any], binaryCb.asInstanceOf[js.Any], hunkCb.asInstanceOf[js.Any], lineCb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromBuffer(content: String, contentLen: Double): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(content.asInstanceOf[js.Any], contentLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def indexToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldIndex: typingsJapgolly.nodegit.indexMod.Index,
    newIndex: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def indexToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldIndex: typingsJapgolly.nodegit.indexMod.Index,
    newIndex: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def indexToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Unit, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    index: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    index: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def treeToIndex(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    index: Unit,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    index: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    index: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    index: Unit,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    index: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    index: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def treeToTree(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    new_tree: Unit,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    new_tree: Unit,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def treeToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository, oldTree: Unit, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  
  inline def treeToWorkdirWithIndex(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(repo: typingsJapgolly.nodegit.repositoryMod.Repository, oldTree: Unit, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.diffMod.Diff]]
}
