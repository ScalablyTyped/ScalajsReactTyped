package typingsJapgolly.reactI18next.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.i18next.mod.TFunction
import typingsJapgolly.reactI18next.anon.Lng
import typingsJapgolly.reactI18next.mod.Namespace
import typingsJapgolly.reactI18next.mod.TranslationProps
import typingsJapgolly.reactI18next.reactI18nextStrings.default
import typingsJapgolly.reactI18next.reactI18nextStrings.fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Translation {
  
  inline def apply(children: (TFunction, Lng, Boolean) => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[TranslationProps]))
  }
  
  @JSImport("react-i18next", "Translation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def i18n(value: typingsJapgolly.i18next.mod.i18n): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def ns(value: Namespace): this.type = set("ns", value.asInstanceOf[js.Any])
    
    inline def nsMode(value: fallback | default): this.type = set("nsMode", value.asInstanceOf[js.Any])
    
    inline def nsVarargs(value: String*): this.type = set("ns", js.Array(value*))
    
    inline def useSuspense(value: Boolean): this.type = set("useSuspense", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TranslationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
