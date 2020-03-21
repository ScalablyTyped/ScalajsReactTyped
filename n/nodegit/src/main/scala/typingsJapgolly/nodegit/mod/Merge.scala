package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.mergeFileInputMod.MergeFileInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Merge")
@js.native
class Merge ()
  extends typingsJapgolly.nodegit.mergeMod.Merge

/* static members */
@JSImport("nodegit", "Merge")
@js.native
object Merge extends js.Object {
  def base(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    one: typingsJapgolly.nodegit.oidMod.Oid,
    two: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def bases(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    one: typingsJapgolly.nodegit.oidMod.Oid,
    two: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.oidArrayMod.Oidarray] = js.native
  def commits(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    theirCommit: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Any = js.native
  def commits(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    theirCommit: typingsJapgolly.nodegit.commitMod.Commit,
    options: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
  def initOptions(opts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions, version: Double): Double = js.native
  def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Any = js.native
  def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = js.native
  def trees(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ancestorTree: typingsJapgolly.nodegit.treeMod.Tree,
    ourTree: typingsJapgolly.nodegit.treeMod.Tree,
    theirTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[Index] = js.native
  def trees(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ancestorTree: typingsJapgolly.nodegit.treeMod.Tree,
    ourTree: typingsJapgolly.nodegit.treeMod.Tree,
    theirTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
}

