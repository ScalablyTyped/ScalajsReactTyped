package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlighterHighlighterDotdriverMod {
  
  trait HighlighterDriver[T]
    extends StObject
       with BaseDriver {
    
    def getElement(): T
    
    def html(): String
  }
  object HighlighterDriver {
    
    inline def apply[T](exists: CallbackTo[Boolean], getElement: CallbackTo[T], html: CallbackTo[String]): HighlighterDriver[T] = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getElement = getElement.toJsFn, html = html.toJsFn)
      __obj.asInstanceOf[HighlighterDriver[T]]
    }
    
    extension [Self <: HighlighterDriver[?], T](x: Self & HighlighterDriver[T]) {
      
      inline def setGetElement(value: CallbackTo[T]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHtml(value: CallbackTo[String]): Self = StObject.set(x, "html", value.toJsFn)
    }
  }
}
