package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsRadioButtonRadioButtonDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def radioButtonUniDriverFactory(base: UniDriver[Any]): RadioUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("radioButtonUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[RadioUniDriver]
  
  trait RadioUniDriver
    extends StObject
       with BaseUniDriver {
    
    def iconExists(): js.Promise[Boolean]
    
    def id(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocusVisible(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isInputFocused(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
    
    def keyDown(key: Any): js.Promise[Unit]
    
    def labelExists(): js.Promise[Boolean]
    
    def name(): js.Promise[String]
    
    def value(): js.Promise[String]
  }
  object RadioUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      iconExists: CallbackTo[js.Promise[Boolean]],
      id: CallbackTo[js.Promise[String]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isFocusVisible: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isInputFocused: CallbackTo[js.Promise[Boolean]],
      isRequired: CallbackTo[js.Promise[Boolean]],
      keyDown: Any => js.Promise[Unit],
      labelExists: CallbackTo[js.Promise[Boolean]],
      name: CallbackTo[js.Promise[String]],
      value: CallbackTo[js.Promise[String]]
    ): RadioUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, iconExists = iconExists.toJsFn, id = id.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isFocusVisible = isFocusVisible.toJsFn, isFocused = isFocused.toJsFn, isInputFocused = isInputFocused.toJsFn, isRequired = isRequired.toJsFn, keyDown = js.Any.fromFunction1(keyDown), labelExists = labelExists.toJsFn, name = name.toJsFn, value = value.toJsFn)
      __obj.asInstanceOf[RadioUniDriver]
    }
    
    extension [Self <: RadioUniDriver](x: Self) {
      
      inline def setIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "iconExists", value.toJsFn)
      
      inline def setId(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "id", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsFocusVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocusVisible", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsInputFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isInputFocused", value.toJsFn)
      
      inline def setIsRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRequired", value.toJsFn)
      
      inline def setKeyDown(value: Any => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setLabelExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "labelExists", value.toJsFn)
      
      inline def setName(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "name", value.toJsFn)
      
      inline def setValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "value", value.toJsFn)
    }
  }
}
