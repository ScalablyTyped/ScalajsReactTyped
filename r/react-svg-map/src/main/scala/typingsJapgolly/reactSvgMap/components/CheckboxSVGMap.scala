package typingsJapgolly.reactSvgMap.components

import typingsJapgolly.reactSvgMap.mod.Map
import typingsJapgolly.reactSvgMap.mod.OnChangeMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxSVGMap {
  
  inline def apply(map: Map): SharedBuilder_OnChangeMapProps1461684119[typingsJapgolly.reactSvgMap.mod.CheckboxSVGMap] = {
    val __props = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    new SharedBuilder_OnChangeMapProps1461684119[typingsJapgolly.reactSvgMap.mod.CheckboxSVGMap](js.Array(this.component, __props.asInstanceOf[OnChangeMapProps]))
  }
  
  @JSImport("react-svg-map", "CheckboxSVGMap")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnChangeMapProps): SharedBuilder_OnChangeMapProps1461684119[typingsJapgolly.reactSvgMap.mod.CheckboxSVGMap] = new SharedBuilder_OnChangeMapProps1461684119[typingsJapgolly.reactSvgMap.mod.CheckboxSVGMap](js.Array(this.component, p.asInstanceOf[js.Any]))
}
