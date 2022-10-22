package typingsJapgolly.nivoTooltip

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.nivoTooltip.anon.Actions
import typingsJapgolly.nivoTooltip.distTypesBasicTooltipMod.BasicTooltipProps
import typingsJapgolly.nivoTooltip.distTypesChipMod.ChipProps
import typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipActionsContextData
import typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextData
import typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden
import typingsJapgolly.nivoTooltip.distTypesCrosshairMod.CrosshairProps
import typingsJapgolly.nivoTooltip.distTypesTableTooltipMod.TableTooltipProps
import typingsJapgolly.nivoTooltip.distTypesTooltipProviderMod.TooltipProviderProps
import typingsJapgolly.nivoTooltip.distTypesTooltipWrapperMod.TooltipWrapperProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  val Chip: NamedExoticComponent[ChipProps] = js.native
  
  @JSImport("@nivo/tooltip", "Crosshair")
  @js.native
  val Crosshair: MemoExoticComponent[js.Function1[/* hasWidthHeightTypeXY */ CrosshairProps, Element]] = js.native
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  val TableTooltip: MemoExoticComponent[js.Function1[/* hasTitleRowsRenderContent */ TableTooltipProps, Element | Null]] = js.native
  
  inline def Tooltip(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")().asInstanceOf[Element | Null]
  
  @JSImport("@nivo/tooltip", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  inline def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TooltipProvider")(hasContainerChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/tooltip", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip", "TooltipWrapper")
  @js.native
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  @JSImport("@nivo/tooltip", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  inline def isVisibleTooltipState(state: TooltipStateContextData): /* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisibleTooltipState")(state.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/tooltip.@nivo/tooltip/dist/types/context.TooltipStateContextDataVisible */ Boolean]
  
  inline def useTooltip(): TooltipActionsContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[TooltipActionsContextData]
  
  inline def useTooltipHandlers(container: MutableRefObject[HTMLDivElement]): Actions = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHandlers")(container.asInstanceOf[js.Any]).asInstanceOf[Actions]
  
  inline def useTooltipState(): TooltipStateContextData = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipState")().asInstanceOf[TooltipStateContextData]
}
