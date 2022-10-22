package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the folder.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The time that the folder was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The type of folder.
    */
  var FolderType: js.UndefOr[typingsJapgolly.awsSdk.clientsQuicksightMod.FolderType] = js.undefined
  
  /**
    * The time that the folder was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The display name of the folder.
    */
  var Name: js.UndefOr[FolderName] = js.undefined
}
object FolderSummary {
  
  inline def apply(): FolderSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderSummary]
  }
  
  extension [Self <: FolderSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "FolderId", js.undefined)
    
    inline def setFolderType(value: FolderType): Self = StObject.set(x, "FolderType", value.asInstanceOf[js.Any])
    
    inline def setFolderTypeUndefined: Self = StObject.set(x, "FolderType", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
