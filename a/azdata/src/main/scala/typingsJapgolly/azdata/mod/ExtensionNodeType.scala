package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionNodeType extends StObject
@JSImport("azdata", "ExtensionNodeType")
@js.native
object ExtensionNodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExtensionNodeType & String] = js.native
  
  @js.native
  sealed trait Database
    extends StObject
       with ExtensionNodeType
  /* "Database" */ val Database: typingsJapgolly.azdata.mod.ExtensionNodeType.Database & String = js.native
  
  @js.native
  sealed trait Server
    extends StObject
       with ExtensionNodeType
  /* "Server" */ val Server: typingsJapgolly.azdata.mod.ExtensionNodeType.Server & String = js.native
}
