package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.ArrowV
import typingsJapgolly.antdMobileRn.antdMobileRnBooleans.`false`
import typingsJapgolly.antdMobileRn.libListIndexDotnativeMod.ListProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("antd-mobile-rn", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.List] {
    
    inline def children(value: `false` | Element | js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderFooter(
      value: (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]) | String | Element
    ): this.type = set("renderFooter", value.asInstanceOf[js.Any])
    
    inline def renderFooterCallbackTo(
      value: CallbackTo[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]
    ): this.type = set("renderFooter", value.toJsFn)
    
    inline def renderFooterVdomElement(value: VdomElement): this.type = set("renderFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderHeader(
      value: (js.Function0[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]) | String | Element
    ): this.type = set("renderHeader", value.asInstanceOf[js.Any])
    
    inline def renderHeaderCallbackTo(
      value: CallbackTo[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
        ]
    ): this.type = set("renderHeader", value.toJsFn)
    
    inline def renderHeaderVdomElement(value: VdomElement): this.type = set("renderHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: ArrowV): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: List.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
