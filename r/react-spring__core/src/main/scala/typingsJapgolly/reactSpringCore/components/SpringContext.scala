package typingsJapgolly.reactSpringCore.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpringContext {
  
  object Consumer {
    
    inline def apply(
      children: typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext => Node
    ): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[
        typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext
      ]]))
    }
    
    @JSImport("@react-spring/core/dist/declarations/src", "SpringContext.Consumer")
    @js.native
    val component: js.Object = js.native
    
    def withProps(
      p: ConsumerProps[
          typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext
        ]
    ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Provider {
    
    inline def apply(value: typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext): Default[js.Object] = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[
        typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext
      ]]))
    }
    
    @JSImport("@react-spring/core/dist/declarations/src", "SpringContext.Provider")
    @js.native
    val component: js.Object = js.native
    
    def withProps(
      p: ProviderProps[
          typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext
        ]
    ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@react-spring/core/dist/declarations/src", "SpringContext")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def immediate(value: Boolean): this.type = set("immediate", value.asInstanceOf[js.Any])
    
    inline def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SpringContext.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: PropsWithChildren[
      typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringContextMod.SpringContext
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
