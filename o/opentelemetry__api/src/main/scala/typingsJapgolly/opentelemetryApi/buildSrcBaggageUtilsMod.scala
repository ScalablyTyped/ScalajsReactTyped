package typingsJapgolly.opentelemetryApi

import typingsJapgolly.opentelemetryApi.buildSrcBaggageTypesMod.Baggage
import typingsJapgolly.opentelemetryApi.buildSrcBaggageTypesMod.BaggageEntry
import typingsJapgolly.opentelemetryApi.buildSrcBaggageTypesMod.BaggageEntryMetadata
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBaggageUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/baggage/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baggageEntryMetadataFromString(str: String): BaggageEntryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageEntryMetadataFromString")(str.asInstanceOf[js.Any]).asInstanceOf[BaggageEntryMetadata]
  
  inline def createBaggage(): Baggage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaggage")().asInstanceOf[Baggage]
  inline def createBaggage(entries: Record[String, BaggageEntry]): Baggage = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaggage")(entries.asInstanceOf[js.Any]).asInstanceOf[Baggage]
}
