package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTooltipSrcTooltipMod.InnerTooltipProps
import typingsJapgolly.orbitUiReactComponents.distTooltipSrcTooltipTriggerMod.InnerTooltipTriggerProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipMod {
  
  @JSImport("@orbit-ui/react-components/dist/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTooltip(hasAsChildrenForwardedRefRest: InnerTooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltip")(hasAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTooltipTrigger(
    hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerTooltipTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltipTrigger")(hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tooltip", "Tooltip")
  @js.native
  val Tooltip: OrbitComponent[HTMLElement, InnerTooltipProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tooltip", "TooltipTrigger")
  @js.native
  val TooltipTrigger: OrbitComponent[HTMLElement, InnerTooltipTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tooltip", "TooltipTriggerContext")
  @js.native
  val TooltipTriggerContext: Context[js.Object] = js.native
  
  inline def parseTooltipTrigger(children: Node): js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTooltipTrigger")(children.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    japgolly.scalajs.react.facade.React.Element, 
    japgolly.scalajs.react.facade.React.Element
  ]]
  
  inline def useTooltipTriggerContext(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipTriggerContext")().asInstanceOf[js.Object]
}
