package typingsJapgolly.reactClipboardjsCopy.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactClipboardjsCopy.mod.ReactClipboard.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_2074302965[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
  
  inline def onError(value: (/* text */ String, /* result */ Boolean) => Callback): this.type = set("onError", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
  
  inline def onSuccess(value: (/* text */ String, /* result */ Boolean) => Callback): this.type = set("onSuccess", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
  
  inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def selection(value: Boolean): this.type = set("selection", value.asInstanceOf[js.Any])
  
  inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  
  inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
}
