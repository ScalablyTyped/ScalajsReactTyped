package typingsJapgolly.googleCloudDatastore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreCoords
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreDouble
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreGeopoint
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreInt
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreKey
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreKeyOptions
import typingsJapgolly.googleCloudDatastore.entityMod.DatastoreKeyPath
import typingsJapgolly.googleCloudDatastore.queryMod.MoreResultsAfterCursor
import typingsJapgolly.googleCloudDatastore.queryMod.MoreResultsAfterLimit
import typingsJapgolly.googleCloudDatastore.queryMod.NoMoreResults
import typingsJapgolly.googleCloudDatastore.transactionMod.DatastoreTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/datastore", JSImport.Namespace)
  @js.native
  open class ^ () extends Datastore {
    def this(options: InitOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@google-cloud/datastore", "DatastoreRequest")
  @js.native
  open class DatastoreRequest ()
    extends typingsJapgolly.googleCloudDatastore.requestMod.DatastoreRequest
  /* static member */
  @JSImport("@google-cloud/datastore", "DatastoreRequest")
  @js.native
  val DatastoreRequest: Instantiable0[typingsJapgolly.googleCloudDatastore.requestMod.DatastoreRequest] = js.native
  
  /* static member */
  @JSImport("@google-cloud/datastore", "KEY")
  @js.native
  val KEY: js.Symbol = js.native
  
  /* static member */
  @JSImport("@google-cloud/datastore", "MORE_RESULTS_AFTER_CURSOR")
  @js.native
  val MORE_RESULTS_AFTER_CURSOR: MoreResultsAfterCursor = js.native
  
  /* static member */
  @JSImport("@google-cloud/datastore", "MORE_RESULTS_AFTER_LIMIT")
  @js.native
  val MORE_RESULTS_AFTER_LIMIT: MoreResultsAfterLimit = js.native
  
  /* static member */
  @JSImport("@google-cloud/datastore", "NO_MORE_RESULTS")
  @js.native
  val NO_MORE_RESULTS: NoMoreResults = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@google-cloud/datastore", "Query")
  @js.native
  open class Query protected ()
    extends typingsJapgolly.googleCloudDatastore.queryMod.Query {
    def this(scope: String, kinds: String, namespace: String) = this()
  }
  /* static member */
  @JSImport("@google-cloud/datastore", "Query")
  @js.native
  val Query: Instantiable3[
    /* scope */ String, 
    /* kinds */ String, 
    /* namespace */ String, 
    typingsJapgolly.googleCloudDatastore.queryMod.Query
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@google-cloud/datastore", "Transaction")
  @js.native
  open class Transaction protected () extends DatastoreTransaction {
    def this(datastore: ^) = this()
  }
  /* static member */
  @JSImport("@google-cloud/datastore", "Transaction")
  @js.native
  val Transaction: Instantiable1[/* datastore */ ^, DatastoreTransaction] = js.native
  
  @js.native
  trait Datastore
    extends typingsJapgolly.googleCloudDatastore.requestMod.DatastoreRequest {
    
    val KEY: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ Any = js.native
    
    val MORE_RESULTS_AFTER_CURSOR: MoreResultsAfterCursor = js.native
    
    val MORE_RESULTS_AFTER_LIMIT: MoreResultsAfterLimit = js.native
    
    val NO_MORE_RESULTS: NoMoreResults = js.native
    
    def createQuery(kind: String): typingsJapgolly.googleCloudDatastore.queryMod.Query = js.native
    // tslint:disable-next-line unified-signatures (Arg is semantically different)
    def createQuery(namespace: String, kind: String): typingsJapgolly.googleCloudDatastore.queryMod.Query = js.native
    
    def determineBaseUrl_(): Unit = js.native
    def determineBaseUrl_(customApiEndpoint: String): Unit = js.native
    
    def double(value: String): DatastoreDouble = js.native
    def double(value: Double): DatastoreDouble = js.native
    
    def geoPoint(coordinates: DatastoreCoords): DatastoreGeopoint = js.native
    
    def int(value: String): DatastoreInt = js.native
    def int(value: Double): DatastoreInt = js.native
    
    def isDouble(value: Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreDouble */ Boolean = js.native
    
    def isGeoPoint(value: Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreGeopoint */ Boolean = js.native
    
    def isInt(value: Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreInt */ Boolean = js.native
    
    def isKey(value: Any): /* is @google-cloud/datastore.@google-cloud/datastore/entity.DatastoreKey */ Boolean = js.native
    
    def key(pathOrOptions: DatastoreKeyOptions): DatastoreKey = js.native
    def key(pathOrOptions: DatastoreKeyPath): DatastoreKey = js.native
    
    def transaction(): DatastoreTransaction = js.native
  }
  
  trait InitOptions extends StObject {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var credentials: js.UndefOr[js.Object] = js.undefined
    
    var keyFilename: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setCredentials(value: js.Object): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    }
  }
}
