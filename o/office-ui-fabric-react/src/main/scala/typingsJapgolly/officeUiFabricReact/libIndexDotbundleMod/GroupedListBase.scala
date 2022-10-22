package typingsJapgolly.officeUiFabricReact.libIndexDotbundleMod

import typingsJapgolly.officeUiFabricReact.anon.Compact
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDotbaseMod.IGroupedListState
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase")
@js.native
open class GroupedListBase protected ()
  extends typingsJapgolly.officeUiFabricReact.mod.GroupedListBase {
  def this(props: IGroupedListProps) = this()
}
/* static members */
object GroupedListBase {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GroupedListBase.defaultProps")
  @js.native
  def defaultProps: Compact = js.native
  inline def defaultProps_=(x: Compact): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: IGroupedListProps, previousState: IGroupedListState): IGroupedListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IGroupedListState]
}
