package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.reactMdUtils.typesHoverHoverModeProviderMod.HoverModeProviderProps
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeContextMod.HoverModeContext
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeMod.HoverModeHookReturnValue
import typingsJapgolly.reactMdUtils.typesHoverUseHoverModeMod.HoverModeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHoverMod {
  
  @JSImport("@react-md/utils/types/hover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_DEACTIVATION_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_DEACTIVATION_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_EXIT_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_EXIT_TIME: /* 300 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "DEFAULT_HOVER_MODE_VISIBLE_IN_TIME")
  @js.native
  val DEFAULT_HOVER_MODE_VISIBLE_IN_TIME: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/utils/types/hover", "HoverModeContextProvider")
  @js.native
  val HoverModeContextProvider: Provider[HoverModeContext] = js.native
  
  inline def HoverModeProvider(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime: HoverModeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HoverModeProvider")(hasChildrenDisabledDefaultVisibleInTimeDeactivateTime.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useHoverMode(): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")().asInstanceOf[HoverModeHookReturnValue]
  inline def useHoverMode(hasDisabledDefaultVisibleExitVisibilityDelay: HoverModeOptions): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")(hasDisabledDefaultVisibleExitVisibilityDelay.asInstanceOf[js.Any]).asInstanceOf[HoverModeHookReturnValue]
  
  inline def useHoverModeContext(): HoverModeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverModeContext")().asInstanceOf[HoverModeContext]
}
