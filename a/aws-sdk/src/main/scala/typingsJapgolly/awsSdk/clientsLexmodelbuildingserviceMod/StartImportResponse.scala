package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportResponse extends StObject {
  
  /**
    * A timestamp for the date and time that the import job was requested.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the specific import job.
    */
  var importId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the import job. If the status is FAILED, you can get the reason for the failure using the GetImport operation.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * The action to take when there is a merge conflict.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
  
  /**
    * The name given to the import job.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of resource to import.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * A list of tags added to the imported bot.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object StartImportResponse {
  
  inline def apply(): StartImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportResponse]
  }
  
  extension [Self <: StartImportResponse](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setImportId(value: String): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
