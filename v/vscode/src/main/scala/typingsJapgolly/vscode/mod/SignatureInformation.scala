package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SignatureInformation")
@js.native
open class SignatureInformation protected () extends StObject {
  /**
    * Creates a new signature information object.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def this(label: String) = this()
  def this(label: String, documentation: String) = this()
  def this(label: String, documentation: MarkdownString) = this()
  
  /**
    * The index of the active parameter.
    *
    * If provided, this is used in place of {@linkcode SignatureHelp.activeParameter}.
    */
  var activeParameter: js.UndefOr[Double] = js.native
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | MarkdownString] = js.native
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String = js.native
  
  /**
    * The parameters of this signature.
    */
  var parameters: js.Array[ParameterInformation] = js.native
}
