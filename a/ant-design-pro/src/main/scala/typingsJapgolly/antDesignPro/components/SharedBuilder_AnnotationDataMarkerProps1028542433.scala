package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.EnhancedTextCfg
import typingsJapgolly.antvG2.anon.Length
import typingsJapgolly.antvG2.anon.Style
import typingsJapgolly.antvG2.antvG2Strings.downward
import typingsJapgolly.antvG2.antvG2Strings.upward
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AnnotationDataMarkerProps1028542433[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
  
  inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
  
  inline def autoAdjust(value: Boolean): this.type = set("autoAdjust", value.asInstanceOf[js.Any])
  
  inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
  
  inline def direction(value: upward | downward): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def line(value: Length): this.type = set("line", value.asInstanceOf[js.Any])
  
  inline def lineNull: this.type = set("line", null)
  
  inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
  
  inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
  
  inline def point(value: Style): this.type = set("point", value.asInstanceOf[js.Any])
  
  inline def pointNull: this.type = set("point", null)
  
  inline def text(value: EnhancedTextCfg): this.type = set("text", value.asInstanceOf[js.Any])
  
  inline def textNull: this.type = set("text", null)
  
  inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  
  inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
}
