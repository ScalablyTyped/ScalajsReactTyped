package typingsJapgolly.deepDiff.mod

import typingsJapgolly.deepDiff.deepDiffStrings.A
import typingsJapgolly.deepDiff.deepDiffStrings.D
import typingsJapgolly.deepDiff.deepDiffStrings.E
import typingsJapgolly.deepDiff.deepDiffStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.deepDiff.mod.DiffNew[RHS]
  - typingsJapgolly.deepDiff.mod.DiffDeleted[LHS]
  - typingsJapgolly.deepDiff.mod.DiffEdit[LHS, RHS]
  - typingsJapgolly.deepDiff.mod.DiffArray[LHS, RHS]
*/
trait Diff_[LHS, RHS] extends js.Object

object Diff_ {
  @scala.inline
  def DiffNew[LHS, RHS](kind: N, rhs: RHS, path: js.Array[_] = null): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  @scala.inline
  def DiffDeleted[LHS, RHS](kind: D, lhs: LHS, path: js.Array[_] = null): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  @scala.inline
  def DiffEdit[LHS, RHS](kind: E, lhs: LHS, rhs: RHS, path: js.Array[_] = null): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
  @scala.inline
  def DiffArray[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A, path: js.Array[_] = null): Diff_[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff_[LHS, RHS]]
  }
}

