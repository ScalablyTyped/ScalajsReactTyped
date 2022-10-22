package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies how the TAB key should be used in a form.
  *
  * If the last control of a form is focused, and the user pressed the TAB key, there are several possibilities how a {@link FormController} should handle
  * this. TabulatorCycle specifies these possibilities.
  *
  * Note that the TabulatorCycle determines what happens when SHIFT-TAB is pressed on the **first** control of a form, as well as when TAB is pressed on
  * the **last** control.
  *
  * **First** and **last** refers to the tabbing order of controls.
  * @see FormControlModel.TabIndex
  * @see FormController
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait TabulatorCycle extends StObject
object TabulatorCycle {
  
  /**
    * a navigation bar is provided and navigation will be performed on the current/active form.
    *
    * This is the default and most often encountered mode.
    *
    * pressing the TAB key from the last control moves the focus to the first control in the tab order of the same record.
    */
  inline def CURRENT: `1` = 1.asInstanceOf[`1`]
  
  /** pressing the TAB key from the last control of a form moves the focus to the first control of the next form in the tab order. */
  inline def PAGE: `2` = 2.asInstanceOf[`2`]
  
  /** pressing the TAB key from the last control moves the focus to the first control in the tab order of the next record. */
  inline def RECORDS: `0` = 0.asInstanceOf[`0`]
}
