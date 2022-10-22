package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcFieldForm.esFormContextMod.FormChangeInfo
import typingsJapgolly.rcFieldForm.esFormContextMod.FormFinishInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FormProviderProps1136047338 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def onFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Callback): this.type = set("onFormChange", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormChangeInfo) => (value(t0, t1)).runNow()))
  
  inline def onFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Callback): this.type = set("onFormFinish", js.Any.fromFunction2((t0: /* name */ String, t1: /* info */ FormFinishInfo) => (value(t0, t1)).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
}
