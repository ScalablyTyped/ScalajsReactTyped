package typingsJapgolly.maximMazurokGapiClientBinaryauthorization

import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization.SystempolicyResource
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.binaryauthorization
import typingsJapgolly.maximMazurokGapiClientBinaryauthorization.maximMazurokGapiClientBinaryauthorizationStrings.v1
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
      
      object binaryauthorization {
        
        @JSGlobal("gapi.client.binaryauthorization.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.binaryauthorization.systempolicy")
        @js.native
        val systempolicy: SystempolicyResource = js.native
      }
      
      /** Load Binary Authorization API v1 */
      inline def load(name: binaryauthorization, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: binaryauthorization, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
