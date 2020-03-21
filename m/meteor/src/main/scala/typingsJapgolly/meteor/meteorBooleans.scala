package typingsJapgolly.meteor

import typingsJapgolly.meteor.Mongo.CurrentDateModifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorBooleans {
  @js.native
  sealed trait `true`
    extends CurrentDateModifier
       with typingsJapgolly.meteor.mongoMod.Mongo.CurrentDateModifier
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

