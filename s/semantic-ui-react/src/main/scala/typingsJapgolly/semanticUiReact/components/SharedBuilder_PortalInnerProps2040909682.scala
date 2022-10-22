package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PortalInnerProps2040909682[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def innerRef(value: typingsJapgolly.react.mod.Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
  
  inline def innerRefNull: this.type = set("innerRef", null)
  
  inline def mountNode(value: Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
  
  inline def onMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback): this.type = set("onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalInnerProps) => (value(t0, t1)).runNow()))
  
  inline def onUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Callback): this.type = set("onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalInnerProps) => (value(t0, t1)).runNow()))
}
