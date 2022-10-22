package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.ServerContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/native.@react-navigation/native/lib/typescript/src/ServerContext.ServerContextType & {  children :react.react.ReactNode} & react.react.RefAttributes<@react-navigation/native.@react-navigation/native/lib/typescript/src/types.ServerContainerRef> */
trait ServerContextTypechildren extends StObject {
  
  var children: Node
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  var location: js.UndefOr[Pathname] = js.undefined
  
  var ref: js.UndefOr[Ref[ServerContainerRef]] = js.undefined
}
object ServerContextTypechildren {
  
  inline def apply(): ServerContextTypechildren = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[ServerContextTypechildren]
  }
  
  extension [Self <: ServerContextTypechildren](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocation(value: Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRef(value: Ref[ServerContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: ServerContainerRef | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ServerContainerRef | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
