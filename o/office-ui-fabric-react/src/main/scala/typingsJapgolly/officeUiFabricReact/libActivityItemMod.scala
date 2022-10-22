package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsActivityItemActivityItemDotclassNamesMod.IActivityItemClassNames
import typingsJapgolly.officeUiFabricReact.libComponentsActivityItemActivityItemDottypesMod.IActivityItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsActivityItemActivityItemDottypesMod.IActivityItemStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActivityItemMod {
  
  @JSImport("office-ui-fabric-react/lib/ActivityItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/ActivityItem", "ActivityItem")
  @js.native
  open class ActivityItem protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsActivityItemMod.ActivityItem {
    def this(props: IActivityItemProps) = this()
  }
  
  inline def getActivityItemClassNames(
    styles: IActivityItemStyles,
    className: String,
    activityPersonas: js.Array[IPersonaProps],
    isCompact: Boolean
  ): IActivityItemClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivityItemClassNames")(styles.asInstanceOf[js.Any], className.asInstanceOf[js.Any], activityPersonas.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemClassNames]
  
  inline def getActivityItemStyles(
    theme: js.UndefOr[ITheme],
    customStyles: js.UndefOr[IActivityItemStyles],
    animateBeaconSignal: js.UndefOr[Boolean],
    beaconColorOne: js.UndefOr[String],
    beaconColorTwo: js.UndefOr[String],
    isCompact: js.UndefOr[Boolean]
  ): IActivityItemStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivityItemStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], animateBeaconSignal.asInstanceOf[js.Any], beaconColorOne.asInstanceOf[js.Any], beaconColorTwo.asInstanceOf[js.Any], isCompact.asInstanceOf[js.Any])).asInstanceOf[IActivityItemStyles]
}
