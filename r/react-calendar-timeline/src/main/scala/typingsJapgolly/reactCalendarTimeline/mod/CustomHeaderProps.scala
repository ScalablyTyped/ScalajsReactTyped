package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomHeaderProps[Data] extends StObject {
  
  def children(): Node = js.native
  def children(props: CustomHeaderPropsChildrenFnProps[Data]): Node = js.native
  
  var headerData: js.UndefOr[Data] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[Unit] = js.native
}
