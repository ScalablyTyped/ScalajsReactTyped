package typingsJapgolly.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLink extends js.Object {
  /**
    * A data entry field that is preserved on a document link between a
    * DocumentLinkRequest and a DocumentLinkResolveRequest.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The range this link applies to.
    */
  var range: Range
  /**
    * The uri this link points to.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on how to
    * trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
    * user settings, and localization.
    *
    * @since 3.15.0
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

@JSImport("vscode-languageserver-types", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: Range): DocumentLink = js.native
  def create(range: Range, target: String): DocumentLink = js.native
  def create(range: Range, target: String, data: js.Any): DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}

