package typingsJapgolly.dojo.dojox.drawing.ui

import typingsJapgolly.dojo.dojox.drawing.plugins.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/ui/Tooltip.html
  *
  *
  * @param options
  */
@JSGlobal("dojox.drawing.ui.Tooltip")
@js.native
class Tooltip protected () extends Plugin {
  def this(options: js.Any) = this()
  /**
    *
    */
  var height: Double = js.native
  /**
    *
    */
  var width: Double = js.native
  /**
    *
    */
  def onOut(): Unit = js.native
  /**
    *
    */
  def onOver(): Unit = js.native
}

