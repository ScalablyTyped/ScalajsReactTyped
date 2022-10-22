package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFileMatcherMod {
  
  @JSImport("app-builder-lib/out/fileMatcher", "excludedExts")
  @js.native
  val excludedExts: /* "iml,hprof,orig,pyc,pyo,rbc,swp,csproj,sln,suo,xproj,cc,d.ts" */ String = js.native
  
  @JSImport("app-builder-lib/out/fileMatcher", "excludedNames")
  @js.native
  val excludedNames: String = js.native
  
  trait GetFileMatchersOptions extends StObject {
    
    val customBuildOptions: PlatformSpecificBuildOptions
    
    val defaultSrc: String
    
    val globalOutDir: String
    
    def macroExpander(pattern: String): String
  }
  object GetFileMatchersOptions {
    
    inline def apply(
      customBuildOptions: PlatformSpecificBuildOptions,
      defaultSrc: String,
      globalOutDir: String,
      macroExpander: String => String
    ): GetFileMatchersOptions = {
      val __obj = js.Dynamic.literal(customBuildOptions = customBuildOptions.asInstanceOf[js.Any], defaultSrc = defaultSrc.asInstanceOf[js.Any], globalOutDir = globalOutDir.asInstanceOf[js.Any], macroExpander = js.Any.fromFunction1(macroExpander))
      __obj.asInstanceOf[GetFileMatchersOptions]
    }
    
    extension [Self <: GetFileMatchersOptions](x: Self) {
      
      inline def setCustomBuildOptions(value: PlatformSpecificBuildOptions): Self = StObject.set(x, "customBuildOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultSrc(value: String): Self = StObject.set(x, "defaultSrc", value.asInstanceOf[js.Any])
      
      inline def setGlobalOutDir(value: String): Self = StObject.set(x, "globalOutDir", value.asInstanceOf[js.Any])
      
      inline def setMacroExpander(value: String => String): Self = StObject.set(x, "macroExpander", js.Any.fromFunction1(value))
    }
  }
}
