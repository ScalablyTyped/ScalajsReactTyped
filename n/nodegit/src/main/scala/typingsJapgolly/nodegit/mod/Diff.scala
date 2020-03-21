package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.diffOptionsMod.DiffOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Diff")
@js.native
class Diff ()
  extends typingsJapgolly.nodegit.diffMod.Diff

/* static members */
@JSImport("nodegit", "Diff")
@js.native
object Diff extends js.Object {
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: js.UndefOr[typingsJapgolly.nodegit.blobMod.Blob],
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
  def indexToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldIndex: typingsJapgolly.nodegit.indexMod.Index,
    newIndex: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldIndex: typingsJapgolly.nodegit.indexMod.Index,
    newIndex: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    index: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    index: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    index: typingsJapgolly.nodegit.indexMod.Index
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    index: typingsJapgolly.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    new_tree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    oldTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typingsJapgolly.nodegit.diffMod.Diff] = js.native
}

