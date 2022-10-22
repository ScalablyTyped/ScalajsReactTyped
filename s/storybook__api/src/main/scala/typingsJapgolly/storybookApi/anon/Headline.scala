package typingsJapgolly.storybookApi.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headline extends StObject {
  
  var headline: String
  
  var subHeadline: js.UndefOr[String | Node] = js.undefined
}
object Headline {
  
  inline def apply(headline: String): Headline = {
    val __obj = js.Dynamic.literal(headline = headline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headline]
  }
  
  extension [Self <: Headline](x: Self) {
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setSubHeadline(value: String | Node): Self = StObject.set(x, "subHeadline", value.asInstanceOf[js.Any])
    
    inline def setSubHeadlineNull: Self = StObject.set(x, "subHeadline", null)
    
    inline def setSubHeadlineUndefined: Self = StObject.set(x, "subHeadline", js.undefined)
    
    inline def setSubHeadlineVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subHeadline", js.Array(value*))
    
    inline def setSubHeadlineVdomElement(value: VdomElement): Self = StObject.set(x, "subHeadline", value.rawElement.asInstanceOf[js.Any])
  }
}
