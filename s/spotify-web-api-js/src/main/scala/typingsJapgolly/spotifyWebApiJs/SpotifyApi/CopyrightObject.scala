package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.C
import typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copyright object
  * [copyright object](https://developer.spotify.com/web-api/object-model/)
  */
trait CopyrightObject extends js.Object {
  var text: String
  var `type`: C | P
}

object CopyrightObject {
  @scala.inline
  def apply(text: String, `type`: C | P): CopyrightObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyrightObject]
  }
}

