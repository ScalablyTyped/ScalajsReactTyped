package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.enumsMod.Enums.DIRECTION
import typingsJapgolly.nodegit.fetchOptionsMod.FetchOptions
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2`
import typingsJapgolly.nodegit.nodegitInts.`3`
import typingsJapgolly.nodegit.pushOptionsMod.PushOptions
import typingsJapgolly.nodegit.refSpecMod.Refspec
import typingsJapgolly.nodegit.remoteCallbacksMod.RemoteCallbacks
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.strArrayMod.Strarray
import typingsJapgolly.nodegit.transferProgressMod.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteMod {
  
  @JSImport("nodegit/remote", "Remote")
  @js.native
  open class Remote () extends StObject {
    
    def autotag(): Double = js.native
    
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks): js.Promise[Double] = js.native
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks, callback: js.Function): js.Promise[Double] = js.native
    
    def connected(): Double = js.native
    
    def defaultBranch(): js.Promise[String] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def download(refSpecs: js.Array[Any]): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[Any], opts: Unit, callback: js.Function): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[Any], opts: FetchOptions): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[Any], opts: FetchOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def dup(): js.Promise[Remote] = js.native
    
    def fetch(refSpecs: js.Array[Any], opts: FetchOptions, message: String): js.Promise[Double] = js.native
    def fetch(refSpecs: js.Array[Any], opts: FetchOptions, message: String, callback: js.Function): js.Promise[Double] = js.native
    
    def free(): Unit = js.native
    
    def getFetchRefspecs(): js.Promise[js.Array[Any]] = js.native
    
    def getPushRefspecs(): js.Promise[js.Array[Any]] = js.native
    
    def getRefspec(n: Double): Refspec = js.native
    
    def name(): String = js.native
    
    def owner(): Repository = js.native
    
    def prune(callbacks: RemoteCallbacks): Double = js.native
    
    def pruneRefs(): Double = js.native
    
    def push(refSpecs: js.Array[Any]): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[Any], options: Unit, callback: js.Function): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[Any], options: PushOptions): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[Any], options: PushOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def pushurl(): String = js.native
    
    /**
      * Lists advertised references from a remote. You must connect to the remote before using referenceList.
      */
    def referenceList(): js.Promise[js.Array[Any]] = js.native
    
    def refspecCount(): Double = js.native
    
    def stats(): TransferProgress = js.native
    
    def stop(): Unit = js.native
    
    def updateTips(callbacks: RemoteCallbacks, updateFetchhead: Double, downloadTags: Double, reflogMessage: String): Double = js.native
    
    def upload(refspecs: String): Double = js.native
    def upload(refspecs: String, opts: PushOptions): Double = js.native
    def upload(refspecs: js.Array[String]): Double = js.native
    def upload(refspecs: js.Array[String], opts: PushOptions): Double = js.native
    def upload(refspecs: Strarray): Double = js.native
    def upload(refspecs: Strarray, opts: PushOptions): Double = js.native
    
    def url(): String = js.native
  }
  /* static members */
  object Remote {
    
    @JSImport("nodegit/remote", "Remote")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addFetch(repo: Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addFetch")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def addPush(repo: Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addPush")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def create(repo: Repository, name: String, url: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    inline def createAnonymous(repo: Repository, url: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnonymous")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    inline def createDetached(url: String): js.Promise[Remote] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetached")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote]]
    
    inline def createWithFetchspec(repo: Repository, name: String, url: String, fetch: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithFetchspec")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    inline def delete(repo: Repository, name: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def initCallbacks(opts: RemoteCallbacks, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initCallbacks")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isValidName(remoteName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(remoteName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def list(repo: Repository): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
    
    inline def lookup(repo: Repository, name: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    inline def lookup(repo: Repository, name: String, callback: js.Function): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    inline def lookup(repo: Repository, name: Remote): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    inline def lookup(repo: Repository, name: Remote, callback: js.Function): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    inline def rename(repo: Repository, oldName: String, newName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(repo.asInstanceOf[js.Any], oldName.asInstanceOf[js.Any], newName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setAutotag(repo: Repository, remote: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutotag")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setPushurl(repo: Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setPushurl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setUrl(repo: Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`3`
    */
    trait AUTOTAG_OPTION extends StObject
    object AUTOTAG_OPTION {
      
      inline def DOWNLOAD_TAGS_ALL: `3` = 3.asInstanceOf[`3`]
      
      inline def DOWNLOAD_TAGS_AUTO: `1` = 1.asInstanceOf[`1`]
      
      inline def DOWNLOAD_TAGS_NONE: `2` = 2.asInstanceOf[`2`]
      
      inline def DOWNLOAD_TAGS_UNSPECIFIED: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
    */
    trait COMPLETION_TYPE extends StObject
    object COMPLETION_TYPE {
      
      inline def COMPLETION_DOWNLOAD: `0` = 0.asInstanceOf[`0`]
      
      inline def COMPLETION_ERROR: `2` = 2.asInstanceOf[`2`]
      
      inline def COMPLETION_INDEXING: `1` = 1.asInstanceOf[`1`]
    }
  }
}
