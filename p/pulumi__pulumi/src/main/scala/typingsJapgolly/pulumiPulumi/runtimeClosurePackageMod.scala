package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeClosurePackageMod {
  
  @JSImport("@pulumi/pulumi/runtime/closure/package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleFromPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getModuleFromPath(path: String, packageDefinition: Unit, opts: RequireOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFromPath")(path.asInstanceOf[js.Any], packageDefinition.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getModuleFromPath(path: String, packageDefinition: PackageDefinition): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFromPath")(path.asInstanceOf[js.Any], packageDefinition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getModuleFromPath(path: String, packageDefinition: PackageDefinition, opts: RequireOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleFromPath")(path.asInstanceOf[js.Any], packageDefinition.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Exports = String | StringDictionary[SubExports]
  
  trait PackageDefinition extends StObject {
    
    var exports: js.UndefOr[Exports] = js.undefined
    
    var name: String
  }
  object PackageDefinition {
    
    inline def apply(name: String): PackageDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDefinition]
    }
    
    extension [Self <: PackageDefinition](x: Self) {
      
      inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequireOpts extends StObject {
    
    var isImport: js.UndefOr[Boolean] = js.undefined
    
    var isRequire: js.UndefOr[Boolean] = js.undefined
  }
  object RequireOpts {
    
    inline def apply(): RequireOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireOpts]
    }
    
    extension [Self <: RequireOpts](x: Self) {
      
      inline def setIsImport(value: Boolean): Self = StObject.set(x, "isImport", value.asInstanceOf[js.Any])
      
      inline def setIsImportUndefined: Self = StObject.set(x, "isImport", js.undefined)
      
      inline def setIsRequire(value: Boolean): Self = StObject.set(x, "isRequire", value.asInstanceOf[js.Any])
      
      inline def setIsRequireUndefined: Self = StObject.set(x, "isRequire", js.undefined)
    }
  }
  
  type SubExports = String | StringDictionary[Any] | Null
}
