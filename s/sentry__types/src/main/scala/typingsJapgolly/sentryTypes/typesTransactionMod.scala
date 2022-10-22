package typingsJapgolly.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryTypes.anon.Data
import typingsJapgolly.sentryTypes.anon.Description
import typingsJapgolly.sentryTypes.anon.PartialDynamicSamplingCon
import typingsJapgolly.sentryTypes.anon.PartialTransactionMetadat
import typingsJapgolly.sentryTypes.anon.PickSpanContextExcludekey
import typingsJapgolly.sentryTypes.typesMeasurementMod.MeasurementUnit
import typingsJapgolly.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import typingsJapgolly.sentryTypes.typesMiscMod.WorkerLocation
import typingsJapgolly.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typingsJapgolly.sentryTypes.typesSpanMod.Span
import typingsJapgolly.sentryTypes.typesSpanMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransactionMod {
  
  type CustomSamplingContext = StringDictionary[Any]
  
  trait SamplingContext
    extends StObject
       with CustomSamplingContext {
    
    /**
      * Object representing the URL of the current page or worker script. Passed by default when using the `BrowserTracing`
      * integration.
      */
    var location: js.UndefOr[WorkerLocation] = js.undefined
    
    /**
      * Sampling decision from the parent transaction, if any.
      */
    var parentSampled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object representing the incoming request to a node server. Passed by default when using the TracingHandler.
      */
    var request: js.UndefOr[ExtractedNodeRequestData] = js.undefined
    
    /**
      * Context data with which transaction being sampled was created
      */
    var transactionContext: TransactionContext
  }
  object SamplingContext {
    
    inline def apply(transactionContext: TransactionContext): SamplingContext = {
      val __obj = js.Dynamic.literal(transactionContext = transactionContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingContext]
    }
    
    extension [Self <: SamplingContext](x: Self) {
      
      inline def setLocation(value: WorkerLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      inline def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      inline def setRequest(value: ExtractedNodeRequestData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setTransactionContext(value: TransactionContext): Self = StObject.set(x, "transactionContext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@sentry/types.@sentry/types/types/transaction.TransactionContext, 'traceId' | 'parentSpanId' | 'parentSampled'> */
  trait TraceparentData extends StObject {
    
    var parentSampled: js.UndefOr[Boolean] = js.undefined
    
    var parentSpanId: js.UndefOr[String] = js.undefined
    
    var traceId: js.UndefOr[String] = js.undefined
  }
  object TraceparentData {
    
    inline def apply(): TraceparentData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceparentData]
    }
    
    extension [Self <: TraceparentData](x: Self) {
      
      inline def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      inline def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      inline def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      inline def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      inline def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.sentryTypes.typesSpanMod.SpanContext because Already inherited
  - typingsJapgolly.sentryTypes.typesSpanMod.Span because var conflicts: data, description, endTimestamp, op, parentSpanId, sampled, spanId, startTimestamp, status, tags, traceId. Inlined transaction, finish, finish, setTag, setData, setStatus, setHttpStatus, startChild, startChild, isSuccess, toTraceparent, toContext, updateWithContext, getTraceContext, toJSON */ @js.native
  trait Transaction
    extends StObject
       with TransactionContext {
    
    /**
      * @inheritDoc
      */
    @JSName("data")
    var data_Transaction: StringDictionary[Any] = js.native
    
    /**
      * Sets the finish timestamp on the current span.
      * @param endTimestamp Takes an endTimestamp if the end should not be the time when you call this function.
      */
    def finish(): Unit = js.native
    def finish(endTimestamp: Double): Unit = js.native
    
    /** Return the current Dynamic Sampling Context of this transaction */
    def getDynamicSamplingContext(): PartialDynamicSamplingCon = js.native
    
    /** Convert the object to JSON for w. spans array info only */
    def getTraceContext(): Data = js.native
    
    /**
      * Determines whether span was successful (HTTP200)
      */
    def isSuccess(): Boolean = js.native
    
    /**
      * Metadata about the transaction
      */
    @JSName("metadata")
    var metadata_Transaction: TransactionMetadata = js.native
    
    /**
      * Sets the data attribute on the current span
      * @param key Data key
      * @param value Data value
      */
    def setData(key: String, value: Any): this.type = js.native
    
    /**
      * Sets the status attribute on the current span based on the http code
      * @param httpStatus http code used to set the status
      */
    def setHttpStatus(httpStatus: Double): this.type = js.native
    
    /**
      * Set observed measurement for this transaction.
      *
      * @param name Name of the measurement
      * @param value Value of the measurement
      * @param unit Unit of the measurement. (Defaults to an empty string)
      */
    def setMeasurement(name: String, value: Double, unit: MeasurementUnit): Unit = js.native
    
    /**
      * Set metadata for this transaction.
      * @hidden
      */
    def setMetadata(newMetadata: PartialTransactionMetadat): Unit = js.native
    
    /**
      * Set the name of the transaction
      */
    def setName(name: String): Unit = js.native
    def setName(name: String, source: TransactionSource): Unit = js.native
    
    /**
      * Sets the status attribute on the current span
      * See: {@sentry/tracing SpanStatus} for possible values
      * @param status http code used to set the status
      */
    def setStatus(status: String): this.type = js.native
    
    /**
      * Sets the tag attribute on the current span.
      *
      * Can also be used to unset a tag, by passing `undefined`.
      *
      * @param key Tag key
      * @param value Tag value
      */
    def setTag(key: String, value: Primitive): this.type = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("spanId")
    var spanId_Transaction: String = js.native
    
    /**
      * Creates a new `Span` while setting the current `Span.id` as `parentSpanId`.
      * Also the `sampled` decision will be inherited.
      */
    def startChild(): Span = js.native
    def startChild(spanContext: PickSpanContextExcludekey): Span = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("startTimestamp")
    var startTimestamp_Transaction: Double = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("tags")
    var tags_Transaction: StringDictionary[Primitive] = js.native
    
    /** Returns the current transaction properties as a `TransactionContext` */
    def toContext(): TransactionContext = js.native
    /** Returns the current span properties as a `SpanContext` */
    @JSName("toContext")
    def toContext_SpanContext(): SpanContext = js.native
    
    /** Convert the object to JSON */
    def toJSON(): Description = js.native
    
    /** Return a traceparent compatible header string */
    def toTraceparent(): String = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("traceId")
    var traceId_Transaction: String = js.native
    
    /**
      * The transaction containing this span
      */
    var transaction: js.UndefOr[Transaction] = js.native
    
    /** Updates the current span with a new `SpanContext` */
    def updateWithContext(spanContext: SpanContext): this.type = js.native
    /** Updates the current transaction with a new `TransactionContext` */
    def updateWithContext(transactionContext: TransactionContext): this.type = js.native
  }
  
  trait TransactionContext
    extends StObject
       with SpanContext {
    
    /**
      * Metadata associated with the transaction, for internal SDK use.
      */
    var metadata: js.UndefOr[PartialTransactionMetadat] = js.undefined
    
    /**
      * Human-readable identifier for the transaction
      */
    var name: String
    
    /**
      * If this transaction has a parent, the parent's sampling decision
      */
    var parentSampled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, sets the end timestamp of the transaction to the highest timestamp of child spans, trimming
      * the duration of the transaction. This is useful to discard extra time in the transaction that is not
      * accounted for in child spans, like what happens in the idle transaction Tracing integration, where we finish the
      * transaction after a given "idle time" and we don't want this "idle time" to be part of the transaction.
      */
    var trimEnd: js.UndefOr[Boolean] = js.undefined
  }
  object TransactionContext {
    
    inline def apply(name: String): TransactionContext = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionContext]
    }
    
    extension [Self <: TransactionContext](x: Self) {
      
      inline def setMetadata(value: PartialTransactionMetadat): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      inline def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      inline def setTrimEnd(value: Boolean): Self = StObject.set(x, "trimEnd", value.asInstanceOf[js.Any])
      
      inline def setTrimEndUndefined: Self = StObject.set(x, "trimEnd", js.undefined)
    }
  }
  
  trait TransactionMetadata extends StObject {
    
    /** Metadata representing information about transaction name changes  */
    var changes: js.Array[TransactionNameChange]
    
    /**
      * The Dynamic Sampling Context of a transaction. If provided during transaction creation, its Dynamic Sampling
      * Context Will be frozen
      */
    var dynamicSamplingContext: js.UndefOr[PartialDynamicSamplingCon] = js.undefined
    
    /** The total number of propagations that happened */
    var propagations: Double
    
    /** For transactions tracing server-side request handling, the request being tracked. */
    var request: js.UndefOr[PolymorphicRequest] = js.undefined
    
    /** For transactions tracing server-side request handling, the path of the request being tracked. */
    /** TODO: If we rm -rf `instrumentServer`, this can go, too */
    var requestPath: js.UndefOr[String] = js.undefined
    
    /** The sample rate used when sampling this transaction */
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    /** Information on how a transaction name was generated. */
    var source: TransactionSource
    
    /** Metadata for the transaction's spans, keyed by spanId */
    var spanMetadata: StringDictionary[StringDictionary[Any]]
  }
  object TransactionMetadata {
    
    inline def apply(
      changes: js.Array[TransactionNameChange],
      propagations: Double,
      source: TransactionSource,
      spanMetadata: StringDictionary[StringDictionary[Any]]
    ): TransactionMetadata = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], propagations = propagations.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], spanMetadata = spanMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionMetadata]
    }
    
    extension [Self <: TransactionMetadata](x: Self) {
      
      inline def setChanges(value: js.Array[TransactionNameChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: TransactionNameChange*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setDynamicSamplingContext(value: PartialDynamicSamplingCon): Self = StObject.set(x, "dynamicSamplingContext", value.asInstanceOf[js.Any])
      
      inline def setDynamicSamplingContextUndefined: Self = StObject.set(x, "dynamicSamplingContext", js.undefined)
      
      inline def setPropagations(value: Double): Self = StObject.set(x, "propagations", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: PolymorphicRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestPath(value: String): Self = StObject.set(x, "requestPath", value.asInstanceOf[js.Any])
      
      inline def setRequestPathUndefined: Self = StObject.set(x, "requestPath", js.undefined)
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSource(value: TransactionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSpanMetadata(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "spanMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransactionNameChange extends StObject {
    
    /** Number of propagations since start of transaction */
    var propagations: Double
    
    /** Previous source before transaction name change */
    var source: TransactionSource
    
    /**
      * Unix timestamp when the name was changed. Same type as the start and
      * end timestamps of a transaction and span.
      */
    var timestamp: Double
  }
  object TransactionNameChange {
    
    inline def apply(propagations: Double, source: TransactionSource, timestamp: Double): TransactionNameChange = {
      val __obj = js.Dynamic.literal(propagations = propagations.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionNameChange]
    }
    
    extension [Self <: TransactionNameChange](x: Self) {
      
      inline def setPropagations(value: Double): Self = StObject.set(x, "propagations", value.asInstanceOf[js.Any])
      
      inline def setSource(value: TransactionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.custom
    - typingsJapgolly.sentryTypes.sentryTypesStrings.url
    - typingsJapgolly.sentryTypes.sentryTypesStrings.route
    - typingsJapgolly.sentryTypes.sentryTypesStrings.view
    - typingsJapgolly.sentryTypes.sentryTypesStrings.component
    - typingsJapgolly.sentryTypes.sentryTypesStrings.task
  */
  trait TransactionSource extends StObject
  object TransactionSource {
    
    inline def component: typingsJapgolly.sentryTypes.sentryTypesStrings.component = "component".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.component]
    
    inline def custom: typingsJapgolly.sentryTypes.sentryTypesStrings.custom = "custom".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.custom]
    
    inline def route: typingsJapgolly.sentryTypes.sentryTypesStrings.route = "route".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.route]
    
    inline def task: typingsJapgolly.sentryTypes.sentryTypesStrings.task = "task".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.task]
    
    inline def url: typingsJapgolly.sentryTypes.sentryTypesStrings.url = "url".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.url]
    
    inline def view: typingsJapgolly.sentryTypes.sentryTypesStrings.view = "view".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.view]
  }
}
