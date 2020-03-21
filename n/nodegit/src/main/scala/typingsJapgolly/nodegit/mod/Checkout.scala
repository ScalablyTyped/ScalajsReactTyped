package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typingsJapgolly.nodegit.checkoutMod.Checkout

/* static members */
@JSImport("nodegit", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  def head(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: typingsJapgolly.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  def index(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    The: Index,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def initOptions(opts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions, version: Double): Double = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.commitMod.Commit,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.oidMod.Oid,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.referenceMod.Reference,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[Unit] = js.native
  def tree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    treeish: typingsJapgolly.nodegit.treeMod.Tree,
    options: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}

