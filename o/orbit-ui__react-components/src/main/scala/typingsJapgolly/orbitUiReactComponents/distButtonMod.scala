package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.Size
import typingsJapgolly.orbitUiReactComponents.distButtonSrcButtonGroupMod.InnerButtonGroupProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcButtonMod.InnerButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcCrossButtonMod.InnerCrossButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcIconButtonMod.InnerIconButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcToggleButtonMod.InnerToggleButtonProps
import typingsJapgolly.orbitUiReactComponents.distButtonSrcToggleIconButtonMod.InnerToggleIconButtonProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button", "Button")
  @js.native
  val Button: OrbitComponent[button, InnerButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button", "ButtonGroup")
  @js.native
  val ButtonGroup: OrbitComponent[HTMLElement, InnerButtonGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button", "CrossButton")
  @js.native
  val CrossButton: OrbitComponent[button, InnerCrossButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button", "IconButton")
  @js.native
  val IconButton: OrbitComponent[button, InnerIconButtonProps] = js.native
  
  inline def InnerButton(props: InnerButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerButtonGroup(props: InnerButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerCrossButton(hasForwardedRefRest: InnerCrossButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerCrossButton")(hasForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerIconButton(props: InnerIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleButton(props: InnerToggleButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerToggleIconButton(props: InnerToggleIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerToggleIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/button", "ToggleButton")
  @js.native
  val ToggleButton: OrbitComponent[button, InnerToggleButtonProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button", "ToggleIconButton")
  @js.native
  val ToggleIconButton: OrbitComponent[button, InnerToggleIconButtonProps] = js.native
  
  inline def embedIconButton[Props /* <: Size & (Record[String, Any]) */](element: japgolly.scalajs.react.facade.React.Element, hasSizeProps: Props): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("embedIconButton")(element.asInstanceOf[js.Any], hasSizeProps.asInstanceOf[js.Any])).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
}
