package typingsJapgolly.expo

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var errorRecovery: js.UndefOr[Any] = js.undefined
    
    var manifestString: js.UndefOr[String] = js.undefined
    
    var notification: js.UndefOr[Any] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setErrorRecovery(value: Any): Self = StObject.set(x, "errorRecovery", value.asInstanceOf[js.Any])
      
      inline def setErrorRecoveryUndefined: Self = StObject.set(x, "errorRecovery", js.undefined)
      
      inline def setManifestString(value: String): Self = StObject.set(x, "manifestString", value.asInstanceOf[js.Any])
      
      inline def setManifestStringUndefined: Self = StObject.set(x, "manifestString", js.undefined)
      
      inline def setNotification(value: Any): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
    
    var response: js.UndefOr[Response] = js.undefined
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
