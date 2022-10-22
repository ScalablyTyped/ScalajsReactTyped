package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.Tooltip_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Tooltip")
@js.native
open class Tooltip[P /* <: TooltipProps */, E /* <: Tooltip_ */] protected () extends DivOverlay[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def onTooltipClose(arg: typingsJapgolly.reactLeaflet.anon.Tooltip[E]): Unit = js.native
  
  def onTooltipOpen(arg: typingsJapgolly.reactLeaflet.anon.Tooltip[E]): Unit = js.native
}
