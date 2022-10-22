package typingsJapgolly.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /** When the script was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** User who originally created the script. */
  var creator: js.UndefOr[GoogleAppsScriptTypeUser] = js.undefined
  
  /** User who last modified the script. */
  var lastModifyUser: js.UndefOr[GoogleAppsScriptTypeUser] = js.undefined
  
  /**
    * The parent's Drive ID that the script will be attached to. This is usually the ID of a Google Document or Google Sheet. This filed is optional, and if not set, a stand-alone script
    * will be created.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /** The script project's Drive ID. */
  var scriptId: js.UndefOr[String] = js.undefined
  
  /** The title for the project. */
  var title: js.UndefOr[String] = js.undefined
  
  /** When the script was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Project {
  
  inline def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  
  extension [Self <: Project](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: GoogleAppsScriptTypeUser): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setLastModifyUser(value: GoogleAppsScriptTypeUser): Self = StObject.set(x, "lastModifyUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifyUserUndefined: Self = StObject.set(x, "lastModifyUser", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
