package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsSingleValueMod {
  
  @JSImport("react-select/dist/declarations/src/components/SingleValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: SingleValueProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def css[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledHasSpacingColors: SingleValueProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(hasIsDisabledHasSpacingColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait SingleValueProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** The data of the selected option rendered in the Single Value component. */
    var data: Option = js.native
    
    /** Props passed to the wrapping element for the group. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Whether this is disabled. */
    var isDisabled: Boolean = js.native
  }
}
