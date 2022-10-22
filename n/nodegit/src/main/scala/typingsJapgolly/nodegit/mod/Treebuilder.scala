package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Treebuilder")
@js.native
open class Treebuilder ()
  extends typingsJapgolly.nodegit.treeBuilderMod.Treebuilder
/* static members */
object Treebuilder {
  
  @JSImport("nodegit", "Treebuilder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder]]
  inline def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    source: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder]]
}
