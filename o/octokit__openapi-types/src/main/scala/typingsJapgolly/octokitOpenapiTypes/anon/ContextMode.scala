package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.gfm
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.markdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMode extends StObject {
  
  /** @description The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository. */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * @description The rendering mode.
    * @default markdown
    * @example markdown
    * @enum {string}
    */
  var mode: js.UndefOr[markdown | gfm] = js.undefined
  
  /** @description The Markdown text to render in HTML. */
  var text: String
}
object ContextMode {
  
  inline def apply(text: String): ContextMode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMode]
  }
  
  extension [Self <: ContextMode](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setMode(value: markdown | gfm): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
