package typingsJapgolly.typedQuerySelector

import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.typedQuerySelector.parserMod.ParseSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    trait Element extends StObject {
      
      def closest[S /* <: String */](selector: S): (ParseSelector[S, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null
    }
    object Element {
      
      inline def apply(
        closest: Any => (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null
      ): Element = {
        val __obj = js.Dynamic.literal(closest = js.Any.fromFunction1(closest))
        __obj.asInstanceOf[Element]
      }
      
      extension [Self <: Element](x: Self) {
        
        inline def setClosest(
          value: Any => (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null
        ): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      }
    }
    
    trait ParentNode extends StObject {
      
      def querySelector[S /* <: String */](selector: S): (ParseSelector[S, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null
      
      def querySelectorAll[S /* <: String */](selector: S): NodeList[
            (ParseSelector[S, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) & Node
          ]
    }
    object ParentNode {
      
      inline def apply(
        querySelector: Any => (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null,
        querySelectorAll: Any => NodeList[
              (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) & Node
            ]
      ): ParentNode = {
        val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
        __obj.asInstanceOf[ParentNode]
      }
      
      extension [Self <: ParentNode](x: Self) {
        
        inline def setQuerySelector(
          value: Any => (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) | Null
        ): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(
          value: Any => NodeList[
                  (ParseSelector[Any, typingsJapgolly.typedQuerySelector.strictMod.global.Element]) & Node
                ]
        ): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      }
    }
  }
}
