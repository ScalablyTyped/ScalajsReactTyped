package typingsJapgolly.msRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ServiceCallback[TResult] = js.Function4[
    /* err */ js.Error | typingsJapgolly.msRest.mod.ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[typingsJapgolly.msRest.mod.WebResource], 
    /* response */ js.UndefOr[typingsJapgolly.node.httpMod.IncomingMessage], 
    scala.Unit
  ]
}
