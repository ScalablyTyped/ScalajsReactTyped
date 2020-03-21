package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.googima
import typingsJapgolly.jwplayer.jwplayerStrings.mid
import typingsJapgolly.jwplayer.jwplayerStrings.post
import typingsJapgolly.jwplayer.jwplayerStrings.pre
import typingsJapgolly.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdRequestParam extends js.Object {
  var adposition: pre | mid | post
  var client: vast | googima
  var offset: pre | mid | post
  var tag: String
}

object AdRequestParam {
  @scala.inline
  def apply(adposition: pre | mid | post, client: vast | googima, offset: pre | mid | post, tag: String): AdRequestParam = {
    val __obj = js.Dynamic.literal(adposition = adposition.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdRequestParam]
  }
}

