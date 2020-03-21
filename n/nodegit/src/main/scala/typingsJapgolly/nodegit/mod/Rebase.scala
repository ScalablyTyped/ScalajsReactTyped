package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.rebaseMod.RebaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Rebase")
@js.native
class Rebase ()
  extends typingsJapgolly.nodegit.rebaseMod.Rebase

/* static members */
@JSImport("nodegit", "Rebase")
@js.native
object Rebase extends js.Object {
  def init(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    branch: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Promise[typingsJapgolly.nodegit.rebaseMod.Rebase] = js.native
  def init(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    branch: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[typingsJapgolly.nodegit.rebaseMod.Rebase] = js.native
  def initOptions(opts: RebaseOptions, version: Double): Double = js.native
  def open(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.rebaseMod.Rebase] = js.native
  def open(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: RebaseOptions): js.Promise[typingsJapgolly.nodegit.rebaseMod.Rebase] = js.native
}

