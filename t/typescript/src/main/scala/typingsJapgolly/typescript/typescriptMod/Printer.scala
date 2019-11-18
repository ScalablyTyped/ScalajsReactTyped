package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  /**
    * Prints a bundle of source files as-is, without any emit transformations.
    */
  def printBundle(bundle: Bundle): String
  /**
    * Prints a source file as-is, without any emit transformations.
    */
  def printFile(sourceFile: SourceFile): String
  /**
    * Prints a list of nodes using the given format flags
    */
  def printList[T /* <: Node */](format: ListFormat, list: NodeArray[T], sourceFile: SourceFile): String
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
  def printNode(hint: EmitHint, node: Node, sourceFile: SourceFile): String
}

object Printer {
  @scala.inline
  def apply(
    printBundle: Bundle => CallbackTo[String],
    printFile: SourceFile => CallbackTo[String],
    printList: (ListFormat, NodeArray[js.Any], SourceFile) => CallbackTo[String],
    printNode: (EmitHint, Node, SourceFile) => CallbackTo[String]
  ): Printer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printBundle")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.Bundle) => printBundle(t0).runNow()))
    __obj.updateDynamic("printFile")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.SourceFile) => printFile(t0).runNow()))
    __obj.updateDynamic("printList")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.typescriptMod.ListFormat, t1: typingsJapgolly.typescript.typescriptMod.NodeArray[js.Any], t2: typingsJapgolly.typescript.typescriptMod.SourceFile) => printList(t0, t1, t2).runNow()))
    __obj.updateDynamic("printNode")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.typescriptMod.EmitHint, t1: typingsJapgolly.typescript.typescriptMod.Node, t2: typingsJapgolly.typescript.typescriptMod.SourceFile) => printNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Printer]
  }
}

