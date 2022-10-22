package typingsJapgolly.maximMazurokGapiClientStreetviewpublish

import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoResource
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoSequenceResource
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoSequencesResource
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotosResource
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.streetviewpublish
import typingsJapgolly.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.v1
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
      
      /** Load Street View Publish API v1 */
      inline def load(name: streetviewpublish, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: streetviewpublish, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object streetviewpublish {
        
        @JSGlobal("gapi.client.streetviewpublish.photo")
        @js.native
        val photo: PhotoResource = js.native
        
        @JSGlobal("gapi.client.streetviewpublish.photoSequence")
        @js.native
        val photoSequence: PhotoSequenceResource = js.native
        
        @JSGlobal("gapi.client.streetviewpublish.photoSequences")
        @js.native
        val photoSequences: PhotoSequencesResource = js.native
        
        @JSGlobal("gapi.client.streetviewpublish.photos")
        @js.native
        val photos: PhotosResource = js.native
      }
    }
  }
}
