package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsFabricFabricDottypesMod.IFabricProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFabricMod {
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "Fabric")
  @js.native
  val Fabric: ForwardRefExoticComponent[
    IFabricProps & (RefAttributes[
      typingsJapgolly.officeUiFabricReact.libComponentsFabricFabricDotbaseMod.FabricBase
    ])
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "FabricBase")
  @js.native
  open class FabricBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsFabricMod.FabricBase {
    def this(props: IFabricProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFabricProps, context: Any) = this()
  }
}
