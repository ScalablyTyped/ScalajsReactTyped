package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Animating
import typingsJapgolly.baseui.anon.Dequeue
import typingsJapgolly.baseui.anon.HasSuffix
import typingsJapgolly.baseui.anon.heightnumberwidthnumberSp
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.i
import typingsJapgolly.baseui.baseuiStrings.p
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.snackbarTypesMod.Duration
import typingsJapgolly.baseui.snackbarTypesMod.Placement
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarElementOverrides
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarElementProps
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarProviderProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("baseui/snackbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DURATION {
    
    @JSImport("baseui/snackbar", "DURATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/snackbar", "DURATION.infinite")
    @js.native
    def infinite: Double = js.native
    inline def infinite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infinite")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.long")
    @js.native
    def long: Double = js.native
    inline def long_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.medium")
    @js.native
    def medium: Double = js.native
    inline def medium_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("baseui/snackbar", "DURATION.short")
    @js.native
    def short: Double = js.native
    inline def short_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
  }
  
  object PLACEMENT {
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/snackbar", "PLACEMENT.topRight")
    @js.native
    val topRight: typingsJapgolly.baseui.baseuiStrings.topRight = js.native
  }
  
  inline def SnackbarElement(hasActionMessageActionOnClickFocusMessageOverridesProgressStartEnhancer: SnackbarElementProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SnackbarElement")(hasActionMessageActionOnClickFocusMessageOverridesProgressStartEnhancer.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SnackbarProvider(hasChildrenOverridesPlacementDefaultDuration: SnackbarProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SnackbarProvider")(hasChildrenOverridesPlacementDefaultDuration.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/snackbar", "StyledActionButtonContainer")
  @js.native
  val StyledActionButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledMessage")
  @js.native
  val StyledMessage: StyletronComponent[p, HasSuffix] = js.native
  
  @JSImport("baseui/snackbar", "StyledPlacementContainer")
  @js.native
  val StyledPlacementContainer: StyletronComponent[div, Animating] = js.native
  
  @JSImport("baseui/snackbar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledSpinner")
  @js.native
  val StyledSpinner: StyletronComponent[i, heightnumberwidthnumberSp] = js.native
  
  @JSImport("baseui/snackbar", "StyledStartEnhancerContainer")
  @js.native
  val StyledStartEnhancerContainer: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/snackbar", "StyledWrapActionButtonContainer")
  @js.native
  val StyledWrapActionButtonContainer: StyletronComponent[div, js.Object] = js.native
  
  inline def useSnackbar(): Dequeue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSnackbar")().asInstanceOf[Dequeue]
  
  type DurationT = Duration
  
  type PlacementT = Placement
  
  type SnackbarElementOverridesT = SnackbarElementOverrides
  
  type SnackbarElementPropsT = SnackbarElementProps
  
  type SnackbarProviderPropsT = SnackbarProviderProps
}
