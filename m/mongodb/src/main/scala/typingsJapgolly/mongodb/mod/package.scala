package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.anon.Id
import typingsJapgolly.mongodb.anon.IdInferIdType
import typingsJapgolly.mongodb.anon.Meta
import typingsJapgolly.mongodb.anon.Open
import typingsJapgolly.mongodb.mod.^
import typingsJapgolly.mongodb.mongodbStrings.ALPNProtocols
import typingsJapgolly.mongodb.mongodbStrings._id
import typingsJapgolly.mongodb.mongodbStrings.`1`
import typingsJapgolly.mongodb.mongodbStrings.awaitData
import typingsJapgolly.mongodb.mongodbStrings.ca
import typingsJapgolly.mongodb.mongodbStrings.cert
import typingsJapgolly.mongodb.mongodbStrings.checkServerIdentity
import typingsJapgolly.mongodb.mongodbStrings.ciphers
import typingsJapgolly.mongodb.mongodbStrings.close
import typingsJapgolly.mongodb.mongodbStrings.commandFailed
import typingsJapgolly.mongodb.mongodbStrings.commandStarted
import typingsJapgolly.mongodb.mongodbStrings.commandSucceeded
import typingsJapgolly.mongodb.mongodbStrings.connectionCheckOutFailed
import typingsJapgolly.mongodb.mongodbStrings.connectionCheckOutStarted
import typingsJapgolly.mongodb.mongodbStrings.connectionCheckedIn
import typingsJapgolly.mongodb.mongodbStrings.connectionCheckedOut
import typingsJapgolly.mongodb.mongodbStrings.connectionClosed
import typingsJapgolly.mongodb.mongodbStrings.connectionCreated
import typingsJapgolly.mongodb.mongodbStrings.connectionPoolCleared
import typingsJapgolly.mongodb.mongodbStrings.connectionPoolClosed
import typingsJapgolly.mongodb.mongodbStrings.connectionPoolCreated
import typingsJapgolly.mongodb.mongodbStrings.connectionPoolReady
import typingsJapgolly.mongodb.mongodbStrings.connectionReady
import typingsJapgolly.mongodb.mongodbStrings.crl
import typingsJapgolly.mongodb.mongodbStrings.ecdhCurve
import typingsJapgolly.mongodb.mongodbStrings.error
import typingsJapgolly.mongodb.mongodbStrings.exhaust
import typingsJapgolly.mongodb.mongodbStrings.family
import typingsJapgolly.mongodb.mongodbStrings.generation
import typingsJapgolly.mongodb.mongodbStrings.hints
import typingsJapgolly.mongodb.mongodbStrings.host
import typingsJapgolly.mongodb.mongodbStrings.hostAddress
import typingsJapgolly.mongodb.mongodbStrings.id
import typingsJapgolly.mongodb.mongodbStrings.isServer
import typingsJapgolly.mongodb.mongodbStrings.key
import typingsJapgolly.mongodb.mongodbStrings.localAddress
import typingsJapgolly.mongodb.mongodbStrings.localPort
import typingsJapgolly.mongodb.mongodbStrings.lookup
import typingsJapgolly.mongodb.mongodbStrings.majority
import typingsJapgolly.mongodb.mongodbStrings.minDHSize
import typingsJapgolly.mongodb.mongodbStrings.noCursorTimeout
import typingsJapgolly.mongodb.mongodbStrings.oplogReplay
import typingsJapgolly.mongodb.mongodbStrings.partial
import typingsJapgolly.mongodb.mongodbStrings.passphrase
import typingsJapgolly.mongodb.mongodbStrings.path
import typingsJapgolly.mongodb.mongodbStrings.pfx
import typingsJapgolly.mongodb.mongodbStrings.port
import typingsJapgolly.mongodb.mongodbStrings.pskCallback
import typingsJapgolly.mongodb.mongodbStrings.rejectUnauthorized
import typingsJapgolly.mongodb.mongodbStrings.requestOCSP
import typingsJapgolly.mongodb.mongodbStrings.secureContext
import typingsJapgolly.mongodb.mongodbStrings.secureProtocol
import typingsJapgolly.mongodb.mongodbStrings.server
import typingsJapgolly.mongodb.mongodbStrings.serverClosed
import typingsJapgolly.mongodb.mongodbStrings.serverDescriptionChanged
import typingsJapgolly.mongodb.mongodbStrings.serverHeartbeatFailed
import typingsJapgolly.mongodb.mongodbStrings.serverHeartbeatStarted
import typingsJapgolly.mongodb.mongodbStrings.serverHeartbeatSucceeded
import typingsJapgolly.mongodb.mongodbStrings.serverOpening
import typingsJapgolly.mongodb.mongodbStrings.servername
import typingsJapgolly.mongodb.mongodbStrings.session
import typingsJapgolly.mongodb.mongodbStrings.socket
import typingsJapgolly.mongodb.mongodbStrings.tailable
import typingsJapgolly.mongodb.mongodbStrings.timeout
import typingsJapgolly.mongodb.mongodbStrings.topologyClosed
import typingsJapgolly.mongodb.mongodbStrings.topologyDescriptionChanged
import typingsJapgolly.mongodb.mongodbStrings.topologyOpening
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.netMod.TcpNetConnectOpts
import typingsJapgolly.node.tlsMod.TLSSocket
import typingsJapgolly.node.tlsMod.TLSSocketOptions
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Extract
import typingsJapgolly.std.MapConstructor
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CURSOR_FLAGS: js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial] = ^.asInstanceOf[js.Dynamic].selectDynamic("CURSOR_FLAGS").asInstanceOf[js.Tuple6[tailable, oplogReplay, noCursorTimeout, awaitData, exhaust, partial]]

type ExplainVerbosity = String

inline def LEGAL_TCP_SOCKET_OPTIONS: js.Tuple5[family, hints, localAddress, localPort, lookup] = ^.asInstanceOf[js.Dynamic].selectDynamic("LEGAL_TCP_SOCKET_OPTIONS").asInstanceOf[js.Tuple5[family, hints, localAddress, localPort, lookup]]

inline def LEGAL_TLS_SOCKET_OPTIONS: js.Tuple16[
ALPNProtocols, 
ca, 
cert, 
checkServerIdentity, 
ciphers, 
crl, 
ecdhCurve, 
key, 
minDHSize, 
passphrase, 
pfx, 
rejectUnauthorized, 
secureContext, 
secureProtocol, 
servername, 
session] = ^.asInstanceOf[js.Dynamic].selectDynamic("LEGAL_TLS_SOCKET_OPTIONS").asInstanceOf[js.Tuple16[
ALPNProtocols, 
ca, 
cert, 
checkServerIdentity, 
ciphers, 
crl, 
ecdhCurve, 
key, 
minDHSize, 
passphrase, 
pfx, 
rejectUnauthorized, 
secureContext, 
secureProtocol, 
servername, 
session]]

inline def MONGO_CLIENT_EVENTS: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("MONGO_CLIENT_EVENTS").asInstanceOf[js.Array[Any]]

inline def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])

inline def ObjectID_ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectId */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ObjectID").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectId */ Any]

type ServerApiVersion = `1`

type AnyError = MongoError | js.Error

type BitwiseFilter = scala.Double | typingsJapgolly.bson.mod.Binary | js.Array[scala.Double]

type Callback[T] = js.Function2[/* error */ js.UndefOr[AnyError], /* result */ js.UndefOr[T], Unit]

type Condition[T] = AlternativeType[T] | FilterOperators[AlternativeType[T]]

type DistinctOptions = CommandOperationOptions

type DropDatabaseOptions = CommandOperationOptions

type DropIndexesOptions = CommandOperationOptions

type EventEmitterWithState = js.Object

type EventsDescription = Record[String, GenericListener]

type ExplainVerbosityLike = ExplainVerbosity | Boolean

type Filter[TSchema] = Partial[TSchema] | ((/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<mongodb.mongodb.WithId<TSchema>>, '.'> ]:? mongodb.mongodb.Condition<mongodb.mongodb.PropertyType<mongodb.mongodb.WithId<TSchema>, Property>>} */ js.Any) & RootFilterOperators[WithId[TSchema]])

type FinalizeFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* reducedValue */ TValue, TValue]

type Hint = String | Document

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbInts.`-1`
  - typingsJapgolly.mongodb.mongodbInts.`1`
  - typingsJapgolly.mongodb.mongodbStrings.`2d`
  - typingsJapgolly.mongodb.mongodbStrings.`2dsphere`
  - typingsJapgolly.mongodb.mongodbStrings.text
  - typingsJapgolly.mongodb.mongodbStrings.geoHaystack
  - scala.Double
*/
type IndexDirection = _IndexDirection | scala.Double

type IndexSpecification = OneOrMore[
String | (js.Tuple2[String, IndexDirection]) | StringDictionary[IndexDirection] | (typingsJapgolly.std.Map[String, IndexDirection])]

type IntegerType = scala.Double | typingsJapgolly.bson.mod.Int32 | typingsJapgolly.bson.mod.Long

type KeysOfAType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? key : never}[keyof TSchema] */ js.Any

type KeysOfOtherType[TSchema, Type] = /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof TSchema ]: std.NonNullable<TSchema[key]> extends Type? never : key}[keyof TSchema] */ js.Any

type MapFunction[TSchema] = js.ThisFunction0[/* this */ TSchema, Unit]

type MatchKeysAndValues[TSchema] = /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<TSchema>, '.'> ]:? mongodb.mongodb.PropertyType<TSchema, Property>} */ js.Any

type MongoClientEvents = (Pick[
TopologyEvents, 
connectionPoolCreated | connectionPoolReady | connectionPoolCleared | connectionPoolClosed | connectionCreated | connectionReady | connectionClosed | connectionCheckOutStarted | connectionCheckOutFailed | connectionCheckedOut | connectionCheckedIn | commandStarted | commandSucceeded | commandFailed | serverOpening | serverClosed | serverDescriptionChanged | topologyOpening | topologyClosed | topologyDescriptionChanged | error | timeout | close | serverHeartbeatStarted | serverHeartbeatSucceeded | serverHeartbeatFailed]) & Open

type NestedPathsOfType[TSchema, Type] = KeysOfAType[
/* import warning: importer.ImportType#apply Failed type conversion: {[ Property in mongodb.mongodb.Join<mongodb.mongodb.NestedPaths<TSchema>, '.'> ]: mongodb.mongodb.PropertyType<TSchema, Property>} */ js.Any, 
Type]

/* Inlined {[ key in keyof bson.bson.ObjectIdLike ]:? never} & bson.bson.Document */
type NonObjectIdLikeDocument = StringDictionary[Any]

type NumericType = IntegerType | typingsJapgolly.bson.mod.Decimal128 | typingsJapgolly.bson.mod.Double

type OneOrMore[T] = T | js.Array[T]

type OnlyFieldsOfType[TSchema, FieldType, AssignableType] = IsAny[
/* import warning: importer.ImportType#apply Failed type conversion: TSchema[keyof TSchema] */ js.Any, 
Record[String, FieldType], 
(AcceptedFields[TSchema, FieldType, AssignableType]) & (NotAcceptedFields[TSchema, FieldType]) & (Record[String, AssignableType])]

type OperationTime = typingsJapgolly.bson.mod.Timestamp

type OptionalId[TSchema] = (EnhancedOmit[TSchema, _id]) & Id[TSchema]

type ProfilingLevelOptions = CommandOperationOptions

type Projection[TSchema /* <: Document */] = Document

type ProjectionOperators = Document

type PullAllOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? TSchema[key]} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & StringDictionary[js.Array[Any]]

type PullOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? std.Partial<mongodb.mongodb.Flatten<TSchema[key]>> | mongodb.mongodb.FilterOperations<mongodb.mongodb.Flatten<TSchema[key]>>} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & (StringDictionary[FilterOperators[Any] | Any])

type PushOperator[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any>> ]:? mongodb.mongodb.Flatten<TSchema[key]> | mongodb.mongodb.ArrayOperator<std.Array<mongodb.mongodb.Flatten<TSchema[key]>>>} */ js.Any) & (NotAcceptedFields[TSchema, js.Array[Any]]) & (StringDictionary[ArrayOperator[Any] | Any])

type ReduceFunction[TKey, TValue] = js.Function2[/* key */ TKey, /* values */ js.Array[TValue], TValue]

type RemoveUserOptions = CommandOperationOptions

type ResumeToken = Any

type RunCommandOptions = CommandOperationOptions

type SchemaMember[T, V] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? V} */ js.Any) | StringDictionary[V]

type ServerOptions = (Omit[ConnectionPoolOptions, id | generation | hostAddress]) & MonitorOptions

type ServerSelector = js.Function2[
/* topologyDescription */ TopologyDescription, 
/* servers */ js.Array[ServerDescription], 
js.Array[ServerDescription]]

type SetFields[TSchema] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in mongodb.mongodb.KeysOfAType<TSchema, std.ReadonlyArray<any> | undefined> ]:? mongodb.mongodb.OptionalId<mongodb.mongodb.Flatten<TSchema[key]>> | mongodb.mongodb.AddToSetOperators<std.Array<mongodb.mongodb.OptionalId<mongodb.mongodb.Flatten<TSchema[key]>>>>} */ js.Any) & (NotAcceptedFields[TSchema, js.UndefOr[js.Array[Any]]]) & (StringDictionary[AddToSetOperators[Any] | Any])

type SetProfilingLevelOptions = CommandOperationOptions

type Sort = String | (Exclude[SortDirection, Meta]) | (js.Array[String | (js.Tuple2[String, SortDirection])]) | StringDictionary[SortDirection] | (typingsJapgolly.std.Map[String, SortDirection]) | (js.Tuple2[String, SortDirection])

type Stream = Socket | TLSSocket

type SupportedNodeConnectionOptions = SupportedTLSConnectionOptions & SupportedTLSSocketOptions & SupportedSocketOptions

type SupportedSocketOptions = Pick[TcpNetConnectOpts, family | hints | localAddress | localPort | lookup]

type SupportedTLSConnectionOptions = Pick[
typingsJapgolly.node.tlsMod.ConnectionOptions, 
Extract[
  host | port | path | socket | checkServerIdentity | servername | session | minDHSize | lookup | timeout | pskCallback, 
  ALPNProtocols | ca | cert | checkServerIdentity | ciphers | crl | ecdhCurve | key | minDHSize | passphrase | pfx | rejectUnauthorized | secureContext | secureProtocol | servername | session
]]

type SupportedTLSSocketOptions = Pick[
TLSSocketOptions, 
Extract[
  isServer | server | session | requestOCSP, 
  ALPNProtocols | ca | cert | checkServerIdentity | ciphers | crl | ecdhCurve | key | minDHSize | passphrase | pfx | rejectUnauthorized | secureContext | secureProtocol | servername | session
]]

type TagSet = StringDictionary[String]

type W = scala.Double | majority

type WithId[TSchema] = (EnhancedOmit[TSchema, _id]) & IdInferIdType[TSchema]

type WithSessionCallback = js.Function1[/* session */ ClientSession, js.Promise[Any]]

type WithTransactionCallback[T] = js.Function1[/* session */ ClientSession, js.Promise[T]]

type WithoutId[TSchema] = Omit[TSchema, _id]
