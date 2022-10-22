package typingsJapgolly.vueTestUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.App
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProperties
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueTestUtils.anon.Emit
import typingsJapgolly.vueTestUtils.distBaseWrapperMod.default
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.$emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVueWrapperMod {
  
  @JSImport("@vue/test-utils/dist/vueWrapper", "VueWrapper")
  @js.native
  open class VueWrapper[T /* <: (Omit[
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
    ], 
    $emit | (/* keyof @vue/runtime-core.@vue/runtime-core.ComponentCustomProperties */ String)
  ]) & Emit & ComponentCustomProperties */] protected () extends default[Node] {
    def this(app: Null, vm: T) = this()
    def this(app: App[Any], vm: T) = this()
    def this(app: Null, vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    def this(app: App[Any], vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    
    /* private */ var __app: Any = js.native
    
    /* private */ var __setProps: Any = js.native
    
    /* private */ var attachNativeEventListener: Any = js.native
    
    /* private */ var componentVM: Any = js.native
    
    @JSName("element")
    def element_MVueWrapper: Element = js.native
    
    def emitted[T](): Record[String, js.Array[T]] = js.native
    def emitted[T](eventName: String): js.UndefOr[js.Array[T]] = js.native
    
    /* private */ def hasMultipleRoots: Any = js.native
    
    /* private */ def parentElement: Any = js.native
    
    def props(): StringDictionary[Any] = js.native
    def props(selector: String): Any = js.native
    
    /* private */ var rootVM: Any = js.native
    
    def setData(data: Record[String, Any]): js.Promise[Unit] = js.native
    
    def setProps(props: Record[String, Any]): js.Promise[Unit] = js.native
    
    def setValue(value: Any, prop: String): js.Promise[Unit] = js.native
    
    def unmount(): Unit = js.native
    
    def vm: T = js.native
  }
}
