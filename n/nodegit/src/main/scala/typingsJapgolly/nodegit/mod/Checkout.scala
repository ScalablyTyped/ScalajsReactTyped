package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Checkout")
@js.native
open class Checkout ()
  extends typingsJapgolly.nodegit.checkoutMod.Checkout
/* static members */
object Checkout {
  
  @JSImport("nodegit", "Checkout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Patch head checkout to automatically coerce objects.
    */
  inline def head(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def head(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(repo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Patch index checkout to automatically coerce objects.
    */
  inline def index(repo: typingsJapgolly.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def index(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    The: Index,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(repo.asInstanceOf[js.Any], The.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def initOptions(opts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.commitMod.Commit,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.oidMod.Oid,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.referenceMod.Reference,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.treeMod.Tree,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("tree")(repo.asInstanceOf[js.Any], treeish.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
