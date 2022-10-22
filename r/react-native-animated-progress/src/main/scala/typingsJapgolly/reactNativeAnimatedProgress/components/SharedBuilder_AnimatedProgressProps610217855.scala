package typingsJapgolly.reactNativeAnimatedProgress.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AnimatedProgressProps610217855 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
  
  inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
  
  inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
  
  inline def indeterminateDuration(value: Double): this.type = set("indeterminateDuration", value.asInstanceOf[js.Any])
  
  inline def onCompletion(value: CallbackTo[Any]): this.type = set("onCompletion", value.toJsFn)
  
  inline def progress(value: Double): this.type = set("progress", value.asInstanceOf[js.Any])
  
  inline def progressDuration(value: Double): this.type = set("progressDuration", value.asInstanceOf[js.Any])
  
  inline def trackColor(value: String): this.type = set("trackColor", value.asInstanceOf[js.Any])
}
