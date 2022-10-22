package typingsJapgolly.maximMazurokGapiClientVision

import typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision.FilesResource
import typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision.ImagesResource
import typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision.LocationsResource
import typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision.OperationsResource
import typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.v1
import typingsJapgolly.maximMazurokGapiClientVision.maximMazurokGapiClientVisionStrings.vision
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
      
      /** Load Cloud Vision API v1 */
      inline def load(name: vision, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: vision, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object vision {
        
        @JSGlobal("gapi.client.vision.files")
        @js.native
        val files: FilesResource = js.native
        
        @JSGlobal("gapi.client.vision.images")
        @js.native
        val images: ImagesResource = js.native
        
        @JSGlobal("gapi.client.vision.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.vision.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.vision.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
