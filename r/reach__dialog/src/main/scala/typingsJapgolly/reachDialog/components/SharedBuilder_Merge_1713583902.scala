package typingsJapgolly.reachDialog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachDialog.reachDialogStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Merge_1713583902 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def allowPinchZoom(value: Boolean): this.type = set("allowPinchZoom", value.asInstanceOf[js.Any])
  
  inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def dangerouslyBypassFocusLock(value: Boolean): this.type = set("dangerouslyBypassFocusLock", value.asInstanceOf[js.Any])
  
  inline def dangerouslyBypassScrollLock(value: Boolean): this.type = set("dangerouslyBypassScrollLock", value.asInstanceOf[js.Any])
  
  inline def initialFocusRef(value: RefHandle[Any]): this.type = set("initialFocusRef", value.asInstanceOf[js.Any])
  
  inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  
  inline def onDismiss(value: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
  
  inline def unstable_lockFocusAcrossFrames(value: Boolean): this.type = set("unstable_lockFocusAcrossFrames", value.asInstanceOf[js.Any])
}
