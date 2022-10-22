package typingsJapgolly.storybookCoreCommon.anon

import typingsJapgolly.node.processMod.global.NodeJS.HRTime
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTime extends StObject {
  
  var options: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options
  
  var startTime: ReturnType[HRTime]
}
object StartTime {
  
  inline def apply(
    options: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options,
    startTime: ReturnType[HRTime]
  ): StartTime = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  extension [Self <: StartTime](x: Self) {
    
    inline def setOptions(value: typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: ReturnType[HRTime]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
