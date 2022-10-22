package typingsJapgolly.reachPopover.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachPopover.mod.PopoverProps
import typingsJapgolly.reachPopover.mod.Position
import typingsJapgolly.reachPopover.mod.PossibleNode
import typingsJapgolly.reachPopover.reachPopoverStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  inline def apply(targetRef: RefHandle[PossibleNode]): Builder = {
    val __props = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Merge[
    /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
    PopoverProps & As[div]
  ]]))
  }
  
  @JSImport("@reach/popover", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def unstable_observableRefs(value: js.Array[RefHandle[PossibleNode]]): this.type = set("unstable_observableRefs", value.asInstanceOf[js.Any])
    
    inline def unstable_observableRefsVarargs(value: RefHandle[PossibleNode]*): this.type = set("unstable_observableRefs", js.Array(value*))
    
    inline def unstable_skipInitialPortalRender(value: Boolean): this.type = set("unstable_skipInitialPortalRender", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      PopoverProps & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
