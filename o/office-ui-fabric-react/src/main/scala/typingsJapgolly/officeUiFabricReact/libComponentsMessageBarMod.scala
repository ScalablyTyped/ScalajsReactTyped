package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.IMessageBarProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsMessageBarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBar")
  @js.native
  val MessageBar: FunctionComponent[IMessageBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
  @js.native
  open class MessageBarBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDotbaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    inline def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType & Double
      ] = js.native
    
    /* 2 */ val blocked: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.blocked & Double = js.native
    
    /* 1 */ val error: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.error & Double = js.native
    
    /* 0 */ val info: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.info & Double = js.native
    
    /* 3 */ val severeWarning: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.severeWarning & Double = js.native
    
    /* 4 */ val success: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.success & Double = js.native
    
    /* 5 */ val warning: typingsJapgolly.officeUiFabricReact.libComponentsMessageBarMessageBarDottypesMod.MessageBarType.warning & Double = js.native
  }
}
