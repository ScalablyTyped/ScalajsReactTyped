package typingsJapgolly.rmcCascader.components

import typingsJapgolly.rmcCascader.libCascaderTypesMod.ICascaderDataItem
import typingsJapgolly.rmcCascader.libCascaderTypesMod.ICascaderProps
import typingsJapgolly.rmcCascader.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcCascader {
  
  inline def apply(data: js.Array[ICascaderDataItem]): SharedBuilder_ICascaderProps1132363685[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_ICascaderProps1132363685[default](js.Array(this.component, __props.asInstanceOf[ICascaderProps]))
  }
  
  @JSImport("rmc-cascader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ICascaderProps): SharedBuilder_ICascaderProps1132363685[default] = new SharedBuilder_ICascaderProps1132363685[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
