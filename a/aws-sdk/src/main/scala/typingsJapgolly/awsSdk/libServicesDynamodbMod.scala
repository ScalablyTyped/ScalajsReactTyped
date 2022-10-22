package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdk.clientsDynamodbMod.ClientConfiguration
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import typingsJapgolly.awsSdk.libServiceMod.Service
import typingsJapgolly.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesDynamodbMod {
  
  @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class DynamoDBCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object DynamoDBCustomizations {
    
    @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The document client simplifies working with items in Amazon DynamoDB by abstracting away the notion of attribute values.
      * This abstraction annotates native JavaScript types supplied as input parameters, as well as converts annotated response data to native JavaScript types.
      */
    @JSImport("aws-sdk/lib/services/dynamodb", "DynamoDBCustomizations.DocumentClient")
    @js.native
    def DocumentClient: Instantiable1[
        /* options */ js.UndefOr[DocumentClientOptions & ClientConfiguration], 
        typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient
      ] = js.native
    inline def DocumentClient_=(
      x: Instantiable1[
          /* options */ js.UndefOr[DocumentClientOptions & ClientConfiguration], 
          DocumentClient
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentClient")(x.asInstanceOf[js.Any])
  }
}
