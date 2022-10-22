package typingsJapgolly.expoModulesAutolinking

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoModulesAutolinking.anon.AppDelegateSubscribers
import typingsJapgolly.expoModulesAutolinking.anon.GradlePath
import typingsJapgolly.expoModulesAutolinking.buildExpoModuleConfigMod.ExpoModuleConfig
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait GenerateOptions
    extends StObject
       with ResolveOptions {
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var target: String
  }
  object GenerateOptions {
    
    inline def apply(platform: SupportedPlatform, searchPaths: js.Array[String], target: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], searchPaths = searchPaths.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleAndroidProjectInfo extends StObject {
    
    var name: String
    
    var sourceDir: String
  }
  object ModuleAndroidProjectInfo {
    
    inline def apply(name: String, sourceDir: String): ModuleAndroidProjectInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleAndroidProjectInfo]
    }
    
    extension [Self <: ModuleAndroidProjectInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSourceDir(value: String): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorAndroid
    - typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorIos
  */
  trait ModuleDescriptor extends StObject
  object ModuleDescriptor {
    
    inline def ModuleDescriptorAndroid(modules: js.Array[String], packageName: String, projects: js.Array[ModuleAndroidProjectInfo]): typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorAndroid = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorAndroid]
    }
    
    inline def ModuleDescriptorIos(
      appDelegateSubscribers: js.Array[String],
      debugOnly: Boolean,
      modules: js.Array[String],
      packageName: String,
      pods: js.Array[ModuleIosPodspecInfo],
      reactDelegateHandlers: js.Array[String],
      swiftModuleNames: js.Array[String]
    ): typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorIos = {
      val __obj = js.Dynamic.literal(appDelegateSubscribers = appDelegateSubscribers.asInstanceOf[js.Any], debugOnly = debugOnly.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], reactDelegateHandlers = reactDelegateHandlers.asInstanceOf[js.Any], swiftModuleNames = swiftModuleNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.expoModulesAutolinking.buildTypesMod.ModuleDescriptorIos]
    }
  }
  
  trait ModuleDescriptorAndroid
    extends StObject
       with ModuleDescriptor {
    
    var modules: js.Array[String]
    
    var packageName: String
    
    var projects: js.Array[ModuleAndroidProjectInfo]
  }
  object ModuleDescriptorAndroid {
    
    inline def apply(modules: js.Array[String], packageName: String, projects: js.Array[ModuleAndroidProjectInfo]): ModuleDescriptorAndroid = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleDescriptorAndroid]
    }
    
    extension [Self <: ModuleDescriptorAndroid](x: Self) {
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: js.Array[ModuleAndroidProjectInfo]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: ModuleAndroidProjectInfo*): Self = StObject.set(x, "projects", js.Array(value*))
    }
  }
  
  trait ModuleDescriptorIos
    extends StObject
       with ModuleDescriptor {
    
    var appDelegateSubscribers: js.Array[String]
    
    var debugOnly: Boolean
    
    var flags: js.UndefOr[Record[String, Any]] = js.undefined
    
    var modules: js.Array[String]
    
    var packageName: String
    
    var pods: js.Array[ModuleIosPodspecInfo]
    
    var reactDelegateHandlers: js.Array[String]
    
    var swiftModuleNames: js.Array[String]
  }
  object ModuleDescriptorIos {
    
    inline def apply(
      appDelegateSubscribers: js.Array[String],
      debugOnly: Boolean,
      modules: js.Array[String],
      packageName: String,
      pods: js.Array[ModuleIosPodspecInfo],
      reactDelegateHandlers: js.Array[String],
      swiftModuleNames: js.Array[String]
    ): ModuleDescriptorIos = {
      val __obj = js.Dynamic.literal(appDelegateSubscribers = appDelegateSubscribers.asInstanceOf[js.Any], debugOnly = debugOnly.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], reactDelegateHandlers = reactDelegateHandlers.asInstanceOf[js.Any], swiftModuleNames = swiftModuleNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleDescriptorIos]
    }
    
    extension [Self <: ModuleDescriptorIos](x: Self) {
      
      inline def setAppDelegateSubscribers(value: js.Array[String]): Self = StObject.set(x, "appDelegateSubscribers", value.asInstanceOf[js.Any])
      
      inline def setAppDelegateSubscribersVarargs(value: String*): Self = StObject.set(x, "appDelegateSubscribers", js.Array(value*))
      
      inline def setDebugOnly(value: Boolean): Self = StObject.set(x, "debugOnly", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Record[String, Any]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPods(value: js.Array[ModuleIosPodspecInfo]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
      
      inline def setPodsVarargs(value: ModuleIosPodspecInfo*): Self = StObject.set(x, "pods", js.Array(value*))
      
      inline def setReactDelegateHandlers(value: js.Array[String]): Self = StObject.set(x, "reactDelegateHandlers", value.asInstanceOf[js.Any])
      
      inline def setReactDelegateHandlersVarargs(value: String*): Self = StObject.set(x, "reactDelegateHandlers", js.Array(value*))
      
      inline def setSwiftModuleNames(value: js.Array[String]): Self = StObject.set(x, "swiftModuleNames", value.asInstanceOf[js.Any])
      
      inline def setSwiftModuleNamesVarargs(value: String*): Self = StObject.set(x, "swiftModuleNames", js.Array(value*))
    }
  }
  
  trait ModuleIosPodspecInfo extends StObject {
    
    var podName: String
    
    var podspecDir: String
  }
  object ModuleIosPodspecInfo {
    
    inline def apply(podName: String, podspecDir: String): ModuleIosPodspecInfo = {
      val __obj = js.Dynamic.literal(podName = podName.asInstanceOf[js.Any], podspecDir = podspecDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleIosPodspecInfo]
    }
    
    extension [Self <: ModuleIosPodspecInfo](x: Self) {
      
      inline def setPodName(value: String): Self = StObject.set(x, "podName", value.asInstanceOf[js.Any])
      
      inline def setPodspecDir(value: String): Self = StObject.set(x, "podspecDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait PackageRevision extends StObject {
    
    var config: js.UndefOr[ExpoModuleConfig] = js.undefined
    
    var duplicates: js.UndefOr[js.Array[PackageRevision]] = js.undefined
    
    var path: String
    
    var version: String
  }
  object PackageRevision {
    
    inline def apply(path: String, version: String): PackageRevision = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageRevision]
    }
    
    extension [Self <: PackageRevision](x: Self) {
      
      inline def setConfig(value: ExpoModuleConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDuplicates(value: js.Array[PackageRevision]): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setDuplicatesVarargs(value: PackageRevision*): Self = StObject.set(x, "duplicates", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PatchReactImportsOptions extends StObject {
    
    var dryRun: Boolean
    
    var podsRoot: String
  }
  object PatchReactImportsOptions {
    
    inline def apply(dryRun: Boolean, podsRoot: String): PatchReactImportsOptions = {
      val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], podsRoot = podsRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchReactImportsOptions]
    }
    
    extension [Self <: PatchReactImportsOptions](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setPodsRoot(value: String): Self = StObject.set(x, "podsRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawExpoModuleConfig extends StObject {
    
    /**
      * Android-specific config.
      */
    var android: js.UndefOr[GradlePath] = js.undefined
    
    /**
      * iOS-specific config.
      */
    var ios: js.UndefOr[AppDelegateSubscribers] = js.undefined
    
    /**
      * An array of supported platforms.
      */
    var platforms: js.UndefOr[js.Array[SupportedPlatform]] = js.undefined
  }
  object RawExpoModuleConfig {
    
    inline def apply(): RawExpoModuleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawExpoModuleConfig]
    }
    
    extension [Self <: RawExpoModuleConfig](x: Self) {
      
      inline def setAndroid(value: GradlePath): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setIos(value: AppDelegateSubscribers): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setPlatforms(value: js.Array[SupportedPlatform]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: SupportedPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
    }
  }
  
  trait ResolveOptions
    extends StObject
       with SearchOptions {
    
    var json: js.UndefOr[Boolean] = js.undefined
  }
  object ResolveOptions {
    
    inline def apply(platform: SupportedPlatform, searchPaths: js.Array[String]): ResolveOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], searchPaths = searchPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveOptions]
    }
    
    extension [Self <: ResolveOptions](x: Self) {
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait SearchOptions extends StObject {
    
    var exclude: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var flags: js.UndefOr[Record[String, Any]] = js.undefined
    
    var ignorePaths: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var nativeModulesDir: js.UndefOr[String | Null] = js.undefined
    
    var platform: SupportedPlatform
    
    var searchPaths: js.Array[String]
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(platform: SupportedPlatform, searchPaths: js.Array[String]): SearchOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], searchPaths = searchPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFlags(value: Record[String, Any]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setIgnorePaths(value: js.Array[String]): Self = StObject.set(x, "ignorePaths", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathsNull: Self = StObject.set(x, "ignorePaths", null)
      
      inline def setIgnorePathsUndefined: Self = StObject.set(x, "ignorePaths", js.undefined)
      
      inline def setIgnorePathsVarargs(value: String*): Self = StObject.set(x, "ignorePaths", js.Array(value*))
      
      inline def setNativeModulesDir(value: String): Self = StObject.set(x, "nativeModulesDir", value.asInstanceOf[js.Any])
      
      inline def setNativeModulesDirNull: Self = StObject.set(x, "nativeModulesDir", null)
      
      inline def setNativeModulesDirUndefined: Self = StObject.set(x, "nativeModulesDir", js.undefined)
      
      inline def setPlatform(value: SupportedPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSearchPaths(value: js.Array[String]): Self = StObject.set(x, "searchPaths", value.asInstanceOf[js.Any])
      
      inline def setSearchPathsVarargs(value: String*): Self = StObject.set(x, "searchPaths", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type SearchResults = StringDictionary[PackageRevision]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.ios
    - typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.android
    - typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.web
  */
  trait SupportedPlatform extends StObject
  object SupportedPlatform {
    
    inline def android: typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.android = "android".asInstanceOf[typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.android]
    
    inline def ios: typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.ios = "ios".asInstanceOf[typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.ios]
    
    inline def web: typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.web = "web".asInstanceOf[typingsJapgolly.expoModulesAutolinking.expoModulesAutolinkingStrings.web]
  }
}
