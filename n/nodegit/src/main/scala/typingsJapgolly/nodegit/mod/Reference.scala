package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reference")
@js.native
open class Reference ()
  extends typingsJapgolly.nodegit.referenceMod.Reference
/* static members */
object Reference {
  
  @JSImport("nodegit", "Reference")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    force: Double,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def createMatching(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    force: Double,
    currentId: typingsJapgolly.nodegit.oidMod.Oid,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def dwim(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def dwim(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def dwim(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def dwim(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("dwim")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def ensureLog(repo: typingsJapgolly.nodegit.repositoryMod.Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasLog(repo: typingsJapgolly.nodegit.repositoryMod.Repository, refname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLog")(repo.asInstanceOf[js.Any], refname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isValidName(refname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(refname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def list(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.referenceMod.Reference,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def nameToId(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("nameToId")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  inline def normalizeName(bufferOut: String, bufferSize: Double, name: String, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeName")(bufferOut.asInstanceOf[js.Any], bufferSize.asInstanceOf[js.Any], name.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def symbolicCreate(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def symbolicCreateMatching(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    target: String,
    force: Double,
    currentValue: String,
    logMessage: String
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCreateMatching")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any], currentValue.asInstanceOf[js.Any], logMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
}
