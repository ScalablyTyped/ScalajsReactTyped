package typingsJapgolly.riotjsDomBindings.mod

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateChunkMeta extends StObject {
  
  var avoidDOMInjection: Boolean
  
  var children: HTMLCollection[Any]
  
  var fragment: DocumentFragment
}
object TemplateChunkMeta {
  
  inline def apply(avoidDOMInjection: Boolean, children: HTMLCollection[Any], fragment: DocumentFragment): TemplateChunkMeta = {
    val __obj = js.Dynamic.literal(avoidDOMInjection = avoidDOMInjection.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunkMeta]
  }
  
  extension [Self <: TemplateChunkMeta](x: Self) {
    
    inline def setAvoidDOMInjection(value: Boolean): Self = StObject.set(x, "avoidDOMInjection", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: HTMLCollection[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: DocumentFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
  }
}
