package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesCustomTypesMod.ExtendedType
import typingsJapgolly.slate.distInterfacesNodeMod.Descendant
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesElementMod {
  
  @JSImport("slate/dist/interfaces/element", "Element")
  @js.native
  val Element: ElementInterface = js.native
  type Element = ExtendedType[typingsJapgolly.slate.slateStrings.Element, BaseElement]
  
  trait BaseElement extends StObject {
    
    var children: js.Array[Descendant]
  }
  object BaseElement {
    
    inline def apply(children: js.Array[Descendant]): BaseElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseElement]
    }
    
    extension [Self <: BaseElement](x: Self) {
      
      inline def setChildren(value: js.Array[Descendant]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Descendant*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  type ElementEntry = js.Tuple2[typingsJapgolly.slate.distInterfacesElementMod.Element, Path]
  
  @js.native
  trait ElementInterface extends StObject {
    
    def isAncestor(value: Any): /* is slate.slate/dist/interfaces/node.Ancestor */ Boolean = js.native
    
    def isElement(value: Any): /* is slate.slate/dist/interfaces/element.Element */ Boolean = js.native
    
    def isElementList(value: Any): /* is std.Array<slate.slate/dist/interfaces/element.Element> */ Boolean = js.native
    
    def isElementProps(props: Any): /* is std.Partial<slate.slate/dist/interfaces/element.Element> */ Boolean = js.native
    
    def isElementType[T /* <: typingsJapgolly.slate.distInterfacesElementMod.Element */](value: Any, elementVal: String): /* is T */ Boolean = js.native
    def isElementType[T /* <: typingsJapgolly.slate.distInterfacesElementMod.Element */](value: Any, elementVal: String, elementKey: String): /* is T */ Boolean = js.native
    
    def matches(
      element: typingsJapgolly.slate.distInterfacesElementMod.Element,
      props: Partial[typingsJapgolly.slate.distInterfacesElementMod.Element]
    ): Boolean = js.native
  }
}
