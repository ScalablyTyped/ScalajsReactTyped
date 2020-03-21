package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.worldMapMod.WorldMapProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "WorldMap")
@js.native
class WorldMap protected ()
  extends Component[WorldMapProps with SVGProps[SVGSVGElement], ComponentState, js.Any] {
  def this(props: WorldMapProps with SVGProps[org.scalajs.dom.raw.SVGSVGElement]) = this()
  def this(props: WorldMapProps with SVGProps[org.scalajs.dom.raw.SVGSVGElement], context: js.Any) = this()
}

@JSImport("grommet", "WorldMap")
@js.native
object WorldMap extends TopLevel[ComponentClass[WorldMapProps with SVGProps[SVGSVGElement], ComponentState]]

