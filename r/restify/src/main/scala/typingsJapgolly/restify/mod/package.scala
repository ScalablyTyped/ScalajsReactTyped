package typingsJapgolly.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FindRouteCallback = js.Function3[
    /* err */ js.Error, 
    /* route */ js.UndefOr[typingsJapgolly.restify.mod.Route], 
    /* params */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type Formatter = js.Function3[
    /* req */ typingsJapgolly.restify.mod.Request, 
    /* res */ typingsJapgolly.restify.mod.Response, 
    /* body */ js.Any, 
    java.lang.String | typingsJapgolly.node.Buffer | scala.Null
  ]
  type Formatters_ = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.restify.mod.Formatter]
  type Next = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type RequestHandler = js.Function3[
    /* req */ typingsJapgolly.restify.mod.Request, 
    /* res */ typingsJapgolly.restify.mod.Response, 
    /* next */ typingsJapgolly.restify.mod.Next, 
    js.Any
  ]
  type RequestHandlerType = typingsJapgolly.restify.mod.RequestHandler | js.Array[typingsJapgolly.restify.mod.RequestHandler]
}
