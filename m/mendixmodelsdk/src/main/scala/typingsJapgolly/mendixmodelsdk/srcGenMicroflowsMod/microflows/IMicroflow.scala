package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions.IMicroflowActionInfo
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/microflows relevant section in reference guide}
  */
@js.native
trait IMicroflow
  extends StObject
     with IServerSideMicroflow {
  
  /**
    * In version 7.23.0: added public
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  val microflowActionInfo: IMicroflowActionInfo | Null = js.native
  
  /**
    * In version 9.0.2: introduced
    */
  val workflowActionInfo: IMicroflowActionInfo | Null = js.native
}
