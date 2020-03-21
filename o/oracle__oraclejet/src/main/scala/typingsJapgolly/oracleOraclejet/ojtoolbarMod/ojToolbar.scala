package typingsJapgolly.oracleOraclejet.ojtoolbarMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.chroming
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.chromingChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.full
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.half
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojToolbar extends baseComponent[ojToolbarSettableProperties] {
  var chroming: full | half | outlined = js.native
  var onChromingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  def addEventListener(`type`: chromingChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  def setProperties(properties: ojToolbarSettablePropertiesLenient): Unit = js.native
  def setProperty(property: chroming, value: full): Unit = js.native
  def setProperty(property: chroming, value: half): Unit = js.native
  def setProperty(property: chroming, value: outlined): Unit = js.native
}

