package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.maplibreGlStrings.formatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedTypeT
  extends StObject
     with Type {
  
  var kind: formatted
}
object FormattedTypeT {
  
  inline def apply(): FormattedTypeT = {
    val __obj = js.Dynamic.literal(kind = "formatted")
    __obj.asInstanceOf[FormattedTypeT]
  }
  
  extension [Self <: FormattedTypeT](x: Self) {
    
    inline def setKind(value: formatted): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
