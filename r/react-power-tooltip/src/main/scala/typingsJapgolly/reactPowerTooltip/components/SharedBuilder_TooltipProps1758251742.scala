package typingsJapgolly.reactPowerTooltip.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPowerTooltip.toolTipMod.AnimationType
import typingsJapgolly.reactPowerTooltip.toolTipMod.ArrowAlignType
import typingsJapgolly.reactPowerTooltip.toolTipMod.PositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TooltipProps1758251742[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def arrowAlign(value: ArrowAlignType): this.type = set("arrowAlign", value.asInstanceOf[js.Any])
  
  inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def flat(value: Boolean): this.type = set("flat", value.asInstanceOf[js.Any])
  
  inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
  
  inline def fontSize(value: String): this.type = set("fontSize", value.asInstanceOf[js.Any])
  
  inline def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
  
  inline def hoverBackground(value: String): this.type = set("hoverBackground", value.asInstanceOf[js.Any])
  
  inline def lineSeparated(value: Boolean | String): this.type = set("lineSeparated", value.asInstanceOf[js.Any])
  
  inline def moveDown(value: String): this.type = set("moveDown", value.asInstanceOf[js.Any])
  
  inline def moveLeft(value: String): this.type = set("moveLeft", value.asInstanceOf[js.Any])
  
  inline def moveRight(value: String): this.type = set("moveRight", value.asInstanceOf[js.Any])
  
  inline def moveUp(value: String): this.type = set("moveUp", value.asInstanceOf[js.Any])
  
  inline def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
  
  inline def static(value: Boolean): this.type = set("static", value.asInstanceOf[js.Any])
  
  inline def textAlign(value: String): this.type = set("textAlign", value.asInstanceOf[js.Any])
  
  inline def zIndex(value: String): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
