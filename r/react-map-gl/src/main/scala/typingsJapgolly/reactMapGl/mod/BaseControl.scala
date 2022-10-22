package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "BaseControl")
@js.native
open class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] protected ()
  extends PureComponent[T, js.Object, Any] {
  def this(props: T) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: T, context: Any) = this()
  
  var _containerRef: RefHandle[S] = js.native
  
  var _context: MapContextProps = js.native
}
