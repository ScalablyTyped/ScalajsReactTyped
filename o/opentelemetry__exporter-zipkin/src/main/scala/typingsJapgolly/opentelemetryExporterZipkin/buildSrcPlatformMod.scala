package typingsJapgolly.opentelemetryExporterZipkin

import typingsJapgolly.opentelemetryExporterZipkin.buildSrcTypesMod.SendFn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformMod {
  
  @JSImport("@opentelemetry/exporter-zipkin/build/src/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareSend(urlStr: String): SendFn = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any]).asInstanceOf[SendFn]
  inline def prepareSend(urlStr: String, headers: Record[String, String]): SendFn = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSend")(urlStr.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[SendFn]
}
