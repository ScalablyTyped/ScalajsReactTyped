package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes in which way the navigation of the records of a database form is performed. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait NavigationBarMode extends StObject
object NavigationBarMode {
  
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  inline def CURRENT: `1` = 1.asInstanceOf[`1`]
  
  /**
    * no navigation bar is provided and navigation on the current form is only possible with the keyboard (TAB/SHIFT TAB).
    *
    * Note that when this mode is set, a simultaneous TabulatorCycle value of TabulatorCycle::CURRENT means that you cannot travel between records anymore.
    * @see TabulatorCycle
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * a navigation bar is provided and navigation will be performed on the parent of the current/active form.
    *
    * This options is usually used for forms containing an grid control only. In such a form, the control has it's own navigation elements, so there is no
    * need to use the navigation bar for the form, but rather for its parent.
    */
  inline def PARENT: `2` = 2.asInstanceOf[`2`]
}
