package typingsJapgolly.stampit.mod.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @internal Checks that a type is a ExtendedDescriptor (except `any` and `unknown`).
  * @template Type A type to check if a ExtendedDescriptor.
  */
// TODO: Improve test by checking the type of common keys
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stampit.stampitBooleans.`false`
  - typingsJapgolly.stampit.stampitBooleans.`true`
*/
trait IsADescriptor[Type] extends js.Object

