package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardHeaderHeaderDotdriverMod {
  
  trait HeaderDriver
    extends StObject
       with BaseDriver {
    
    def subtitle(): String
    
    def title(): String
  }
  object HeaderDriver {
    
    inline def apply(exists: CallbackTo[Boolean], subtitle: CallbackTo[String], title: CallbackTo[String]): HeaderDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, subtitle = subtitle.toJsFn, title = title.toJsFn)
      __obj.asInstanceOf[HeaderDriver]
    }
    
    extension [Self <: HeaderDriver](x: Self) {
      
      inline def setSubtitle(value: CallbackTo[String]): Self = StObject.set(x, "subtitle", value.toJsFn)
      
      inline def setTitle(value: CallbackTo[String]): Self = StObject.set(x, "title", value.toJsFn)
    }
  }
}
