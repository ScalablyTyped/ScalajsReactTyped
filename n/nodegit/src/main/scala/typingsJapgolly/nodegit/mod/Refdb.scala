package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Refdb")
@js.native
open class Refdb ()
  extends typingsJapgolly.nodegit.refDbMod.Refdb
/* static members */
object Refdb {
  
  @JSImport("nodegit", "Refdb")
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.refDbMod.Refdb] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.refDbMod.Refdb]]
}
