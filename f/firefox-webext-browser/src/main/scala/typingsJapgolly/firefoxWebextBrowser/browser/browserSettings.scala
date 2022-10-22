package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browserSettings` API to control global settings of the browser.
  *
  * Permissions: `browserSettings`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserSettings {
  
  /** Color management mode. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.off
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.full
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only
  */
  trait ColorManagementMode extends StObject
  object ColorManagementMode {
    
    inline def full: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.full = "full".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.full]
    
    inline def off: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.off = "off".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.off]
    
    inline def tagged_only: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only = "tagged_only".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tagged_only]
  }
  
  /** After which mouse event context menus should popup. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown
  */
  trait ContextMenuMouseEvent extends StObject
  object ContextMenuMouseEvent {
    
    inline def mousedown: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown = "mousedown".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown]
    
    inline def mouseup: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup = "mouseup".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup]
  }
  
  /* browserSettings types */
  /** How images should be animated in the browser. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
  */
  trait ImageAnimationBehavior extends StObject
  object ImageAnimationBehavior {
    
    inline def none: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = "none".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none]
    
    inline def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    inline def once: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = "once".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.once]
  }
}
