package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.anon.Rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RoomLinkValidator")
@js.native
open class RoomLinkValidator protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.RoomLinkValidator {
  /**
    * @param config Config for the validator.
    * @param config.ruleFile Filename for the rule file.
    * @param config.rules Rules if not using a rule file, will be
    *                               overwritten if both is set.
    * @param asBot The AS bot.
    */
  def this(
    config: Rules,
    asBot: typingsJapgolly.matrixAppserviceBridge.libComponentsAppServiceBotMod.AppServiceBot
  ) = this()
}
