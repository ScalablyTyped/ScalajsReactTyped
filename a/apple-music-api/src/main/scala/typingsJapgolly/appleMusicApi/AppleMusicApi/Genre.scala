package typingsJapgolly.appleMusicApi.AppleMusicApi

import typingsJapgolly.appleMusicApi.AnonName
import typingsJapgolly.appleMusicApi.appleMusicApiStrings.genres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/genre
trait Genre extends Resource {
  var attributes: AnonName
  @JSName("type")
  var type_Genre: genres
}

object Genre {
  @scala.inline
  def apply(attributes: AnonName, id: String, `type`: genres, href: String = null): Genre = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
}

