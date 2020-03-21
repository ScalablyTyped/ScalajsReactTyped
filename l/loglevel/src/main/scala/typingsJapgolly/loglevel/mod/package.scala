package typingsJapgolly.loglevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoggingMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ typingsJapgolly.loglevel.mod.LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    typingsJapgolly.loglevel.mod.LoggingMethod
  ]
}
