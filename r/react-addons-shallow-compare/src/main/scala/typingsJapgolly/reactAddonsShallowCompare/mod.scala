package typingsJapgolly.reactAddonsShallowCompare

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[P, S](component: Component[P & js.Object, js.Object], nextProps: P, nextState: S): Boolean = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("react-addons-shallow-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
