package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionConfig extends StObject {
  
  /**
    * Controls whether expanding an item will cause the other items to close.
    *
    * @default true
    */
  var closeOthers: js.UndefOr[Boolean] = js.undefined
}
object IAccordionConfig {
  
  inline def apply(): IAccordionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionConfig]
  }
  
  extension [Self <: IAccordionConfig](x: Self) {
    
    inline def setCloseOthers(value: Boolean): Self = StObject.set(x, "closeOthers", value.asInstanceOf[js.Any])
    
    inline def setCloseOthersUndefined: Self = StObject.set(x, "closeOthers", js.undefined)
  }
}
