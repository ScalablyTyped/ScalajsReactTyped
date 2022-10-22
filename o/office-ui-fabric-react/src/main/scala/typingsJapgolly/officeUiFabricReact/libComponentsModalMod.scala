package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsModalMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Modal", "Modal")
  @js.native
  val Modal: FunctionComponent[IModalProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase")
  @js.native
  open class ModalBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsModalModalDotbaseMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  /* static members */
  object ModalBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase.defaultProps")
    @js.native
    def defaultProps: IModalProps = js.native
    inline def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
