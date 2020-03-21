package typingsJapgolly.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BeforeSend = js.Function1[
    /* report */ typingsJapgolly.bugsnagJs.reportMod.default, 
    scala.Boolean | scala.Unit
  ]
  type BeforeSession = js.Function1[/* client */ typingsJapgolly.bugsnagJs.clientMod.Client, scala.Unit]
}
