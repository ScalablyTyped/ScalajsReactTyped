package typingsJapgolly.datadogNativeAppsec

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: StringDictionary[js.Array[String]]
    
    var failed: Double
    
    var loaded: Double
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Errors {
    
    inline def apply(errors: StringDictionary[js.Array[String]], failed: Double, loaded: Double): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
  }
  object Major {
    
    inline def apply(major: Double, minor: Double, patch: Double): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    extension [Self <: Major](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObfuscatorKeyRegex extends StObject {
    
    var obfuscatorKeyRegex: js.UndefOr[String] = js.undefined
    
    var obfuscatorValueRegex: js.UndefOr[String] = js.undefined
  }
  object ObfuscatorKeyRegex {
    
    inline def apply(): ObfuscatorKeyRegex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObfuscatorKeyRegex]
    }
    
    extension [Self <: ObfuscatorKeyRegex](x: Self) {
      
      inline def setObfuscatorKeyRegex(value: String): Self = StObject.set(x, "obfuscatorKeyRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorKeyRegexUndefined: Self = StObject.set(x, "obfuscatorKeyRegex", js.undefined)
      
      inline def setObfuscatorValueRegex(value: String): Self = StObject.set(x, "obfuscatorValueRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorValueRegexUndefined: Self = StObject.set(x, "obfuscatorValueRegex", js.undefined)
    }
  }
}
