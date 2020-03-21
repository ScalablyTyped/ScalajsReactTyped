package typingsJapgolly.grpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Any client call type
    */
  type Call = typingsJapgolly.grpc.mod.ClientUnaryCall | typingsJapgolly.grpc.mod.ClientReadableStream[js.Any] | typingsJapgolly.grpc.mod.ClientWritableStream[js.Any] | (typingsJapgolly.grpc.mod.ClientDuplexStream[js.Any, js.Any])
  type CancelRequester = js.Function1[/* next */ js.Function, scala.Unit]
  type CheckServerIdentityCallback = js.Function2[
    /* hostname */ java.lang.String, 
    /* cert */ typingsJapgolly.grpc.mod.Certificate, 
    js.UndefOr[js.Error]
  ]
  type CloseRequester = js.Function1[/* next */ js.Function, scala.Unit]
  type Deadline = scala.Double | js.Date
  type Filename = java.lang.String | typingsJapgolly.grpc.AnonFile
  type GetPeerRequester = js.Function1[/* next */ js.Function, java.lang.String]
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MetadataListener = js.Function2[/* metadata */ typingsJapgolly.grpc.mod.Metadata, /* next */ js.Function, scala.Unit]
  type MetadataRequester = js.Function3[
    /* metadata */ typingsJapgolly.grpc.mod.Metadata, 
    /* listener */ typingsJapgolly.grpc.mod.Listener, 
    /* next */ js.Function, 
    scala.Unit
  ]
  type MetadataValue = java.lang.String | typingsJapgolly.node.Buffer
  type PackageDefinition = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.grpc.mod.ServiceDefinition[js.Any] | typingsJapgolly.grpc.mod.ProtobufTypeDefinition
  ]
  type ServiceDefinition[ImplementationType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ I in keyof ImplementationType ]: grpc.grpc.MethodDefinition<any, any>}
    */ typingsJapgolly.grpc.grpcStrings.ServiceDefinition with js.Any
  type StatusListener = js.Function2[
    /* status */ typingsJapgolly.grpc.mod.StatusObject, 
    /* next */ js.Function, 
    scala.Unit
  ]
  type UntypedServiceImplementation = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.grpc.mod.handleCall[js.Any, js.Any]]
  /**
    * A deserialization function
    * @param data The byte sequence to deserialize
    * @return The data deserialized as a value
    */
  type deserialize[T] = js.Function1[/* data */ typingsJapgolly.node.Buffer, T]
  /**
    * User provided method to handle bidirectional streaming calls on the server.
    */
  type handleBidiStreamingCall[RequestType, ResponseType] = js.Function1[
    /* call */ typingsJapgolly.grpc.mod.ServerDuplexStream[RequestType, ResponseType], 
    scala.Unit
  ]
  type handleCall[RequestType, ResponseType] = (typingsJapgolly.grpc.mod.handleUnaryCall[RequestType, ResponseType]) | (typingsJapgolly.grpc.mod.handleClientStreamingCall[RequestType, ResponseType]) | (typingsJapgolly.grpc.mod.handleServerStreamingCall[RequestType, ResponseType]) | (typingsJapgolly.grpc.mod.handleBidiStreamingCall[RequestType, ResponseType])
  /**
    * User provided method to handle client streaming methods on the server.
    */
  type handleClientStreamingCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsJapgolly.grpc.mod.ServerReadableStream[RequestType], 
    /* callback */ typingsJapgolly.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  /**
    * User provided method to handle server streaming methods on the server.
    */
  type handleServerStreamingCall[RequestType, ResponseType] = js.Function1[/* call */ typingsJapgolly.grpc.mod.ServerWriteableStream[RequestType], scala.Unit]
  /**
    * User-provided method to handle unary requests on a server
    */
  type handleUnaryCall[RequestType, ResponseType] = js.Function2[
    /* call */ typingsJapgolly.grpc.mod.ServerUnaryCall[RequestType], 
    /* callback */ typingsJapgolly.grpc.mod.sendUnaryData[ResponseType], 
    scala.Unit
  ]
  type metadataGenerator = js.Function2[
    /* params */ typingsJapgolly.grpc.AnonServiceurl, 
    /* callback */ js.Function2[
      /* error */ js.Error | scala.Null, 
      /* metadata */ js.UndefOr[typingsJapgolly.grpc.mod.Metadata], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type requestCallback[ResponseType] = js.Function2[
    /* error */ typingsJapgolly.grpc.mod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
  /**
    * Callback function passed to server handlers that handle methods with
    * unary responses.
    */
  type sendUnaryData[ResponseType] = js.Function4[
    /* error */ typingsJapgolly.grpc.mod.ServiceError | scala.Null, 
    /* value */ ResponseType | scala.Null, 
    /* trailer */ js.UndefOr[typingsJapgolly.grpc.mod.Metadata], 
    /* flags */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  /**
    * A serialization function
    * @param value The value to serialize
    * @return The value serialized as a byte sequence
    */
  type serialize[T] = js.Function1[/* value */ T, typingsJapgolly.node.Buffer]
}
