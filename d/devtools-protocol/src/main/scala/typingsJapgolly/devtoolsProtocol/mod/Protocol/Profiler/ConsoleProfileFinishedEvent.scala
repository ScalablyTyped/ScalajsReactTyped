package typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleProfileFinishedEvent extends StObject {
  
  var id: String
  
  /**
    * Location of console.profileEnd().
    */
  var location: Location
  
  var profile: Profile
  
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.undefined
}
object ConsoleProfileFinishedEvent {
  
  inline def apply(id: String, location: Location, profile: Profile): ConsoleProfileFinishedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileFinishedEvent]
  }
  
  extension [Self <: ConsoleProfileFinishedEvent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
