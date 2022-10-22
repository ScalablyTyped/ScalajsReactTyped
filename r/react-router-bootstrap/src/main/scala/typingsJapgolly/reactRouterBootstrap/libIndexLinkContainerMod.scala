package typingsJapgolly.reactRouterBootstrap

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexLinkContainerMod extends Shortcut {
  
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  val default: ComponentClassP[NavLinkProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-router-bootstrap/lib/IndexLinkContainer", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends Component[NavLinkProps, js.Object, Any] {
    def this(props: NavLinkProps) = this()
    def this(props: NavLinkProps, context: Any) = this()
  }
  
  //IndexLink is removed in react-router, but continues there in react-router-bootstrap for backwards compatibility.
  //Better use <LinkContainer exact/>
  type IndexLinkContainer = ComponentClassP[NavLinkProps & js.Object]
  
  type _To = ComponentClassP[NavLinkProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `libIndexLinkContainerMod.foo` */
  override def _to: ComponentClassP[NavLinkProps & js.Object] = default
}
