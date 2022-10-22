package typingsJapgolly.materialUiCore

import typingsJapgolly.enzyme.mod.EnzymeSelector
import typingsJapgolly.enzyme.mod.ShallowRendererProps
import typingsJapgolly.materialUiCore.anon.Fn1
import typingsJapgolly.materialUiCore.anon.PartialShallowOptions
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsCreateShallowMod {
  
  @JSImport("@material-ui/core/test-utils/createShallow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Fn1]
  inline def default(options: PartialShallowOptions): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Fn1]
  
  trait ShallowOptions
    extends StObject
       with ShallowRendererProps {
    
    var dive: Boolean
    
    var shallow: Fn1
    
    var untilSelector: EnzymeSelector
  }
  object ShallowOptions {
    
    inline def apply(dive: Boolean, shallow: Fn1, untilSelector: EnzymeSelector): ShallowOptions = {
      val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShallowOptions]
    }
    
    extension [Self <: ShallowOptions](x: Self) {
      
      inline def setDive(value: Boolean): Self = StObject.set(x, "dive", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: Fn1): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setUntilSelector(value: EnzymeSelector): Self = StObject.set(x, "untilSelector", value.asInstanceOf[js.Any])
      
      inline def setUntilSelectorFunction2(value: (Any, /* context */ js.UndefOr[Any]) => Element | Null): Self = StObject.set(x, "untilSelector", js.Any.fromFunction2(value))
    }
  }
}
