package typingsJapgolly.reactPortalTooltip.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPortalTooltip.anon.ArrowStyle
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Align
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Arrow
import typingsJapgolly.reactPortalTooltip.libCardMod.Card.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TooltipProps603247757[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def align(value: Align): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def alignNull: this.type = set("align", null)
  
  inline def arrow(value: Arrow): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  inline def arrowNull: this.type = set("arrow", null)
  
  inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
  
  inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  
  inline def style(value: ArrowStyle): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def tooltipTimeout(value: Double): this.type = set("tooltipTimeout", value.asInstanceOf[js.Any])
  
  inline def useHover(value: Boolean): this.type = set("useHover", value.asInstanceOf[js.Any])
}
