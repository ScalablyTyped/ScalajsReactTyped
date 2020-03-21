package typingsJapgolly.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalMod {
  type ComponentFactory[P] = (typingsJapgolly.preact.mod.ComponentClass[P, js.Object]) | typingsJapgolly.preact.internalMod.FunctionalComponent[P]
}
