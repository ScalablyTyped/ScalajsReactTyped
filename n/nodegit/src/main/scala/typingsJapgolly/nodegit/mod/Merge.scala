package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.mergeFileInputMod.MergeFileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Merge")
@js.native
open class Merge ()
  extends typingsJapgolly.nodegit.mergeMod.Merge
/* static members */
object Merge {
  
  @JSImport("nodegit", "Merge")
  @js.native
  val ^ : js.Any = js.native
  
  inline def base(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    one: typingsJapgolly.nodegit.oidMod.Oid,
    two: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("base")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  inline def bases(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    one: typingsJapgolly.nodegit.oidMod.Oid,
    two: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.oidArrayMod.Oidarray] = (^.asInstanceOf[js.Dynamic].applyDynamic("bases")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidArrayMod.Oidarray]]
  
  inline def commits(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    theirCommit: typingsJapgolly.nodegit.commitMod.Commit
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def commits(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    theirCommit: typingsJapgolly.nodegit.commitMod.Commit,
    options: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fileInitInput(opts: MergeFileInput, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fileInitInput")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def initOptions(opts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: Unit,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def merge(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    theirHead: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def trees(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ancestorTree: typingsJapgolly.nodegit.treeMod.Tree,
    ourTree: typingsJapgolly.nodegit.treeMod.Tree,
    theirTree: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
  inline def trees(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    ancestorTree: typingsJapgolly.nodegit.treeMod.Tree,
    ourTree: typingsJapgolly.nodegit.treeMod.Tree,
    theirTree: typingsJapgolly.nodegit.treeMod.Tree,
    opts: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
}
