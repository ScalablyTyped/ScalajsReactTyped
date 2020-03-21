package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Submodule")
@js.native
class Submodule ()
  extends typingsJapgolly.nodegit.submoduleMod.Submodule

/* static members */
@JSImport("nodegit", "Submodule")
@js.native
object Submodule extends js.Object {
  def addSetup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    url: String,
    path: String,
    useGitLink: Double
  ): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsJapgolly.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = js.native
  def resolveUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsJapgolly.nodegit.bufMod.Buf] = js.native
  def setBranch(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, branch: String): Double = js.native
  def setFetchRecurseSubmodules(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    name: String,
    fetchRecurseSubmodules: Double
  ): Double = js.native
  def setIgnore(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def setUpdate(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, update: Double): js.Promise[Double] = js.native
  def setUrl(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[Double] = js.native
  def status(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
}

