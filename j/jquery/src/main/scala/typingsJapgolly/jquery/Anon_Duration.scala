package typingsJapgolly.jquery

import typingsJapgolly.jquery.JQuery.Duration
import typingsJapgolly.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration
  extends _SpeedSettings[js.Any] {
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: Duration
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Duration): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

