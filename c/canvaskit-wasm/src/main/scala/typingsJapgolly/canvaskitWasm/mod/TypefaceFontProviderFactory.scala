package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypefaceFontProviderFactory extends StObject {
  
  /**
    * Return an empty TypefaceFontProvider
    */
  def Make(): TypefaceFontProvider
}
object TypefaceFontProviderFactory {
  
  inline def apply(Make: CallbackTo[TypefaceFontProvider]): TypefaceFontProviderFactory = {
    val __obj = js.Dynamic.literal(Make = Make.toJsFn)
    __obj.asInstanceOf[TypefaceFontProviderFactory]
  }
  
  extension [Self <: TypefaceFontProviderFactory](x: Self) {
    
    inline def setMake(value: CallbackTo[TypefaceFontProvider]): Self = StObject.set(x, "Make", value.toJsFn)
  }
}
