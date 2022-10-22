package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
import typingsJapgolly.materialUiCore.materialUiCoreStrings.regular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variant extends StObject {
  
  var disableGutters: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[regular | dense] = js.undefined
}
object Variant {
  
  inline def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  extension [Self <: Variant](x: Self) {
    
    inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setVariant(value: regular | dense): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
