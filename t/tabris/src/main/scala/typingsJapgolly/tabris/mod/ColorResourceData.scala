package typingsJapgolly.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<keyof Resources, tabris.tabris.Selectable<tabris.tabris.ColorValue>> */
trait ColorResourceData[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Color} */ js.Any */] extends StObject {
  
  var build: Selectable[ColorValue]
  
  var constructor: Selectable[ColorValue]
}
object ColorResourceData {
  
  inline def apply[Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Color} */ js.Any */](): ColorResourceData[Resources] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorResourceData[Resources]]
  }
  
  extension [Self <: ColorResourceData[?], Resources /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof Resources ]: tabris.tabris.Color} */ js.Any */](x: Self & ColorResourceData[Resources]) {
    
    inline def setBuild(value: Selectable[ColorValue]): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildNull: Self = StObject.set(x, "build", null)
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setConstructor(value: Selectable[ColorValue]): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setConstructorNull: Self = StObject.set(x, "constructor", null)
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
  }
}
