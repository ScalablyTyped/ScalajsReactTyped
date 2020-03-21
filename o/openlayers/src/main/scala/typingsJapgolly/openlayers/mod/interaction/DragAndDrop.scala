package typingsJapgolly.openlayers.mod.interaction

import org.scalajs.dom.raw.File
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.olx.interaction.DragAndDropOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragAndDrop")
@js.native
/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
class DragAndDrop () extends Interaction {
  def this(opt_options: DragAndDropOptions) = this()
}

/* static members */
@JSImport("openlayers", "interaction.DragAndDrop")
@js.native
object DragAndDrop extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
    * of this type.
    *
    * @param type Type.
    * @param file File.
    * @param opt_features Features.
    * @param opt_projection Projection.
    */
  @js.native
  class Event protected ()
    extends typingsJapgolly.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    def this(`type`: DragAndDropEventType, file: File) = this()
    def this(`type`: DragAndDropEventType, file: File, opt_features: js.Array[Feature]) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: js.Array[Feature],
      opt_projection: Projection
    ) = this()
    /**
      * The features parsed from dropped data.
      * @api stable
      */
    var features: js.Array[Feature] = js.native
    /**
      * The dropped file.
      * @api stable
      */
    var file: File = js.native
    /**
      * The feature projection.
      * @api
      */
    var projection: Projection = js.native
  }
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
    * neither prevents the browser default nor stops event propagation.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  var handleEvent: js.Any = js.native
}

