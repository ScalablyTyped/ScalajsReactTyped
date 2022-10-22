package typingsJapgolly.next.anon

import typingsJapgolly.next.distServerRenderResultMod.default
import typingsJapgolly.next.distServerSendPayloadMod.PayloadOptions
import typingsJapgolly.next.nextStrings.html
import typingsJapgolly.next.nextStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEtags extends StObject {
  
  var generateEtags: Boolean
  
  var options: js.UndefOr[PayloadOptions] = js.undefined
  
  var poweredByHeader: Boolean
  
  var result: default
  
  var `type`: html | json
}
object GenerateEtags {
  
  inline def apply(generateEtags: Boolean, poweredByHeader: Boolean, result: default, `type`: html | json): GenerateEtags = {
    val __obj = js.Dynamic.literal(generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEtags]
  }
  
  extension [Self <: GenerateEtags](x: Self) {
    
    inline def setGenerateEtags(value: Boolean): Self = StObject.set(x, "generateEtags", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PayloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPoweredByHeader(value: Boolean): Self = StObject.set(x, "poweredByHeader", value.asInstanceOf[js.Any])
    
    inline def setResult(value: default): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: html | json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
