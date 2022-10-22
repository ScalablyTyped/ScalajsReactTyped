package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.applyMod.Apply.LOCATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Apply")
@js.native
open class Apply ()
  extends typingsJapgolly.nodegit.applyMod.Apply
/* static members */
object Apply {
  
  @JSImport("nodegit", "Apply")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    diff: typingsJapgolly.nodegit.diffMod.Diff,
    location: LOCATION,
    options: typingsJapgolly.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def toTree(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    preimage: typingsJapgolly.nodegit.treeMod.Tree,
    diff: typingsJapgolly.nodegit.diffMod.Diff,
    options: typingsJapgolly.nodegit.applyOptionsMod.ApplyOptions
  ): js.Promise[typingsJapgolly.nodegit.indexMod.Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTree")(repo.asInstanceOf[js.Any], preimage.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.indexMod.Index]]
}
