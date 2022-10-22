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

trait Desc extends StObject {
  
  var desc: Node
  
  var icon: Node
  
  var target: js.UndefOr[String] = js.undefined
  
  var title: Node
  
  var url: String
}
object Desc {
  
  inline def apply(url: String): Desc = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], desc = null, icon = null, title = null)
    __obj.asInstanceOf[Desc]
  }
  
  extension [Self <: Desc](x: Self) {
    
    inline def setDesc(value: VdomNode): Self = StObject.set(x, "desc", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDescNull: Self = StObject.set(x, "desc", null)
    
    inline def setDescVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "desc", js.Array(value*))
    
    inline def setDescVdomElement(value: VdomElement): Self = StObject.set(x, "desc", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
