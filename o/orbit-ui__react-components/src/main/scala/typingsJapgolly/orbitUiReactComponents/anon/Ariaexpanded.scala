package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.ReactKeyboardEventFrom
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
trait Ariaexpanded extends StObject {
  
  var `aria-controls`: String = js.native
  
  var `aria-describedby`: String = js.native
  
  var `aria-expanded`: Boolean = js.native
  
  var `aria-haspopup`: dialog | menu | listbox = js.native
  
  var `aria-label`: String = js.native
  
  var `aria-labelledby`: String = js.native
  
  var disabled: Boolean = js.native
  
  var id: String = js.native
  
  var onBlur: Unit = js.native
  
  var onClick: Unit = js.native
  
  var onFocus: Unit = js.native
  
  var onKeyDown: Unit = js.native
  def onKeyDown(event: ReactKeyboardEventFrom[Element]): Unit = js.native
  
  var onKeyUp: Unit = js.native
  
  var onMouseEnter: Unit = js.native
  
  var ref: MergedRef[HTMLElement] = js.native
  
  var tabIndex: Double = js.native
}
