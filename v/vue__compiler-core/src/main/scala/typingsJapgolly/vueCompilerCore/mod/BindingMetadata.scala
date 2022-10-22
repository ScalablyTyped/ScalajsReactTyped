package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingMetadata
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[BindingTypes]] {
  
  var __isScriptSetup: js.UndefOr[Boolean] = js.undefined
  
  var __propsAliases: js.UndefOr[Record[String, String]] = js.undefined
}
object BindingMetadata {
  
  inline def apply(): BindingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingMetadata]
  }
  
  extension [Self <: BindingMetadata](x: Self) {
    
    inline def set__isScriptSetup(value: Boolean): Self = StObject.set(x, "__isScriptSetup", value.asInstanceOf[js.Any])
    
    inline def set__isScriptSetupUndefined: Self = StObject.set(x, "__isScriptSetup", js.undefined)
    
    inline def set__propsAliases(value: Record[String, String]): Self = StObject.set(x, "__propsAliases", value.asInstanceOf[js.Any])
    
    inline def set__propsAliasesUndefined: Self = StObject.set(x, "__propsAliases", js.undefined)
  }
}
