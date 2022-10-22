package typingsJapgolly.baseui

import typingsJapgolly.baseui.accordionAccordionMod.default
import typingsJapgolly.baseui.accordionTypesMod.PanelStateReducer
import typingsJapgolly.baseui.accordionTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.accordionTypesMod.StatefulPanelProps
import typingsJapgolly.baseui.accordionTypesMod.StatelessAccordionProps
import typingsJapgolly.baseui.anon.ExpandedBoolean
import typingsJapgolly.baseui.anon.PartialAccordionProps
import typingsJapgolly.baseui.anon.childrenReactNodedisabled
import typingsJapgolly.baseui.anon.heightstringnumberSharedS
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.g
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.svg
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("baseui/accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  open class Accordion () extends default
  /* static members */
  object Accordion {
    
    @JSImport("baseui/accordion", "Accordion")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/accordion", "Accordion.defaultProps")
    @js.native
    def defaultProps: PartialAccordionProps = js.native
    inline def defaultProps_=(x: PartialAccordionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/accordion", "Panel")
  @js.native
  val Panel: ForwardRefExoticComponent[childrenReactNodedisabled] = js.native
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/accordion", "STATE_CHANGE_TYPE.expand")
    @js.native
    val expand: typingsJapgolly.baseui.baseuiStrings.expand = js.native
  }
  
  inline def StatefulPanel(props: StatefulPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  open class StatefulPanelContainer ()
    extends typingsJapgolly.baseui.accordionStatefulPanelContainerMod.default
  object StatefulPanelContainer {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps.initialState")
      @js.native
      def initialState: ExpandedBoolean = js.native
      inline def initialState_=(x: ExpandedBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/accordion", "StatefulPanelContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: PanelStateReducer = js.native
      inline def stateReducer_=(x: PanelStateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def StatelessAccordion(hasAccordionChildrenDisabledExpandedOnChangeOverridesRenderAll: StatelessAccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatelessAccordion")(hasAccordionChildrenDisabledExpandedOnChangeOverridesRenderAll.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/accordion", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledContentAnimationContainer")
  @js.native
  val StyledContentAnimationContainer: StyletronComponent[div, heightstringnumberSharedS] = js.native
  
  @JSImport("baseui/accordion", "StyledHeader")
  @js.native
  val StyledHeader: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledPanelContainer")
  @js.native
  val StyledPanelContainer: StyletronComponent[li_, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[ul, js.Object] = js.native
  
  @JSImport("baseui/accordion", "StyledToggleIcon")
  @js.native
  val StyledToggleIcon: StyletronComponent[svg, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/accordion", "StyledToggleIconGroup")
  @js.native
  val StyledToggleIconGroup: StyletronComponent[g, SharedStylePropsArg] = js.native
  
  type SharedProps = SharedStylePropsArg
}
