package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Calendar")
@js.native
open class Calendar protected ()
  extends typingsJapgolly.officeUiFabricReact.libCalendarMod.Calendar {
  def this(props: ICalendarProps) = this()
}
/* static members */
object Calendar {
  
  @JSImport("office-ui-fabric-react", "Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Calendar.defaultProps")
  @js.native
  def defaultProps: ICalendarProps = js.native
  inline def defaultProps_=(x: ICalendarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
