package typingsJapgolly.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJSONConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dependencies: js.UndefOr[Record[String, String]] = js.undefined
}
object PackageJSONConfig {
  
  inline def apply(): PackageJSONConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageJSONConfig]
  }
  
  extension [Self <: PackageJSONConfig](x: Self) {
    
    inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
  }
}
