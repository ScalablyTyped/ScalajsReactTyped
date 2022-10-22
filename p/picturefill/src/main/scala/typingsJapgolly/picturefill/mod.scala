package typingsJapgolly.picturefill

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.picturefill.mod.Picturefill.EvaluateArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(arg: EvaluateArg): Unit = ^.asInstanceOf[js.Dynamic].apply(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("picturefill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Picturefill {
    
    type ElementNullable = Element | Null
    
    trait EvaluateArg extends StObject {
      
      var elements: NodeList[Node] | js.Array[ElementNullable]
      
      var reevaluate: js.UndefOr[Boolean] = js.undefined
    }
    object EvaluateArg {
      
      inline def apply(elements: NodeList[Node] | js.Array[ElementNullable]): EvaluateArg = {
        val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
        __obj.asInstanceOf[EvaluateArg]
      }
      
      extension [Self <: EvaluateArg](x: Self) {
        
        inline def setElements(value: NodeList[Node] | js.Array[ElementNullable]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsVarargs(value: ElementNullable*): Self = StObject.set(x, "elements", js.Array(value*))
        
        inline def setReevaluate(value: Boolean): Self = StObject.set(x, "reevaluate", value.asInstanceOf[js.Any])
        
        inline def setReevaluateUndefined: Self = StObject.set(x, "reevaluate", js.undefined)
      }
    }
  }
}
