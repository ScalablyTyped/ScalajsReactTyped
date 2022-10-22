package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsFilterMod.AnalyticsFilter
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsFilterMod.UnmarshalledAnalyticsFilter
import typingsJapgolly.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis
import typingsJapgolly.awsSdkClientS3Node.typesStorageClassAnalysisMod.UnmarshalledStorageClassAnalysis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAnalyticsConfigurationMod {
  
  trait AnalyticsConfiguration extends StObject {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    var Filter: js.UndefOr[AnalyticsFilter] = js.undefined
    
    /**
      * <p>The identifier used to represent an analytics configuration.</p>
      */
    var Id: String
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    var StorageClassAnalysis: typingsJapgolly.awsSdkClientS3Node.typesStorageClassAnalysisMod.StorageClassAnalysis
  }
  object AnalyticsConfiguration {
    
    inline def apply(Id: String, StorageClassAnalysis: StorageClassAnalysis): AnalyticsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsConfiguration]
    }
    
    extension [Self <: AnalyticsConfiguration](x: Self) {
      
      inline def setFilter(value: AnalyticsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setStorageClassAnalysis(value: StorageClassAnalysis): Self = StObject.set(x, "StorageClassAnalysis", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledAnalyticsConfiguration
    extends StObject
       with AnalyticsConfiguration {
    
    /**
      * <p>The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.</p>
      */
    @JSName("Filter")
    var Filter_UnmarshalledAnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsFilter] = js.undefined
    
    /**
      * <p>If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.</p>
      */
    @JSName("StorageClassAnalysis")
    var StorageClassAnalysis_UnmarshalledAnalyticsConfiguration: UnmarshalledStorageClassAnalysis
  }
  object UnmarshalledAnalyticsConfiguration {
    
    inline def apply(Id: String, StorageClassAnalysis: UnmarshalledStorageClassAnalysis): UnmarshalledAnalyticsConfiguration = {
      val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StorageClassAnalysis = StorageClassAnalysis.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledAnalyticsConfiguration]
    }
    
    extension [Self <: UnmarshalledAnalyticsConfiguration](x: Self) {
      
      inline def setFilter(value: UnmarshalledAnalyticsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      inline def setStorageClassAnalysis(value: UnmarshalledStorageClassAnalysis): Self = StObject.set(x, "StorageClassAnalysis", value.asInstanceOf[js.Any])
    }
  }
}
