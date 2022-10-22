package typingsJapgolly.reachDescendants

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reachDescendants.mod.Descendant
import typingsJapgolly.reachDescendants.mod.DescendantContextValue
import typingsJapgolly.reachDescendants.reachDescendantsStrings.both
import typingsJapgolly.reachDescendants.reachDescendantsStrings.horizontal
import typingsJapgolly.reachDescendants.reachDescendantsStrings.option
import typingsJapgolly.reachDescendants.reachDescendantsStrings.vertical
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Callback[K /* <: /* keyof DescendantType */ String */, DescendantType /* <: Descendant[HTMLElement] */] extends StObject {
    
    def callback(nextOption: DescendantType): Unit = js.native
    def callback(
      nextOption: /* import warning: importer.ImportType#apply Failed type conversion: DescendantType[K] */ js.Any
    ): Unit = js.native
    
    var currentIndex: js.UndefOr[Double | Null] = js.native
    
    var filter: js.UndefOr[js.Function1[/* descendant */ DescendantType, Boolean]] = js.native
    
    var key: js.UndefOr[K | option] = js.native
    
    var orientation: js.UndefOr[vertical | horizontal | both] = js.native
    
    var rotate: js.UndefOr[Boolean] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
  }
  
  trait Children[DescendantType /* <: Descendant[HTMLElement] */] extends StObject {
    
    var children: Node
    
    var context: Context[DescendantContextValue[DescendantType]]
    
    var items: js.Array[DescendantType]
    
    var set: Dispatch[SetStateAction[js.Array[DescendantType]]]
  }
  object Children {
    
    inline def apply[DescendantType /* <: Descendant[HTMLElement] */](
      context: Context[DescendantContextValue[DescendantType]],
      items: js.Array[DescendantType],
      set: SetStateAction[js.Array[DescendantType]] => japgolly.scalajs.react.Callback
    ): Children[DescendantType] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: SetStateAction[js.Array[DescendantType]]) => set(t0).runNow()), children = null)
      __obj.asInstanceOf[Children[DescendantType]]
    }
    
    extension [Self <: Children[?], DescendantType /* <: Descendant[HTMLElement] */](x: Self & Children[DescendantType]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContext(value: Context[DescendantContextValue[DescendantType]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DescendantType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DescendantType*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSet(value: SetStateAction[js.Array[DescendantType]] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: SetStateAction[js.Array[DescendantType]]) => value(t0).runNow()))
    }
  }
}
