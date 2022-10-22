package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.anon.RequiredElectronBrandingO
import typingsJapgolly.appBuilderLib.mod.Packager
import typingsJapgolly.appBuilderLib.outConfigurationMod.Configuration
import typingsJapgolly.appBuilderLib.outFrameworkMod.Framework
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outElectronElectronFrameworkMod {
  
  @JSImport("app-builder-lib/out/electron/ElectronFramework", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBrandingOpts(opts: Configuration): RequiredElectronBrandingO = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrandingOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[RequiredElectronBrandingO]
  
  inline def createElectronFrameworkSupport(configuration: Configuration, packager: Packager): js.Promise[Framework] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElectronFrameworkSupport")(configuration.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Framework]]
  
  trait ElectronBrandingOptions extends StObject {
    
    var productName: js.UndefOr[String] = js.undefined
    
    var projectName: js.UndefOr[String] = js.undefined
  }
  object ElectronBrandingOptions {
    
    inline def apply(): ElectronBrandingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronBrandingOptions]
    }
    
    extension [Self <: ElectronBrandingOptions](x: Self) {
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
      
      inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    }
  }
  
  trait ElectronDownloadOptions extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    /**
      * The [cache location](https://github.com/electron-userland/electron-download#cache-location).
      */
    var cache: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    var customDir: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    var customFilename: js.UndefOr[String | Null] = js.undefined
    
    var isVerifyChecksum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mirror.
      */
    var mirror: js.UndefOr[String | Null] = js.undefined
    
    var platform: js.UndefOr[ElectronPlatformName] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ElectronDownloadOptions {
    
    inline def apply(): ElectronDownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronDownloadOptions]
    }
    
    extension [Self <: ElectronDownloadOptions](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheNull: Self = StObject.set(x, "cache", null)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCustomDir(value: String): Self = StObject.set(x, "customDir", value.asInstanceOf[js.Any])
      
      inline def setCustomDirNull: Self = StObject.set(x, "customDir", null)
      
      inline def setCustomDirUndefined: Self = StObject.set(x, "customDir", js.undefined)
      
      inline def setCustomFilename(value: String): Self = StObject.set(x, "customFilename", value.asInstanceOf[js.Any])
      
      inline def setCustomFilenameNull: Self = StObject.set(x, "customFilename", null)
      
      inline def setCustomFilenameUndefined: Self = StObject.set(x, "customFilename", js.undefined)
      
      inline def setIsVerifyChecksum(value: Boolean): Self = StObject.set(x, "isVerifyChecksum", value.asInstanceOf[js.Any])
      
      inline def setIsVerifyChecksumUndefined: Self = StObject.set(x, "isVerifyChecksum", js.undefined)
      
      inline def setMirror(value: String): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      inline def setMirrorNull: Self = StObject.set(x, "mirror", null)
      
      inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      inline def setPlatform(value: ElectronPlatformName): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.darwin
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.linux
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.win32
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.mas
  */
  trait ElectronPlatformName extends StObject
  object ElectronPlatformName {
    
    inline def darwin: typingsJapgolly.appBuilderLib.appBuilderLibStrings.darwin = "darwin".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.darwin]
    
    inline def linux: typingsJapgolly.appBuilderLib.appBuilderLibStrings.linux = "linux".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.linux]
    
    inline def mas: typingsJapgolly.appBuilderLib.appBuilderLibStrings.mas = "mas".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.mas]
    
    inline def win32: typingsJapgolly.appBuilderLib.appBuilderLibStrings.win32 = "win32".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.win32]
  }
}
