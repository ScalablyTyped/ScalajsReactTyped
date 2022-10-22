package typingsJapgolly.vueTestUtils

import org.scalajs.dom.Node
import typingsJapgolly.std.Record
import typingsJapgolly.vueTestUtils.anon.RequiredGlobalMountOption
import typingsJapgolly.vueTestUtils.distTypesMod.GlobalMountOptions
import typingsJapgolly.vueTestUtils.distTypesMod.RefSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@vue/test-utils/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isClassComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.ConcreteComponent<{}, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.ConcreteComponent<{}, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> */ Boolean]
  
  inline def isFunctionalComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.FunctionalComponent<{}, {}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionalComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.FunctionalComponent<{}, {}> */ Boolean]
  
  inline def isNotNullOrUndefined[T /* <: js.Object */](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")().asInstanceOf[/* is T */ Boolean]
  inline def isNotNullOrUndefined[T /* <: js.Object */](obj: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isObject(obj: Any): /* is std.Record<string, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, any> */ Boolean]
  
  inline def isObjectComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any> */ Boolean]
  
  inline def isRefSelector(selector: String): /* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean]
  inline def isRefSelector(selector: RefSelector): /* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean]
  
  inline def mergeDeep(target: Record[String, Any], source: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def mergeGlobalProperties(): RequiredGlobalMountOption = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGlobalProperties")().asInstanceOf[RequiredGlobalMountOption]
  inline def mergeGlobalProperties(mountGlobal: GlobalMountOptions): RequiredGlobalMountOption = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGlobalProperties")(mountGlobal.asInstanceOf[js.Any]).asInstanceOf[RequiredGlobalMountOption]
  
  inline def textContent(element: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
}
