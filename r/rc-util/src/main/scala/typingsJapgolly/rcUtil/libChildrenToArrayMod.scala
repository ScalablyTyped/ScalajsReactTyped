package typingsJapgolly.rcUtil

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChildrenToArrayMod {
  
  @JSImport("rc-util/lib/Children/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(children: Node): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def default(children: Node, option: Option): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  trait Option extends StObject {
    
    var keepEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setKeepEmpty(value: Boolean): Self = StObject.set(x, "keepEmpty", value.asInstanceOf[js.Any])
      
      inline def setKeepEmptyUndefined: Self = StObject.set(x, "keepEmpty", js.undefined)
    }
  }
}
