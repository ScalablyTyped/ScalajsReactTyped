package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typingsJapgolly.officeUiFabricReact.libComponentsAutofillAutofillDottypesMod.IAutofillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAutofillMod {
  
  @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Autofill", "BaseAutoFill")
  @js.native
  open class BaseAutoFill protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsAutofillMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
}
