package typingsJapgolly.maximMazurokGapiClientGamesmanagement

import typingsJapgolly.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.AchievementsResource
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ApplicationsResource
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.EventsResource
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.PlayersResource
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement.ScoresResource
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.gamesmanagement
import typingsJapgolly.maximMazurokGapiClientGamesmanagement.maximMazurokGapiClientGamesmanagementStrings.v1management
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object gamesmanagement {
        
        @JSGlobal("gapi.client.gamesmanagement.achievements")
        @js.native
        val achievements: AchievementsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.events")
        @js.native
        val events: EventsResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.players")
        @js.native
        val players: PlayersResource = js.native
        
        @JSGlobal("gapi.client.gamesmanagement.scores")
        @js.native
        val scores: ScoresResource = js.native
      }
      
      /** Load Google Play Game Management v1management */
      inline def load(name: gamesmanagement, version: v1management): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: gamesmanagement, version: v1management, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
