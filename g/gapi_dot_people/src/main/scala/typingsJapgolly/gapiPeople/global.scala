package typingsJapgolly.gapiPeople

import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiPeople.gapi.client.people.Person
import typingsJapgolly.gapiPeople.gapi.client.people.SearchContactsParameters
import typingsJapgolly.gapiPeople.gapi.client.people.SearchContactsResponse
import typingsJapgolly.gapiPeople.gapi.client.people.otherContacts.ListParameters
import typingsJapgolly.gapiPeople.gapi.client.people.otherContacts.ListResponse
import typingsJapgolly.gapiPeople.gapi.client.people.people.BatchGetResponse
import typingsJapgolly.gapiPeople.gapi.client.people.people.GetBatchGetParameters
import typingsJapgolly.gapiPeople.gapi.client.people.people.GetParameters
import typingsJapgolly.gapiPeople.gapi.client.people.people.connections.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object people {
        
        object otherContacts {
          
          @JSGlobal("gapi.client.people.otherContacts")
          @js.native
          val ^ : js.Any = js.native
          
          inline def list(parameters: ListParameters): HttpRequest[ListResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[ListResponse]]
          
          inline def search(parameters: SearchContactsParameters): HttpRequest[SearchContactsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[SearchContactsResponse]]
        }
        
        object people {
          
          @JSGlobal("gapi.client.people.people")
          @js.native
          val ^ : js.Any = js.native
          
          object connections {
            
            @JSGlobal("gapi.client.people.people.connections")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(parameters: typingsJapgolly.gapiPeople.gapi.client.people.people.connections.ListParameters): HttpRequest[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Response]]
          }
          
          inline def get(parameters: GetParameters): HttpRequest[Person] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[Person]]
          
          inline def getBatchGet(parameters: GetBatchGetParameters): HttpRequest[BatchGetResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBatchGet")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[BatchGetResponse]]
          
          inline def searchContacts(parameters: SearchContactsParameters): HttpRequest[SearchContactsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchContacts")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[SearchContactsResponse]]
        }
      }
    }
  }
}
