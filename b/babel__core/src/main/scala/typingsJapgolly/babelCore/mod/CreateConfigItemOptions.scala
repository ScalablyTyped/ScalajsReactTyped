package typingsJapgolly.babelCore.mod

import typingsJapgolly.babelCore.babelCoreStrings.plugin
import typingsJapgolly.babelCore.babelCoreStrings.preset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigItemOptions extends StObject {
  
  var dirname: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[preset | plugin] = js.undefined
}
object CreateConfigItemOptions {
  
  inline def apply(): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
  
  extension [Self <: CreateConfigItemOptions](x: Self) {
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    inline def setType(value: preset | plugin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
