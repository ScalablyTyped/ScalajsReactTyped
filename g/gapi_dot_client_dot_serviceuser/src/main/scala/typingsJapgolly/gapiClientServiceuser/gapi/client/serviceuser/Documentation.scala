package typingsJapgolly.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Documentation extends js.Object {
  /** The URL to the root of documentation. */
  var documentationRootUrl: js.UndefOr[String] = js.undefined
  /**
    * Declares a single overview page. For example:
    * <pre><code>documentation:
    * summary: ...
    * overview: &#40;== include overview.md ==&#41;
    * </code></pre>
    * This is a shortcut for the following declaration (using pages style):
    * <pre><code>documentation:
    * summary: ...
    * pages:
    * - name: Overview
    * content: &#40;== include overview.md ==&#41;
    * </code></pre>
    * Note: you cannot specify both `overview` field and `pages` field.
    */
  var overview: js.UndefOr[String] = js.undefined
  /** The top level pages for the documentation set. */
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  /**
    * A list of documentation rules that apply to individual API elements.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[DocumentationRule]] = js.undefined
  /**
    * A short summary of what the service does. Can only be provided by
    * plain text.
    */
  var summary: js.UndefOr[String] = js.undefined
}

object Documentation {
  @scala.inline
  def apply(
    documentationRootUrl: String = null,
    overview: String = null,
    pages: js.Array[Page] = null,
    rules: js.Array[DocumentationRule] = null,
    summary: String = null
  ): Documentation = {
    val __obj = js.Dynamic.literal()
    if (documentationRootUrl != null) __obj.updateDynamic("documentationRootUrl")(documentationRootUrl.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentation]
  }
}

