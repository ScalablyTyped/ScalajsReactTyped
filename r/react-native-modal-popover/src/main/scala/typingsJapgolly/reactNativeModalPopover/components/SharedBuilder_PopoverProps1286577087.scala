package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Placement
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Rect
import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Size
import typingsJapgolly.reactNativeModalPopover.libPopoverMod.Orientation
import typingsJapgolly.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PopoverProps1286577087[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def arrowSize(value: Size): this.type = set("arrowSize", value.asInstanceOf[js.Any])
  
  inline def arrowStyle(value: StyleProp[ViewStyle]): this.type = set("arrowStyle", value.asInstanceOf[js.Any])
  
  inline def arrowStyleNull: this.type = set("arrowStyle", null)
  
  inline def backgroundStyle(value: StyleProp[ViewStyle]): this.type = set("backgroundStyle", value.asInstanceOf[js.Any])
  
  inline def backgroundStyleNull: this.type = set("backgroundStyle", null)
  
  inline def calculateStatusBar(value: Boolean): this.type = set("calculateStatusBar", value.asInstanceOf[js.Any])
  
  inline def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
  
  inline def contentStyleNull: this.type = set("contentStyle", null)
  
  inline def displayArea(value: Rect): this.type = set("displayArea", value.asInstanceOf[js.Any])
  
  inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
  
  inline def easing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): this.type = set("easing", js.Any.fromFunction1(value))
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
  
  inline def placement(value: Placement | auto): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def popoverStyle(value: StyleProp[ViewStyle]): this.type = set("popoverStyle", value.asInstanceOf[js.Any])
  
  inline def popoverStyleNull: this.type = set("popoverStyle", null)
  
  inline def supportedOrientations(value: js.Array[Orientation]): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
  
  inline def supportedOrientationsVarargs(value: Orientation*): this.type = set("supportedOrientations", js.Array(value*))
  
  inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
