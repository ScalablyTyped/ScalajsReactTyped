package typingsJapgolly.direction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("direction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Detect direction: left-to-right, right-to-left, or neutral.
    *
    * @example
    * ```
    * direction('anglais') // => 'ltr'
    * direction('بسيطة') // => 'rtl'
    * direction('?') // => 'neutral'
    * ```
    */
  def apply(value: String): Direction = js.native
}

