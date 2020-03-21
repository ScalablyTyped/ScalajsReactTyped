package typingsJapgolly.supertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typingsJapgolly.supertest.mod.Response, scala.Unit]
  type Request = typingsJapgolly.superagent.mod.SuperAgentRequest
  type Response = typingsJapgolly.superagent.mod.Response
  type SuperTest[T /* <: typingsJapgolly.superagent.mod.SuperAgentRequest */] = typingsJapgolly.superagent.mod.SuperAgent[T]
}
