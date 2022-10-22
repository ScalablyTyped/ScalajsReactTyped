package typingsJapgolly.reactQuery

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactQuery.typesDevtoolsDevtoolsMod.DevtoolsOptions
import typingsJapgolly.reactQuery.typesDevtoolsDevtoolsMod.DevtoolsPanelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDevtoolsMod {
  
  @JSImport("react-query/types/devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ReactQueryDevtools(
    hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce: DevtoolsOptions
  ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactQueryDevtools")(hasInitialIsOpenPanelPropsCloseButtonPropsToggleButtonPropsPositionContainerStyleNonce.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("react-query/types/devtools", "ReactQueryDevtoolsPanel")
  @js.native
  val ReactQueryDevtoolsPanel: ForwardRefExoticComponent[DevtoolsPanelOptions & RefAttributes[HTMLDivElement]] = js.native
}
