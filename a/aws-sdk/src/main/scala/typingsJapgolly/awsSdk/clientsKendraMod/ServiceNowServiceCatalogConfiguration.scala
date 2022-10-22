package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowServiceCatalogConfiguration extends StObject {
  
  /**
    *  TRUE to index attachments to service catalog items.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
    */
  var DocumentDataFieldName: DataSourceFieldName
  
  /**
    * The name of the ServiceNow field that is mapped to the index document title field.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain attachments of catalogs in your ServiceNow. Item that match the patterns are excluded from the index. Items that don't match the patterns are included in the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the item isn't included in the index. The regex is applied to the file name of the attachment.
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Maps attributes or field names of catalogs to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to ServiceNow fields. For more information, see Mapping data source fields. The ServiceNow data source field names must exist in your ServiceNow custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain attachments of catalogs in your ServiceNow. Item that match the patterns are included in the index. Items that don't match the patterns are excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the item isn't included in the index. The regex is applied to the file name of the attachment.
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
}
object ServiceNowServiceCatalogConfiguration {
  
  inline def apply(DocumentDataFieldName: DataSourceFieldName): ServiceNowServiceCatalogConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowServiceCatalogConfiguration]
  }
  
  extension [Self <: ServiceNowServiceCatalogConfiguration](x: Self) {
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    inline def setDocumentDataFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    inline def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    inline def setExcludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.undefined)
    
    inline def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.undefined)
    
    inline def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.Array(value*))
  }
}
