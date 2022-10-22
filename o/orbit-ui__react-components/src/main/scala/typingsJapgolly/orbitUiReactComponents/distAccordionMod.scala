package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionContextMod.AccordionContextType
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionHeaderMod.InnerAccordionHeaderProps
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionMod.InnerAccordionProps
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionPanelMod.InnerAccordionPanelProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccordionMod {
  
  @JSImport("@orbit-ui/react-components/dist/accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "Accordion")
  @js.native
  val Accordion: OrbitComponent[HTMLElement, InnerAccordionProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionContext")
  @js.native
  val AccordionContext: Context[AccordionContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionHeader")
  @js.native
  val AccordionHeader: OrbitComponent[HTMLElement, InnerAccordionHeaderProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/accordion", "AccordionPanel")
  @js.native
  val AccordionPanel: OrbitComponent[HTMLElement, InnerAccordionPanelProps] = js.native
  
  inline def InnerAccordion(
    hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest: InnerAccordionProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordion")(hasIdExpandedKeysPropDefaultExpandedKeysOnExpansionChangeExpansionModeAutoFocusVariantAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionHeader(props: InnerAccordionHeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAccordionPanel(props: InnerAccordionPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAccordionPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useAccordionContext(): AccordionContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useAccordionContext")().asInstanceOf[AccordionContextType]
}
