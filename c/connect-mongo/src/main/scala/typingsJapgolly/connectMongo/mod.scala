package typingsJapgolly.connectMongo

import typingsJapgolly.connectMongo.buildMainLibMongoStoreMod.ConnectMongoOptions
import typingsJapgolly.connectMongo.buildMainLibMongoStoreMod.MongoStore
import typingsJapgolly.connectMongo.buildMainLibMongoStoreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("connect-mongo", JSImport.Namespace)
  @js.native
  open class ^ protected () extends default {
    def this(hasCollectionNameTtlMongoOptionsAutoRemoveAutoRemoveIntervalTouchAfterStringifyCryptoRequired: ConnectMongoOptions) = this()
  }
  @JSImport("connect-mongo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(options: ConnectMongoOptions): MongoStore = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[MongoStore]
}
