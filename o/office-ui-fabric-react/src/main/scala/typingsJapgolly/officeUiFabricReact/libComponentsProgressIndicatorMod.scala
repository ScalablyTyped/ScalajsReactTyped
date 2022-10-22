package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.Description
import typingsJapgolly.officeUiFabricReact.libComponentsProgressIndicatorProgressIndicatorDottypesMod.IProgressIndicatorProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressIndicatorMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicator")
  @js.native
  val ProgressIndicator: FunctionComponent[IProgressIndicatorProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase")
  @js.native
  open class ProgressIndicatorBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsProgressIndicatorProgressIndicatorDotbaseMod.ProgressIndicatorBase {
    def this(props: IProgressIndicatorProps) = this()
  }
  /* static members */
  object ProgressIndicatorBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator", "ProgressIndicatorBase.defaultProps")
    @js.native
    def defaultProps: Description = js.native
    inline def defaultProps_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
