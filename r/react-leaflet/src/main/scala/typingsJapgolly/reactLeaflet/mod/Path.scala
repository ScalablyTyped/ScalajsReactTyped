package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.PathOptions
import typingsJapgolly.reactLeaflet.anon.PopupContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("react-leaflet", "Path")
@js.native
open class Path[P /* <: PathProps */, E /* <: typingsJapgolly.leaflet.mod.Path */] protected () extends MapLayer[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def getChildContext(): PopupContainer[E] = js.native
  
  def getPathOptions(props: P): PathOptions = js.native
  
  def setStyle(options: PathOptions): Unit = js.native
  
  def setStyleIfChanged(fromProps: P, toProps: P): Unit = js.native
}
