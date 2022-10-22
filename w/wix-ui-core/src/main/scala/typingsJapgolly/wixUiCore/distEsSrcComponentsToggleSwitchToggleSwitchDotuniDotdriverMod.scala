package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsToggleSwitchToggleSwitchDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/toggle-switch/ToggleSwitch.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toggleSwitchUniDriverFactory(base: UniDriver[Any]): ToggleSwitchUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleSwitchUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ToggleSwitchUniDriver]
  
  trait ToggleSwitchUniDriver
    extends StObject
       with BaseUniDriver {
    
    /** Returns the id of the input */
    def getId(): js.Promise[String]
    
    /** Returns the toggle icon inside the knob */
    def getKnobIcon(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the knob icon */
    def getKnobIconStyles(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the knob */
    def getKnobStyles(): js.Promise[js.Object]
    
    /** Returns the computed styles object of the root component */
    def getRootStyles(): js.Promise[js.Object]
    
    /** Returns the tab index */
    def getTabIndex(): js.Promise[Double]
    
    /** Returns the computed styles object of the track */
    def getTrackStyles(): js.Promise[js.Object]
    
    /** Returns whether the toggle has an icon */
    def hasKnobIcon(): js.Promise[Boolean]
    
    /** Returns a boolean indicating if the toggleSwitch is checked */
    def isChecked(): js.Promise[Boolean]
    
    /** Returns a boolean indicating if the toggleSwitch is disabled */
    def isDisabled(): js.Promise[Boolean]
  }
  object ToggleSwitchUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getId: CallbackTo[js.Promise[String]],
      getKnobIcon: CallbackTo[js.Promise[js.Object]],
      getKnobIconStyles: CallbackTo[js.Promise[js.Object]],
      getKnobStyles: CallbackTo[js.Promise[js.Object]],
      getRootStyles: CallbackTo[js.Promise[js.Object]],
      getTabIndex: CallbackTo[js.Promise[Double]],
      getTrackStyles: CallbackTo[js.Promise[js.Object]],
      hasKnobIcon: CallbackTo[js.Promise[Boolean]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): ToggleSwitchUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getKnobIcon = getKnobIcon.toJsFn, getKnobIconStyles = getKnobIconStyles.toJsFn, getKnobStyles = getKnobStyles.toJsFn, getRootStyles = getRootStyles.toJsFn, getTabIndex = getTabIndex.toJsFn, getTrackStyles = getTrackStyles.toJsFn, hasKnobIcon = hasKnobIcon.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[ToggleSwitchUniDriver]
    }
    
    extension [Self <: ToggleSwitchUniDriver](x: Self) {
      
      inline def setGetId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetKnobIcon(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getKnobIcon", value.toJsFn)
      
      inline def setGetKnobIconStyles(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getKnobIconStyles", value.toJsFn)
      
      inline def setGetKnobStyles(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getKnobStyles", value.toJsFn)
      
      inline def setGetRootStyles(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getRootStyles", value.toJsFn)
      
      inline def setGetTabIndex(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
      
      inline def setGetTrackStyles(value: CallbackTo[js.Promise[js.Object]]): Self = StObject.set(x, "getTrackStyles", value.toJsFn)
      
      inline def setHasKnobIcon(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasKnobIcon", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
