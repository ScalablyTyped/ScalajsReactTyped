package typingsJapgolly.maximMazurokGapiClientVideointelligence

import typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.OperationsResource
import typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence.VideosResource
import typingsJapgolly.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.v1
import typingsJapgolly.maximMazurokGapiClientVideointelligence.maximMazurokGapiClientVideointelligenceStrings.videointelligence
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
      
      /** Load Cloud Video Intelligence API v1 */
      inline def load(name: videointelligence, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: videointelligence, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object videointelligence {
        
        @JSGlobal("gapi.client.videointelligence.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.videointelligence.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.videointelligence.videos")
        @js.native
        val videos: VideosResource = js.native
      }
    }
  }
}
