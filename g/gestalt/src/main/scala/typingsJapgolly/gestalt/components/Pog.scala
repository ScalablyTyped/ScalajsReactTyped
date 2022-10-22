package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Path
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.transparentDarkGray
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import typingsJapgolly.gestalt.mod.Icons
import typingsJapgolly.gestalt.mod.PogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pog {
  
  @JSImport("gestalt", "Pog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def bgColor(value: transparent | darkGray | transparentDarkGray | gray | lightGray | white | red): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetSvgPath(value: Path): this.type = set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def hovered(value: Boolean): this.type = set("hovered", value.asInstanceOf[js.Any])
    
    inline def icon(value: Icons): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconColor(value: gray | darkGray | red | white): this.type = set("iconColor", value.asInstanceOf[js.Any])
    
    inline def padding(value: `1` | `2` | `3` | `4` | `5`): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def size(value: xs | sm | md | lg | xl): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
