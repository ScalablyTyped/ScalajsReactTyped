package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.Debug
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.Release
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetName extends StObject {
  
  var buildConfiguration: js.UndefOr[String | Release | Debug] = js.undefined
  
  var targetName: js.UndefOr[String] = js.undefined
}
object TargetName {
  
  inline def apply(): TargetName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetName]
  }
  
  extension [Self <: TargetName](x: Self) {
    
    inline def setBuildConfiguration(value: String | Release | Debug): Self = StObject.set(x, "buildConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBuildConfigurationUndefined: Self = StObject.set(x, "buildConfiguration", js.undefined)
    
    inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
  }
}
