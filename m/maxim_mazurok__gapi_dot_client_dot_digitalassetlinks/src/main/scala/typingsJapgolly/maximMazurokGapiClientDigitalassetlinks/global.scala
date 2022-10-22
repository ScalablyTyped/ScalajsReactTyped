package typingsJapgolly.maximMazurokGapiClientDigitalassetlinks

import typingsJapgolly.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.AssetlinksResource
import typingsJapgolly.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks.StatementsResource
import typingsJapgolly.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.digitalassetlinks
import typingsJapgolly.maximMazurokGapiClientDigitalassetlinks.maximMazurokGapiClientDigitalassetlinksStrings.v1
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
      
      object digitalassetlinks {
        
        @JSGlobal("gapi.client.digitalassetlinks.assetlinks")
        @js.native
        val assetlinks: AssetlinksResource = js.native
        
        @JSGlobal("gapi.client.digitalassetlinks.statements")
        @js.native
        val statements: StatementsResource = js.native
      }
      
      /** Load Digital Asset Links API v1 */
      inline def load(name: digitalassetlinks, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: digitalassetlinks, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
