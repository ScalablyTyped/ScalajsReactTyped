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

object distDeclarationsSrcComponentsContainersMod {
  
  @JSImport("react-select/dist/declarations/src/components/containers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IndicatorsContainer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: IndicatorsContainerProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorsContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectContainer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ContainerProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ValueContainer[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ValueContainerProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def containerCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledIsRtl: ContainerProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("containerCSS")(hasIsDisabledIsRtl.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def indicatorsContainerCSS(): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("indicatorsContainerCSS")().asInstanceOf[CSSObjectWithLabel]
  
  inline def valueContainerCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    hasHasSpacingIsMultiHasValueHasControlShouldRenderValue: ValueContainerProps[Option, IsMulti, Group]
  ): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("valueContainerCSS")(hasHasSpacingIsMultiHasValueHasControlShouldRenderValue.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait ContainerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** Inner props to be passed down to the container. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** Whether the select is disabled. */
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
  
  @js.native
  trait IndicatorsContainerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** Props to be passed to the indicators container element. */
    var innerProps: js.UndefOr[js.Object] = js.native
    
    var isDisabled: Boolean = js.native
  }
  
  @js.native
  trait ValueContainerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered. */
    var children: Node = js.native
    
    /** Props to be passed to the value container element. */
    var innerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
    
    var isDisabled: Boolean = js.native
  }
}
