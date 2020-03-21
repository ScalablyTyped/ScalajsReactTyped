package typingsJapgolly.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compositeunsubscribeMod {
  type Subscription = js.Function2[
    /* unsubAll */ typingsJapgolly.baconjs.typesMod.Unsub, 
    /* unsubMe */ typingsJapgolly.baconjs.typesMod.Unsub, 
    typingsJapgolly.baconjs.typesMod.Unsub
  ]
}
