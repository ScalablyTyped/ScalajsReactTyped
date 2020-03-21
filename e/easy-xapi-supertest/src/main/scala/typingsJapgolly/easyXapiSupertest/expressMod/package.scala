package typingsJapgolly.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  type ErrorRequestHandler = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsJapgolly.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsJapgolly.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type Handler = typingsJapgolly.easyXapiSupertest.expressMod.RequestHandler
  type RequestHandler = js.Function3[
    /* req */ typingsJapgolly.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsJapgolly.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type RequestParamHandler = js.Function4[
    /* req */ typingsJapgolly.easyXapiSupertest.expressMod.Request, 
    /* res */ typingsJapgolly.easyXapiSupertest.expressMod.Response, 
    /* next */ js.Function, 
    /* param */ js.Any, 
    js.Any
  ]
}
