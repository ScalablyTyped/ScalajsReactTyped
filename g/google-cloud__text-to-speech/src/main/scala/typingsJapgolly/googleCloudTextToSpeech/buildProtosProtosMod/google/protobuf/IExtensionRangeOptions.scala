package typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExtensionRangeOptions. */
trait IExtensionRangeOptions extends StObject {
  
  /** ExtensionRangeOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}
object IExtensionRangeOptions {
  
  inline def apply(): IExtensionRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtensionRangeOptions]
  }
  
  extension [Self <: IExtensionRangeOptions](x: Self) {
    
    inline def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
