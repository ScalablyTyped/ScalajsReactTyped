package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/telemetry/events/version.EventCliSessionStarted, 'nextVersion' | 'nodeVersion' | 'hasNextConfig' | 'buildTarget' | 'hasWebpackConfig' | 'hasBabelConfig' | 'basePathEnabled' | 'i18nEnabled' | 'imageEnabled' | 'imageFutureEnabled' | 'locales' | 'localeDomainsCount' | 'localeDetectionEnabled' | 'imageDomainsCount' | 'imageRemotePatternsCount' | 'imageSizes' | 'imageLoader' | 'imageFormats' | 'trailingSlashEnabled' | 'reactStrictMode'> */
trait OmitEventCliSessionStarte extends StObject {
  
  var cliCommand: String
  
  var hasNowJson: Boolean
  
  var isCustomServer: js.UndefOr[Boolean | Null] = js.undefined
  
  var isSrcDir: js.UndefOr[Boolean | Null] = js.undefined
  
  var webpackVersion: js.UndefOr[Double | Null] = js.undefined
}
object OmitEventCliSessionStarte {
  
  inline def apply(cliCommand: String, hasNowJson: Boolean): OmitEventCliSessionStarte = {
    val __obj = js.Dynamic.literal(cliCommand = cliCommand.asInstanceOf[js.Any], hasNowJson = hasNowJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEventCliSessionStarte]
  }
  
  extension [Self <: OmitEventCliSessionStarte](x: Self) {
    
    inline def setCliCommand(value: String): Self = StObject.set(x, "cliCommand", value.asInstanceOf[js.Any])
    
    inline def setHasNowJson(value: Boolean): Self = StObject.set(x, "hasNowJson", value.asInstanceOf[js.Any])
    
    inline def setIsCustomServer(value: Boolean): Self = StObject.set(x, "isCustomServer", value.asInstanceOf[js.Any])
    
    inline def setIsCustomServerNull: Self = StObject.set(x, "isCustomServer", null)
    
    inline def setIsCustomServerUndefined: Self = StObject.set(x, "isCustomServer", js.undefined)
    
    inline def setIsSrcDir(value: Boolean): Self = StObject.set(x, "isSrcDir", value.asInstanceOf[js.Any])
    
    inline def setIsSrcDirNull: Self = StObject.set(x, "isSrcDir", null)
    
    inline def setIsSrcDirUndefined: Self = StObject.set(x, "isSrcDir", js.undefined)
    
    inline def setWebpackVersion(value: Double): Self = StObject.set(x, "webpackVersion", value.asInstanceOf[js.Any])
    
    inline def setWebpackVersionNull: Self = StObject.set(x, "webpackVersion", null)
    
    inline def setWebpackVersionUndefined: Self = StObject.set(x, "webpackVersion", js.undefined)
  }
}
