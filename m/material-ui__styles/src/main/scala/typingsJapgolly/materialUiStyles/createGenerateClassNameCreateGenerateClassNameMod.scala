package typingsJapgolly.materialUiStyles

import typingsJapgolly.jss.mod.GenerateId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGenerateClassNameCreateGenerateClassNameMod {
  
  @JSImport("@material-ui/styles/createGenerateClassName/createGenerateClassName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[GenerateId]
  inline def default(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  trait GenerateClassNameOptions extends StObject {
    
    var disableGlobal: js.UndefOr[Boolean] = js.undefined
    
    var productionPrefix: js.UndefOr[String] = js.undefined
    
    var seed: js.UndefOr[String] = js.undefined
  }
  object GenerateClassNameOptions {
    
    inline def apply(): GenerateClassNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateClassNameOptions]
    }
    
    extension [Self <: GenerateClassNameOptions](x: Self) {
      
      inline def setDisableGlobal(value: Boolean): Self = StObject.set(x, "disableGlobal", value.asInstanceOf[js.Any])
      
      inline def setDisableGlobalUndefined: Self = StObject.set(x, "disableGlobal", js.undefined)
      
      inline def setProductionPrefix(value: String): Self = StObject.set(x, "productionPrefix", value.asInstanceOf[js.Any])
      
      inline def setProductionPrefixUndefined: Self = StObject.set(x, "productionPrefix", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
