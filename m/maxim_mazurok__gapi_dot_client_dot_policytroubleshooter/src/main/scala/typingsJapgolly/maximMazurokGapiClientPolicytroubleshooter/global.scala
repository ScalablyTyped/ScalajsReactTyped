package typingsJapgolly.maximMazurokGapiClientPolicytroubleshooter

import typingsJapgolly.maximMazurokGapiClientPolicytroubleshooter.gapi.client.policytroubleshooter.IamResource
import typingsJapgolly.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.policytroubleshooter
import typingsJapgolly.maximMazurokGapiClientPolicytroubleshooter.maximMazurokGapiClientPolicytroubleshooterStrings.v1
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
      
      /** Load Policy Troubleshooter API v1 */
      inline def load(name: policytroubleshooter, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: policytroubleshooter, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object policytroubleshooter {
        
        @JSGlobal("gapi.client.policytroubleshooter.iam")
        @js.native
        val iam: IamResource = js.native
      }
    }
  }
}
