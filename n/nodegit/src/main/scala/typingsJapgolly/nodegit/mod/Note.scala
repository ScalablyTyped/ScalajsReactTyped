package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Note")
@js.native
open class Note ()
  extends typingsJapgolly.nodegit.noteMod.Note
/* static members */
object Note {
  
  @JSImport("nodegit", "Note")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    oid: typingsJapgolly.nodegit.oidMod.Oid,
    note: String,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any], note.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  inline def foreach(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    noteCb: js.Function,
    payload: Any
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], noteCb.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def iteratorNew(repo: typingsJapgolly.nodegit.repositoryMod.Repository, notesRef: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def next(
    noteId: typingsJapgolly.nodegit.oidMod.Oid,
    annotatedId: typingsJapgolly.nodegit.oidMod.Oid,
    it: Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(noteId.asInstanceOf[js.Any], annotatedId.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def read(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    oid: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[typingsJapgolly.nodegit.noteMod.Note] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.noteMod.Note]]
  
  inline def remove(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    notesRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    oid: typingsJapgolly.nodegit.oidMod.Oid
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
