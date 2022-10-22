package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.BuildConfiguration
import typingsJapgolly.expoConfigPlugins.buildIosUtilsXcodeprojMod.NativeTargetSectionEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosTargetMod {
  
  @JSImport("@expo/config-plugins/build/ios/Target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TargetType extends StObject
  @JSImport("@expo/config-plugins/build/ios/Target", "TargetType")
  @js.native
  object TargetType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TargetType & String] = js.native
    
    @js.native
    sealed trait APPLICATION
      extends StObject
         with TargetType
    /* "com.apple.product-type.application" */ val APPLICATION: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.APPLICATION & String = js.native
    
    @js.native
    sealed trait APP_CLIP
      extends StObject
         with TargetType
    /* "com.apple.product-type.application.on-demand-install-capable" */ val APP_CLIP: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.APP_CLIP & String = js.native
    
    @js.native
    sealed trait EXTENSION
      extends StObject
         with TargetType
    /* "com.apple.product-type.app-extension" */ val EXTENSION: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.EXTENSION & String = js.native
    
    @js.native
    sealed trait OTHER
      extends StObject
         with TargetType
    /* "other" */ val OTHER: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.OTHER & String = js.native
    
    @js.native
    sealed trait STICKER_PACK_EXTENSION
      extends StObject
         with TargetType
    /* "com.apple.product-type.app-extension.messages-sticker-pack" */ val STICKER_PACK_EXTENSION: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.STICKER_PACK_EXTENSION & String = js.native
    
    @js.native
    sealed trait WATCH
      extends StObject
         with TargetType
    /* "com.apple.product-type.application.watchapp" */ val WATCH: typingsJapgolly.expoConfigPlugins.buildIosTargetMod.TargetType.WATCH & String = js.native
  }
  
  inline def findApplicationTargetWithDependenciesAsync(projectRoot: String, scheme: String): js.Promise[Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("findApplicationTargetWithDependenciesAsync")(projectRoot.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Target]]
  
  inline def findFirstNativeTarget(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): NativeTargetSectionEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNativeTarget")(project.asInstanceOf[js.Any]).asInstanceOf[NativeTargetSectionEntry]
  
  inline def findNativeTargetByName(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    targetName: String
  ): NativeTargetSectionEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("findNativeTargetByName")(project.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[NativeTargetSectionEntry]
  
  inline def findSignableTargets(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): js.Array[NativeTargetSectionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSignableTargets")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[NativeTargetSectionEntry]]
  
  inline def getNativeTargets(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): js.Array[NativeTargetSectionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeTargets")(project.asInstanceOf[js.Any]).asInstanceOf[js.Array[NativeTargetSectionEntry]]
  
  inline def getXCBuildConfigurationFromPbxproj(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getXCBuildConfigurationFromPbxproj")(project.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null]
  inline def getXCBuildConfigurationFromPbxproj(
    project: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XcodeProject */ Any,
    hasTargetNameBuildConfiguration: BuildConfiguration
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getXCBuildConfigurationFromPbxproj")(project.asInstanceOf[js.Any], hasTargetNameBuildConfiguration.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XCBuildConfiguration */ Any) | Null]
  
  inline def isTargetOfType(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ Any,
    targetType: TargetType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTargetOfType")(target.asInstanceOf[js.Any], targetType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Target extends StObject {
    
    var dependencies: js.UndefOr[js.Array[Target]] = js.undefined
    
    var name: String
    
    var `type`: TargetType
  }
  object Target {
    
    inline def apply(name: String, `type`: TargetType): Target = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setDependencies(value: js.Array[Target]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: Target*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: TargetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
