package typingsJapgolly.reactCopyToClipboard.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCopyToClipboard.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_1231192942[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def onCopy(value: (/* text */ String, /* result */ Boolean) => Callback): this.type = set("onCopy", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
  
  inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
}
