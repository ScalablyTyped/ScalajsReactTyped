package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AzureResource extends StObject
@JSImport("azdata", "AzureResource")
@js.native
object AzureResource extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AzureResource & Double] = js.native
  
  /**
    * Azure Dev Ops
    */
  @js.native
  sealed trait AzureDevOps
    extends StObject
       with AzureResource
  /* 6 */ val AzureDevOps: typingsJapgolly.azdata.mod.AzureResource.AzureDevOps & Double = js.native
  
  /**
    * Azure Key Vault
    */
  @js.native
  sealed trait AzureKeyVault
    extends StObject
       with AzureResource
  /* 3 */ val AzureKeyVault: typingsJapgolly.azdata.mod.AzureResource.AzureKeyVault & Double = js.native
  
  /**
    * Kusto
    */
  @js.native
  sealed trait AzureKusto
    extends StObject
       with AzureResource
  /* 10 */ val AzureKusto: typingsJapgolly.azdata.mod.AzureResource.AzureKusto & Double = js.native
  
  /**
    * Azure Log Analytics
    */
  @js.native
  sealed trait AzureLogAnalytics
    extends StObject
       with AzureResource
  /* 8 */ val AzureLogAnalytics: typingsJapgolly.azdata.mod.AzureResource.AzureLogAnalytics & Double = js.native
  
  /**
    * Azure Storage
    */
  @js.native
  sealed trait AzureStorage
    extends StObject
       with AzureResource
  /* 9 */ val AzureStorage: typingsJapgolly.azdata.mod.AzureResource.AzureStorage & Double = js.native
  
  /**
    * Azure AD Graph
    */
  @js.native
  sealed trait Graph
    extends StObject
       with AzureResource
  /* 4 */ val Graph: typingsJapgolly.azdata.mod.AzureResource.Graph & Double = js.native
  
  /**
    * Microsoft Resource Management
    */
  @js.native
  sealed trait MicrosoftResourceManagement
    extends StObject
       with AzureResource
  /* 5 */ val MicrosoftResourceManagement: typingsJapgolly.azdata.mod.AzureResource.MicrosoftResourceManagement & Double = js.native
  
  /**
    * Microsoft Graph
    */
  @js.native
  sealed trait MsGraph
    extends StObject
       with AzureResource
  /* 7 */ val MsGraph: typingsJapgolly.azdata.mod.AzureResource.MsGraph & Double = js.native
  
  /**
    * OSS RDMS
    */
  @js.native
  sealed trait OssRdbms
    extends StObject
       with AzureResource
  /* 2 */ val OssRdbms: typingsJapgolly.azdata.mod.AzureResource.OssRdbms & Double = js.native
  
  /**
    * Power BI
    */
  @js.native
  sealed trait PowerBi
    extends StObject
       with AzureResource
  /* 11 */ val PowerBi: typingsJapgolly.azdata.mod.AzureResource.PowerBi & Double = js.native
  
  /**
    * Azure Resource Management (ARM)
    */
  @js.native
  sealed trait ResourceManagement
    extends StObject
       with AzureResource
  /* 0 */ val ResourceManagement: typingsJapgolly.azdata.mod.AzureResource.ResourceManagement & Double = js.native
  
  /**
    * SQL Azure
    */
  @js.native
  sealed trait Sql
    extends StObject
       with AzureResource
  /* 1 */ val Sql: typingsJapgolly.azdata.mod.AzureResource.Sql & Double = js.native
}
