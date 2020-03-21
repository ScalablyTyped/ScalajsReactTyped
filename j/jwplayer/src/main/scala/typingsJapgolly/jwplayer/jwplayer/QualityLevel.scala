package typingsJapgolly.jwplayer.jwplayer

import typingsJapgolly.jwplayer.jwplayerStrings.`initial choice`
import typingsJapgolly.jwplayer.jwplayerStrings.api
import typingsJapgolly.jwplayer.jwplayerStrings.auto
import typingsJapgolly.jwplayer.jwplayerStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualityLevel extends js.Object {
  var level: Level
  var mode: auto | manual
  var reason: auto | api | (`initial choice`)
}

object QualityLevel {
  @scala.inline
  def apply(level: Level, mode: auto | manual, reason: auto | api | (`initial choice`)): QualityLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QualityLevel]
  }
}

