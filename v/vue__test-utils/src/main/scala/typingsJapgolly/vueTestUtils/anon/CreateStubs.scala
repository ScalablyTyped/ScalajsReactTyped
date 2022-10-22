package typingsJapgolly.vueTestUtils.anon

import org.scalajs.dom.Node
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.ConcreteComponent
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import typingsJapgolly.vueTestUtils.distConfigMod.Pluggable
import typingsJapgolly.vueTestUtils.distDomWrapperMod.DOMWrapper
import typingsJapgolly.vueTestUtils.distStubsMod.CustomCreateStub
import typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStubs extends StObject {
  
  var DOMWrapper: Pluggable[typingsJapgolly.vueTestUtils.distDomWrapperMod.DOMWrapper[Node]]
  
  var VueWrapper: Pluggable[
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
  
  var createStubs: js.UndefOr[CustomCreateStub] = js.undefined
}
object CreateStubs {
  
  inline def apply(
    DOMWrapper: Pluggable[DOMWrapper[Node]],
    VueWrapper: Pluggable[
      VueWrapper[
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
  ): CreateStubs = {
    val __obj = js.Dynamic.literal(DOMWrapper = DOMWrapper.asInstanceOf[js.Any], VueWrapper = VueWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStubs]
  }
  
  extension [Self <: CreateStubs](x: Self) {
    
    inline def setCreateStubs(
      value: /* params */ Component => ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
    ): Self = StObject.set(x, "createStubs", js.Any.fromFunction1(value))
    
    inline def setCreateStubsUndefined: Self = StObject.set(x, "createStubs", js.undefined)
    
    inline def setDOMWrapper(value: Pluggable[DOMWrapper[Node]]): Self = StObject.set(x, "DOMWrapper", value.asInstanceOf[js.Any])
    
    inline def setVueWrapper(
      value: Pluggable[
          VueWrapper[
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
    ): Self = StObject.set(x, "VueWrapper", value.asInstanceOf[js.Any])
  }
}
