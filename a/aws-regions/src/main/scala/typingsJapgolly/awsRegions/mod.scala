package typingsJapgolly.awsRegions

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aws-regions", JSImport.Namespace)
  @js.native
  val ^ : AwsRegions = js.native
  
  trait AwsRegionInfo extends StObject {
    
    var code: String
    
    var full_name: String
    
    var name: String
    
    var public: Boolean
    
    var zones: js.Array[String]
  }
  object AwsRegionInfo {
    
    inline def apply(code: String, full_name: String, name: String, public: Boolean, zones: js.Array[String]): AwsRegionInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsRegionInfo]
    }
    
    extension [Self <: AwsRegionInfo](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
      
      inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
    }
  }
  
  @js.native
  trait AwsRegions extends StObject {
    
    def list(): js.Array[AwsRegionInfo] = js.native
    def list(options: ListOptions): js.Array[AwsRegionInfo] = js.native
    
    def lookup(options: LookupOptions): AwsRegionInfo = js.native
  }
  
  trait ListOptions extends StObject {
    
    var public: js.UndefOr[Boolean] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsRegions.mod.LookupOptionsCode
    - typingsJapgolly.awsRegions.mod.LookupOptionsName
  */
  trait LookupOptions extends StObject
  object LookupOptions {
    
    inline def LookupOptionsCode(code: String): typingsJapgolly.awsRegions.mod.LookupOptionsCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsRegions.mod.LookupOptionsCode]
    }
    
    inline def LookupOptionsName(name: String): typingsJapgolly.awsRegions.mod.LookupOptionsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsRegions.mod.LookupOptionsName]
    }
  }
  
  trait LookupOptionsCode
    extends StObject
       with LookupOptions {
    
    var code: String
  }
  object LookupOptionsCode {
    
    inline def apply(code: String): LookupOptionsCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptionsCode]
    }
    
    extension [Self <: LookupOptionsCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait LookupOptionsName
    extends StObject
       with LookupOptions {
    
    var name: String
  }
  object LookupOptionsName {
    
    inline def apply(name: String): LookupOptionsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptionsName]
    }
    
    extension [Self <: LookupOptionsName](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AwsRegions
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AwsRegions = ^
}
