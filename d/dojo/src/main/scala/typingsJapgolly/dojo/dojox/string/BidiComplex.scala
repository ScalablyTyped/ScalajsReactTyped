package typingsJapgolly.dojo.dojox.string

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/BidiComplex.html
  *
  *
  */
trait BidiComplex extends js.Object {
  /**
    * Attach key listeners to the INPUT field to accomodate dynamic complex BiDi expressions
    *
    * @param field
    * @param pattern
    */
  def attachInput(field: HTMLElement, pattern: String): Unit
  /**
    * Create the display string by adding the Unicode direction Markers
    *
    * @param str
    * @param pattern
    */
  def createDisplayString(str: String, pattern: String): Unit
  /**
    * removes all Unicode directional markers from the string
    *
    * @param str
    */
  def stripSpecialCharacters(str: js.Any): Unit
}

object BidiComplex {
  @scala.inline
  def apply(
    attachInput: (HTMLElement, String) => Callback,
    createDisplayString: (String, String) => Callback,
    stripSpecialCharacters: js.Any => Callback
  ): BidiComplex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachInput")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => attachInput(t0, t1).runNow()))
    __obj.updateDynamic("createDisplayString")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createDisplayString(t0, t1).runNow()))
    __obj.updateDynamic("stripSpecialCharacters")(js.Any.fromFunction1((t0: js.Any) => stripSpecialCharacters(t0).runNow()))
    __obj.asInstanceOf[BidiComplex]
  }
}

