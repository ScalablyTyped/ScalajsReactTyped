package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icons extends StObject {
  
  var icons: js.UndefOr[`7`] = js.undefined
}
object Icons {
  
  inline def apply(): Icons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icons]
  }
  
  extension [Self <: Icons](x: Self) {
    
    inline def setIcons(value: `7`): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
