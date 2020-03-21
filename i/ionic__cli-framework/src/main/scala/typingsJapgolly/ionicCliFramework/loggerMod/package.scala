package typingsJapgolly.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loggerMod {
  type LoggerFormatter = js.Function1[
    /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord, 
    java.lang.String
  ]
  type LoggerLevelWeight = scala.Double
}
