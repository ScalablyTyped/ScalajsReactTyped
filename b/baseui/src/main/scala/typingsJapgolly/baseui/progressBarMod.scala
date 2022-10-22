package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Inline
import typingsJapgolly.baseui.anon.IsLeft
import typingsJapgolly.baseui.anon.PartialProgressBarPropsRe
import typingsJapgolly.baseui.anon.PathLength
import typingsJapgolly.baseui.anon.Steps
import typingsJapgolly.baseui.anon.`254`
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.medium_
import typingsJapgolly.baseui.baseuiStrings.path
import typingsJapgolly.baseui.baseuiStrings.small_
import typingsJapgolly.baseui.baseuiStrings.svg
import typingsJapgolly.baseui.progressBarTypesMod.ProgressBarRoundedProps
import typingsJapgolly.baseui.progressBarTypesMod.StyleProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("baseui/progress-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  val ProgressBar: ForwardRefExoticComponent[PartialProgressBarPropsRe] = js.native
  
  inline def ProgressBarRounded(hasProgressSizeAnimateInlineOverridesRestProps: ProgressBarRoundedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ProgressBarRounded")(hasProgressSizeAnimateInlineOverridesRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object SIZE {
    
    @JSImport("baseui/progress-bar", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/progress-bar", "SIZE.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/progress-bar", "SIZE.small")
    @js.native
    val small: small_ = js.native
  }
  
  @JSImport("baseui/progress-bar", "StyledBar")
  @js.native
  val StyledBar: StyletronComponent[div, Steps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarContainer")
  @js.native
  val StyledBarContainer: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledBarProgress")
  @js.native
  val StyledBarProgress: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledInfiniteBar")
  @js.native
  val StyledInfiniteBar: StyletronComponent[div, IsLeft] = js.native
  
  @JSImport("baseui/progress-bar", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedRoot")
  @js.native
  val StyledProgressBarRoundedRoot: StyletronComponent[div, Inline] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedSvg")
  @js.native
  val StyledProgressBarRoundedSvg: StyletronComponent[svg, `254`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedText")
  @js.native
  val StyledProgressBarRoundedText: StyletronComponent[div, `254`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedTrackBackground")
  @js.native
  val StyledProgressBarRoundedTrackBackground: StyletronComponent[path, `254`] = js.native
  
  @JSImport("baseui/progress-bar", "StyledProgressBarRoundedTrackForeground")
  @js.native
  val StyledProgressBarRoundedTrackForeground: StyletronComponent[path, PathLength] = js.native
  
  @JSImport("baseui/progress-bar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, StyleProps] = js.native
}
