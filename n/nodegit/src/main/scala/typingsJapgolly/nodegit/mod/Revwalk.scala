package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revwalk")
@js.native
open class Revwalk ()
  extends typingsJapgolly.nodegit.revWalkMod.Revwalk
/* static members */
object Revwalk {
  
  @JSImport("nodegit", "Revwalk")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): typingsJapgolly.nodegit.revWalkMod.Revwalk = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.revWalkMod.Revwalk]
}
