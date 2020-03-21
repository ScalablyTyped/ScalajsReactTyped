package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typingsJapgolly.nodegit.remoteMod.Remote

/* static members */
@JSImport("nodegit", "Remote")
@js.native
object Remote extends js.Object {
  def addFetch(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def addPush(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String): typingsJapgolly.nodegit.remoteMod.Remote = js.native
  def createAnonymous(repo: typingsJapgolly.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def createDetached(url: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def createWithFetchspec(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def delete(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = js.native
  def initCallbacks(opts: typingsJapgolly.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = js.native
  def isValidName(remoteName: String): Boolean = js.native
  def list(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: typingsJapgolly.nodegit.remoteMod.Remote
  ): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: typingsJapgolly.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typingsJapgolly.nodegit.remoteMod.Remote] = js.native
  def setAutotag(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = js.native
  def setPushurl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
  def setUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
}

