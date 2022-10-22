package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.SegmentImportResource
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.UnmarshalledSegmentImportResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentResponseMod {
  
  trait SegmentResponse extends StObject {
    
    /**
      * The ID of the application that the segment applies to.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when the segment was created.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
    
    /**
      * The unique segment ID.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The import job settings.
      */
    var ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined
    
    /**
      * The date and time when the segment was last modified.
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the segment.
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
    
    /**
      * The segment type:
      * DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
      * IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
      */
    var SegmentType: js.UndefOr[DIMENSIONAL | IMPORT | String] = js.undefined
    
    /**
      * The segment version number.
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object SegmentResponse {
    
    inline def apply(): SegmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentResponse]
    }
    
    extension [Self <: SegmentResponse](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setImportDefinition(value: SegmentImportResource): Self = StObject.set(x, "ImportDefinition", value.asInstanceOf[js.Any])
      
      inline def setImportDefinitionUndefined: Self = StObject.set(x, "ImportDefinition", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      inline def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
      
      inline def setSegmentType(value: DIMENSIONAL | IMPORT | String): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
      
      inline def setSegmentTypeUndefined: Self = StObject.set(x, "SegmentType", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  trait UnmarshalledSegmentResponse
    extends StObject
       with SegmentResponse {
    
    /**
      * The segment dimensions attributes.
      */
    @JSName("Dimensions")
    var Dimensions_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentDimensions] = js.undefined
    
    /**
      * The import job settings.
      */
    @JSName("ImportDefinition")
    var ImportDefinition_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentImportResource] = js.undefined
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
      */
    @JSName("SegmentGroups")
    var SegmentGroups_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentGroupList] = js.undefined
  }
  object UnmarshalledSegmentResponse {
    
    inline def apply(): UnmarshalledSegmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentResponse]
    }
    
    extension [Self <: UnmarshalledSegmentResponse](x: Self) {
      
      inline def setDimensions(value: UnmarshalledSegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      inline def setImportDefinition(value: UnmarshalledSegmentImportResource): Self = StObject.set(x, "ImportDefinition", value.asInstanceOf[js.Any])
      
      inline def setImportDefinitionUndefined: Self = StObject.set(x, "ImportDefinition", js.undefined)
      
      inline def setSegmentGroups(value: UnmarshalledSegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      inline def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
}
