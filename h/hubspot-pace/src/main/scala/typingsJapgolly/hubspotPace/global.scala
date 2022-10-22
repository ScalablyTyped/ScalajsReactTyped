package typingsJapgolly.hubspotPace

import typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.Pace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HubSpotPaceInterfaces {
    
    @JSGlobal("HubSpotPaceInterfaces.PaceEvent")
    @js.native
    object PaceEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent & Double] = js.native
      
      /* 3 */ val done: typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent.done & Double = js.native
      
      /* 4 */ val hide: typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent.hide & Double = js.native
      
      /* 2 */ val restart: typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent.restart & Double = js.native
      
      /* 0 */ val start: typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent.start & Double = js.native
      
      /* 1 */ val stop: typingsJapgolly.hubspotPace.HubSpotPaceInterfaces.PaceEvent.stop & Double = js.native
    }
  }
  
  @JSGlobal("pace")
  @js.native
  def pace: Pace = js.native
  inline def pace_=(x: Pace): Unit = js.Dynamic.global.updateDynamic("pace")(x.asInstanceOf[js.Any])
}
