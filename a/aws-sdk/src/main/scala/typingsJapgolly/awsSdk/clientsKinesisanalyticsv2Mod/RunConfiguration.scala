package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunConfiguration extends StObject {
  
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[
    typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationRestoreConfiguration
  ] = js.undefined
  
  /**
    * Describes the starting parameters for a Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.FlinkRunConfiguration] = js.undefined
  
  /**
    * Describes the starting parameters for a SQL-based Kinesis Data Analytics application application.
    */
  var SqlRunConfigurations: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.SqlRunConfigurations] = js.undefined
}
object RunConfiguration {
  
  inline def apply(): RunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfiguration]
  }
  
  extension [Self <: RunConfiguration](x: Self) {
    
    inline def setApplicationRestoreConfiguration(value: ApplicationRestoreConfiguration): Self = StObject.set(x, "ApplicationRestoreConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationRestoreConfigurationUndefined: Self = StObject.set(x, "ApplicationRestoreConfiguration", js.undefined)
    
    inline def setFlinkRunConfiguration(value: FlinkRunConfiguration): Self = StObject.set(x, "FlinkRunConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlinkRunConfigurationUndefined: Self = StObject.set(x, "FlinkRunConfiguration", js.undefined)
    
    inline def setSqlRunConfigurations(value: SqlRunConfigurations): Self = StObject.set(x, "SqlRunConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSqlRunConfigurationsUndefined: Self = StObject.set(x, "SqlRunConfigurations", js.undefined)
    
    inline def setSqlRunConfigurationsVarargs(value: SqlRunConfiguration*): Self = StObject.set(x, "SqlRunConfigurations", js.Array(value*))
  }
}
