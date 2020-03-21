package typingsJapgolly.nodegit.pathSpecMod

import typingsJapgolly.nodegit.diffMod.Diff
import typingsJapgolly.nodegit.mod.Index
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
class Pathspec_ () extends js.Object {
  def free(): Unit = js.native
  def matchDiff(diff: Diff, flags: Double): js.Promise[_] = js.native
  def matchIndex(index: Index, flags: Double): js.Promise[_] = js.native
  def matchTree(tree: Tree, flags: Double): js.Promise[_] = js.native
  def matchWorkdir(repo: Repository, flags: Double): js.Promise[_] = js.native
  def matchesPath(flags: Double, path: String): Double = js.native
}

