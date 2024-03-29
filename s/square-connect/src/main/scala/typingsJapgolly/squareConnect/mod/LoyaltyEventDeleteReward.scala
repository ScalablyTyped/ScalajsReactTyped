package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventDeleteReward")
@js.native
open class LoyaltyEventDeleteReward () extends StObject {
  
  /**
    * The ID of the `loyalty program`.
    */
  var loyalty_program_id: String = js.native
  
  /**
    * The number of points returned to the loyalty account.
    */
  var points: Double = js.native
  
  /**
    * The ID of the deleted `loyalty reward`. This field is returned only if the event source is `LOYALTY_API`.
    */
  var reward_id: js.UndefOr[String] = js.native
}
