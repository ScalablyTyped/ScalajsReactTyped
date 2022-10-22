package typingsJapgolly.maximMazurokGapiClientArea120tables

import typingsJapgolly.maximMazurokGapiClientArea120tables.gapi.client.area120tables.TablesResource
import typingsJapgolly.maximMazurokGapiClientArea120tables.gapi.client.area120tables.WorkspacesResource
import typingsJapgolly.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.area120tables
import typingsJapgolly.maximMazurokGapiClientArea120tables.maximMazurokGapiClientArea120tablesStrings.v1alpha1
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
      
      object area120tables {
        
        @JSGlobal("gapi.client.area120tables.tables")
        @js.native
        val tables: TablesResource = js.native
        
        @JSGlobal("gapi.client.area120tables.workspaces")
        @js.native
        val workspaces: WorkspacesResource = js.native
      }
      
      /** Load Area120 Tables API v1alpha1 */
      inline def load(name: area120tables, version: v1alpha1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: area120tables, version: v1alpha1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
