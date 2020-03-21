package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends typingsJapgolly.nodegit.blameMod.Blame

/* static members */
@JSImport("nodegit", "Blame")
@js.native
object Blame extends js.Object {
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  def file(repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): typingsJapgolly.nodegit.blameMod.Blame = js.native
  def file(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    path: String,
    options: typingsJapgolly.nodegit.blameOptionsMod.BlameOptions
  ): typingsJapgolly.nodegit.blameMod.Blame = js.native
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: typingsJapgolly.nodegit.blameOptionsMod.BlameOptions, version: Double): Double = js.native
}

