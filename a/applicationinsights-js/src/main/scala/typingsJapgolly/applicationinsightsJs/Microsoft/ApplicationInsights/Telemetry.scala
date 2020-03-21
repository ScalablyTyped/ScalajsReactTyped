package typingsJapgolly.applicationinsightsJs.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.PerformanceTiming
import typingsJapgolly.applicationinsightsJs.AI.DataPoint
import typingsJapgolly.applicationinsightsJs.AI.ExceptionDetails
import typingsJapgolly.applicationinsightsJs.AI.MessageData
import typingsJapgolly.applicationinsightsJs.AI.PageViewData
import typingsJapgolly.applicationinsightsJs.AI.PageViewPerfData
import typingsJapgolly.applicationinsightsJs.AI.SeverityLevel
import typingsJapgolly.applicationinsightsJs.AnonDomProcessing
import typingsJapgolly.applicationinsightsJs.AnonDuration
import typingsJapgolly.applicationinsightsJs.AnonExceptions
import typingsJapgolly.applicationinsightsJs.AnonMeasurements
import typingsJapgolly.applicationinsightsJs.AnonMessage
import typingsJapgolly.applicationinsightsJs.AnonMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry")
@js.native
object Telemetry extends js.Object {
  @js.native
  class Event protected () extends ISerializable {
    /**
      * Constructs a new instance of the EventTelemetry object
      */
    def this(name: String) = this()
    def this(name: String, properties: js.Any) = this()
    def this(name: String, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_Event: AnonMeasurements = js.native
    var measurements: js.Any = js.native
    var name: String = js.native
    var properties: js.Any = js.native
    var ver: Double = js.native
  }
  
  @js.native
  class Exception protected () extends ISerializable {
    /**
      * Constructs a new isntance of the ExceptionTelemetry object
      */
    def this(exception: js.Error) = this()
    def this(exception: js.Error, handledAt: String) = this()
    def this(exception: js.Error, handledAt: String, properties: js.Any) = this()
    def this(exception: js.Error, handledAt: String, properties: js.Any, measurements: js.Any) = this()
    def this(
      exception: js.Error,
      handledAt: String,
      properties: js.Any,
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_Exception: AnonExceptions = js.native
    var crashThreadId: Double = js.native
    var exceptions: js.Array[ExceptionDetails] = js.native
    var handledAt: String = js.native
    var measurements: js.Any = js.native
    var problemId: String = js.native
    var properties: js.Any = js.native
    var severityLevel: SeverityLevel = js.native
    var ver: Double = js.native
  }
  
  @js.native
  class Metric protected () extends ISerializable {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(name: String, value: Double) = this()
    def this(name: String, value: Double, count: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double, properties: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_Metric: AnonMetrics = js.native
    var metrics: js.Array[DataPoint] = js.native
    var properties: js.Any = js.native
    var ver: Double = js.native
  }
  
  @js.native
  /**
    * Constructs a new instance of the PageEventTelemetry object
    */
  class PageView ()
    extends PageViewData
       with ISerializable {
    def this(name: String) = this()
    def this(name: String, url: String) = this()
    def this(name: String, url: String, durationMs: Double) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_PageView: AnonDuration = js.native
  }
  
  @js.native
  class PageViewPerformance protected ()
    extends PageViewPerfData
       with ISerializable {
    /**
      * Constructs a new instance of the PageEventTelemetry object
      */
    def this(name: String, url: String, unused: Double) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_PageViewPerformance: AnonDomProcessing = js.native
    var durationMs: js.Any = js.native
    /**
      * Field indicating whether this instance of PageViewPerformance is valid and should be sent
      */
    var isValid: js.Any = js.native
    /**
      * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
      */
    def getDurationMs(): Double = js.native
    /**
      * Indicates whether this instance of PageViewPerformance is valid and should be sent
      */
    def getIsValid(): Boolean = js.native
  }
  
  @js.native
  class RemoteDependencyData protected ()
    extends typingsJapgolly.applicationinsightsJs.AI.RemoteDependencyData
       with ISerializable {
    /**
      * Constructs a new instance of the RemoteDependencyData object
      */
    def this(
      id: String,
      absoluteUrl: String,
      commandName: String,
      value: Double,
      success: Boolean,
      resultCode: Double
    ) = this()
    def this(
      id: String,
      absoluteUrl: String,
      commandName: String,
      value: Double,
      success: Boolean,
      resultCode: Double,
      method: String
    ) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* private */ def formatDependencyName(method: js.Any, absoluteUrl: js.Any): js.Any = js.native
  }
  
  @js.native
  class Trace protected ()
    extends MessageData
       with ISerializable {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(message: String) = this()
    def this(message: String, properties: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    @JSName("aiDataContract")
    var aiDataContract_Trace: AnonMessage = js.native
  }
  
  @js.native
  object Common extends js.Object {
    @js.native
    class Base ()
      extends typingsJapgolly.applicationinsightsJs.Microsoft.Telemetry.Base
         with ISerializable {
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
    }
    
    @js.native
    class Data[TDomain] protected ()
      extends typingsJapgolly.applicationinsightsJs.Microsoft.Telemetry.Data[TDomain]
         with ISerializable {
      /**
        * Constructs a new instance of telemetry data.
        */
      def this(`type`: String, data: TDomain) = this()
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
    }
    
    @js.native
    class DataSanitizer () extends js.Object
    
    @js.native
    class Envelope protected () extends IEnvelope {
      /**
        * Constructs a new instance of telemetry data.
        */
      def this(data: typingsJapgolly.applicationinsightsJs.Microsoft.Telemetry.Base, name: String) = this()
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
      /* CompleteClass */
      override var appId: String = js.native
      /* CompleteClass */
      override var appVer: String = js.native
      /* CompleteClass */
      override var data: js.Any = js.native
      @JSName("data")
      var data_Envelope: Base = js.native
      /* CompleteClass */
      override var deviceId: String = js.native
      /* CompleteClass */
      override var flags: Double = js.native
      /* CompleteClass */
      override var iKey: String = js.native
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var os: String = js.native
      /* CompleteClass */
      override var osVer: String = js.native
      /* CompleteClass */
      override var sampleRate: Double = js.native
      /* CompleteClass */
      override var seq: String = js.native
      /* CompleteClass */
      override var tags: StringDictionary[js.Any] = js.native
      /* CompleteClass */
      override var time: String = js.native
      /* CompleteClass */
      override var userId: String = js.native
      /* CompleteClass */
      override var ver: Double = js.native
    }
    
    /* static members */
    @js.native
    object DataSanitizer extends js.Object {
      def padNumber(num: js.Any): String = js.native
      def sanitizeException(exception: js.Any): js.Any = js.native
      def sanitizeKey(name: js.Any): js.Any = js.native
      def sanitizeKeyAndAddUniqueness(key: js.Any, map: js.Any): js.Any = js.native
      def sanitizeMeasurements(measurements: js.Any): js.Any = js.native
      def sanitizeMessage(message: js.Any): js.Any = js.native
      def sanitizeProperties(properties: js.Any): js.Any = js.native
      def sanitizeString(value: js.Any): js.Any = js.native
      def sanitizeUrl(url: js.Any): js.Any = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object Exception extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
    /**
      * Creates a simple exception with 1 stack frame. Useful for manual constracting of exception.
      */
    def CreateSimpleException(
      message: String,
      typeName: String,
      assembly: String,
      fileName: String,
      details: String,
      line: Double
    ): Exception = js.native
    def CreateSimpleException(
      message: String,
      typeName: String,
      assembly: String,
      fileName: String,
      details: String,
      line: Double,
      handledAt: String
    ): Exception = js.native
  }
  
  /* static members */
  @js.native
  object Metric extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object PageView extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object PageViewPerformance extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
    def getDuration(start: js.Any, end: js.Any): Double = js.native
    def getPerformanceTiming(): PerformanceTiming = js.native
    /**
      * As page loads different parts of performance timing numbers get set. When all of them are set we can report it.
      * Returns true if ready, false otherwise.
      */
    def isPerformanceTimingDataReady(): Boolean = js.native
    /**
      * Returns true is window performance timing API is supported, false otherwise.
      */
    def isPerformanceTimingSupported(): PerformanceTiming = js.native
  }
  
  /* static members */
  @js.native
  object RemoteDependencyData extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object Trace extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
}

