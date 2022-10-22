package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioRadioDotdriverMod {
  
  trait RadioDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getId(): String
    
    def getLabel(): String
    
    def getName(): String
    
    def getValue(): String
    
    def iconExists(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def keyDown(key: String): Unit
    
    def labelExists(): Boolean
  }
  object RadioDriver {
    
    inline def apply(
      click: Callback,
      exists: CallbackTo[Boolean],
      getId: CallbackTo[String],
      getLabel: CallbackTo[String],
      getName: CallbackTo[String],
      getValue: CallbackTo[String],
      iconExists: CallbackTo[Boolean],
      isChecked: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      keyDown: String => Callback,
      labelExists: CallbackTo[Boolean]
    ): RadioDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getId = getId.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getValue = getValue.toJsFn, iconExists = iconExists.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, keyDown = js.Any.fromFunction1((t0: String) => keyDown(t0).runNow()), labelExists = labelExists.toJsFn)
      __obj.asInstanceOf[RadioDriver]
    }
    
    extension [Self <: RadioDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[String]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "iconExists", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setKeyDown(value: String => Callback): Self = StObject.set(x, "keyDown", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLabelExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "labelExists", value.toJsFn)
    }
  }
}
