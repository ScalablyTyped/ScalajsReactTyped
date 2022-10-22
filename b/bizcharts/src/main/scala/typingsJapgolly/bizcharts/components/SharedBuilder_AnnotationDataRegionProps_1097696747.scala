package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.EnhancedTextCfg
import typingsJapgolly.antvG2.anon.Style
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AnnotationDataRegionProps_1097696747[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
  
  inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
  
  inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
  
  inline def lineLength(value: Double): this.type = set("lineLength", value.asInstanceOf[js.Any])
  
  inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
  
  inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
  
  inline def region(value: Style): this.type = set("region", value.asInstanceOf[js.Any])
  
  inline def regionNull: this.type = set("region", null)
  
  inline def style(value: ShapeAttrs): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def text(value: EnhancedTextCfg): this.type = set("text", value.asInstanceOf[js.Any])
  
  inline def textNull: this.type = set("text", null)
  
  inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  
  inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
}
