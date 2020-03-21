package typingsJapgolly.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var Browser: typingsJapgolly.jwplayer.jwplayer.Browser
  var Features: typingsJapgolly.jwplayer.jwplayer.Features
  var OS: typingsJapgolly.jwplayer.jwplayer.OS
}

object Environment {
  @scala.inline
  def apply(Browser: Browser, Features: Features, OS: OS): Environment = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Features = Features.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Environment]
  }
}

