package typingsJapgolly.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.openrct2.mod.global.LoadTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.LocationTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.RotateTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.ZoomTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.FollowTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.SpeedTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.WaitTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.LoadScenarioTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.RestartTitleSequenceCommand
  - typingsJapgolly.openrct2.mod.global.EndTitleSequenceCommand
*/
trait TitleSequenceCommand extends StObject
object TitleSequenceCommand {
  
  inline def EndTitleSequenceCommand(): typingsJapgolly.openrct2.mod.global.EndTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("end")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.EndTitleSequenceCommand]
  }
  
  inline def FollowTitleSequenceCommand(): typingsJapgolly.openrct2.mod.global.FollowTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(id = null)
    __obj.updateDynamic("type")("follow")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.FollowTitleSequenceCommand]
  }
  
  inline def LoadScenarioTitleSequenceCommand(scenario: String): typingsJapgolly.openrct2.mod.global.LoadScenarioTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(scenario = scenario.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loadsc")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.LoadScenarioTitleSequenceCommand]
  }
  
  inline def LoadTitleSequenceCommand(index: Double): typingsJapgolly.openrct2.mod.global.LoadTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("load")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.LoadTitleSequenceCommand]
  }
  
  inline def LocationTitleSequenceCommand(x: Double, y: Double): typingsJapgolly.openrct2.mod.global.LocationTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("location")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.LocationTitleSequenceCommand]
  }
  
  inline def RestartTitleSequenceCommand(): typingsJapgolly.openrct2.mod.global.RestartTitleSequenceCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("restart")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.RestartTitleSequenceCommand]
  }
  
  inline def RotateTitleSequenceCommand(rotations: Double): typingsJapgolly.openrct2.mod.global.RotateTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(rotations = rotations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rotate")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.RotateTitleSequenceCommand]
  }
  
  inline def SpeedTitleSequenceCommand(speed: Double): typingsJapgolly.openrct2.mod.global.SpeedTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("speed")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.SpeedTitleSequenceCommand]
  }
  
  inline def WaitTitleSequenceCommand(duration: Double): typingsJapgolly.openrct2.mod.global.WaitTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("wait")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.WaitTitleSequenceCommand]
  }
  
  inline def ZoomTitleSequenceCommand(zoom: Double): typingsJapgolly.openrct2.mod.global.ZoomTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("zoom")
    __obj.asInstanceOf[typingsJapgolly.openrct2.mod.global.ZoomTitleSequenceCommand]
  }
}
