package typingsJapgolly.babelCore.mod

import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babelTraverse.mod.Scope
import typingsJapgolly.babelTraverse.mod.TraverseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", "traverse")
@js.native
object traverse extends js.Object {
  def apply(
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply(
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  def apply(
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def apply(
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply(
    parent: typingsJapgolly.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply(
    parent: typingsJapgolly.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope
  ): Unit = js.native
  def apply(
    parent: typingsJapgolly.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def apply(
    parent: typingsJapgolly.babelTraverse.mod.Node,
    opts: TraverseOptions[typingsJapgolly.babelTraverse.mod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply[S](
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def apply[S](
    parent: js.Array[typingsJapgolly.babelTraverse.mod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
  def apply[S](parent: typingsJapgolly.babelTraverse.mod.Node, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def apply[S](
    parent: typingsJapgolly.babelTraverse.mod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[typingsJapgolly.babelTraverse.mod.Node]
  ): Unit = js.native
}

