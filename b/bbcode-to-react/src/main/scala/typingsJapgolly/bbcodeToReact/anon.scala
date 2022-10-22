package typingsJapgolly.bbcodeToReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Linkify extends StObject {
    
    var linkify: Boolean
  }
  object Linkify {
    
    inline def apply(linkify: Boolean): Linkify = {
      val __obj = js.Dynamic.literal(linkify = linkify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linkify]
    }
    
    extension [Self <: Linkify](x: Self) {
      
      inline def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Omit<bbcode-to-react.bbcode-to-react.TagType, 'children'>> */
  trait PartialOmitTagTypechildre extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var parent: js.UndefOr[Node] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PartialOmitTagTypechildre {
    
    inline def apply(): PartialOmitTagTypechildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOmitTagTypechildre]
    }
    
    extension [Self <: PartialOmitTagTypechildre](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParent(value: VdomNode): Self = StObject.set(x, "parent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setParentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "parent", js.Array(value*))
      
      inline def setParentVdomElement(value: VdomElement): Self = StObject.set(x, "parent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
