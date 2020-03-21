package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends typingsJapgolly.nodegit.treeBuilderMod.Treebuilder

/* static members */
@JSImport("nodegit", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  def create(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder] = js.native
  def create(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    source: typingsJapgolly.nodegit.treeMod.Tree
  ): js.Promise[typingsJapgolly.nodegit.treeBuilderMod.Treebuilder] = js.native
}

