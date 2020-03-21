package typingsJapgolly.dojo.dojox.grid.cells

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.html
  *
  *
  */
trait dijit_ extends js.Object {
  /**
    *
    */
  def CheckBox(): Unit
  /**
    *
    */
  def ComboBox(): Unit
  /**
    *
    */
  def DateTextBox(): Unit
  /**
    *
    */
  def Editor(): Unit
}

object dijit_ {
  @scala.inline
  def apply(CheckBox: Callback, ComboBox: Callback, DateTextBox: Callback, Editor: Callback): dijit_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CheckBox")(CheckBox.toJsFn)
    __obj.updateDynamic("ComboBox")(ComboBox.toJsFn)
    __obj.updateDynamic("DateTextBox")(DateTextBox.toJsFn)
    __obj.updateDynamic("Editor")(Editor.toJsFn)
    __obj.asInstanceOf[dijit_]
  }
}

