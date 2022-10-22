package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.V_1
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsExportDestinationMod.AnalyticsExportDestination
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsExportDestinationMod.UnmarshalledAnalyticsExportDestination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStorageClassAnalysisDataExportMod {
  
  trait StorageClassAnalysisDataExport extends StObject {
    
    /**
      * <p>The place to store the data for an analysis.</p>
      */
    var Destination: AnalyticsExportDestination
    
    /**
      * <p>The version of the output schema to use when exporting data. Must be V_1.</p>
      */
    var OutputSchemaVersion: V_1 | String
  }
  object StorageClassAnalysisDataExport {
    
    inline def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: V_1 | String): StorageClassAnalysisDataExport = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClassAnalysisDataExport]
    }
    
    extension [Self <: StorageClassAnalysisDataExport](x: Self) {
      
      inline def setDestination(value: AnalyticsExportDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      inline def setOutputSchemaVersion(value: V_1 | String): Self = StObject.set(x, "OutputSchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledStorageClassAnalysisDataExport
    extends StObject
       with StorageClassAnalysisDataExport {
    
    /**
      * <p>The place to store the data for an analysis.</p>
      */
    @JSName("Destination")
    var Destination_UnmarshalledStorageClassAnalysisDataExport: UnmarshalledAnalyticsExportDestination
  }
  object UnmarshalledStorageClassAnalysisDataExport {
    
    inline def apply(Destination: UnmarshalledAnalyticsExportDestination, OutputSchemaVersion: V_1 | String): UnmarshalledStorageClassAnalysisDataExport = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStorageClassAnalysisDataExport]
    }
    
    extension [Self <: UnmarshalledStorageClassAnalysisDataExport](x: Self) {
      
      inline def setDestination(value: UnmarshalledAnalyticsExportDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    }
  }
}
