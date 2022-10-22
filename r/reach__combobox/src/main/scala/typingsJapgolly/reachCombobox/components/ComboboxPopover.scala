package typingsJapgolly.reachCombobox.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachCombobox.anon.ComboboxPopoverPropsParti
import typingsJapgolly.reachCombobox.reachComboboxStrings.div
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachPopover.mod.Position
import typingsJapgolly.reachPopover.mod.PossibleNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxPopover {
  
  @JSImport("@reach/combobox", "ComboboxPopover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def targetRef(value: RefHandle[PossibleNode]): this.type = set("targetRef", value.asInstanceOf[js.Any])
    
    inline def unstable_observableRefs(value: js.Array[RefHandle[PossibleNode]]): this.type = set("unstable_observableRefs", value.asInstanceOf[js.Any])
    
    inline def unstable_observableRefsVarargs(value: RefHandle[PossibleNode]*): this.type = set("unstable_observableRefs", js.Array(value*))
    
    inline def unstable_skipInitialPortalRender(value: Boolean): this.type = set("unstable_skipInitialPortalRender", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ComboboxPopover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      ComboboxPopoverPropsParti & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
