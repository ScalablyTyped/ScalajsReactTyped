package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.ScrollbarComponent
  * @augments pc.Component
  * @description Create a new ScrollbarComponent.
  * @classdesc A ScrollbarComponent enables a group of entities to behave like a draggable scrollbar.
  * @param {pc.ScrollbarComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {number} orientation Whether the scrollbar moves horizontally or vertically. Can be:
  *
  * * {@link pc.ORIENTATION_HORIZONTAL}: The scrollbar animates in the horizontal axis.
  * * {@link pc.ORIENTATION_VERTICAL}: The scrollbar animates in the vertical axis.
  *
  * Defaults to pc.ORIENTATION_HORIZONTAL.
  * @property {number} value The current position value of the scrollbar, in the range 0 to 1. Defaults to 0.
  * @property {number} handleSize The size of the handle relative to the size of the track, in the range
  * 0 to 1. For a vertical scrollbar, a value of 1 means that the handle will take up the full height of
  * the track.
  * @property {pc.Entity} handleEntity The entity to be used as the scrollbar handle. This entity must
  * have a Scrollbar component.
  */
@JSImport("playcanvas", "ScrollbarComponent")
@js.native
class ScrollbarComponent protected ()
  extends typingsJapgolly.playcanvas.pc.ScrollbarComponent {
  def this(
    system: typingsJapgolly.playcanvas.pc.ScrollbarComponentSystem,
    entity: typingsJapgolly.playcanvas.pc.Entity
  ) = this()
}

