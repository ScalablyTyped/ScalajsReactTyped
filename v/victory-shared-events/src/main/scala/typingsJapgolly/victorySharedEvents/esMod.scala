package typingsJapgolly.victorySharedEvents

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-shared-events/es", "VictorySharedEvents")
  @js.native
  open class VictorySharedEvents protected () extends Component[VictorySharedEventsProps, Any, Any] {
    def this(props: VictorySharedEventsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictorySharedEventsProps, context: Any) = this()
  }
  
  trait VictorySharedEventsProps extends StObject {
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var externalEventMutations: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventCallbackInterface<string | Array<string>, string | number | Array<string | number>> */ Any
        ]
      ] = js.undefined
    
    var groupComponent: js.UndefOr[Element] = js.undefined
  }
  object VictorySharedEventsProps {
    
    inline def apply(): VictorySharedEventsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictorySharedEventsProps]
    }
    
    extension [Self <: VictorySharedEventsProps](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: VdomElement): Self = StObject.set(x, "container", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setExternalEventMutations(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventCallbackInterface<string | Array<string>, string | number | Array<string | number>> */ Any
            ]
      ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
      
      inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
      
      inline def setExternalEventMutationsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventCallbackInterface<string | Array<string>, string | number | Array<string | number>> */ Any)*
      ): Self = StObject.set(x, "externalEventMutations", js.Array(value*))
      
      inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    }
  }
}
