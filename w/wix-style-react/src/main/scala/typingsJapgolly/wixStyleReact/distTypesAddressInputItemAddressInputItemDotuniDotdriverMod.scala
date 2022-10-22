package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputItemAddressInputItemDotuniDotdriverMod {
  
  trait AddressInputItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMainLabelText(): js.Promise[String]
    
    def getPrefix(): js.Promise[BaseUniDriver]
    
    def getSecondaryLabelText(): js.Promise[String]
    
    def getSuffix(): js.Promise[BaseUniDriver]
  }
  object AddressInputItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getMainLabelText: CallbackTo[js.Promise[String]],
      getPrefix: CallbackTo[js.Promise[BaseUniDriver]],
      getSecondaryLabelText: CallbackTo[js.Promise[String]],
      getSuffix: CallbackTo[js.Promise[BaseUniDriver]]
    ): AddressInputItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getMainLabelText = getMainLabelText.toJsFn, getPrefix = getPrefix.toJsFn, getSecondaryLabelText = getSecondaryLabelText.toJsFn, getSuffix = getSuffix.toJsFn)
      __obj.asInstanceOf[AddressInputItemUniDriver]
    }
    
    extension [Self <: AddressInputItemUniDriver](x: Self) {
      
      inline def setGetMainLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMainLabelText", value.toJsFn)
      
      inline def setGetPrefix(value: CallbackTo[js.Promise[BaseUniDriver]]): Self = StObject.set(x, "getPrefix", value.toJsFn)
      
      inline def setGetSecondaryLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSecondaryLabelText", value.toJsFn)
      
      inline def setGetSuffix(value: CallbackTo[js.Promise[BaseUniDriver]]): Self = StObject.set(x, "getSuffix", value.toJsFn)
    }
  }
}
