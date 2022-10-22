package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.libComponentsAnnouncedAnnouncedDottypesMod.IAnnouncedProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "AnnouncedBase")
@js.native
open class AnnouncedBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libAnnouncedMod.AnnouncedBase {
  def this(props: IAnnouncedProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IAnnouncedProps, context: Any) = this()
}
/* static members */
object AnnouncedBase {
  
  @JSImport("office-ui-fabric-react", "AnnouncedBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "AnnouncedBase.defaultProps")
  @js.native
  def defaultProps: Partial[IAnnouncedProps] = js.native
  inline def defaultProps_=(x: Partial[IAnnouncedProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
