package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.assetMod.Archive
import typingsJapgolly.pulumiPulumi.assetMod.Asset
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeClosureCodePathsMod {
  
  @JSImport("@pulumi/pulumi/runtime/closure/codePaths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")().asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: Unit,
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: Unit,
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: Unit, extraExcludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  
  trait CodePathOptions extends StObject {
    
    /**
      * Packages to explicitly exclude from the Assets for a serialized closure.  This can be used
      * when clients want to trim down the size of a closure, and they know that some package won't
      * ever actually be needed at runtime, but is still a dependency of some package that is being
      * used at runtime.
      */
    var extraExcludePackages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Extra packages to include when producing the Assets for a serialized closure.  This can be
      * useful if the packages are acquired in a way that the serialization code does not understand.
      * For example, if there was some sort of module that was pulled in based off of a computed
      * string.
      */
    var extraIncludePackages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Local file/directory paths that we always want to include when producing the Assets to be
      * included for a serialized closure.
      */
    var extraIncludePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The resource to log any errors we encounter against.
      */
    var logResource: js.UndefOr[Resource] = js.undefined
  }
  object CodePathOptions {
    
    inline def apply(): CodePathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodePathOptions]
    }
    
    extension [Self <: CodePathOptions](x: Self) {
      
      inline def setExtraExcludePackages(value: js.Array[String]): Self = StObject.set(x, "extraExcludePackages", value.asInstanceOf[js.Any])
      
      inline def setExtraExcludePackagesUndefined: Self = StObject.set(x, "extraExcludePackages", js.undefined)
      
      inline def setExtraExcludePackagesVarargs(value: String*): Self = StObject.set(x, "extraExcludePackages", js.Array(value*))
      
      inline def setExtraIncludePackages(value: js.Array[String]): Self = StObject.set(x, "extraIncludePackages", value.asInstanceOf[js.Any])
      
      inline def setExtraIncludePackagesUndefined: Self = StObject.set(x, "extraIncludePackages", js.undefined)
      
      inline def setExtraIncludePackagesVarargs(value: String*): Self = StObject.set(x, "extraIncludePackages", js.Array(value*))
      
      inline def setExtraIncludePaths(value: js.Array[String]): Self = StObject.set(x, "extraIncludePaths", value.asInstanceOf[js.Any])
      
      inline def setExtraIncludePathsUndefined: Self = StObject.set(x, "extraIncludePaths", js.undefined)
      
      inline def setExtraIncludePathsVarargs(value: String*): Self = StObject.set(x, "extraIncludePaths", js.Array(value*))
      
      inline def setLogResource(value: Resource): Self = StObject.set(x, "logResource", value.asInstanceOf[js.Any])
      
      inline def setLogResourceUndefined: Self = StObject.set(x, "logResource", js.undefined)
    }
  }
}
