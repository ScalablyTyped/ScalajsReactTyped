package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.wixStyleReact.anon.OnEnd
import typingsJapgolly.wixStyleReact.anon.TransitionPropstimeoutnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionToggleMod {
  
  /** Toggle is a component to solve ReactTransitionGroup bug with lagging collapse and expand transitions. */
  object default {
    
    inline def apply(hasChildrenDataHookMountOnEnterShowTimeoutUnmountOnExitOnEndOnStart: TransitionPropstimeoutnum): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenDataHookMountOnEnterShowTimeoutUnmountOnExitOnEndOnStart.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/Toggle", "default.propTypes")
    @js.native
    def propTypes: OnEnd = js.native
    inline def propTypes_=(x: OnEnd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
