package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlankTarget extends StObject {
  
  var blankTarget: js.UndefOr[Boolean] = js.undefined
  
  var href: String
  
  var key: js.UndefOr[String] = js.undefined
  
  var title: Node
}
object BlankTarget {
  
  inline def apply(href: String): BlankTarget = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = null)
    __obj.asInstanceOf[BlankTarget]
  }
  
  extension [Self <: BlankTarget](x: Self) {
    
    inline def setBlankTarget(value: Boolean): Self = StObject.set(x, "blankTarget", value.asInstanceOf[js.Any])
    
    inline def setBlankTargetUndefined: Self = StObject.set(x, "blankTarget", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
