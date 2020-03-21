package typingsJapgolly.phosphorCommands.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CommandRegistry {
  /**
    * A type alias for a user-defined command function.
    */
  type CommandFunc[T] = js.Function1[/* args */ typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject, T]
  /**
    * A type alias for a simple immutable string dataset.
    */
  type Dataset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
