package typingsJapgolly.googleapis.bloggerV2Mod.bloggerV2

import typingsJapgolly.googleapis.AnonCountry
import typingsJapgolly.googleapis.AnonSelfLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBlog extends js.Object {
  /**
    * The description of this blog. This is displayed underneath the title.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier for this resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of this entry. Always blogger#blog
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The locale this Blog is set to.
    */
  var locale: js.UndefOr[AnonCountry] = js.native
  /**
    * The name of this blog. This is displayed as the title.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The container of pages in this blog.
    */
  var pages: js.UndefOr[AnonSelfLink] = js.native
  /**
    * The container of posts in this blog.
    */
  var posts: js.UndefOr[AnonSelfLink] = js.native
  /**
    * RFC 3339 date-time when this blog was published.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * RFC 3339 date-time when this blog was last updated.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The URL where this blog is published.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaBlog {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    kind: String = null,
    locale: AnonCountry = null,
    name: String = null,
    pages: AnonSelfLink = null,
    posts: AnonSelfLink = null,
    published: String = null,
    selfLink: String = null,
    updated: String = null,
    url: String = null
  ): SchemaBlog = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (posts != null) __obj.updateDynamic("posts")(posts.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBlog]
  }
}

