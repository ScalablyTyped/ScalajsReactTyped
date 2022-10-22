package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.wordpressComponents.externalLinkMod.ExternalLink.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalLinkMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/external-link", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ExternalLink {
    
    type Props = HTMLProps[HTMLAnchorElement]
  }
}
