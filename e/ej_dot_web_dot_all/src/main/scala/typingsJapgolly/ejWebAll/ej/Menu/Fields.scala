package typingsJapgolly.ejWebAll.ej.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** It receives the child data for the inner level.
    */
  var child: js.UndefOr[js.Any] = js.undefined
  /** It receives datasource as Essential DataManager object and JSON object.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the HTML attributes to â€œLIâ€ item list.
    */
  var htmlAttribute: js.UndefOr[String] = js.undefined
  /** Specifies the id to menu items list
    */
  var id: js.UndefOr[String] = js.undefined
  /** Specifies the image attribute to â€œimgâ€ tag inside items list.
    */
  var imageAttribute: js.UndefOr[String] = js.undefined
  /** Specifies the image URL to â€œimgâ€ tag inside item list.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Adds custom attributes like &quot;target&quot; to the anchor tag of the menu items.
    */
  var linkAttribute: js.UndefOr[String] = js.undefined
  /** Specifies the parent id of the table.
    */
  var parentId: js.UndefOr[String] = js.undefined
  /** It receives query to retrieve data from the table (query is same as SQL).
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Specifies the sprite CSS class to â€œLIâ€ item list.
    */
  var spriteCssClass: js.UndefOr[String] = js.undefined
  /** It receives table name to execute query on the corresponding table.
    */
  var tableName: js.UndefOr[String] = js.undefined
  /** Specifies the text of menu items list.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the URL to the anchor tag in menu item list.
    */
  var url: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    child: js.Any = null,
    dataSource: js.Any = null,
    htmlAttribute: String = null,
    id: String = null,
    imageAttribute: String = null,
    imageUrl: String = null,
    linkAttribute: String = null,
    parentId: String = null,
    query: js.Any = null,
    spriteCssClass: String = null,
    tableName: String = null,
    text: String = null,
    url: String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (child != null) __obj.updateDynamic("child")(child.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (htmlAttribute != null) __obj.updateDynamic("htmlAttribute")(htmlAttribute.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageAttribute != null) __obj.updateDynamic("imageAttribute")(imageAttribute.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (linkAttribute != null) __obj.updateDynamic("linkAttribute")(linkAttribute.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (spriteCssClass != null) __obj.updateDynamic("spriteCssClass")(spriteCssClass.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

