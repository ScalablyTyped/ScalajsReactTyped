package typingsJapgolly.leafletRoutingMachine.leafletMod.Routing_

import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-left`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-right`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`enter-roundabout`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-left`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-right`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-left`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-right`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.`u-turn`
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.arrive
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.continue
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.depart
import typingsJapgolly.leafletRoutingMachine.leafletRoutingMachineStrings.via
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Formatter")
@js.native
open class Formatter_ () extends StObject {
  def this(options: FormatterOptions) = this()
  
  def capitalize(s: String): String = js.native
  
  def formatDistance(d: Double): String = js.native
  def formatDistance(d: Double, precision: Double): String = js.native
  
  def formatInstruction(instruction: IInstruction): String = js.native
  
  def formatTime(t: Double): String = js.native
  
  def getIconName(instruction: IInstruction, index: Double): depart | via | `enter-roundabout` | arrive | continue | `bear-right` | `turn-right` | `sharp-right` | `u-turn` | `sharp-left` | `turn-left` | `bear-left` = js.native
}
