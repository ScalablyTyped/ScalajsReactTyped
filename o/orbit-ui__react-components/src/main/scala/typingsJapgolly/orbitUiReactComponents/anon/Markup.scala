package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Markup extends StObject {
  
  var markup: Element
  
  var tileProps: ClassNameString
}
object Markup {
  
  inline def apply(markup: VdomElement, tileProps: ClassNameString): Markup = {
    val __obj = js.Dynamic.literal(markup = markup.rawElement.asInstanceOf[js.Any], tileProps = tileProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markup]
  }
  
  extension [Self <: Markup](x: Self) {
    
    inline def setMarkup(value: VdomElement): Self = StObject.set(x, "markup", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTileProps(value: ClassNameString): Self = StObject.set(x, "tileProps", value.asInstanceOf[js.Any])
  }
}
