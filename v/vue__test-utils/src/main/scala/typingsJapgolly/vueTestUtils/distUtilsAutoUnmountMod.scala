package typingsJapgolly.vueTestUtils

import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsAutoUnmountMod {
  
  @JSImport("@vue/test-utils/dist/utils/autoUnmount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableAutoUnmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoUnmount")().asInstanceOf[Unit]
  
  inline def enableAutoUnmount(hook: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoUnmount")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackInstance_false(
    wrapper: VueWrapper[
      ComponentPublicInstance[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        `false`, 
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackInstance")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
