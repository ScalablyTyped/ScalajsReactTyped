package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.Disabled
import typingsJapgolly.officeUiFabricReact.libUtilitiesButtonGridButtonGridCellDottypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typingsJapgolly.react.mod.DeprecatedLifecycle because Already inherited
- typingsJapgolly.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typingsJapgolly.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typingsJapgolly.react.mod.Component because Already inherited
- typingsJapgolly.officeUiFabricReact.libUtilitiesButtonGridButtonGridCellMod.ButtonGridCell because Already inherited
- typingsJapgolly.officeUiFabricReact.libUtilitiesButtonGridMod.ButtonGridCell because Already inherited
- typingsJapgolly.officeUiFabricReact.libGridMod.ButtonGridCell because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "ButtonGridCell")
@js.native
open class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
  extends typingsJapgolly.officeUiFabricReact.libButtonGridMod.ButtonGridCell[T, P] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
}
/* static members */
object ButtonGridCell {
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
