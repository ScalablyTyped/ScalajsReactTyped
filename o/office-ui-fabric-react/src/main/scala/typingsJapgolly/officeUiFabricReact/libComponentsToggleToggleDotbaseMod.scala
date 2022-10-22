package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialIToggleState
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIToggleProps
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIToggleState
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggle
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToggleToggleDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
  @js.native
  open class ToggleBase protected ()
    extends Component[IToggleProps, IToggleState, Any]
       with IToggle {
    def this(props: IToggleProps) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _noop: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _toggleButton: Any = js.native
    
    /**
      * Gets the current checked state of the toggle.
      */
    val checked: Boolean = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
  }
  
  trait IToggleState extends StObject {
    
    var checked: Boolean
  }
  object IToggleState {
    
    inline def apply(checked: Boolean): IToggleState = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToggleState]
    }
    
    extension [Self <: IToggleState](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
