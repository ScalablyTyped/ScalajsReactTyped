package typingsJapgolly.datadogPprof

import typingsJapgolly.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
import typingsJapgolly.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import typingsJapgolly.datadogPprof.outSrcV8TypesMod.CpuProfile
import typingsJapgolly.datadogPprof.outSrcV8TypesMod.TimeProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcProfileSerializerMod {
  
  @JSImport("@datadog/pprof/out/src/profile-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double, sourceMapper: SourceMapper): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serializeHeapProfile(prof: AllocationProfileNode, startTimeNanos: Double, intervalBytes: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String,
    sourceMapper: SourceMapper
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: Unit,
    sourceMapper: SourceMapper
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double, sourceMapper: SourceMapper): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Any]
}
