package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationScalarHandle
  extends StObject
     with NormalizationHandle {
  
  // "ScalarHandle";
  val alias: js.UndefOr[String | Null] = js.undefined
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  // NOTE: this property is optional because it's expected to be rarely used
  val dynamicKey: js.UndefOr[NormalizationArgument | Null] = js.undefined
  
  val filters: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  val handle: String
  
  val handleArgs: js.UndefOr[js.Array[NormalizationArgument]] = js.undefined
  
  val key: String
  
  val kind: String
  
  val name: String
}
object NormalizationScalarHandle {
  
  inline def apply(handle: String, key: String, kind: String, name: String): NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationScalarHandle]
  }
  
  extension [Self <: NormalizationScalarHandle](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDynamicKey(value: NormalizationArgument): Self = StObject.set(x, "dynamicKey", value.asInstanceOf[js.Any])
    
    inline def setDynamicKeyNull: Self = StObject.set(x, "dynamicKey", null)
    
    inline def setDynamicKeyUndefined: Self = StObject.set(x, "dynamicKey", js.undefined)
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "handleArgs", value.asInstanceOf[js.Any])
    
    inline def setHandleArgsUndefined: Self = StObject.set(x, "handleArgs", js.undefined)
    
    inline def setHandleArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "handleArgs", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
