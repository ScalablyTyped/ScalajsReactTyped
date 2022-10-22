package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialIToggleState
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIToggleProps
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIToggleState
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleMod {
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "Toggle")
  @js.native
  val Toggle: FunctionComponent[IToggleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase")
  @js.native
  open class ToggleBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsToggleMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
  }
}
