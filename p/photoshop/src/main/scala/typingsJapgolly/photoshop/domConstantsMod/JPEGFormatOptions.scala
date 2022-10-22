package typingsJapgolly.photoshop.domConstantsMod

import typingsJapgolly.photoshop.photoshopStrings.optimizedbaseline
import typingsJapgolly.photoshop.photoshopStrings.progressive
import typingsJapgolly.photoshop.photoshopStrings.standardbaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.photoshop.photoshopStrings.standardbaseline
  - typingsJapgolly.photoshop.photoshopStrings.progressive
  - typingsJapgolly.photoshop.photoshopStrings.optimizedbaseline
*/
trait JPEGFormatOptions extends StObject
object JPEGFormatOptions {
  
  /**
    * Optimized color and a slightly reduced file size.
    */
  inline def OPTIMIZEDBASELINE: optimizedbaseline = "optimizedbaseline".asInstanceOf[optimizedbaseline]
  
  /**
    * Displays a series of increasing detailed scans as the image downloads.
    */
  inline def PROGRESSIVE: progressive = "progressive".asInstanceOf[progressive]
  
  /**
    * Format recognized by most web browsers.
    */
  inline def STANDARDBASELINE: standardbaseline = "standardbaseline".asInstanceOf[standardbaseline]
}
