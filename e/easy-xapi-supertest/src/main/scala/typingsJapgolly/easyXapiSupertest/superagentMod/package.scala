package typingsJapgolly.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superagentMod {
  type CallbackHandler = (js.Function2[
    /* err */ js.Any, 
    /* res */ typingsJapgolly.easyXapiSupertest.superagentMod.Response, 
    scala.Unit
  ]) | (js.Function1[/* res */ typingsJapgolly.easyXapiSupertest.superagentMod.Response, scala.Unit])
  type SuperAgentRequest = typingsJapgolly.easyXapiSupertest.superagentMod.Request[
    typingsJapgolly.easyXapiSupertest.superagentMod.Request[
      typingsJapgolly.easyXapiSupertest.superagentMod.Request[typingsJapgolly.easyXapiSupertest.superagentMod.Request[js.Any]]
    ]
  ]
}
