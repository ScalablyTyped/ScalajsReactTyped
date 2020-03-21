package typingsJapgolly.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  type AuditLoggerContext = js.Function4[
    /* req */ typingsJapgolly.restify.mod.Request, 
    /* res */ typingsJapgolly.restify.mod.Response, 
    /* route */ js.Any, 
    /* error */ js.Any, 
    js.Any
  ]
  type MetricsCallback = js.Function5[
    /* err */ js.Error, 
    /* metrics */ typingsJapgolly.restify.mod.plugins.MetricsCallbackOptions, 
    /* req */ typingsJapgolly.restify.mod.Request, 
    /* res */ typingsJapgolly.restify.mod.Response, 
    /* route */ typingsJapgolly.restify.mod.Route, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.restify.restifyStrings.close
    - typingsJapgolly.restify.restifyStrings.aborted
    - `js.undefined`
  */
  type TMetricsCallback = js.UndefOr[typingsJapgolly.restify.mod.plugins._TMetricsCallback]
}
