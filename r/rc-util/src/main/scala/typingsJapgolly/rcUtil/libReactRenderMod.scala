package typingsJapgolly.rcUtil

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReactRenderMod {
  
  @JSImport("rc-util/lib/React/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def r(node: Element, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_r")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def render(node: Element, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def u(container: ContainerType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_u")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmount(container: ContainerType): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(container.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcUtil.anon.ElementMARKRootundefined
    - typingsJapgolly.rcUtil.anon.DocumentFragmentMARKRootu
  */
  trait ContainerType extends StObject
}
