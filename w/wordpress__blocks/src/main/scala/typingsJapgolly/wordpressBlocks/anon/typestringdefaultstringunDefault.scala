package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.mod.AttributeSource.None
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'string',   default :string | undefined} & {  source :never | undefined} */
trait typestringdefaultstringunDefault
  extends StObject
     with None {
  
  var default: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: string
}
object typestringdefaultstringunDefault {
  
  inline def apply(): typestringdefaultstringunDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typestringdefaultstringunDefault]
  }
  
  extension [Self <: typestringdefaultstringunDefault](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
