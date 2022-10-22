package typingsJapgolly.grommet.components

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Fixed
import typingsJapgolly.grommet.es6ComponentsDropMod.DropProps
import typingsJapgolly.grommet.es6ComponentsMaskedInputMod.MaskedInputExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaskedInput {
  
  @JSImport("grommet/es6", "MaskedInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def dropHeight(value: xsmall | small | medium | large | xlarge | String): this.type = set("dropHeight", value.asInstanceOf[js.Any])
    
    inline def dropProps(value: DropProps): this.type = set("dropProps", value.asInstanceOf[js.Any])
    
    inline def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def mask(value: js.Array[Fixed]): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maskVarargs(value: Fixed*): this.type = set("mask", js.Array(value*))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[Element] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: TextAlignType): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MaskedInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MaskedInputExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
