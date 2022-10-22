package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.anon.DELETED
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.CHANGED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  /**
    * The type of the change which happened to the observed entry.
    * If it is DELETED, then the observed entry will be automatically
    * removed from the list of observed entries.
    * @see ChangeType
    */
  var changeType: ToStringLiteral[
    DELETED, 
    /* keyof chrome-apps.anon.DELETED */ CHANGED | typingsJapgolly.chromeApps.chromeAppsStrings.DELETED, 
    /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
  ]
  
  /** List of changes to entries within the observed directory (including the entry itself)  */
  var changes: js.UndefOr[js.Array[NotificationChange]] = js.undefined
  
  /** The identifier of the file system related to this change. */
  var fileSystemId: String
  
  /** The path of the observed entry. */
  var observedPath: String
  
  /** Mode of the observed entry. */
  var recursive: Boolean
  
  /**
    * Tag for the notification.
    * Required if the file system was mounted with the supportsNotifyTag option.
    * Note, that this flag is necessary to provide notifications about changes
    * which changed even when the system was shutdown.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object NotificationOptions {
  
  inline def apply(
    changeType: ToStringLiteral[
      DELETED, 
      /* keyof chrome-apps.anon.DELETED */ CHANGED | typingsJapgolly.chromeApps.chromeAppsStrings.DELETED, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
    ],
    fileSystemId: String,
    observedPath: String,
    recursive: Boolean
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], observedPath = observedPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
  
  extension [Self <: NotificationOptions](x: Self) {
    
    inline def setChangeType(
      value: ToStringLiteral[
          DELETED, 
          /* keyof chrome-apps.anon.DELETED */ CHANGED | typingsJapgolly.chromeApps.chromeAppsStrings.DELETED, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} extends keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'} ? std.Exclude<keyof {  CHANGED :'CHANGED',   DELETED :'DELETED'}, 'CHANGED' | 'DELETED'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: js.Array[NotificationChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setChangesVarargs(value: NotificationChange*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setObservedPath(value: String): Self = StObject.set(x, "observedPath", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
