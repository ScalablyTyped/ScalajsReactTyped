package typingsJapgolly.cqrsDomain

import typingsJapgolly.cqrsDomain.mod.SupportedDBTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cqrsDomainStrings {
  
  @js.native
  sealed trait azuretable
    extends StObject
       with SupportedDBTypes
  inline def azuretable: azuretable = "azuretable".asInstanceOf[azuretable]
  
  @js.native
  sealed trait inmemory
    extends StObject
       with SupportedDBTypes
  inline def inmemory: inmemory = "inmemory".asInstanceOf[inmemory]
  
  @js.native
  sealed trait mongodb
    extends StObject
       with SupportedDBTypes
  inline def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  
  @js.native
  sealed trait redis
    extends StObject
       with SupportedDBTypes
  inline def redis: redis = "redis".asInstanceOf[redis]
  
  @js.native
  sealed trait tingodb
    extends StObject
       with SupportedDBTypes
  inline def tingodb: tingodb = "tingodb".asInstanceOf[tingodb]
}
