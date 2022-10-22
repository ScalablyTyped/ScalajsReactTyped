package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosPathsMod {
  
  @JSImport("@expo/config-plugins/build/ios/Paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSchemeNames(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemeNames")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def findSchemePaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSchemePaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAllEntitlementsPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllEntitlementsPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAllInfoPlistPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllInfoPlistPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAllPBXProjectPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllPBXProjectPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAllXcodeProjectPaths(projectRoot: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllXcodeProjectPaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getAppDelegate(projectRoot: String): AppDelegateProjectFile = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegate")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[AppDelegateProjectFile]
  
  inline def getAppDelegateFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAppDelegateHeaderFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateHeaderFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAppDelegateObjcHeaderFilePath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppDelegateObjcHeaderFilePath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEntitlementsPath(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntitlementsPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getExpoPlistPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpoPlistPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFileInfo(filePath: String): Language = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(filePath.asInstanceOf[js.Any]).asInstanceOf[Language]
  
  inline def getInfoPlistPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfoPlistPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPBXProjectPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPBXProjectPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSourceRoot(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSupportingPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportingPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getXcodeProjectPath(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getXcodeProjectPath")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AppDelegateProjectFile = ProjectFile[AppleLanguage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objc
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objcpp
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.swift
  */
  trait AppleLanguage extends StObject
  object AppleLanguage {
    
    inline def objc: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objc = "objc".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objc]
    
    inline def objcpp: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objcpp = "objcpp".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.objcpp]
    
    inline def swift: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.swift = "swift".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.swift]
  }
  
  trait ProjectFile[L /* <: String */] extends StObject {
    
    var contents: String
    
    var language: L
    
    var path: String
  }
  object ProjectFile {
    
    inline def apply[L /* <: String */](contents: String, language: L, path: String): ProjectFile[L] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectFile[L]]
    }
    
    extension [Self <: ProjectFile[?], L /* <: String */](x: Self & ProjectFile[L]) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: L): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
