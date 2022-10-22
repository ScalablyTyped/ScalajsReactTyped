package typingsJapgolly.reactLinkify.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLinkify.mod.MatchInfo
import typingsJapgolly.reactLinkify.mod.Props
import typingsJapgolly.reactLinkify.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLinkify {
  
  @JSImport("react-linkify", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def componentDecorator(value: (/* decoratedHref */ String, /* decoratedText */ String, /* key */ Double) => Node): this.type = set("componentDecorator", js.Any.fromFunction3(value))
    
    inline def hrefDecorator(value: /* urlHref */ String => String): this.type = set("hrefDecorator", js.Any.fromFunction1(value))
    
    inline def matchDecorator(value: /* text */ String => js.Array[MatchInfo] | Null): this.type = set("matchDecorator", js.Any.fromFunction1(value))
    
    inline def textDecorator(value: /* urlText */ String => String): this.type = set("textDecorator", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactLinkify.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
