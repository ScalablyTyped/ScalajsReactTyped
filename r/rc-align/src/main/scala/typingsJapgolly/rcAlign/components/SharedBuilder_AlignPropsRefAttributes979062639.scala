package typingsJapgolly.rcAlign.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcAlign.esInterfaceMod.AlignResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AlignPropsRefAttributes979062639[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def monitorBufferTime(value: Double): this.type = set("monitorBufferTime", value.asInstanceOf[js.Any])
  
  inline def monitorWindowResize(value: Boolean): this.type = set("monitorWindowResize", value.asInstanceOf[js.Any])
  
  inline def onAlign(value: (/* source */ HTMLElement, /* result */ AlignResult) => Callback): this.type = set("onAlign", js.Any.fromFunction2((t0: /* source */ HTMLElement, t1: /* result */ AlignResult) => (value(t0, t1)).runNow()))
}
