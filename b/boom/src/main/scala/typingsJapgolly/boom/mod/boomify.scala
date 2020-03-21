package typingsJapgolly.boom.mod

import typingsJapgolly.boom.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "boomify")
@js.native
object boomify extends js.Object {
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  def apply(error: js.Error): Boom[Null] = js.native
  def apply(error: js.Error, options: AnonMessage): Boom[Null] = js.native
}

