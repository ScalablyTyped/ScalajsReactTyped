package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialButtonSocialButtonDotuniDotdriverMod {
  
  trait SocialButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getText(): js.Promise[String]
  }
  object SocialButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getText: CallbackTo[js.Promise[String]]
    ): SocialButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getText = getText.toJsFn)
      __obj.asInstanceOf[SocialButtonUniDriver]
    }
    
    extension [Self <: SocialButtonUniDriver](x: Self) {
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
    }
  }
}
