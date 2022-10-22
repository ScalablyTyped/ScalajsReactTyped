package typingsJapgolly.reactQrReader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactQrReader.reactQrReaderBooleans.`false`
import typingsJapgolly.reactQrReader.reactQrReaderStrings.environment
import typingsJapgolly.reactQrReader.reactQrReaderStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_props_762593117[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def delay(value: Double | `false`): this.type = set("delay", value.asInstanceOf[js.Any])
  
  inline def facingMode(value: user | environment): this.type = set("facingMode", value.asInstanceOf[js.Any])
  
  inline def legacyMode(value: Boolean): this.type = set("legacyMode", value.asInstanceOf[js.Any])
  
  inline def onImageLoad(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
  
  inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
  
  inline def resolution(value: Double): this.type = set("resolution", value.asInstanceOf[js.Any])
  
  inline def showViewFinder(value: Boolean): this.type = set("showViewFinder", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
}
