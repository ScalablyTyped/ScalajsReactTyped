package typingsJapgolly.meteor

import typingsJapgolly.meteor.Mongo.CurrentDateModifier
import typingsJapgolly.meteor.meteorStrings.date
import typingsJapgolly.meteor.meteorStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonType
  extends CurrentDateModifier
     with typingsJapgolly.meteor.mongoMod.Mongo.CurrentDateModifier {
  @JSName("$type")
  var $type: timestamp | date = js.native
}

