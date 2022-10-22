package typingsJapgolly.fullcalendarVue

import typingsJapgolly.fullcalendarCommon.mod.PluginDef
import typingsJapgolly.fullcalendarVue.anon.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomContentTypeMod {
  
  @JSImport("@fullcalendar/vue/dist/custom-content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createVueContentTypePlugin(
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
  ): PluginDef = ^.asInstanceOf[js.Dynamic].applyDynamic("createVueContentTypePlugin")(parent.asInstanceOf[js.Any]).asInstanceOf[PluginDef]
  
  inline def wrapVDomGenerator(
    vDomGenerator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NormalizedScopedSlot */ Any
  ): js.Function1[/* props */ Any, Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapVDomGenerator")(vDomGenerator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Vue]]
}
