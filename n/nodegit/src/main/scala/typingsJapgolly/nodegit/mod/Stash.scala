package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.stashMod.StashApplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Stash")
@js.native
class Stash ()
  extends typingsJapgolly.nodegit.stashMod.Stash

/* static members */
@JSImport("nodegit", "Stash")
@js.native
object Stash extends js.Object {
  @JSName("apply")
  def apply(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  @JSName("apply")
  def apply(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  def drop(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def pop(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = js.native
  def pop(repo: typingsJapgolly.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def save(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    stasher: typingsJapgolly.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
}

