package typingsJapgolly.photoshop.domConstantsMod

import typingsJapgolly.photoshop.photoshopStrings.blackAndWhite
import typingsJapgolly.photoshop.photoshopStrings.none
import typingsJapgolly.photoshop.photoshopStrings.primaries
import typingsJapgolly.photoshop.photoshopStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.photoshop.photoshopStrings.none
  - typingsJapgolly.photoshop.photoshopStrings.blackAndWhite
  - typingsJapgolly.photoshop.photoshopStrings.primaries
  - typingsJapgolly.photoshop.photoshopStrings.web
*/
trait ForcedColors extends StObject
object ForcedColors {
  
  /** Pure black and pure white */
  inline def BLACKANDWHITE: blackAndWhite = "blackAndWhite".asInstanceOf[blackAndWhite]
  
  /** None */
  inline def NONE: none = "none".asInstanceOf[none]
  
  /**
    * Red, green, blue, cyan, magenta, yellow, black, and white.
    */
  inline def PRIMARIES: primaries = "primaries".asInstanceOf[primaries]
  
  /**
    * The 216 web-safe colors
    */
  inline def WEB: web = "web".asInstanceOf[web]
}
