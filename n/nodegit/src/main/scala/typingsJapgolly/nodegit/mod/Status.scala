package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Status")
@js.native
open class Status ()
  extends typingsJapgolly.nodegit.statusMod.Status
/* static members */
object Status {
  
  @JSImport("nodegit", "Status")
  @js.native
  val ^ : js.Any = js.native
  
  inline def byIndex(statuslist: typingsJapgolly.nodegit.statusListMod.StatusList, idx: Double): typingsJapgolly.nodegit.statusEntryMod.StatusEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("byIndex")(statuslist.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.statusEntryMod.StatusEntry]
  
  inline def file(repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: Unit, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def foreachExt(repo: typingsJapgolly.nodegit.repositoryMod.Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreachExt")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def shouldIgnore(ignored: Double, repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnore")(ignored.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Double]
}
