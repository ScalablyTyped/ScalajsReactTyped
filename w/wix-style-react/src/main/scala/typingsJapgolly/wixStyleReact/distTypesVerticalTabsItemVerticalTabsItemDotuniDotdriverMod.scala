package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsItemVerticalTabsItemDotuniDotdriverMod {
  
  trait VerticalTabsItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getText(): js.Promise[String]
    
    def pressEnterKey(): js.Promise[Unit]
  }
  object VerticalTabsItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getText: CallbackTo[js.Promise[String]],
      pressEnterKey: CallbackTo[js.Promise[Unit]]
    ): VerticalTabsItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getText = getText.toJsFn, pressEnterKey = pressEnterKey.toJsFn)
      __obj.asInstanceOf[VerticalTabsItemUniDriver]
    }
    
    extension [Self <: VerticalTabsItemUniDriver](x: Self) {
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setPressEnterKey(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pressEnterKey", value.toJsFn)
    }
  }
}
