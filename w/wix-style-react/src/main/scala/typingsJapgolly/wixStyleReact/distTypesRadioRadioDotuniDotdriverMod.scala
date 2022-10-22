package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioRadioDotuniDotdriverMod {
  
  trait RadioUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getId(): js.Promise[String]
    
    def getLabel(): js.Promise[String]
    
    def getName(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def iconExists(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def keyDown(key: String): js.Promise[Unit]
    
    def labelExists(): js.Promise[Boolean]
  }
  object RadioUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getId: CallbackTo[js.Promise[String]],
      getLabel: CallbackTo[js.Promise[String]],
      getName: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String]],
      iconExists: CallbackTo[js.Promise[Boolean]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      keyDown: String => js.Promise[Unit],
      labelExists: CallbackTo[js.Promise[Boolean]]
    ): RadioUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getValue = getValue.toJsFn, iconExists = iconExists.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, keyDown = js.Any.fromFunction1(keyDown), labelExists = labelExists.toJsFn)
      __obj.asInstanceOf[RadioUniDriver]
    }
    
    extension [Self <: RadioUniDriver](x: Self) {
      
      inline def setGetId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "iconExists", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setKeyDown(value: String => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setLabelExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "labelExists", value.toJsFn)
    }
  }
}
