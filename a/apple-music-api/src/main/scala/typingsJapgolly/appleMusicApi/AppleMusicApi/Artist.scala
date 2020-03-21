package typingsJapgolly.appleMusicApi.AppleMusicApi

import typingsJapgolly.appleMusicApi.AnonEditorialNotes
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.artists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artist
trait Artist extends Resource {
  var attributes: js.UndefOr[AnonEditorialNotes] = js.undefined
  var relationships: js.UndefOr[ArtistRelationships] = js.undefined
  @JSName("type")
  var type_Artist: artists
}

object Artist {
  @scala.inline
  def apply(
    id: String,
    `type`: artists,
    attributes: AnonEditorialNotes = null,
    href: String = null,
    relationships: ArtistRelationships = null
  ): Artist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
}

