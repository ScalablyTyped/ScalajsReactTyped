package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.mod.AttributeSource.None
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'boolean',   default :boolean | undefined} & {  source :never | undefined} */
trait typebooleandefaultbooleanDefault
  extends StObject
     with None {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: boolean
}
object typebooleandefaultbooleanDefault {
  
  inline def apply(): typebooleandefaultbooleanDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typebooleandefaultbooleanDefault]
  }
  
  extension [Self <: typebooleandefaultbooleanDefault](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
