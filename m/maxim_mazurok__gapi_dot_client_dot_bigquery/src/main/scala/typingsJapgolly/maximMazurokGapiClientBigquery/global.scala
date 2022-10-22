package typingsJapgolly.maximMazurokGapiClientBigquery

import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.DatasetsResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobsResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.ModelsResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.RoutinesResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.RowAccessPoliciesResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.TabledataResource
import typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery.TablesResource
import typingsJapgolly.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.bigquery
import typingsJapgolly.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.v2
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
      
      object bigquery {
        
        @JSGlobal("gapi.client.bigquery.datasets")
        @js.native
        val datasets: DatasetsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.jobs")
        @js.native
        val jobs: JobsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.models")
        @js.native
        val models: ModelsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.bigquery.routines")
        @js.native
        val routines: RoutinesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.rowAccessPolicies")
        @js.native
        val rowAccessPolicies: RowAccessPoliciesResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tabledata")
        @js.native
        val tabledata: TabledataResource = js.native
        
        @JSGlobal("gapi.client.bigquery.tables")
        @js.native
        val tables: TablesResource = js.native
      }
      
      /** Load BigQuery API v2 */
      inline def load(name: bigquery, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: bigquery, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
