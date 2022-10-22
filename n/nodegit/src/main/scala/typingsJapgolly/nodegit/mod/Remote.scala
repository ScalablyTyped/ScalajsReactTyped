package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Remote")
@js.native
open class Remote ()
  extends typingsJapgolly.nodegit.remoteMod.Remote
/* static members */
object Remote {
  
  @JSImport("nodegit", "Remote")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFetch(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addFetch")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def addPush(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addPush")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  
  inline def createAnonymous(repo: typingsJapgolly.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnonymous")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  
  inline def createDetached(url: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetached")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  
  inline def createWithFetchspec(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithFetchspec")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  
  inline def delete(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def initCallbacks(opts: typingsJapgolly.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initCallbacks")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isValidName(remoteName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(remoteName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def list(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: typingsJapgolly.nodegit.remoteMod.Remote
  ): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: typingsJapgolly.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.remoteMod.Remote]]
  
  inline def rename(repo: typingsJapgolly.nodegit.repositoryMod.Repository, oldName: String, newName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(repo.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setAutotag(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutotag")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setPushurl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setPushurl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
}
