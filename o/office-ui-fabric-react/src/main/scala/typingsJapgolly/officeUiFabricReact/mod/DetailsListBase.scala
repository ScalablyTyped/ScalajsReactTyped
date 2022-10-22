package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDotbaseMod.IDetailsListState
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DetailsListBase")
@js.native
open class DetailsListBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libDetailsListMod.DetailsListBase {
  def this(props: IDetailsListProps) = this()
}
/* static members */
object DetailsListBase {
  
  @JSImport("office-ui-fabric-react", "DetailsListBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DetailsListBase.defaultProps")
  @js.native
  def defaultProps: typingsJapgolly.officeUiFabricReact.anon.CheckboxVisibility = js.native
  inline def defaultProps_=(x: typingsJapgolly.officeUiFabricReact.anon.CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsListState]
}
