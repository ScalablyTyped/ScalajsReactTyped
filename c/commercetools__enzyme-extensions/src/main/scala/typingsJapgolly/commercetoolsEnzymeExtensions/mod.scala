package typingsJapgolly.commercetoolsEnzymeExtensions

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.enzyme.mod.EnzymeSelector
import typingsJapgolly.enzyme.mod.ShallowWrapper
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(s: Instantiable1[/* nodes */ js.Array[Element], ShallowWrapper[js.Object, js.Object, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@commercetools/enzyme-extensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object enzymeAugmentingMod {
    
    @js.native
    trait ShallowWrapper[P] extends StObject {
      
      def drill(
        expander: js.Function1[
              /* props */ Any, 
              typingsJapgolly.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[js.Object]
            ]
      ): typingsJapgolly.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
      
      def until(selector: EnzymeSelector): typingsJapgolly.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
      def until(selector: EnzymeSelector, options: UntilOptions): typingsJapgolly.commercetoolsEnzymeExtensions.mod.enzymeAugmentingMod.ShallowWrapper[P] = js.native
    }
    
    trait UntilOptions extends StObject {
      
      var maxDepth: Double
    }
    object UntilOptions {
      
      inline def apply(maxDepth: Double): UntilOptions = {
        val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
        __obj.asInstanceOf[UntilOptions]
      }
      
      extension [Self <: UntilOptions](x: Self) {
        
        inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      }
    }
  }
}
