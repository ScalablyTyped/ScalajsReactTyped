package typingsJapgolly.leafletDraw.mod

import typingsJapgolly.leafletDraw.mod.Control.DrawConstructorOptions
import typingsJapgolly.leafletDraw.mod.Draw.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DrawToolbar")
@js.native
class DrawToolbar () extends Toolbar {
  def getActions(handler: Feature): js.Array[ToolbarAction] = js.native
  def getModeHandlers(map: DrawMap): js.Array[ToolbarModeHandler] = js.native
  def setOptions(options: DrawConstructorOptions): Unit = js.native
}

