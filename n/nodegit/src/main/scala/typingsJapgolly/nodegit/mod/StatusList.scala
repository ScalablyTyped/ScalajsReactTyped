package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "StatusList")
@js.native
open class StatusList ()
  extends typingsJapgolly.nodegit.statusListMod.StatusList
/* static members */
object StatusList {
  
  @JSImport("nodegit", "StatusList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList]]
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.statusListMod.StatusList]]
}
