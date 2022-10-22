package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read through the standard web platform APIs.
  *
  * Permissions: `clipboardWrite`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object clipboard {
  
  /** The type of imageData. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.png
  */
  trait SetImageDataImageType extends StObject
  object SetImageDataImageType {
    
    inline def jpeg: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg = "jpeg".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.jpeg]
    
    inline def png: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.png = "png".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.png]
  }
}
