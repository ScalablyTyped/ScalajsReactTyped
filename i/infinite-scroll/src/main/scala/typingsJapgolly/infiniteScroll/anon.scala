package typingsJapgolly.infiniteScroll

import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    /** The operative content loaded from the fetch request */
    var body: String | js.Object
    
    /** Appended elements if `append` is `true` in config */
    var items: js.UndefOr[NodeList[Node]] = js.undefined
    
    /** Reponse returned from `fetch` */
    var response: Response
  }
  object Body {
    
    inline def apply(body: String | js.Object, response: Response): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setItems(value: NodeList[Node]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
