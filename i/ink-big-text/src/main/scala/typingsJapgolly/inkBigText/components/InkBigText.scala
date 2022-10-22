package typingsJapgolly.inkBigText.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.inkBigText.inkBigTextStrings.`3d`
import typingsJapgolly.inkBigText.inkBigTextStrings.black
import typingsJapgolly.inkBigText.inkBigTextStrings.block
import typingsJapgolly.inkBigText.inkBigTextStrings.blue
import typingsJapgolly.inkBigText.inkBigTextStrings.center
import typingsJapgolly.inkBigText.inkBigTextStrings.chrome
import typingsJapgolly.inkBigText.inkBigTextStrings.cyan
import typingsJapgolly.inkBigText.inkBigTextStrings.green
import typingsJapgolly.inkBigText.inkBigTextStrings.grid
import typingsJapgolly.inkBigText.inkBigTextStrings.huge
import typingsJapgolly.inkBigText.inkBigTextStrings.left
import typingsJapgolly.inkBigText.inkBigTextStrings.magenta
import typingsJapgolly.inkBigText.inkBigTextStrings.pallet
import typingsJapgolly.inkBigText.inkBigTextStrings.red
import typingsJapgolly.inkBigText.inkBigTextStrings.right
import typingsJapgolly.inkBigText.inkBigTextStrings.shade
import typingsJapgolly.inkBigText.inkBigTextStrings.simple
import typingsJapgolly.inkBigText.inkBigTextStrings.simple3d
import typingsJapgolly.inkBigText.inkBigTextStrings.simpleBlock
import typingsJapgolly.inkBigText.inkBigTextStrings.slick
import typingsJapgolly.inkBigText.inkBigTextStrings.tiny
import typingsJapgolly.inkBigText.inkBigTextStrings.transparent
import typingsJapgolly.inkBigText.inkBigTextStrings.white
import typingsJapgolly.inkBigText.inkBigTextStrings.yellow
import typingsJapgolly.inkBigText.mod.BigTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkBigText {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BigTextProps]))
  }
  
  @JSImport("ink-big-text", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: transparent | black | red | green | yellow | blue | magenta | cyan | white): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def font(
      value: block | slick | tiny | grid | pallet | shade | simple | simpleBlock | `3d` | simple3d | chrome | huge
    ): this.type = set("font", value.asInstanceOf[js.Any])
    
    inline def letterSpacing(value: Double): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def space(value: Boolean): this.type = set("space", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BigTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
