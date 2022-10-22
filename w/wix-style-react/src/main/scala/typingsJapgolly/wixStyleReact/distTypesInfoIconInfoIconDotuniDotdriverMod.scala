package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInfoIconInfoIconDotuniDotdriverMod {
  
  trait InfoIconUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getContent(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def hover(): js.Promise[Unit]
  }
  object InfoIconUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContent: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[String]],
      hover: CallbackTo[js.Promise[Unit]]
    ): InfoIconUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getContent = getContent.toJsFn, getSize = getSize.toJsFn, hover = hover.toJsFn)
      __obj.asInstanceOf[InfoIconUniDriver]
    }
    
    extension [Self <: InfoIconUniDriver](x: Self) {
      
      inline def setGetContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setHover(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hover", value.toJsFn)
    }
  }
}
