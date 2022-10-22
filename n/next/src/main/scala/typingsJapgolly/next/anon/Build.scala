package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var app: js.UndefOr[
    typingsJapgolly.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest
  ] = js.undefined
  
  var build: typingsJapgolly.next.distServerGetPageFilesMod.BuildManifest
}
object Build {
  
  inline def apply(build: typingsJapgolly.next.distServerGetPageFilesMod.BuildManifest): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setApp(value: typingsJapgolly.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setBuild(value: typingsJapgolly.next.distServerGetPageFilesMod.BuildManifest): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
  }
}
