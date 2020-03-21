package typingsJapgolly.nodegit.stashMod.Stash

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.signatureMod.Signature
import typingsJapgolly.nodegit.stashMod.StashApplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/stash", "Stash")
@js.native
object ^ extends js.Object {
  @JSName("apply")
  def apply(repo: Repository, index: Double): js.Promise[Double] = js.native
  @JSName("apply")
  def apply(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  def drop(repo: Repository, index: Double): js.Promise[Double] = js.native
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  def pop(repo: Repository, index: Double): js.Promise[Double] = js.native
  def pop(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  def save(repo: Repository, stasher: Signature, message: String, flags: Double): js.Promise[Oid] = js.native
}

