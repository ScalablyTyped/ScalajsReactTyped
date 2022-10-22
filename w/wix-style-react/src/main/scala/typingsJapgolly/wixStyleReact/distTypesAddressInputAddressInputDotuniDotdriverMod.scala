package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputAddressInputDotuniDotdriverMod {
  
  trait AddressInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAtOption(index: Double): js.Promise[Unit]
    
    def clickAtOptionWithValue(value: String): js.Promise[Unit]
    
    def clickClear(): js.Promise[Unit]
    
    def clickInput(): js.Promise[Unit]
    
    def enterText(value: String): js.Promise[Unit]
    
    def getAmountOfItems(): js.Promise[Double]
    
    def getInputValue(): js.Promise[String]
    
    def getItemMainLabelAt(index: Double): js.Promise[String]
    
    def getItemSecondaryLabelAt(index: Double): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isLoading(): js.Promise[Boolean]
    
    def pressEnter(): js.Promise[Unit]
  }
  object AddressInputUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickAtOption: Double => js.Promise[Unit],
      clickAtOptionWithValue: String => js.Promise[Unit],
      clickClear: CallbackTo[js.Promise[Unit]],
      clickInput: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getAmountOfItems: CallbackTo[js.Promise[Double]],
      getInputValue: CallbackTo[js.Promise[String]],
      getItemMainLabelAt: Double => js.Promise[String],
      getItemSecondaryLabelAt: Double => js.Promise[String],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isLoading: CallbackTo[js.Promise[Boolean]],
      pressEnter: CallbackTo[js.Promise[Unit]]
    ): AddressInputUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickAtOption = js.Any.fromFunction1(clickAtOption), clickAtOptionWithValue = js.Any.fromFunction1(clickAtOptionWithValue), clickClear = clickClear.toJsFn, clickInput = clickInput.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getAmountOfItems = getAmountOfItems.toJsFn, getInputValue = getInputValue.toJsFn, getItemMainLabelAt = js.Any.fromFunction1(getItemMainLabelAt), getItemSecondaryLabelAt = js.Any.fromFunction1(getItemSecondaryLabelAt), isDisabled = isDisabled.toJsFn, isFocused = isFocused.toJsFn, isLoading = isLoading.toJsFn, pressEnter = pressEnter.toJsFn)
      __obj.asInstanceOf[AddressInputUniDriver]
    }
    
    extension [Self <: AddressInputUniDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1(value))
      
      inline def setClickAtOptionWithValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickAtOptionWithValue", js.Any.fromFunction1(value))
      
      inline def setClickClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickClear", value.toJsFn)
      
      inline def setClickInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickInput", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetAmountOfItems(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getAmountOfItems", value.toJsFn)
      
      inline def setGetInputValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getInputValue", value.toJsFn)
      
      inline def setGetItemMainLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemMainLabelAt", js.Any.fromFunction1(value))
      
      inline def setGetItemSecondaryLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemSecondaryLabelAt", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsLoading(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoading", value.toJsFn)
      
      inline def setPressEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pressEnter", value.toJsFn)
    }
  }
}
