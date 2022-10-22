package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.branchMod.Branch.BRANCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Branch")
@js.native
open class Branch ()
  extends typingsJapgolly.nodegit.branchMod.Branch
/* static members */
object Branch {
  
  @JSImport("nodegit", "Branch")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    branchName: String,
    target: typingsJapgolly.nodegit.commitMod.Commit,
    force: Double
  ): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def createFromAnnotated(
    repository: typingsJapgolly.nodegit.repositoryMod.Repository,
    branchName: String,
    commit: typingsJapgolly.nodegit.annotatedCommitMod.AnnotatedCommit,
    force: Double
  ): typingsJapgolly.nodegit.referenceMod.Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromAnnotated")(repository.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.referenceMod.Reference]
  
  inline def delete(branch: typingsJapgolly.nodegit.referenceMod.Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isHead(branch: typingsJapgolly.nodegit.referenceMod.Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isHead")(branch.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def iteratorNew(repo: typingsJapgolly.nodegit.repositoryMod.Repository, listFlags: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("iteratorNew")(repo.asInstanceOf[js.Any], listFlags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, branchName: String, branchType: BRANCH): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], branchName.asInstanceOf[js.Any], branchType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def move(branch: typingsJapgolly.nodegit.referenceMod.Reference, newBranchName: String, force: Double): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(branch.asInstanceOf[js.Any], newBranchName.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
  
  inline def name(ref: typingsJapgolly.nodegit.referenceMod.Reference): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def setUpstream(branch: typingsJapgolly.nodegit.referenceMod.Reference): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpstream")(branch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def setUpstream(branch: typingsJapgolly.nodegit.referenceMod.Reference, upstreamName: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpstream")(branch.asInstanceOf[js.Any], upstreamName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def upstream(branch: typingsJapgolly.nodegit.referenceMod.Reference): js.Promise[typingsJapgolly.nodegit.referenceMod.Reference] = ^.asInstanceOf[js.Dynamic].applyDynamic("upstream")(branch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.referenceMod.Reference]]
}
