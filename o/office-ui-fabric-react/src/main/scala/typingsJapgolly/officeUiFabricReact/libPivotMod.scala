package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.IPivotProps
import typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotItemDottypesMod.IPivotItemProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPivotMod {
  
  @JSImport("office-ui-fabric-react/lib/Pivot", "Pivot")
  @js.native
  val Pivot: FunctionComponent[IPivotProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pivot", "PivotBase")
  @js.native
  open class PivotBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPivotMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pivot", "PivotItem")
  @js.native
  open class PivotItem protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsPivotMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pivot", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat & Double
      ] = js.native
    
    /* 0 */ val links: typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat.links & Double = js.native
    
    /* 1 */ val tabs: typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkFormat.tabs & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Pivot", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize & Double
      ] = js.native
    
    /* 1 */ val large: typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize.large & Double = js.native
    
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.libComponentsPivotPivotDottypesMod.PivotLinkSize.normal & Double = js.native
  }
}
