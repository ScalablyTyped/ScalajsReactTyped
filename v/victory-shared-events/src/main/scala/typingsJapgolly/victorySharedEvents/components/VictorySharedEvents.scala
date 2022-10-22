package typingsJapgolly.victorySharedEvents.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victorySharedEvents.esMod.VictorySharedEventsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictorySharedEvents {
  
  @JSImport("victory-shared-events/es", "VictorySharedEvents")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victorySharedEvents.esMod.VictorySharedEvents] {
    
    inline def children(value: Element | js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def container(value: VdomElement): this.type = set("container", value.rawElement.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def externalEventMutations(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventCallbackInterface<string | Array<string>, string | number | Array<string | number>> */ Any
        ]
    ): this.type = set("externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def externalEventMutationsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventCallbackInterface<string | Array<string>, string | number | Array<string | number>> */ Any)*
    ): this.type = set("externalEventMutations", js.Array(value*))
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictorySharedEvents.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictorySharedEventsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
