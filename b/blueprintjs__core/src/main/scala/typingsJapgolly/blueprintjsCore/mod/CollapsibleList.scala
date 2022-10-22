package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.anon.PartialCollapsibleListPro
import typingsJapgolly.blueprintjsCore.libEsmComponentsCollapsibleListCollapsibleListMod.CollapsibleListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "CollapsibleList")
@js.native
open class CollapsibleList protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.CollapsibleList {
  def this(props: CollapsibleListProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CollapsibleListProps, context: Any) = this()
}
/* static members */
object CollapsibleList {
  
  @JSImport("@blueprintjs/core", "CollapsibleList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "CollapsibleList.defaultProps")
  @js.native
  def defaultProps: PartialCollapsibleListPro = js.native
  inline def defaultProps_=(x: PartialCollapsibleListPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "CollapsibleList.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
