package typingsJapgolly.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EggGroup extends StObject {
  
  var names: Translations
}
object EggGroup {
  
  inline def apply(names: Translations): EggGroup = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggGroup]
  }
  
  extension [Self <: EggGroup](x: Self) {
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
  }
}
