package typingsJapgolly.lesgo

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsSdk.clientsDynamodbMod.DocumentClient
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExpressionAttributeValueMap
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Integer
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ItemList
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.Key
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyExpression
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemInputAttributeMap
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemOutput
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.RegionName
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateExpression
import typingsJapgolly.awsSdk.libDynamodbDocumentClientMod.DocumentClient.UpdateItemOutput
import typingsJapgolly.lesgo.anon.ExpressionAttributeValues
import typingsJapgolly.lesgo.anon.Item
import typingsJapgolly.lesgo.anon.KeyConditionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesDynamoDbServiceMod {
  
  @JSImport("lesgo/services/DynamoDbService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DynamoDb {
    def this(params: DynamoDbParams) = this()
    
    /* CompleteClass */
    var client: DocumentClient = js.native
    
    /* CompleteClass */
    override def connect(opts: DynamoDbParams): Unit = js.native
    
    /* protected */ /* CompleteClass */
    override def preparePutPayload(tableName: TableName, item: PutItemInputAttributeMap): Item = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareQueryCountPayload(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): KeyConditionExpression = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareQueryPayload(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap,
      projectionExpression: ProjectionExpression
    ): ExpressionAttributeValues = js.native
    
    /* protected */ /* CompleteClass */
    override def prepareUpdatePayload(
      tableName: TableName,
      key: Key,
      updateExpression: UpdateExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): typingsJapgolly.lesgo.anon.Key = js.native
    
    /* CompleteClass */
    override def put(tableName: TableName, item: PutItemInputAttributeMap): js.Promise[PutItemOutput] = js.native
    
    /* CompleteClass */
    override def query(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap,
      projectionExpression: ProjectionExpression
    ): js.Promise[ItemList] = js.native
    
    /* CompleteClass */
    override def queryCount(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): js.Promise[Integer] = js.native
    
    /* CompleteClass */
    override def update(
      tableName: TableName,
      key: Key,
      updateExpression: UpdateExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): js.Promise[UpdateItemOutput] = js.native
  }
  
  trait DynamoDb extends StObject {
    
    var client: DocumentClient
    
    def connect(opts: DynamoDbParams): Unit
    
    /* protected */ def preparePutPayload(tableName: TableName, item: PutItemInputAttributeMap): Item
    
    /* protected */ def prepareQueryCountPayload(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): KeyConditionExpression
    
    /* protected */ def prepareQueryPayload(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap,
      projectionExpression: ProjectionExpression
    ): ExpressionAttributeValues
    
    /* protected */ def prepareUpdatePayload(
      tableName: TableName,
      key: Key,
      updateExpression: UpdateExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): typingsJapgolly.lesgo.anon.Key
    
    def put(tableName: TableName, item: PutItemInputAttributeMap): js.Promise[PutItemOutput]
    
    def query(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap,
      projectionExpression: ProjectionExpression
    ): js.Promise[ItemList]
    
    def queryCount(
      tableName: TableName,
      keyConditionExpression: KeyExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): js.Promise[Integer]
    
    def update(
      tableName: TableName,
      key: Key,
      updateExpression: UpdateExpression,
      expressionAttributeValues: ExpressionAttributeValueMap
    ): js.Promise[UpdateItemOutput]
  }
  object DynamoDb {
    
    inline def apply(
      client: DocumentClient,
      connect: DynamoDbParams => Callback,
      preparePutPayload: (TableName, PutItemInputAttributeMap) => Item,
      prepareQueryCountPayload: (TableName, KeyExpression, ExpressionAttributeValueMap) => KeyConditionExpression,
      prepareQueryPayload: (TableName, KeyExpression, ExpressionAttributeValueMap, ProjectionExpression) => ExpressionAttributeValues,
      prepareUpdatePayload: (TableName, Key, UpdateExpression, ExpressionAttributeValueMap) => typingsJapgolly.lesgo.anon.Key,
      put: (TableName, PutItemInputAttributeMap) => js.Promise[PutItemOutput],
      query: (TableName, KeyExpression, ExpressionAttributeValueMap, ProjectionExpression) => js.Promise[ItemList],
      queryCount: (TableName, KeyExpression, ExpressionAttributeValueMap) => js.Promise[Integer],
      update: (TableName, Key, UpdateExpression, ExpressionAttributeValueMap) => js.Promise[UpdateItemOutput]
    ): DynamoDb = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], connect = js.Any.fromFunction1((t0: DynamoDbParams) => connect(t0).runNow()), preparePutPayload = js.Any.fromFunction2(preparePutPayload), prepareQueryCountPayload = js.Any.fromFunction3(prepareQueryCountPayload), prepareQueryPayload = js.Any.fromFunction4(prepareQueryPayload), prepareUpdatePayload = js.Any.fromFunction4(prepareUpdatePayload), put = js.Any.fromFunction2(put), query = js.Any.fromFunction4(query), queryCount = js.Any.fromFunction3(queryCount), update = js.Any.fromFunction4(update))
      __obj.asInstanceOf[DynamoDb]
    }
    
    extension [Self <: DynamoDb](x: Self) {
      
      inline def setClient(value: DocumentClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: DynamoDbParams => Callback): Self = StObject.set(x, "connect", js.Any.fromFunction1((t0: DynamoDbParams) => value(t0).runNow()))
      
      inline def setPreparePutPayload(value: (TableName, PutItemInputAttributeMap) => Item): Self = StObject.set(x, "preparePutPayload", js.Any.fromFunction2(value))
      
      inline def setPrepareQueryCountPayload(value: (TableName, KeyExpression, ExpressionAttributeValueMap) => KeyConditionExpression): Self = StObject.set(x, "prepareQueryCountPayload", js.Any.fromFunction3(value))
      
      inline def setPrepareQueryPayload(
        value: (TableName, KeyExpression, ExpressionAttributeValueMap, ProjectionExpression) => ExpressionAttributeValues
      ): Self = StObject.set(x, "prepareQueryPayload", js.Any.fromFunction4(value))
      
      inline def setPrepareUpdatePayload(
        value: (TableName, Key, UpdateExpression, ExpressionAttributeValueMap) => typingsJapgolly.lesgo.anon.Key
      ): Self = StObject.set(x, "prepareUpdatePayload", js.Any.fromFunction4(value))
      
      inline def setPut(value: (TableName, PutItemInputAttributeMap) => js.Promise[PutItemOutput]): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      inline def setQuery(
        value: (TableName, KeyExpression, ExpressionAttributeValueMap, ProjectionExpression) => js.Promise[ItemList]
      ): Self = StObject.set(x, "query", js.Any.fromFunction4(value))
      
      inline def setQueryCount(value: (TableName, KeyExpression, ExpressionAttributeValueMap) => js.Promise[Integer]): Self = StObject.set(x, "queryCount", js.Any.fromFunction3(value))
      
      inline def setUpdate(
        value: (TableName, Key, UpdateExpression, ExpressionAttributeValueMap) => js.Promise[UpdateItemOutput]
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    }
  }
  
  trait DynamoDbParams extends StObject {
    
    var region: RegionName
  }
  object DynamoDbParams {
    
    inline def apply(region: RegionName): DynamoDbParams = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDbParams]
    }
    
    extension [Self <: DynamoDbParams](x: Self) {
      
      inline def setRegion(value: RegionName): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
}
