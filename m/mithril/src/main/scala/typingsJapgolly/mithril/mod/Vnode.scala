package typingsJapgolly.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Virtual DOM nodes, or vnodes, are Javascript objects that represent an element (or parts of the DOM). */
trait Vnode[Attrs, State] extends StObject {
  
  /** A hashmap of DOM attributes, events, properties and lifecycle methods. */
  var attrs: Attrs
  
  /** In most vnode types, the children property is an array of vnodes. For text and trusted HTML vnodes, The children property is either a string, a number or a boolean. */
  var children: js.UndefOr[ChildArrayOrPrimitive] = js.undefined
  
  /** The value used to map a DOM element to its respective item in an array of data. */
  var key: js.UndefOr[String | Double] = js.undefined
  
  /** An object that is persisted between redraws. In component vnodes, state is a shallow clone of the component object. */
  var state: State
  
  /** The nodeName of a DOM element. It may also be the string [ if a vnode is a fragment, # if it's a text vnode, or < if it's a trusted HTML vnode. Additionally, it may be a component. */
  var tag: String | (ComponentTypes[Attrs, State])
  
  /**
    * This is used instead of children if a vnode contains a text node as its only child.
    * This is done for performance reasons.
    * Component vnodes never use the text property even if they have a text node as their only child.
    */
  var text: js.UndefOr[String | Double | Boolean] = js.undefined
}
object Vnode {
  
  inline def apply[Attrs, State](attrs: Attrs, state: State, tag: String | (ComponentTypes[Attrs, State])): Vnode[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vnode[Attrs, State]]
  }
  
  extension [Self <: Vnode[?, ?], Attrs, State](x: Self & (Vnode[Attrs, State])) {
    
    inline def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: ChildArrayOrPrimitive): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Children*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String | (ComponentTypes[Attrs, State])): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagFunction1(value: /* vnode */ Vnode[Attrs, js.Object] => Component[Attrs, js.Object]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    
    inline def setText(value: String | Double | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
