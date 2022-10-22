package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataProviderType extends StObject
@JSImport("azdata", "DataProviderType")
@js.native
object DataProviderType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataProviderType & String] = js.native
  
  @js.native
  sealed trait AdminServicesProvider
    extends StObject
       with DataProviderType
  /* "AdminServicesProvider" */ val AdminServicesProvider: typingsJapgolly.azdata.mod.DataProviderType.AdminServicesProvider & String = js.native
  
  @js.native
  sealed trait AgentServicesProvider
    extends StObject
       with DataProviderType
  /* "AgentServicesProvider" */ val AgentServicesProvider: typingsJapgolly.azdata.mod.DataProviderType.AgentServicesProvider & String = js.native
  
  @js.native
  sealed trait BackupProvider
    extends StObject
       with DataProviderType
  /* "BackupProvider" */ val BackupProvider: typingsJapgolly.azdata.mod.DataProviderType.BackupProvider & String = js.native
  
  @js.native
  sealed trait CapabilitiesProvider
    extends StObject
       with DataProviderType
  /* "CapabilitiesProvider" */ val CapabilitiesProvider: typingsJapgolly.azdata.mod.DataProviderType.CapabilitiesProvider & String = js.native
  
  @js.native
  sealed trait ConnectionProvider
    extends StObject
       with DataProviderType
  /* "ConnectionProvider" */ val ConnectionProvider: typingsJapgolly.azdata.mod.DataProviderType.ConnectionProvider & String = js.native
  
  @js.native
  sealed trait FileBrowserProvider
    extends StObject
       with DataProviderType
  /* "FileBrowserProvider" */ val FileBrowserProvider: typingsJapgolly.azdata.mod.DataProviderType.FileBrowserProvider & String = js.native
  
  @js.native
  sealed trait IconProvider
    extends StObject
       with DataProviderType
  /* "IconProvider" */ val IconProvider: typingsJapgolly.azdata.mod.DataProviderType.IconProvider & String = js.native
  
  @js.native
  sealed trait MetadataProvider
    extends StObject
       with DataProviderType
  /* "MetadataProvider" */ val MetadataProvider: typingsJapgolly.azdata.mod.DataProviderType.MetadataProvider & String = js.native
  
  @js.native
  sealed trait ObjectExplorerNodeProvider
    extends StObject
       with DataProviderType
  /* "ObjectExplorerNodeProvider" */ val ObjectExplorerNodeProvider: typingsJapgolly.azdata.mod.DataProviderType.ObjectExplorerNodeProvider & String = js.native
  
  @js.native
  sealed trait ObjectExplorerProvider
    extends StObject
       with DataProviderType
  /* "ObjectExplorerProvider" */ val ObjectExplorerProvider: typingsJapgolly.azdata.mod.DataProviderType.ObjectExplorerProvider & String = js.native
  
  @js.native
  sealed trait ProfilerProvider
    extends StObject
       with DataProviderType
  /* "ProfilerProvider" */ val ProfilerProvider: typingsJapgolly.azdata.mod.DataProviderType.ProfilerProvider & String = js.native
  
  @js.native
  sealed trait QueryProvider
    extends StObject
       with DataProviderType
  /* "QueryProvider" */ val QueryProvider: typingsJapgolly.azdata.mod.DataProviderType.QueryProvider & String = js.native
  
  @js.native
  sealed trait RestoreProvider
    extends StObject
       with DataProviderType
  /* "RestoreProvider" */ val RestoreProvider: typingsJapgolly.azdata.mod.DataProviderType.RestoreProvider & String = js.native
  
  @js.native
  sealed trait ScriptingProvider
    extends StObject
       with DataProviderType
  /* "ScriptingProvider" */ val ScriptingProvider: typingsJapgolly.azdata.mod.DataProviderType.ScriptingProvider & String = js.native
  
  @js.native
  sealed trait SerializationProvider
    extends StObject
       with DataProviderType
  /* "SerializationProvider" */ val SerializationProvider: typingsJapgolly.azdata.mod.DataProviderType.SerializationProvider & String = js.native
  
  @js.native
  sealed trait SqlAssessmentServicesProvider
    extends StObject
       with DataProviderType
  /* "SqlAssessmentServicesProvider" */ val SqlAssessmentServicesProvider: typingsJapgolly.azdata.mod.DataProviderType.SqlAssessmentServicesProvider & String = js.native
  
  @js.native
  sealed trait TaskServicesProvider
    extends StObject
       with DataProviderType
  /* "TaskServicesProvider" */ val TaskServicesProvider: typingsJapgolly.azdata.mod.DataProviderType.TaskServicesProvider & String = js.native
}
