package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiCore.anon.GetBorderRadius
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedButtonButtonDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/button/Button.driver", "buttonDriverFactory")
  @js.native
  val buttonDriverFactory: DriverFactory[ButtonDriver] = js.native
  
  trait ButtonDriver
    extends StObject
       with BaseDriver {
    
    /** click on the button root element */
    def click(): Any
    
    /** returns elements textContent */
    def getTextContent(): Any
    
    /** returns elements type attribute */
    def getType(): Any
    
    /** returns if the element is disabled */
    def isDisabled(): Boolean
    
    var styles: GetBorderRadius
  }
  object ButtonDriver {
    
    inline def apply(
      click: CallbackTo[Any],
      exists: CallbackTo[Boolean],
      getTextContent: CallbackTo[Any],
      getType: CallbackTo[Any],
      isDisabled: CallbackTo[Boolean],
      styles: GetBorderRadius
    ): ButtonDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getTextContent = getTextContent.toJsFn, getType = getType.toJsFn, isDisabled = isDisabled.toJsFn, styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonDriver]
    }
    
    extension [Self <: ButtonDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetTextContent(value: CallbackTo[Any]): Self = StObject.set(x, "getTextContent", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[Any]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setStyles(value: GetBorderRadius): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
