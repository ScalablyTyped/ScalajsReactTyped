package typingsJapgolly.youtubePlayer.typesMod

import typingsJapgolly.youtubePlayer.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IframeApiType extends js.Object {
  var Player: AnonInstantiable
}

object IframeApiType {
  @scala.inline
  def apply(Player: AnonInstantiable): IframeApiType = {
    val __obj = js.Dynamic.literal(Player = Player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IframeApiType]
  }
}

