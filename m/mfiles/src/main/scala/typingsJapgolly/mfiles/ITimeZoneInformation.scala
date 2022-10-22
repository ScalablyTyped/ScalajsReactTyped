package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeZoneInformation extends StObject {
  
  def LoadTimeZoneByName(TimeZoneName: String): Unit
  
  def LoadWithCurrentTimeZone(): Unit
  
  val StandardName: String
}
object ITimeZoneInformation {
  
  inline def apply(LoadTimeZoneByName: String => Callback, LoadWithCurrentTimeZone: Callback, StandardName: String): ITimeZoneInformation = {
    val __obj = js.Dynamic.literal(LoadTimeZoneByName = js.Any.fromFunction1((t0: String) => LoadTimeZoneByName(t0).runNow()), LoadWithCurrentTimeZone = LoadWithCurrentTimeZone.toJsFn, StandardName = StandardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeZoneInformation]
  }
  
  extension [Self <: ITimeZoneInformation](x: Self) {
    
    inline def setLoadTimeZoneByName(value: String => Callback): Self = StObject.set(x, "LoadTimeZoneByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLoadWithCurrentTimeZone(value: Callback): Self = StObject.set(x, "LoadWithCurrentTimeZone", value.toJsFn)
    
    inline def setStandardName(value: String): Self = StObject.set(x, "StandardName", value.asInstanceOf[js.Any])
  }
}
