package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.reactSelect.anon.Size
import typingsJapgolly.reactSelect.anon.`0`
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsIndicatorsMod {
  
  @JSImport("react-select/dist/declarations/src/components/indicators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CrossIcon(props: CrossIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DownChevron(props: DownChevronProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DropdownIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: DropdownIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IndicatorSeparator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: IndicatorSeparatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LoadingIndicator {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: LoadingIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select/dist/declarations/src/components/indicators", "LoadingIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/dist/declarations/src/components/indicators", "LoadingIndicator.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    inline def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def clearIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsFocusedHasHasBaseUnitColors: ClearIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndicatorCSS")(hasIsFocusedHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  inline def clearIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsFocusedHasHasBaseUnitColors: DropdownIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndicatorCSS")(hasIsFocusedHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def dropdownIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsFocusedHasHasBaseUnitColors: ClearIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownIndicatorCSS")(hasIsFocusedHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  inline def dropdownIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsFocusedHasHasBaseUnitColors: DropdownIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("dropdownIndicatorCSS")(hasIsFocusedHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def indicatorSeparatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsDisabledHasHasBaseUnitColors: IndicatorSeparatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("indicatorSeparatorCSS")(hasIsDisabledHasHasBaseUnitColors.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  inline def loadingIndicatorCSS[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](hasIsFocusedSizeHasColorsHasBaseUnit: LoadingIndicatorProps[Option, IsMulti, Group]): CSSObjectWithLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("loadingIndicatorCSS")(hasIsFocusedSizeHasColorsHasBaseUnit.asInstanceOf[js.Any]).asInstanceOf[CSSObjectWithLabel]
  
  @js.native
  trait ClearIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered inside the indicator. */
    var children: js.UndefOr[Node] = js.native
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
  }
  
  type CrossIconProps = SVGProps[SVGSVGElement] & `0`
  
  type DownChevronProps = SVGProps[SVGSVGElement] & `0`
  
  @js.native
  trait DropdownIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** The children to be rendered inside the indicator. */
    var children: js.UndefOr[Node] = js.native
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
  }
  
  @js.native
  trait IndicatorSeparatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    var innerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.native
    
    var isDisabled: Boolean = js.native
    
    var isFocused: Boolean = js.native
  }
  
  @js.native
  trait LoadingIndicatorProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */]
    extends StObject
       with CommonPropsAndClassName[Option, IsMulti, Group] {
    
    /** Props that will be passed on to the children. */
    var innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
    
    var isDisabled: Boolean = js.native
    
    /** The focused state of the select. */
    var isFocused: Boolean = js.native
    
    /** Set size of the container. */
    var size: Double = js.native
  }
}
