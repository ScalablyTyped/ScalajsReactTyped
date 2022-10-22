package typingsJapgolly.maximMazurokGapiClientAndroidmanagement

import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.EnterprisesResource
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement.SignupUrlsResource
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.androidmanagement
import typingsJapgolly.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.v1
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
      
      object androidmanagement {
        
        @JSGlobal("gapi.client.androidmanagement.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
        
        @JSGlobal("gapi.client.androidmanagement.signupUrls")
        @js.native
        val signupUrls: SignupUrlsResource = js.native
      }
      
      /** Load Android Management API v1 */
      inline def load(name: androidmanagement, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: androidmanagement, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
