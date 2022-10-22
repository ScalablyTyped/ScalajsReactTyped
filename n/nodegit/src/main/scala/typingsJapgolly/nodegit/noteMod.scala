package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noteMod {
  
  @JSImport("nodegit/note", "Note")
  @js.native
  open class Note () extends StObject {
    
    def author(): Signature = js.native
    
    def committer(): Signature = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def message(): String = js.native
  }
  /* static members */
  object Note {
    
    @JSImport("nodegit/note", "Note")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      repo: Repository,
      notesRef: String,
      author: Signature,
      committer: Signature,
      oid: Oid,
      note: String,
      force: Double
    ): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any], note.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    inline def foreach(repo: Repository, notesRef: String, noteCb: js.Function, payload: Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], noteCb.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def iteratorNew(repo: Repository, notesRef: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def next(noteId: Oid, annotatedId: Oid, it: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(noteId.asInstanceOf[js.Any], annotatedId.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def read(repo: Repository, notesRef: String, oid: Oid): js.Promise[Note] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Note]]
    
    inline def remove(repo: Repository, notesRef: String, author: Signature, committer: Signature, oid: Oid): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], notesRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], oid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
}
