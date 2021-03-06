package typingsJapgolly.nodegit.blameMod.Blame

import typingsJapgolly.nodegit.blameOptionsMod.BlameOptions
import typingsJapgolly.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/blame", "Blame")
@js.native
object ^ extends js.Object {
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  def file(repo: Repository, path: String): typingsJapgolly.nodegit.blameMod.Blame = js.native
  def file(repo: Repository, path: String, options: BlameOptions): typingsJapgolly.nodegit.blameMod.Blame = js.native
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: BlameOptions, version: Double): Double = js.native
}

