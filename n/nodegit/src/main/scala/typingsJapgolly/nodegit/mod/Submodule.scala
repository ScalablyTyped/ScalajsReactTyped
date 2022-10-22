package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Submodule")
@js.native
open class Submodule ()
  extends typingsJapgolly.nodegit.submoduleMod.Submodule
/* static members */
object Submodule {
  
  @JSImport("nodegit", "Submodule")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addSetup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    url: String,
    path: String,
    useGitLink: Double
  ): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("addSetup")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any], path.asInstanceOf[js.Any], useGitLink.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule]]
  
  inline def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule]]
  
  inline def resolveUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsJapgolly.nodegit.bufMod.Buf] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUrl")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.bufMod.Buf]]
  
  inline def setBranch(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, branch: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setBranch")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setFetchRecurseSubmodules(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    fetchRecurseSubmodules: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setFetchRecurseSubmodules")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fetchRecurseSubmodules.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setIgnore(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIgnore")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def setUpdate(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, update: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpdate")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def setUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def status(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("updateInitOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
