package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Details about the resource usage and capacity of the environment. */
trait IndexCapacity extends StObject {
  
  /** Summary of the collection usage in the environment. */
  var collections: js.UndefOr[CollectionUsage] = js.undefined
  
  /** Summary of the disk usage statistics for the environment. */
  var disk_usage: js.UndefOr[DiskUsage] = js.undefined
  
  /** Summary of the document usage statistics for the environment. */
  var documents: js.UndefOr[EnvironmentDocuments] = js.undefined
}
object IndexCapacity {
  
  inline def apply(): IndexCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexCapacity]
  }
  
  extension [Self <: IndexCapacity](x: Self) {
    
    inline def setCollections(value: CollectionUsage): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setDisk_usage(value: DiskUsage): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
    
    inline def setDisk_usageUndefined: Self = StObject.set(x, "disk_usage", js.undefined)
    
    inline def setDocuments(value: EnvironmentDocuments): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
  }
}
