package typingsJapgolly.maximMazurokGapiClientBooks

import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.BookshelvesResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.CloudloadingResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.DictionaryResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.FamilysharingResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.LayersResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.MyconfigResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.MylibraryResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.NotificationResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.OnboardingResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.PersonalizedstreamResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.PromoofferResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.SeriesResource
import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.VolumesResource
import typingsJapgolly.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.books
import typingsJapgolly.maximMazurokGapiClientBooks.maximMazurokGapiClientBooksStrings.v1
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
      
      object books {
        
        @JSGlobal("gapi.client.books.bookshelves")
        @js.native
        val bookshelves: BookshelvesResource = js.native
        
        @JSGlobal("gapi.client.books.cloudloading")
        @js.native
        val cloudloading: CloudloadingResource = js.native
        
        @JSGlobal("gapi.client.books.dictionary")
        @js.native
        val dictionary: DictionaryResource = js.native
        
        @JSGlobal("gapi.client.books.familysharing")
        @js.native
        val familysharing: FamilysharingResource = js.native
        
        @JSGlobal("gapi.client.books.layers")
        @js.native
        val layers: LayersResource = js.native
        
        @JSGlobal("gapi.client.books.myconfig")
        @js.native
        val myconfig: MyconfigResource = js.native
        
        @JSGlobal("gapi.client.books.mylibrary")
        @js.native
        val mylibrary: MylibraryResource = js.native
        
        @JSGlobal("gapi.client.books.notification")
        @js.native
        val notification: NotificationResource = js.native
        
        @JSGlobal("gapi.client.books.onboarding")
        @js.native
        val onboarding: OnboardingResource = js.native
        
        @JSGlobal("gapi.client.books.personalizedstream")
        @js.native
        val personalizedstream: PersonalizedstreamResource = js.native
        
        @JSGlobal("gapi.client.books.promooffer")
        @js.native
        val promooffer: PromoofferResource = js.native
        
        @JSGlobal("gapi.client.books.series")
        @js.native
        val series: SeriesResource = js.native
        
        @JSGlobal("gapi.client.books.volumes")
        @js.native
        val volumes: VolumesResource = js.native
      }
      
      /** Load Books API v1 */
      inline def load(name: books, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: books, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
