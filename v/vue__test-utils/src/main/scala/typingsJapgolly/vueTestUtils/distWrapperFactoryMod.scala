package typingsJapgolly.vueTestUtils

import org.scalajs.dom.Node
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.App
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueTestUtils.distWrapperFactoryMod.WrapperType.DOMWrapper
import typingsJapgolly.vueTestUtils.distWrapperFactoryMod.WrapperType.VueWrapper
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWrapperFactoryMod {
  
  @JSImport("@vue/test-utils/dist/wrapperFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait WrapperType extends StObject
  @JSImport("@vue/test-utils/dist/wrapperFactory", "WrapperType")
  @js.native
  object WrapperType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WrapperType & Double] = js.native
    
    @js.native
    sealed trait DOMWrapper
      extends StObject
         with WrapperType
    /* 0 */ val DOMWrapper: typingsJapgolly.vueTestUtils.distWrapperFactoryMod.WrapperType.DOMWrapper & Double = js.native
    
    @js.native
    sealed trait VueWrapper
      extends StObject
         with WrapperType
    /* 1 */ val VueWrapper: typingsJapgolly.vueTestUtils.distWrapperFactoryMod.WrapperType.VueWrapper & Double = js.native
  }
  
  @JSImport("@vue/test-utils/dist/wrapperFactory", "createDOMWrapper")
  @js.native
  val createDOMWrapper: DOMWrapperFactory = js.native
  
  @JSImport("@vue/test-utils/dist/wrapperFactory", "createVueWrapper")
  @js.native
  val createVueWrapper: VueWrapperFactory = js.native
  
  inline def registerFactory(`type`: DOMWrapper, fn: DOMWrapperFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFactory")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFactory(`type`: VueWrapper, fn: VueWrapperFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFactory")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DOMWrapperFactory = js.Function1[
    /* element */ Node, 
    typingsJapgolly.vueTestUtils.distDomWrapperMod.DOMWrapper[Node]
  ]
  
  type VueWrapperFactory = js.Function3[
    /* app */ App[Any] | Null, 
    /* vm */ ComponentPublicInstance[
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
    /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], js.Promise[Unit]]], 
    typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ]
}
