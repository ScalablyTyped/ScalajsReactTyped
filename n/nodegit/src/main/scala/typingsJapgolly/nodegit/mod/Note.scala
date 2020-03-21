package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Note")
@js.native
class Note ()
  extends typingsJapgolly.nodegit.noteMod.Note

/* static members */
@JSImport("nodegit", "Note")
@js.native
object Note extends js.Object {
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    oid: typingsJapgolly.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = js.native
  def foreach(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: js.Any
  ): js.Promise[Double] = js.native
  def iteratorNew(repo: typingsJapgolly.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[_] = js.native
  def next(
    noteId: typingsJapgolly.nodegit.oidMod.Oid,
    annotatedId: typingsJapgolly.nodegit.oidMod.Oid,
    it: js.Any
  ): Double = js.native
  def read(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    oid: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.noteMod.Note] = js.native
  def remove(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    oid: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Double] = js.native
}

