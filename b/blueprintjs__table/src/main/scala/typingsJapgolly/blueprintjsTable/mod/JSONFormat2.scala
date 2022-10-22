package typingsJapgolly.blueprintjsTable.mod

import typingsJapgolly.blueprintjsTable.libEsmCellFormatsJsonFormatMod.JSONFormatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "JSONFormat2")
@js.native
open class JSONFormat2 protected ()
  extends typingsJapgolly.blueprintjsTable.libEsmCellFormatsJsonFormat2Mod.JSONFormat2 {
  def this(props: JSONFormatProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: JSONFormatProps, context: Any) = this()
}
/* static members */
object JSONFormat2 {
  
  @JSImport("@blueprintjs/table", "JSONFormat2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "JSONFormat2.defaultProps")
  @js.native
  def defaultProps: JSONFormatProps = js.native
  inline def defaultProps_=(x: JSONFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/table", "JSONFormat2.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
