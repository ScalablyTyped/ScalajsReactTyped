package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiMod {
  type ActionStarter[I] = js.Function2[
    /* action */ typingsJapgolly.popmotion.actionMod.Action, 
    /* key */ I, 
    typingsJapgolly.popmotion.typesMod.ColdSubscription
  ]
}
