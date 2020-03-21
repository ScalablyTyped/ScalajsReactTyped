package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.googima
import typingsJapgolly.jwplayer.jwplayerStrings.vast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdProgressParam extends js.Object {
  var client: vast | googima
  var creativetype: String
  var tag: String
}

object AdProgressParam {
  @scala.inline
  def apply(client: vast | googima, creativetype: String, tag: String): AdProgressParam = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], creativetype = creativetype.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdProgressParam]
  }
}

