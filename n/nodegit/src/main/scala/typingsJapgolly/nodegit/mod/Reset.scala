package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reset")
@js.native
class Reset ()
  extends typingsJapgolly.nodegit.resetMod.Reset

/* static members */
@JSImport("nodegit", "Reset")
@js.native
object Reset extends js.Object {
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    pathspecs: String
  ): js.Promise[Double] = js.native
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  /**
    * Look up a refs's commit.
    */
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    pathspecs: typingsJapgolly.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = js.native
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.tagMod.Tag,
    pathspecs: String
  ): js.Promise[Double] = js.native
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.tagMod.Tag,
    pathspecs: js.Array[String]
  ): js.Promise[Double] = js.native
  def default(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.tagMod.Tag,
    pathspecs: typingsJapgolly.nodegit.strArrayMod.Strarray
  ): js.Promise[Double] = js.native
  /**
    * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
    * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
    * See the documentation for reset.
    */
  def fromAnnotated(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    resetType: Double,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): Double = js.native
  /**
    * Look up a refs's commit.
    */
  def reset(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    resetType: Double,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
  def reset(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    target: typingsJapgolly.nodegit.tagMod.Tag,
    resetType: Double,
    checkoutOpts: typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Promise[Double] = js.native
}

