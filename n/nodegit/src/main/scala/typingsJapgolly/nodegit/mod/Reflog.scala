package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Reflog")
@js.native
open class Reflog ()
  extends typingsJapgolly.nodegit.refLogMod.Reflog
/* static members */
object Reflog {
  
  @JSImport("nodegit", "Reflog")
  @js.native
  val ^ : js.Any = js.native
  
  inline def delete(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def read(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.refLogMod.Reflog] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.refLogMod.Reflog]]
  
  inline def rename(repo: typingsJapgolly.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(repo.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
}
