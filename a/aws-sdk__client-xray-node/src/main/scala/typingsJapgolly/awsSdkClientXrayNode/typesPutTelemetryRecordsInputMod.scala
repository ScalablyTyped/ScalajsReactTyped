package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typingsJapgolly.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutTelemetryRecordsInputMod {
  
  trait PutTelemetryRecordsInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var EC2InstanceId: js.UndefOr[String] = js.undefined
    
    /**
      * <p/>
      */
    var Hostname: js.UndefOr[String] = js.undefined
    
    /**
      * <p/>
      */
    var ResourceARN: js.UndefOr[String] = js.undefined
    
    /**
      * <p/>
      */
    var TelemetryRecords: js.Array[TelemetryRecord] | js.Iterable[TelemetryRecord]
  }
  object PutTelemetryRecordsInput {
    
    inline def apply(TelemetryRecords: js.Array[TelemetryRecord] | js.Iterable[TelemetryRecord]): PutTelemetryRecordsInput = {
      val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutTelemetryRecordsInput]
    }
    
    extension [Self <: PutTelemetryRecordsInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setEC2InstanceId(value: String): Self = StObject.set(x, "EC2InstanceId", value.asInstanceOf[js.Any])
      
      inline def setEC2InstanceIdUndefined: Self = StObject.set(x, "EC2InstanceId", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
      
      inline def setResourceARN(value: String): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
      
      inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
      
      inline def setTelemetryRecords(value: js.Array[TelemetryRecord] | js.Iterable[TelemetryRecord]): Self = StObject.set(x, "TelemetryRecords", value.asInstanceOf[js.Any])
      
      inline def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = StObject.set(x, "TelemetryRecords", js.Array(value*))
    }
  }
}
