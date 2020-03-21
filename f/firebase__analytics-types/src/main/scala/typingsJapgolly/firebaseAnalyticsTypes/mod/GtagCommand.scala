package typingsJapgolly.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
  - typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
  - typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
*/
trait GtagCommand extends js.Object

object GtagCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def config: typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config = this.cast("config")
  @scala.inline
  def event: typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event = this.cast("event")
  @scala.inline
  def set: typingsJapgolly.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set = this.cast("set")
}

