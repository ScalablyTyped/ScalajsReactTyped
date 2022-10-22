package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionConstantsMod {
  
  object dataHooks {
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks.fadeStyles")
    @js.native
    def fadeStyles: String = js.native
    inline def fadeStyles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fadeStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks.moveStyles")
    @js.native
    def moveStyles: String = js.native
    inline def moveStyles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks.scaleStyles")
    @js.native
    def scaleStyles: String = js.native
    inline def scaleStyles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks.toggleStyles")
    @js.native
    def toggleStyles: String = js.native
    inline def toggleStyles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Transition/constants", "dataHooks.transition")
    @js.native
    def transition: String = js.native
    inline def transition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transition")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/Transition/constants", "easingMap")
  @js.native
  val easingMap: StyleMap = js.native
  
  type StyleMap = StringDictionary[String]
  
  trait TransitionStatusType extends StObject {
    
    var entered: js.UndefOr[CSSProperties] = js.undefined
    
    var entering: js.UndefOr[CSSProperties] = js.undefined
    
    var exited: js.UndefOr[CSSProperties] = js.undefined
    
    var exiting: js.UndefOr[CSSProperties] = js.undefined
    
    var unmounted: js.UndefOr[CSSProperties] = js.undefined
  }
  object TransitionStatusType {
    
    inline def apply(): TransitionStatusType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionStatusType]
    }
    
    extension [Self <: TransitionStatusType](x: Self) {
      
      inline def setEntered(value: CSSProperties): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
      
      inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
      
      inline def setEntering(value: CSSProperties): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      inline def setEnteringUndefined: Self = StObject.set(x, "entering", js.undefined)
      
      inline def setExited(value: CSSProperties): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
      
      inline def setExitedUndefined: Self = StObject.set(x, "exited", js.undefined)
      
      inline def setExiting(value: CSSProperties): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      inline def setExitingUndefined: Self = StObject.set(x, "exiting", js.undefined)
      
      inline def setUnmounted(value: CSSProperties): Self = StObject.set(x, "unmounted", value.asInstanceOf[js.Any])
      
      inline def setUnmountedUndefined: Self = StObject.set(x, "unmounted", js.undefined)
    }
  }
  
  trait TransitionStyles extends StObject {
    
    var fade: TransitionStatusType
    
    var move: TransitionStatusType
    
    var scale: TransitionStatusType
    
    var toggle: TransitionStatusType
  }
  object TransitionStyles {
    
    inline def apply(
      fade: TransitionStatusType,
      move: TransitionStatusType,
      scale: TransitionStatusType,
      toggle: TransitionStatusType
    ): TransitionStyles = {
      val __obj = js.Dynamic.literal(fade = fade.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionStyles]
    }
    
    extension [Self <: TransitionStyles](x: Self) {
      
      inline def setFade(value: TransitionStatusType): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setMove(value: TransitionStatusType): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setScale(value: TransitionStatusType): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: TransitionStatusType): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeIn
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveIn
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.expand
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleUp
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeOut
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveOut
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.collapse
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleDown
  */
  trait TransitionType extends StObject
  object TransitionType {
    
    inline def collapse: typingsJapgolly.wixStyleReact.wixStyleReactStrings.collapse = "collapse".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.collapse]
    
    inline def expand: typingsJapgolly.wixStyleReact.wixStyleReactStrings.expand = "expand".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.expand]
    
    inline def fadeIn: typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeIn = "fadeIn".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeIn]
    
    inline def fadeOut: typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeOut = "fadeOut".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.fadeOut]
    
    inline def moveIn: typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveIn = "moveIn".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveIn]
    
    inline def moveOut: typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveOut = "moveOut".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.moveOut]
    
    inline def scaleDown: typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleDown = "scaleDown".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleDown]
    
    inline def scaleUp: typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleUp = "scaleUp".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.scaleUp]
  }
}
