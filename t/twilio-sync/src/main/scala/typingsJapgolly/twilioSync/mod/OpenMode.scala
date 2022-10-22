package typingsJapgolly.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mode for opening the Sync object:
  * * `'open_or_create'` - reads a Sync object or creates one if it does not exist.
  * * `'open_existing'` - reads an existing Sync object. The promise is rejected if the object does not exist.
  * * `'create_new'` - creates a new Sync object. If the *id* property is specified, it will be used as the unique name.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioSync.twilioSyncStrings.open_or_create
  - typingsJapgolly.twilioSync.twilioSyncStrings.open_existing
  - typingsJapgolly.twilioSync.twilioSyncStrings.create_new
*/
trait OpenMode extends StObject
object OpenMode {
  
  inline def create_new: typingsJapgolly.twilioSync.twilioSyncStrings.create_new = "create_new".asInstanceOf[typingsJapgolly.twilioSync.twilioSyncStrings.create_new]
  
  inline def open_existing: typingsJapgolly.twilioSync.twilioSyncStrings.open_existing = "open_existing".asInstanceOf[typingsJapgolly.twilioSync.twilioSyncStrings.open_existing]
  
  inline def open_or_create: typingsJapgolly.twilioSync.twilioSyncStrings.open_or_create = "open_or_create".asInstanceOf[typingsJapgolly.twilioSync.twilioSyncStrings.open_or_create]
}
