package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DatabaseEngineEdition extends StObject
@JSImport("azdata", "DatabaseEngineEdition")
@js.native
object DatabaseEngineEdition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DatabaseEngineEdition & Double] = js.native
  
  @js.native
  sealed trait Enterprise
    extends StObject
       with DatabaseEngineEdition
  /* 3 */ val Enterprise: typingsJapgolly.azdata.mod.DatabaseEngineEdition.Enterprise & Double = js.native
  
  @js.native
  sealed trait Express
    extends StObject
       with DatabaseEngineEdition
  /* 4 */ val Express: typingsJapgolly.azdata.mod.DatabaseEngineEdition.Express & Double = js.native
  
  @js.native
  sealed trait Personal
    extends StObject
       with DatabaseEngineEdition
  /* 1 */ val Personal: typingsJapgolly.azdata.mod.DatabaseEngineEdition.Personal & Double = js.native
  
  @js.native
  sealed trait SqlDataWarehouse
    extends StObject
       with DatabaseEngineEdition
  /* 6 */ val SqlDataWarehouse: typingsJapgolly.azdata.mod.DatabaseEngineEdition.SqlDataWarehouse & Double = js.native
  
  @js.native
  sealed trait SqlDatabase
    extends StObject
       with DatabaseEngineEdition
  /* 5 */ val SqlDatabase: typingsJapgolly.azdata.mod.DatabaseEngineEdition.SqlDatabase & Double = js.native
  
  @js.native
  sealed trait SqlManagedInstance
    extends StObject
       with DatabaseEngineEdition
  /* 8 */ val SqlManagedInstance: typingsJapgolly.azdata.mod.DatabaseEngineEdition.SqlManagedInstance & Double = js.native
  
  @js.native
  sealed trait SqlOnDemand
    extends StObject
       with DatabaseEngineEdition
  /* 11 */ val SqlOnDemand: typingsJapgolly.azdata.mod.DatabaseEngineEdition.SqlOnDemand & Double = js.native
  
  @js.native
  sealed trait SqlStretchDatabase
    extends StObject
       with DatabaseEngineEdition
  /* 7 */ val SqlStretchDatabase: typingsJapgolly.azdata.mod.DatabaseEngineEdition.SqlStretchDatabase & Double = js.native
  
  @js.native
  sealed trait Standard
    extends StObject
       with DatabaseEngineEdition
  /* 2 */ val Standard: typingsJapgolly.azdata.mod.DatabaseEngineEdition.Standard & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with DatabaseEngineEdition
  /* 0 */ val Unknown: typingsJapgolly.azdata.mod.DatabaseEngineEdition.Unknown & Double = js.native
}
