package typingsJapgolly.intlifyVueDevtools

import typingsJapgolly.intlifyShared.mod.Emittable
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`compile-error`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-compilation`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-evaluation`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-resolve`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-devtools-plugin-vue-i18n`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-resource-inspector`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-timeline`
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.fallback
import typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.missing
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsLabels")
  @js.native
  val VueDevToolsLabels: Record[String, String] = js.native
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsPlaceholders")
  @js.native
  val VueDevToolsPlaceholders: Record[String, String] = js.native
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsTimelineColors")
  @js.native
  val VueDevToolsTimelineColors: Record[String, Double] = js.native
  
  type VueDevToolsEmitter = Emittable[VueDevToolsEmitterEvents]
  
  @js.native
  trait VueDevToolsEmitterEvents extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-devtools-plugin-vue-i18n`
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-resource-inspector`
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-timeline`
  */
  trait VueDevToolsIDs extends StObject
  object VueDevToolsIDs {
    
    inline def CUSTOM_INSPECTOR: `vue-i18n-resource-inspector` = "vue-i18n-resource-inspector".asInstanceOf[`vue-i18n-resource-inspector`]
    
    inline def PLUGIN: `vue-devtools-plugin-vue-i18n` = "vue-devtools-plugin-vue-i18n".asInstanceOf[`vue-devtools-plugin-vue-i18n`]
    
    inline def TIMELINE: `vue-i18n-timeline` = "vue-i18n-timeline".asInstanceOf[`vue-i18n-timeline`]
  }
  
  @js.native
  trait VueDevToolsTimelineEventPayloads extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`compile-error`
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.missing
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.fallback
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-resolve`
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-compilation`
    - typingsJapgolly.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-evaluation`
  */
  trait VueDevToolsTimelineEvents extends StObject
  object VueDevToolsTimelineEvents {
    
    inline def COMPILE_ERROR: `compile-error` = "compile-error".asInstanceOf[`compile-error`]
    
    inline def FALBACK: fallback = "fallback".asInstanceOf[fallback]
    
    inline def MESSAGE_COMPILATION: `message-compilation` = "message-compilation".asInstanceOf[`message-compilation`]
    
    inline def MESSAGE_EVALUATION: `message-evaluation` = "message-evaluation".asInstanceOf[`message-evaluation`]
    
    inline def MESSAGE_RESOLVE: `message-resolve` = "message-resolve".asInstanceOf[`message-resolve`]
    
    inline def MISSING: missing = "missing".asInstanceOf[missing]
  }
}
