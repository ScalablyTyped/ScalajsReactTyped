package typingsJapgolly.wixUiCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsEllipsisTooltipStateFullComponentWrapMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/ellipsis-tooltip/StateFullComponentWrap", "StateFullComponentWrap")
  @js.native
  open class StateFullComponentWrap protected ()
    extends Component[StateFullComponentWrapProps, js.Object, Any] {
    def this(props: StateFullComponentWrapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StateFullComponentWrapProps, context: Any) = this()
  }
  
  trait StateFullComponentWrapProps
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var children: js.UndefOr[Any] = js.undefined
  }
  object StateFullComponentWrapProps {
    
    inline def apply(): StateFullComponentWrapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateFullComponentWrapProps]
    }
    
    extension [Self <: StateFullComponentWrapProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
