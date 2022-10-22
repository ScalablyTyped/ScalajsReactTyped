package typingsJapgolly.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page; defaults to
  * <code>automatic</code>.
  *
  * "automatic": Zoom changes are handled automatically by the browser.
  * "manual": Overrides the automatic handling of zoom changes. The <code>onZoomChange</code> event will still be dispatched,
  * and it is the responsibility of the extension to listen for this event and manually scale the page.
  * This mode does not support <code>per-origin</code> zooming, and will thus ignore the <code>scope</code>
  * zoom setting and assume <code>per-tab</code>.
  * "disabled": Disables all zooming in the tab. The tab will revert to the default zoom level,
  * and all attempted zoom changes will be ignored.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.automatic
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.manual
  - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disabled
*/
trait ZoomSettingsMode extends StObject
object ZoomSettingsMode {
  
  inline def automatic: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.automatic = "automatic".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.automatic]
  
  inline def disabled: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.disabled]
  
  inline def manual: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.manual = "manual".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.manual]
}
