package typingsJapgolly.photoshop.domConstantsMod

import typingsJapgolly.photoshop.photoshopStrings.display
import typingsJapgolly.photoshop.photoshopStrings.dontDisplay
import typingsJapgolly.photoshop.photoshopStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.photoshop.photoshopStrings.display
  - typingsJapgolly.photoshop.photoshopStrings.silent
  - typingsJapgolly.photoshop.photoshopStrings.dontDisplay
*/
trait DialogModes extends StObject
object DialogModes {
  
  /**
    * All dialogs will be shown
    */
  inline def ALL: display = "display".asInstanceOf[display]
  
  /**
    * Dialogs will be shown only if Photoshop raises an error
    */
  inline def ERROR: silent = "silent".asInstanceOf[silent]
  
  /**
    * All dialogs will be hidden, and bad calls will silently fail
    */
  inline def NONE: dontDisplay = "dontDisplay".asInstanceOf[dontDisplay]
}
