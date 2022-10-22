package typingsJapgolly.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudSpanner.anon.PickanytransactionTag
import typingsJapgolly.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typingsJapgolly.googleCloudSpanner.buildSrcDatabaseMod.Database
import typingsJapgolly.googleCloudSpanner.buildSrcTransactionMod.PartitionedDml
import typingsJapgolly.googleCloudSpanner.buildSrcTransactionMod.Snapshot
import typingsJapgolly.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import typingsJapgolly.googleCloudSpanner.buildSrcTransactionMod.Transaction
import typingsJapgolly.googleCloudSpanner.googleCloudSpannerStrings.readonly
import typingsJapgolly.googleCloudSpanner.googleCloudSpannerStrings.readwrite
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ServiceError
import typingsJapgolly.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSessionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any */ @JSImport("@google-cloud/spanner/build/src/session", "Session")
  @js.native
  open class Session protected () extends StObject {
    def this(database: Database) = this()
    def this(database: Database, name: String) = this()
    
    /**
      * Delete a session.
      *
      * Wrapper around {@link v1.SpannerClient#deleteSession}.
      *
      * @see {@link v1.SpannerClient#deleteSession}
      * @see [DeleteSession API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.DeleteSession)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteSessionCallback} [callback] Callback function.
      * @returns {Promise<DeleteSessionResponse>}
      *
      * @example
      * ```
      * session.delete(function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Session deleted successfully.
      * });
      *
      * //-
      * //Returns a Promise if the callback is omitted.
      * //-
      * session.delete().then(function(data) {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[DeleteSessionResponse] = js.native
    def delete(callback: DeleteSessionCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[DeleteSessionResponse] = js.native
    def delete(gaxOptions: CallOptions, callback: DeleteSessionCallback): Unit = js.native
    
    var formattedName_ : js.UndefOr[String] = js.native
    
    /**
      * @typedef {array} GetSessionMetadataResponse
      * @property {object} 0 The session's metadata.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSessionMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} metadata The session's metadata.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get the session's metadata.
      *
      * Wrapper around {@link v1.SpannerClient#getSession}.
      *
      * @see {@link v1.SpannerClient#getSession}
      * @see [GetSession API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.GetSession)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetSessionMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetSessionMetadataResponse>}
      *
      * @example
      * ```
      * session.getMetadata(function(err, metadata, apiResponse) {});
      *
      * //-
      * //Returns a Promise if the callback is omitted.
      * //-
      * session.getMetadata().then(function(data) {
      *   const metadata = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getMetadata(): js.Promise[GetSessionMetadataResponse] = js.native
    def getMetadata(callback: GetSessionMetadataCallback): Unit = js.native
    def getMetadata(gaxOptions: CallOptions): js.Promise[GetSessionMetadataResponse] = js.native
    def getMetadata(gaxOptions: CallOptions, callback: GetSessionMetadataCallback): Unit = js.native
    
    var id: String = js.native
    
    /**
      * Ping the session with `SELECT 1` to prevent it from expiring.
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {BasicCallback} [callback] Callback function.
      * @returns {Promise<BasicResponse>}
      *
      * @example
      * ```
      * session.keepAlive(function(err) {
      *   if (err) {
      *     // An error occurred while trying to keep this session alive.
      *   }
      * });
      * ```
      */
    def keepAlive(): js.Promise[KeepAliveResponse] = js.native
    def keepAlive(callback: KeepAliveCallback): Unit = js.native
    def keepAlive(gaxOptions: CallOptions): js.Promise[KeepAliveResponse] = js.native
    def keepAlive(gaxOptions: CallOptions, callback: KeepAliveCallback): Unit = js.native
    
    var lastError: js.UndefOr[ServiceError] = js.native
    
    var lastUsed: js.UndefOr[Double] = js.native
    
    /**
      * Create a PartitionedDml transaction.
      *
      * @returns {PartitionedDml}
      *
      * @example
      * ```
      * const transaction = session.partitionedDml();
      * ```
      */
    def partitionedDml(): PartitionedDml = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * Create a Snapshot transaction.
      *
      * @param {TimestampBounds} [options] The timestamp bounds.
      * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions] The default query options to use.
      * @returns {Snapshot}
      *
      * @example
      * ```
      * const snapshot = session.snapshot({strong: false});
      * ```
      */
    def snapshot(): Snapshot = js.native
    def snapshot(
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Snapshot = js.native
    def snapshot(options: TimestampBounds): Snapshot = js.native
    def snapshot(
      options: TimestampBounds,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Snapshot = js.native
    
    /**
      * Create a read write Transaction.
      *
      * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions] The default query options to use.
      * @return {Transaction}
      *
      * @example
      * ```
      * const transaction = session.transaction();
      * ```
      */
    def transaction(): Transaction = js.native
    def transaction(
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Transaction = js.native
    def transaction(
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any,
      requestOptions: PickanytransactionTag
    ): Transaction = js.native
    def transaction(queryOptions: Unit, requestOptions: PickanytransactionTag): Transaction = js.native
    
    var txn: js.UndefOr[Transaction] = js.native
    
    var `type`: js.UndefOr[types] = js.native
  }
  /* static members */
  object Session {
    
    @JSImport("@google-cloud/spanner/build/src/session", "Session")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the session name to include the parent database's name.
      *
      * @private
      *
      * @param {string} databaseName The parent database's name.
      * @param {string} name The instance name.
      * @returns {string}
      *
      * @example
      * ```
      * Session.formatName_('my-database', 'my-session');
      * // 'projects/grape-spaceship-123/instances/my-instance/' +
      * // 'databases/my-database/sessions/my-session'
      * ```
      */
    inline def formatName_(databaseName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(databaseName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type DeleteSessionCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any
  ]
  
  type DeleteSessionResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any
  ]
  
  type GetSessionMetadataCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ISession */ Any
  ]
  
  type GetSessionMetadataResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ISession */ Any
  ]
  
  type GetSessionResponse = js.Tuple2[Session, Response[Any]]
  
  type KeepAliveCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.IResultSet */ Any
  ]
  
  type KeepAliveResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.IResultSet */ Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleCloudSpanner.googleCloudSpannerStrings.readonly
    - typingsJapgolly.googleCloudSpanner.googleCloudSpannerStrings.readwrite
  */
  trait types extends StObject
  object types {
    
    inline def ReadOnly: readonly = "readonly".asInstanceOf[readonly]
    
    inline def ReadWrite: readwrite = "readwrite".asInstanceOf[readwrite]
  }
}
