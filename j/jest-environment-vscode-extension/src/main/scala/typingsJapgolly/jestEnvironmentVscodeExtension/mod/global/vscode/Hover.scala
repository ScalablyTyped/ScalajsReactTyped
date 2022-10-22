package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.mod.MarkedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Hover")
@js.native
open class Hover protected ()
  extends typingsJapgolly.vscode.mod.Hover {
  def this(contents: js.Array[typingsJapgolly.vscode.mod.MarkdownString | MarkedString]) = this()
  /**
    * Creates a new hover object.
    *
    * @param contents The contents of the hover.
    * @param range The range to which the hover applies.
    */
  def this(contents: typingsJapgolly.vscode.mod.MarkdownString) = this()
  def this(contents: MarkedString) = this()
  def this(
    contents: js.Array[typingsJapgolly.vscode.mod.MarkdownString | MarkedString],
    range: typingsJapgolly.vscode.mod.Range
  ) = this()
  def this(contents: typingsJapgolly.vscode.mod.MarkdownString, range: typingsJapgolly.vscode.mod.Range) = this()
  def this(contents: MarkedString, range: typingsJapgolly.vscode.mod.Range) = this()
}
