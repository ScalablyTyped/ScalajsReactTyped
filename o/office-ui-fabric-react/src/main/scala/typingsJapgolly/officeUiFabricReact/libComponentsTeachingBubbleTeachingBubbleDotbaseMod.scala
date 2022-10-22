package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.anon.CalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubbleProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTeachingBubbleTeachingBubbleDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
  @js.native
  open class TeachingBubbleBase protected () extends Component[ITeachingBubbleProps, ITeachingBubbleState, Any] {
    def this(props: ITeachingBubbleProps) = this()
    
    /* private */ var _defaultCalloutProps: Any = js.native
    
    def focus(): Unit = js.native
    
    var rootElement: RefHandle[HTMLDivElement] = js.native
  }
  /* static members */
  object TeachingBubbleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase.defaultProps")
    @js.native
    def defaultProps: CalloutProps = js.native
    inline def defaultProps_=(x: CalloutProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ITeachingBubbleState extends StObject {
    
    var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
  }
  object ITeachingBubbleState {
    
    inline def apply(): ITeachingBubbleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITeachingBubbleState]
    }
    
    extension [Self <: ITeachingBubbleState](x: Self) {
      
      inline def setIsTeachingBubbleVisible(value: Boolean): Self = StObject.set(x, "isTeachingBubbleVisible", value.asInstanceOf[js.Any])
      
      inline def setIsTeachingBubbleVisibleUndefined: Self = StObject.set(x, "isTeachingBubbleVisible", js.undefined)
    }
  }
}
