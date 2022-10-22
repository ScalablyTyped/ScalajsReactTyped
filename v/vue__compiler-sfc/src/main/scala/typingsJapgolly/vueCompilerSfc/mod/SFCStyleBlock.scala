package typingsJapgolly.vueCompilerSfc.mod

import typingsJapgolly.std.Record
import typingsJapgolly.vueCompilerCore.mod.SourceLocation
import typingsJapgolly.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typingsJapgolly.vueCompilerSfc.vueCompilerSfcStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCStyleBlock
  extends StObject
     with SFCBlock {
  
  var module: js.UndefOr[String | Boolean] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_SFCStyleBlock: style
}
object SFCStyleBlock {
  
  inline def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation): SFCStyleBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("style")
    __obj.asInstanceOf[SFCStyleBlock]
  }
  
  extension [Self <: SFCStyleBlock](x: Self) {
    
    inline def setModule(value: String | Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setType(value: style): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
