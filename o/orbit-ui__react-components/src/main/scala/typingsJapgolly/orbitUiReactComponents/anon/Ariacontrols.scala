package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.listbox
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ariacontrols extends StObject {
  
  var `aria-controls`: String = js.native
  
  var `aria-expanded`: Boolean = js.native
  
  var `aria-haspopup`: dialog | menu | listbox = js.native
  
  var onBlur: Unit = js.native
  def onBlur(event: ReactFocusEventFrom[Element]): Unit = js.native
  
  var onClick: Unit = js.native
  def onClick(event: ReactEventFrom[Element]): Unit = js.native
  
  var onFocus: Unit = js.native
  def onFocus(event: ReactFocusEventFrom[Element]): Unit = js.native
  
  var onKeyDown: Unit = js.native
  def onKeyDown(event: ReactKeyboardEventFrom[Element]): Unit = js.native
  
  var onKeyUp: Unit = js.native
  def onKeyUp(event: ReactKeyboardEventFrom[Element]): Unit = js.native
  
  var onMouseEnter: Unit = js.native
  def onMouseEnter(event: ReactMouseEventFrom[Element]): Unit = js.native
  
  var ref: MergedRef[HTMLElement] = js.native
  
  var tabIndex: Double = js.native
}
