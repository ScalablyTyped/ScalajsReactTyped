package typingsJapgolly.opentelemetryResources

import typingsJapgolly.opentelemetryResources.buildSrcConfigMod.ResourceDetectionConfig
import typingsJapgolly.opentelemetryResources.buildSrcDetectorsBrowserDetectorMod.BrowserDetector_
import typingsJapgolly.opentelemetryResources.buildSrcDetectorsEnvDetectorMod.EnvDetector_
import typingsJapgolly.opentelemetryResources.buildSrcDetectorsProcessDetectorMod.ProcessDetector_
import typingsJapgolly.opentelemetryResources.buildSrcPlatformNodeHostDetectorMod.HostDetector_
import typingsJapgolly.opentelemetryResources.buildSrcPlatformNodeOsdetectorMod.OSDetector_
import typingsJapgolly.opentelemetryResources.buildSrcTypesMod.ResourceAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/resources", "Resource")
  @js.native
  open class Resource protected ()
    extends typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource {
    def this(/**
      * A dictionary of attributes with string keys and values that provide
      * information about the entity as numbers, strings or booleans
      * TODO: Consider to add check/validation on attributes.
      */
    attributes: ResourceAttributes) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("@opentelemetry/resources", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a Resource that indentifies the SDK in use.
      */
    inline def default(): typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource]
    
    @JSImport("@opentelemetry/resources", "Resource.EMPTY")
    @js.native
    val EMPTY: typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource = js.native
    
    /**
      * Returns an empty Resource
      */
    inline def empty(): typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource]
  }
  
  @JSImport("@opentelemetry/resources", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  inline def detectResources(): js.Promise[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")().asInstanceOf[js.Promise[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource]]
  inline def detectResources(config: ResourceDetectionConfig): js.Promise[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectResources")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.opentelemetryResources.buildSrcResourceMod.Resource]]
  
  @JSImport("@opentelemetry/resources", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
  
  @JSImport("@opentelemetry/resources", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
}
