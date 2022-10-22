package typingsJapgolly.ink.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ink.anon.readonlymarginnumberundef
import typingsJapgolly.ink.buildDomMod.DOMElement
import typingsJapgolly.ink.inkStrings.`column-reverse`
import typingsJapgolly.ink.inkStrings.`flex-end`
import typingsJapgolly.ink.inkStrings.`flex-start`
import typingsJapgolly.ink.inkStrings.`row-reverse`
import typingsJapgolly.ink.inkStrings.`space-around`
import typingsJapgolly.ink.inkStrings.`space-between`
import typingsJapgolly.ink.inkStrings.absolute
import typingsJapgolly.ink.inkStrings.arrow
import typingsJapgolly.ink.inkStrings.auto
import typingsJapgolly.ink.inkStrings.bold
import typingsJapgolly.ink.inkStrings.center
import typingsJapgolly.ink.inkStrings.classic
import typingsJapgolly.ink.inkStrings.column
import typingsJapgolly.ink.inkStrings.double
import typingsJapgolly.ink.inkStrings.doubleSingle
import typingsJapgolly.ink.inkStrings.flex
import typingsJapgolly.ink.inkStrings.none
import typingsJapgolly.ink.inkStrings.relative
import typingsJapgolly.ink.inkStrings.round
import typingsJapgolly.ink.inkStrings.row
import typingsJapgolly.ink.inkStrings.single
import typingsJapgolly.ink.inkStrings.singleDouble
import typingsJapgolly.ink.inkStrings.stretch
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("ink", "Box")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[DOMElement] {
    
    inline def alignItems(value: `flex-start` | center | `flex-end` | stretch): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: `flex-start` | center | `flex-end` | auto): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def borderColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
    ): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic | arrow): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    
    inline def display(value: flex | none): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def flexBasis(value: Double | String): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    
    inline def flexDirection(value: row | column | `row-reverse` | `column-reverse`): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    
    inline def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    inline def flexShrink(value: Double): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def justifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def marginX(value: Double): this.type = set("marginX", value.asInstanceOf[js.Any])
    
    inline def marginY(value: Double): this.type = set("marginY", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def paddingBottom(value: Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    
    inline def paddingLeft(value: Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    
    inline def paddingRight(value: Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    
    inline def paddingTop(value: Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    
    inline def paddingX(value: Double): this.type = set("paddingX", value.asInstanceOf[js.Any])
    
    inline def paddingY(value: Double): this.type = set("paddingY", value.asInstanceOf[js.Any])
    
    inline def position(value: absolute | relative): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: readonlymarginnumberundef): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
