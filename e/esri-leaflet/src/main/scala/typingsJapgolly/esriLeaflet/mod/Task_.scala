package typingsJapgolly.esriLeaflet.mod

import typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
  * ArcGIS Server Services like query, find and identify.
  */
@JSImport("esri-leaflet", "Task")
@js.native
class Task_ protected ()
  extends typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.Task_ {
  def this(options: typingsJapgolly.esriLeaflet.mod.leafletAugmentingMod.esri.Service) = this()
  def this(options: TaskOptions) = this()
}

