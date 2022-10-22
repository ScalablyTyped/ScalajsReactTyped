package typingsJapgolly.reachAlertDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachAlertDialog.reachAlertDialogStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Merge_1356725188 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def allowPinchZoom(value: Boolean): this.type = set("allowPinchZoom", value.asInstanceOf[js.Any])
  
  inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def initialFocusRef(value: RefHandle[Any]): this.type = set("initialFocusRef", value.asInstanceOf[js.Any])
  
  inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  
  inline def leastDestructiveRef(value: RefHandle[HTMLElement]): this.type = set("leastDestructiveRef", value.asInstanceOf[js.Any])
  
  inline def onDismiss(value: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
  
  inline def unstable_lockFocusAcrossFrames(value: Boolean): this.type = set("unstable_lockFocusAcrossFrames", value.asInstanceOf[js.Any])
}
