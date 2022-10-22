package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.cherryPickOptionsMod.CherrypickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Cherrypick")
@js.native
open class Cherrypick ()
  extends typingsJapgolly.nodegit.cherryPickMod.Cherrypick
/* static members */
object Cherrypick {
  
  @JSImport("nodegit", "Cherrypick")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  inline def cherrypick(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cherrypick")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def cherrypick(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    commit: typingsJapgolly.nodegit.commitMod.Commit,
    options: CherrypickOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cherrypick")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  /**
    * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
    */
  inline def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], cherrypickCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def commit(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsJapgolly.nodegit.commitMod.Commit,
    ourCommit: typingsJapgolly.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsJapgolly.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], cherrypickCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any], mergeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def initOptions(opts: CherrypickOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
}
