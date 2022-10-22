package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityRole extends StObject {
  
  var accessibilityRole: link = js.native
  
  var href: String = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  def onPress(): Unit = js.native
  def onPress(e: ReactMouseEventFrom[HTMLAnchorElement]): Unit = js.native
  def onPress(e: GestureResponderEvent): Unit = js.native
}
