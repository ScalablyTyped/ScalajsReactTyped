package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsCommandBarCommandBarDottypesMod.ICommandBarProps
import typingsJapgolly.officeUiFabricReact.libComponentsCommandBarCommandBarDottypesMod.ICommandBarStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsCommandBarCommandBarDottypesMod.ICommandBarStyles
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandBarMod {
  
  @JSImport("office-ui-fabric-react/lib/CommandBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/CommandBar", "CommandBar")
  @js.native
  val CommandBar: FunctionComponent[ICommandBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/CommandBar", "CommandBarBase")
  @js.native
  open class CommandBarBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsCommandBarMod.CommandBarBase {
    def this(props: ICommandBarProps) = this()
  }
  /* static members */
  object CommandBarBase {
    
    @JSImport("office-ui-fabric-react/lib/CommandBar", "CommandBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/CommandBar", "CommandBarBase.defaultProps")
    @js.native
    def defaultProps: ICommandBarProps = js.native
    inline def defaultProps_=(x: ICommandBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getCommandBarStyles(props: ICommandBarStyleProps): ICommandBarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandBarStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICommandBarStyles]
  
  inline def getCommandButtonStyles(): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")().asInstanceOf[IButtonStyles]
  inline def getCommandButtonStyles(customStyles: IButtonStyles): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandButtonStyles")(customStyles.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
}
