package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.wixStyleReact.anon.AnimateOnLoad
import typingsJapgolly.wixStyleReact.anon.AnimateOnLoadBoolean
import typingsJapgolly.wixStyleReact.distTypesTransitionTransitionDottypesMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionTransitionMod {
  
  /** Transition is a wrapper that allows animations of other components. */
  object default {
    
    inline def apply(
      hasAnimateOnLoadDataHookChildrenEnterAnimationExitAnimationMountOnEnterUnmountOnExitOnEndOnStartShow: TransitionProps
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasAnimateOnLoadDataHookChildrenEnterAnimationExitAnimationMountOnEnterUnmountOnExitOnEndOnStartShow.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Transition/Transition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Transition/Transition", "default.defaultProps")
    @js.native
    def defaultProps: AnimateOnLoadBoolean = js.native
    inline def defaultProps_=(x: AnimateOnLoadBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/Transition", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/Transition", "default.propTypes")
    @js.native
    def propTypes: AnimateOnLoad = js.native
    inline def propTypes_=(x: AnimateOnLoad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
