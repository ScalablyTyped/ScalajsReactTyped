package typingsJapgolly.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /**
    * &#42;&#42;Only populated in `person.metadata.sources`.&#42;&#42;
    *
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * source. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.undefined
  /** The unique identifier within the source type generated by the server. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * &#42;&#42;Only populated in `person.metadata.sources`.&#42;&#42;
    *
    * Metadata about a source of type PROFILE.
    */
  var profileMetadata: js.UndefOr[ProfileMetadata] = js.undefined
  /** The source type. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * &#42;&#42;Only populated in `person.metadata.sources`.&#42;&#42;
    *
    * Last update timestamp of this source.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    profileMetadata: ProfileMetadata = null,
    `type`: String = null,
    updateTime: String = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (profileMetadata != null) __obj.updateDynamic("profileMetadata")(profileMetadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

