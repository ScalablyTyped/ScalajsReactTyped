package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.Noop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noop_
  extends StObject
     with BaseNode
     with Miscellaneous
     with Node {
  
  @JSName("type")
  var type_Noop_ : Noop
}
object Noop_ {
  
  inline def apply(): Noop_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[Noop_]
  }
  
  extension [Self <: Noop_](x: Self) {
    
    inline def setType(value: Noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
