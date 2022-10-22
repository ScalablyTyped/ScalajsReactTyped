package typingsJapgolly.expressValidator.srcOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIntOptions
  extends StObject
     with MinMaxExtendedOptions {
  
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined
}
object IsIntOptions {
  
  inline def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  
  extension [Self <: IsIntOptions](x: Self) {
    
    inline def setAllow_leading_zeroes(value: Boolean): Self = StObject.set(x, "allow_leading_zeroes", value.asInstanceOf[js.Any])
    
    inline def setAllow_leading_zeroesUndefined: Self = StObject.set(x, "allow_leading_zeroes", js.undefined)
  }
}
