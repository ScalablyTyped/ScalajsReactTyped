package typingsJapgolly.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "Telegram")
@js.native
open class Telegram protected ()
  extends typingsJapgolly.yuka.srcYukaMod.Telegram {
  /**
    * Constructs a new telegram object.
    *
    * @param sender - The sender.
    * @param receiver - The receiver.
    * @param message - The actual message.
    * @param delay - A time value in millisecond used to delay the message dispatching.
    * @param data - An object for custom data.
    */
  def this(
    sender: typingsJapgolly.yuka.srcCoreGameEntityMod.GameEntity,
    receiver: typingsJapgolly.yuka.srcCoreGameEntityMod.GameEntity,
    message: String,
    delay: Double,
    data: js.Object
  ) = this()
}
