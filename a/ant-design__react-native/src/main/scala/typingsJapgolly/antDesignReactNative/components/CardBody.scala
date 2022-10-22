package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.anon.PickCardStylebody
import typingsJapgolly.antDesignReactNative.libCardCardBodyMod.CardBodyProps
import typingsJapgolly.antDesignReactNative.libCardCardBodyMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardBody {
  
  @JSImport("@ant-design/react-native/lib/card/CardBody", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[PickCardStylebody]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
