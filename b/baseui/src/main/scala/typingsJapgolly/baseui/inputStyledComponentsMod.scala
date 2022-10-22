package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Adjoined
import typingsJapgolly.baseui.anon.AlignTop
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.baseui.anon.IsFocusVisibleSize
import typingsJapgolly.baseui.anon.Positive
import typingsJapgolly.baseui.anon.SVGAttributesSVGElementch
import typingsJapgolly.baseui.anon.SharedPropsthemeTheme
import typingsJapgolly.baseui.anon.SharedStylePropsthemeThem
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.input
import typingsJapgolly.baseui.inputTypesMod.SharedProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStyledComponentsMod {
  
  @JSImport("baseui/input/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/input/styled-components", "Input")
  @js.native
  val Input: StyletronComponent[input, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "InputContainer")
  @js.native
  val InputContainer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "InputEnhancer")
  @js.native
  val InputEnhancer: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "Root")
  @js.native
  val Root: StyletronComponent[div, SharedProps] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledClearIcon")
  @js.native
  val StyledClearIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], IsFocusVisible] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledClearIconContainer")
  @js.native
  val StyledClearIconContainer: StyletronComponent[div, AlignTop] = js.native
  
  @JSImport("baseui/input/styled-components", "StyledMaskToggleButton")
  @js.native
  val StyledMaskToggleButton: StyletronComponent[button, IsFocusVisibleSize] = js.native
  
  inline def getInputContainerStyles(props: Positive): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputContainerStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getInputStyles(props: SharedPropsthemeTheme): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  inline def getInputStyles(props: SharedStylePropsthemeThem): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def getRootStyles(props: Adjoined): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootStyles")(props.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
