package typingsJapgolly.reactNativeSvgCharts.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeSvgCharts.anon.BOTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "Grid")
@js.native
open class Grid[T] protected ()
  extends Component[GridProps[T], js.Object, Any] {
  def this(props: GridProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: GridProps[T], context: Any) = this()
}
/* static members */
object Grid {
  
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-svg-charts", "Grid.Direction")
  @js.native
  def Direction: BOTH = js.native
  inline def Direction_=(x: BOTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Direction")(x.asInstanceOf[js.Any])
}
