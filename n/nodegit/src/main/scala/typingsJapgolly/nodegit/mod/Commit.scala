package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Commit")
@js.native
open class Commit ()
  extends typingsJapgolly.nodegit.commitMod.Commit
/* static members */
object Commit {
  
  @JSImport("nodegit", "Commit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsJapgolly.nodegit.treeMod.Tree,
    parentCount: Double,
    parents: js.Array[Any]
  ): typingsJapgolly.nodegit.oidMod.Oid = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.oidMod.Oid]
  
  inline def createV(
    id: typingsJapgolly.nodegit.oidMod.Oid,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typingsJapgolly.nodegit.signatureMod.Signature,
    committer: typingsJapgolly.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typingsJapgolly.nodegit.treeMod.Tree,
    parentCount: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("createV")(id.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createWithSignature(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commitContent: String,
    signature: String,
    signatureField: String
  ): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], commitContent.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], signatureField.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.commitMod.Commit]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.commitMod.Commit]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.commitMod.Commit]]
  
  inline def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.commitMod.Commit]]
}
