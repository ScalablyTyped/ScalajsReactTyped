package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.anon.OFFLINENOTNECESSARY
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.OFFLINE_NOT_NECESSARY
import typingsJapgolly.chromeApps.chromeAppsStrings.SAVE_FOR_OFFLINE
import typingsJapgolly.chromeApps.chromeAppsStrings.SHARE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * The identifier of the action.
    * Any string or CommonActionId for common actions.
    * @see CommonActionId
    **/
  var id: (ToStringLiteral[
    OFFLINENOTNECESSARY, 
    /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} extends keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} ? std.Exclude<keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'}, 'SAVE_FOR_OFFLINE' | 'OFFLINE_NOT_NECESSARY' | 'SHARE'> : never */ js.Any
  ]) | String
  
  /** The title of the action. It may be ignored for common actions.  */
  var title: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply(
    id: (ToStringLiteral[
      OFFLINENOTNECESSARY, 
      /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} extends keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} ? std.Exclude<keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'}, 'SAVE_FOR_OFFLINE' | 'OFFLINE_NOT_NECESSARY' | 'SHARE'> : never */ js.Any
    ]) | String
  ): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setId(
      value: (ToStringLiteral[
          OFFLINENOTNECESSARY, 
          /* keyof chrome-apps.anon.OFFLINENOTNECESSARY */ SAVE_FOR_OFFLINE | OFFLINE_NOT_NECESSARY | SHARE, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} extends keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'} ? std.Exclude<keyof {  SAVE_FOR_OFFLINE :'SAVE_FOR_OFFLINE',   OFFLINE_NOT_NECESSARY :'OFFLINE_NOT_NECESSARY',   SHARE :'SHARE'}, 'SAVE_FOR_OFFLINE' | 'OFFLINE_NOT_NECESSARY' | 'SHARE'> : never */ js.Any
        ]) | String
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
