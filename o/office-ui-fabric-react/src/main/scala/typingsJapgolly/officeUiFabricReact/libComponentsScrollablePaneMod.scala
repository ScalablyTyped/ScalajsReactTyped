package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneContext
import typingsJapgolly.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.always
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.auto
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsScrollablePaneMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePane")
  @js.native
  val ScrollablePane: FunctionComponent[IScrollablePaneProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePaneBase")
  @js.native
  open class ScrollablePaneBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDotbaseMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollablePaneContext")
  @js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  
  object ScrollbarVisibility {
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility.always")
    @js.native
    def always: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    inline def always_=(x: always): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane", "ScrollbarVisibility.auto")
    @js.native
    def auto: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
    inline def auto_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
  }
}
