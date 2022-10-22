package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.reactSelectStrings.option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsOptionMod {
  
  @JSImport("react-select/dist/declarations/src/components/Option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: OptionProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def optionCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledIsFocusedIsSelectedHasSpacingColors: OptionProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("optionCSS")(hasIsDisabledIsFocusedIsSelectedHasSpacingColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait OptionProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** The data of the selected option. */
    var data: Option = js.native
    
    /** props passed to the wrapping element for the group. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Inner ref to DOM Node */
    var innerRef: RefFn[HTMLDivElement] = js.native
    
    /** Whether the option is disabled. */
    var isDisabled: Boolean = js.native
    
    /** Whether the option is focused. */
    var isFocused: Boolean = js.native
    
    /** Whether the option is selected. */
    var isSelected: Boolean = js.native
    
    /** Text to be displayed representing the option. */
    var label: String = js.native
    
    /** Type is used by the menu to determine whether this is an option or a group.
      In the case of option this is always `option`. **/
    var `type`: option = js.native
  }
}
