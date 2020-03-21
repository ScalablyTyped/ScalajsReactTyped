package typingsJapgolly.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypressMod {
  // Cypress, cy, Log inherits EventEmitter.
  type EventEmitter2 = typingsJapgolly.eventemitter2.mod.EventEmitter2
  // small utility types to better express meaning of other types
  type dateTimeISO = java.lang.String
  type hookId = java.lang.String
  type ms = scala.Double
  type pixels = scala.Double
  type testId = java.lang.String
}
