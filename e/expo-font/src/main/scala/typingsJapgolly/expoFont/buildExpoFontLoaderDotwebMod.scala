package typingsJapgolly.expoFont

import typingsJapgolly.expoFont.buildFontDottypesMod.FontResource
import typingsJapgolly.expoFont.buildFontDottypesMod.UnloadFontOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoFontLoaderDotwebMod {
  
  object default {
    
    @JSImport("expo-font/build/ExpoFontLoader.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def loadAsync(fontFamilyName: String, resource: FontResource): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(fontFamilyName.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("expo-font/build/ExpoFontLoader.web", "default.name")
    @js.native
    val name: String = js.native
    
    inline def unloadAllAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAllAsync")().asInstanceOf[js.Promise[Unit]]
    
    inline def unloadAsync(fontFamilyName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def unloadAsync(fontFamilyName: String, options: UnloadFontOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unloadAsync")(fontFamilyName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
