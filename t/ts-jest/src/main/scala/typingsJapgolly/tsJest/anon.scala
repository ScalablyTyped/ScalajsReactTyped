package typingsJapgolly.tsJest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.typescript.mod.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Dictk {
    
    inline def apply(): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictk]
    }
    
    extension [Self <: Dictk](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreCodes: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var warnOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIgnoreCodes(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "ignoreCodes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCodesUndefined: Self = StObject.set(x, "ignoreCodes", js.undefined)
      
      inline def setIgnoreCodesVarargs(value: (Double | String)*): Self = StObject.set(x, "ignoreCodes", js.Array(value*))
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setWarnOnly(value: Boolean): Self = StObject.set(x, "warnOnly", value.asInstanceOf[js.Any])
      
      inline def setWarnOnlyUndefined: Self = StObject.set(x, "warnOnly", js.undefined)
    }
  }
  
  trait NodeResolve extends StObject {
    
    var nodeResolve: js.UndefOr[Boolean] = js.undefined
    
    var throwIfMissing: js.UndefOr[Boolean] = js.undefined
  }
  object NodeResolve {
    
    inline def apply(): NodeResolve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeResolve]
    }
    
    extension [Self <: NodeResolve](x: Self) {
      
      inline def setNodeResolve(value: Boolean): Self = StObject.set(x, "nodeResolve", value.asInstanceOf[js.Any])
      
      inline def setNodeResolveUndefined: Self = StObject.set(x, "nodeResolve", js.undefined)
      
      inline def setThrowIfMissing(value: Boolean): Self = StObject.set(x, "throwIfMissing", value.asInstanceOf[js.Any])
      
      inline def setThrowIfMissingUndefined: Self = StObject.set(x, "throwIfMissing", js.undefined)
    }
  }
  
  trait Prefix extends StObject {
    
    var prefix: String
  }
  object Prefix {
    
    inline def apply(prefix: String): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    extension [Self <: Prefix](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofScriptSnapshot extends StObject {
    
    def fromString(text: String): IScriptSnapshot
  }
  object TypeofScriptSnapshot {
    
    inline def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshot = {
      val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
      __obj.asInstanceOf[TypeofScriptSnapshot]
    }
    
    extension [Self <: TypeofScriptSnapshot](x: Self) {
      
      inline def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
    }
  }
}
