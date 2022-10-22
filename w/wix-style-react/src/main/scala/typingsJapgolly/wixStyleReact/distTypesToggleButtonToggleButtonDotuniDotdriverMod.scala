package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleButtonToggleButtonDotuniDotdriverMod {
  
  trait ToggleButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabelPlacement(): js.Promise[String]
    
    def getLabelValue(): js.Promise[String]
    
    def getSkin(): js.Promise[String | Null]
    
    var isButtonDisabled: js.Function0[js.Promise[Boolean]]
    
    def isButtonSelected(): js.Promise[Boolean]
  }
  object ToggleButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabelPlacement: CallbackTo[js.Promise[String]],
      getLabelValue: CallbackTo[js.Promise[String]],
      getSkin: CallbackTo[js.Promise[String | Null]],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]],
      isButtonSelected: CallbackTo[js.Promise[Boolean]]
    ): ToggleButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabelPlacement = getLabelPlacement.toJsFn, getLabelValue = getLabelValue.toJsFn, getSkin = getSkin.toJsFn, isButtonDisabled = isButtonDisabled.toJsFn, isButtonSelected = isButtonSelected.toJsFn)
      __obj.asInstanceOf[ToggleButtonUniDriver]
    }
    
    extension [Self <: ToggleButtonUniDriver](x: Self) {
      
      inline def setGetLabelPlacement(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelPlacement", value.toJsFn)
      
      inline def setGetLabelValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelValue", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
      
      inline def setIsButtonSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonSelected", value.toJsFn)
    }
  }
}
