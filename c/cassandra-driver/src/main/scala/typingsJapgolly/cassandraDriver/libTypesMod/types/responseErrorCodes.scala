package typingsJapgolly.cassandraDriver.libTypesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait responseErrorCodes extends StObject
@JSImport("cassandra-driver/lib/types", "types.responseErrorCodes")
@js.native
object responseErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[responseErrorCodes & Double] = js.native
  
  @js.native
  sealed trait alreadyExists
    extends StObject
       with responseErrorCodes
  /* 0x2400 */ val alreadyExists: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.alreadyExists & Double = js.native
  
  @js.native
  sealed trait badCredentials
    extends StObject
       with responseErrorCodes
  /* 0x0100 */ val badCredentials: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.badCredentials & Double = js.native
  
  @js.native
  sealed trait clientWriteFailure
    extends StObject
       with responseErrorCodes
  /* 0x8000 */ val clientWriteFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.clientWriteFailure & Double = js.native
  
  @js.native
  sealed trait configError
    extends StObject
       with responseErrorCodes
  /* 0x2300 */ val configError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.configError & Double = js.native
  
  @js.native
  sealed trait functionFailure
    extends StObject
       with responseErrorCodes
  /* 0x1400 */ val functionFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.functionFailure & Double = js.native
  
  @js.native
  sealed trait invalid
    extends StObject
       with responseErrorCodes
  /* 0x2200 */ val invalid: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.invalid & Double = js.native
  
  @js.native
  sealed trait isBootstrapping
    extends StObject
       with responseErrorCodes
  /* 0x1002 */ val isBootstrapping: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.isBootstrapping & Double = js.native
  
  @js.native
  sealed trait overloaded
    extends StObject
       with responseErrorCodes
  /* 0x1001 */ val overloaded: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.overloaded & Double = js.native
  
  @js.native
  sealed trait protocolError
    extends StObject
       with responseErrorCodes
  /* 0x000A */ val protocolError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.protocolError & Double = js.native
  
  @js.native
  sealed trait readFailure
    extends StObject
       with responseErrorCodes
  /* 0x1300 */ val readFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.readFailure & Double = js.native
  
  @js.native
  sealed trait readTimeout
    extends StObject
       with responseErrorCodes
  /* 0x1200 */ val readTimeout: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.readTimeout & Double = js.native
  
  @js.native
  sealed trait serverError
    extends StObject
       with responseErrorCodes
  /* 0x0000 */ val serverError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.serverError & Double = js.native
  
  @js.native
  sealed trait syntaxError
    extends StObject
       with responseErrorCodes
  /* 0x2000 */ val syntaxError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.syntaxError & Double = js.native
  
  @js.native
  sealed trait truncateError
    extends StObject
       with responseErrorCodes
  /* 0x1003 */ val truncateError: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.truncateError & Double = js.native
  
  @js.native
  sealed trait unauthorized
    extends StObject
       with responseErrorCodes
  /* 0x2100 */ val unauthorized: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unauthorized & Double = js.native
  
  @js.native
  sealed trait unavailableException
    extends StObject
       with responseErrorCodes
  /* 0x1000 */ val unavailableException: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unavailableException & Double = js.native
  
  @js.native
  sealed trait unprepared
    extends StObject
       with responseErrorCodes
  /* 0x2500 */ val unprepared: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.unprepared & Double = js.native
  
  @js.native
  sealed trait writeFailure
    extends StObject
       with responseErrorCodes
  /* 0x1500 */ val writeFailure: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.writeFailure & Double = js.native
  
  @js.native
  sealed trait writeTimeout
    extends StObject
       with responseErrorCodes
  /* 0x1100 */ val writeTimeout: typingsJapgolly.cassandraDriver.libTypesMod.types.responseErrorCodes.writeTimeout & Double = js.native
}
