package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.openDirectory
import typingsJapgolly.chromeApps.chromeAppsStrings.openFile
import typingsJapgolly.chromeApps.chromeAppsStrings.openWritableFile
import typingsJapgolly.chromeApps.chromeAppsStrings.saveFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPENDIRECTORY extends StObject {
  
  var OPEN_DIRECTORY: openDirectory
  
  var OPEN_FILE: openFile
  
  var OPEN_WRITABLE_FILE: openWritableFile
  
  var SAVE_FILE: saveFile
}
object OPENDIRECTORY {
  
  inline def apply(): OPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = "openDirectory", OPEN_FILE = "openFile", OPEN_WRITABLE_FILE = "openWritableFile", SAVE_FILE = "saveFile")
    __obj.asInstanceOf[OPENDIRECTORY]
  }
  
  extension [Self <: OPENDIRECTORY](x: Self) {
    
    inline def setOPEN_DIRECTORY(value: openDirectory): Self = StObject.set(x, "OPEN_DIRECTORY", value.asInstanceOf[js.Any])
    
    inline def setOPEN_FILE(value: openFile): Self = StObject.set(x, "OPEN_FILE", value.asInstanceOf[js.Any])
    
    inline def setOPEN_WRITABLE_FILE(value: openWritableFile): Self = StObject.set(x, "OPEN_WRITABLE_FILE", value.asInstanceOf[js.Any])
    
    inline def setSAVE_FILE(value: saveFile): Self = StObject.set(x, "SAVE_FILE", value.asInstanceOf[js.Any])
  }
}
