package typingsJapgolly.nodegit.diffMod.Diff

import typingsJapgolly.nodegit.blobMod.Blob
import typingsJapgolly.nodegit.diffOptionsMod.DiffOptions
import typingsJapgolly.nodegit.indexMod.Index
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
object ^ extends js.Object {
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: js.UndefOr[Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[_] = js.native
  def fromBuffer(content: String, contentLen: Double): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
}

