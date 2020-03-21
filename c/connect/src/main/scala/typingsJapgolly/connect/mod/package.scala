package typingsJapgolly.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsJapgolly.connect.mod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ typingsJapgolly.connect.mod.NextFunction, 
    scala.Unit
  ]
  type HandleFunction = typingsJapgolly.connect.mod.SimpleHandleFunction | typingsJapgolly.connect.mod.NextHandleFunction | typingsJapgolly.connect.mod.ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ typingsJapgolly.connect.mod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    /* next */ typingsJapgolly.connect.mod.NextFunction, 
    scala.Unit
  ]
  type ServerHandle = typingsJapgolly.connect.mod.HandleFunction | typingsJapgolly.node.httpMod.Server
  type SimpleHandleFunction = js.Function2[
    /* req */ typingsJapgolly.connect.mod.IncomingMessage, 
    /* res */ typingsJapgolly.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
