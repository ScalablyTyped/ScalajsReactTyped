package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typingsJapgolly.officeUiFabricReact.libComponentsSearchBoxSearchBoxDottypesMod.ISearchBoxProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBox")
  @js.native
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBoxBase")
  @js.native
  open class SearchBoxBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsSearchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  /* static members */
  object SearchBoxBase {
    
    @JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBoxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBoxBase.defaultProps")
    @js.native
    def defaultProps: PickISearchBoxPropsdisabl = js.native
    inline def defaultProps_=(x: PickISearchBoxPropsdisabl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
