package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdUtils.typesModeTypesMod.UserInteractionMode
import typingsJapgolly.reactMdUtils.typesModeUserInteractionModeListenerMod.UserInteractionModeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModeMod {
  
  @JSImport("@react-md/utils/types/mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UserInteractionModeListener(hasChildren: UserInteractionModeListenerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UserInteractionModeListener")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsUserInteractionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useUserInteractionMode(): UserInteractionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useUserInteractionMode")().asInstanceOf[UserInteractionMode]
}
