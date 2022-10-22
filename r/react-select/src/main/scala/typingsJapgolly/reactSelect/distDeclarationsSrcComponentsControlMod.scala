package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsControlMod {
  
  @JSImport("react-select/dist/declarations/src/components/Control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ControlProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def css[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledIsFocusedHasColorsBorderRadiusSpacing: ControlProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(hasIsDisabledIsFocusedHasColorsBorderRadiusSpacing.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait ControlProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** Children to render. */
    var children: Node = js.native
    
    /** The mouse down event and the innerRef to pass down to the controller element. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var innerRef: Ref[HTMLDivElement] = js.native
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the select is focused. */
    var isFocused: Boolean = js.native
    
    /** Whether the select is expanded. */
    var menuIsOpen: Boolean = js.native
  }
}
