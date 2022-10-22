package typingsJapgolly.dropboxChooser

import typingsJapgolly.dropboxChooser.Dropbox.Chooser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Dropbox: js.UndefOr[Chooser] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setDropbox(value: Chooser): Self = StObject.set(x, "Dropbox", value.asInstanceOf[js.Any])
    
    inline def setDropboxUndefined: Self = StObject.set(x, "Dropbox", js.undefined)
  }
}
