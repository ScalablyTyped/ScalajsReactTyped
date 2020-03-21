package typingsJapgolly.nodegit.submoduleMod.Submodule

import typingsJapgolly.nodegit.bufMod.Buf
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/submodule", "Submodule")
@js.native
object ^ extends js.Object {
  def addSetup(repo: Repository, url: String, path: String, useGitLink: Double): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = js.native
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  def lookup(repo: Repository, name: String): js.Promise[typingsJapgolly.nodegit.submoduleMod.Submodule] = js.native
  def resolveUrl(repo: Repository, url: String): js.Promise[Buf] = js.native
  def setBranch(repo: Repository, name: String, branch: String): Double = js.native
  def setFetchRecurseSubmodules(repo: Repository, name: String, fetchRecurseSubmodules: Double): Double = js.native
  def setIgnore(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def setUpdate(repo: Repository, name: String, update: Double): js.Promise[Double] = js.native
  def setUrl(repo: Repository, name: String, url: String): js.Promise[Double] = js.native
  def status(repo: Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
}

