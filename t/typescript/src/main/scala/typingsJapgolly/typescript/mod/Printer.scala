package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  /**
    * Prints a bundle of source files as-is, without any emit transformations.
    */
  def printBundle(bundle: Bundle): java.lang.String
  /**
    * Prints a source file as-is, without any emit transformations.
    */
  def printFile(sourceFile: SourceFile): java.lang.String
  /**
    * Prints a list of nodes using the given format flags
    */
  def printList[T /* <: Node */](format: ListFormat, list: NodeArray[T], sourceFile: SourceFile): java.lang.String
  /**
    * Print a node and its subtree as-is, without any emit transformations.
    * @param hint A value indicating the purpose of a node. This is primarily used to
    * distinguish between an `Identifier` used in an expression position, versus an
    * `Identifier` used as an `IdentifierName` as part of a declaration. For most nodes you
    * should just pass `Unspecified`.
    * @param node The node to print. The node and its subtree are printed as-is, without any
    * emit transformations.
    * @param sourceFile A source file that provides context for the node. The source text of
    * the file is used to emit the original source content for literals and identifiers, while
    * the identifiers of the source file are used when generating unique names to avoid
    * collisions.
    */
  def printNode(hint: EmitHint, node: Node, sourceFile: SourceFile): java.lang.String
}

object Printer {
  @scala.inline
  def apply(
    printBundle: Bundle => CallbackTo[java.lang.String],
    printFile: SourceFile => CallbackTo[java.lang.String],
    printList: (ListFormat, NodeArray[js.Any], SourceFile) => CallbackTo[java.lang.String],
    printNode: (EmitHint, Node, SourceFile) => CallbackTo[java.lang.String]
  ): Printer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printBundle")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Bundle) => printBundle(t0).runNow()))
    __obj.updateDynamic("printFile")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SourceFile) => printFile(t0).runNow()))
    __obj.updateDynamic("printList")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.mod.ListFormat, t1: typingsJapgolly.typescript.mod.NodeArray[js.Any], t2: typingsJapgolly.typescript.mod.SourceFile) => printList(t0, t1, t2).runNow()))
    __obj.updateDynamic("printNode")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.mod.EmitHint, t1: typingsJapgolly.typescript.mod.Node, t2: typingsJapgolly.typescript.mod.SourceFile) => printNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Printer]
  }
}

