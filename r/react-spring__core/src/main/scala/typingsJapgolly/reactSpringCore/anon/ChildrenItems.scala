package typingsJapgolly.reactSpringCore.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringValues
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesPropsMod.PickAnimated
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.ItemKeys
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.Key
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionRenderFn
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionState
import typingsJapgolly.reactSpringCore.reactSpringCoreBooleans.`true`
import typingsJapgolly.reactSpringTypes.utilMod.NoInfer
import typingsJapgolly.reactSpringTypes.utilMod.OneOrMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenItems[Item, Props /* <: js.Object */] extends StObject {
  
  var children: TransitionRenderFn[NoInfer[Item], PickAnimated[Props, `true`]]
  
  var items: OneOrMore[Item]
  
  var keys: js.UndefOr[ItemKeys[NoInfer[Item]]] = js.undefined
}
object ChildrenItems {
  
  inline def apply[Item, Props /* <: js.Object */](
    children: (/* values */ SpringValues[PickAnimated[Props, `true`]], NoInfer[Item], /* transition */ TransitionState[NoInfer[Item], PickAnimated[Props, `true`]], /* index */ Double) => Node,
    items: OneOrMore[Item]
  ): ChildrenItems[Item, Props] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenItems[Item, Props]]
  }
  
  extension [Self <: ChildrenItems[?, ?], Item, Props /* <: js.Object */](x: Self & (ChildrenItems[Item, Props])) {
    
    inline def setChildren(
      value: (/* values */ SpringValues[PickAnimated[Props, `true`]], NoInfer[Item], /* transition */ TransitionState[NoInfer[Item], PickAnimated[Props, `true`]], /* index */ Double) => Node
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setItems(value: OneOrMore[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeys(value: ItemKeys[NoInfer[Item]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction1(value: NoInfer[Item] => Key): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
