package typingsJapgolly.gapiTranslate

import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiTranslate.anon.Cid
import typingsJapgolly.gapiTranslate.anon.Fields
import typingsJapgolly.gapiTranslate.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object language {
      
      trait detections extends StObject {
        
        /**
          * Detect the language of text.
          */
        def list(`object`: Fields): HttpRequest[GoogleApiTranslateDetectionListResponse]
      }
      object detections {
        
        inline def apply(list: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): detections = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[detections]
        }
        
        extension [Self <: detections](x: Self) {
          
          inline def setList(value: Fields => HttpRequest[GoogleApiTranslateDetectionListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      trait languages extends StObject {
        
        /**
          * List the source/target languages supported by the API
          */
        def list(`object`: Target): HttpRequest[GoogleApiTranslateLanguageListResponse]
      }
      object languages {
        
        inline def apply(list: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): languages = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[languages]
        }
        
        extension [Self <: languages](x: Self) {
          
          inline def setList(value: Target => HttpRequest[GoogleApiTranslateLanguageListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
      
      trait translations extends StObject {
        
        /**
          * Returns text translations from one language to another.
          */
        def list(`object`: Cid): HttpRequest[GoogleApiTranslateTranslationListResponse]
      }
      object translations {
        
        inline def apply(list: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): translations = {
          val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
          __obj.asInstanceOf[translations]
        }
        
        extension [Self <: translations](x: Self) {
          
          inline def setList(value: Cid => HttpRequest[GoogleApiTranslateTranslationListResponse]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
