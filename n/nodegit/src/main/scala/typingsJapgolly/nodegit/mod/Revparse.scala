package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revparse")
@js.native
open class Revparse ()
  extends typingsJapgolly.nodegit.revParseMod.Revparse
/* static members */
object Revparse {
  
  @JSImport("nodegit", "Revparse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ext(
    objectOut: typingsJapgolly.nodegit.objectMod.Object,
    referenceOut: typingsJapgolly.nodegit.referenceMod.Reference,
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ext")(objectOut.asInstanceOf[js.Any], referenceOut.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def single(repo: typingsJapgolly.nodegit.repositoryMod.Repository, spec: String): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("single")(repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.objectMod.Object]]
}
