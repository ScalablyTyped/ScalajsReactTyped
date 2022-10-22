package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.distServerConfigSharedMod.NextConfigComplete
import typingsJapgolly.next.nextStrings.app
import typingsJapgolly.next.nextStrings.pages
import typingsJapgolly.next.nextStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDirLoader extends StObject {
  
  var absolutePagePath: String
  
  var appDirLoader: js.UndefOr[String] = js.undefined
  
  var buildId: String
  
  var bundlePath: String
  
  var config: NextConfigComplete
  
  var isDev: Boolean
  
  var isServerComponent: Boolean
  
  var middleware: js.UndefOr[PartialMiddlewareConfig] = js.undefined
  
  var page: String
  
  var pages: StringDictionary[String]
  
  var pagesType: js.UndefOr[app | pages | root] = js.undefined
  
  var rootDir: String
}
object AppDirLoader {
  
  inline def apply(
    absolutePagePath: String,
    buildId: String,
    bundlePath: String,
    config: NextConfigComplete,
    isDev: Boolean,
    isServerComponent: Boolean,
    page: String,
    pages: StringDictionary[String],
    rootDir: String
  ): AppDirLoader = {
    val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], bundlePath = bundlePath.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], isDev = isDev.asInstanceOf[js.Any], isServerComponent = isServerComponent.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDirLoader]
  }
  
  extension [Self <: AppDirLoader](x: Self) {
    
    inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
    
    inline def setAppDirLoader(value: String): Self = StObject.set(x, "appDirLoader", value.asInstanceOf[js.Any])
    
    inline def setAppDirLoaderUndefined: Self = StObject.set(x, "appDirLoader", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBundlePath(value: String): Self = StObject.set(x, "bundlePath", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setIsDev(value: Boolean): Self = StObject.set(x, "isDev", value.asInstanceOf[js.Any])
    
    inline def setIsServerComponent(value: Boolean): Self = StObject.set(x, "isServerComponent", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: PartialMiddlewareConfig): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPages(value: StringDictionary[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesType(value: app | pages | root): Self = StObject.set(x, "pagesType", value.asInstanceOf[js.Any])
    
    inline def setPagesTypeUndefined: Self = StObject.set(x, "pagesType", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
