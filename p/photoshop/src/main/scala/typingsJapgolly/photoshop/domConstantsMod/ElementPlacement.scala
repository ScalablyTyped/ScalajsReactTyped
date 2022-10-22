package typingsJapgolly.photoshop.domConstantsMod

import typingsJapgolly.photoshop.photoshopStrings.placeAfter
import typingsJapgolly.photoshop.photoshopStrings.placeAtBeginning
import typingsJapgolly.photoshop.photoshopStrings.placeAtEnd
import typingsJapgolly.photoshop.photoshopStrings.placeBefore
import typingsJapgolly.photoshop.photoshopStrings.placeInside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.photoshop.photoshopStrings.placeBefore
  - typingsJapgolly.photoshop.photoshopStrings.placeAtBeginning
  - typingsJapgolly.photoshop.photoshopStrings.placeAtEnd
  - typingsJapgolly.photoshop.photoshopStrings.placeAfter
  - typingsJapgolly.photoshop.photoshopStrings.placeInside
*/
trait ElementPlacement extends StObject
object ElementPlacement {
  
  /**
    * Place below a layer, below group if group layer
    */
  inline def PLACEAFTER: placeAfter = "placeAfter".asInstanceOf[placeAfter]
  
  /**
    * Place at the top
    */
  inline def PLACEATBEGINNING: placeAtBeginning = "placeAtBeginning".asInstanceOf[placeAtBeginning]
  
  /**
    * Place at the bottom, above background if background layer exists
    */
  inline def PLACEATEND: placeAtEnd = "placeAtEnd".asInstanceOf[placeAtEnd]
  
  /**
    * Place above a layer, above group if group layer
    */
  inline def PLACEBEFORE: placeBefore = "placeBefore".asInstanceOf[placeBefore]
  
  /**
    * Place inside a group layer, throws error if not group layer
    */
  inline def PLACEINSIDE: placeInside = "placeInside".asInstanceOf[placeInside]
}
