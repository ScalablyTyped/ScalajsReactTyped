package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipLayerMod {
  
  @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayer")
  @js.native
  val KeytipLayer: FunctionComponent[IKeytipLayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase")
  @js.native
  open class KeytipLayerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: Any) = this()
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/KeytipLayer", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    inline def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
