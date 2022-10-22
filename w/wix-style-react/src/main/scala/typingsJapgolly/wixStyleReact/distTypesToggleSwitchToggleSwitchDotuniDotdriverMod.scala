package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesToggleSwitchToggleSwitchCoreToggleSwitchCoreDotuniDotdriverMod.ToggleSwitchCoreUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchDotuniDotdriverMod {
  
  trait ToggleSwitchUniDriver
    extends StObject
       with ToggleSwitchCoreUniDriver {
    
    def getSize(): js.Promise[String]
    
    def getSkin(): js.Promise[String]
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
      getSize: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[String]],
      getTabIndex: CallbackTo[js.Promise[Double]],
      getTrackStyles: CallbackTo[js.Promise[js.Object]],
      hasKnobIcon: CallbackTo[js.Promise[Boolean]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): ToggleSwitchUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getKnobIcon = getKnobIcon.toJsFn, getKnobIconStyles = getKnobIconStyles.toJsFn, getKnobStyles = getKnobStyles.toJsFn, getRootStyles = getRootStyles.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getTabIndex = getTabIndex.toJsFn, getTrackStyles = getTrackStyles.toJsFn, hasKnobIcon = hasKnobIcon.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[ToggleSwitchUniDriver]
    }
    
    extension [Self <: ToggleSwitchUniDriver](x: Self) {
      
      inline def setGetSize(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSkin", value.toJsFn)
    }
  }
}
