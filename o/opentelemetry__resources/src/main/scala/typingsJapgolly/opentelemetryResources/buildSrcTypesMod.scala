package typingsJapgolly.opentelemetryResources

import typingsJapgolly.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typingsJapgolly.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  @js.native
  trait Detector extends StObject {
    
    def detect(): js.Promise[Resource] = js.native
    def detect(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
  }
  
  type ResourceAttributes = SpanAttributes
}
