package typingsJapgolly.vueRuntimeCore.mod

import typingsJapgolly.std.ThisType
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.B
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.Defaults
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsWithoutProps[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PE]
  extends StObject
     with ComponentOptionsBase[PE, RawBindings, D, C, M, Mixin, Extends, E, EE, js.Object]
     with ThisType[
      CreateComponentPublicInstance[
        PE, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        PE, 
        js.Object, 
        `false`, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[PE], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], B]) & EnsureNonVoid[RawBindings], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.D
        ]) & EnsureNonVoid[D], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.C
        ]) & EnsureNonVoid[C], 
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.M
        ]) & EnsureNonVoid[M], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], Defaults]) & EnsureNonVoid[js.Object]
      ]
    ] {
  
  var props: Unit
}
object ComponentOptionsWithoutProps {
  
  inline def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PE](props: Unit): ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, PE] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, PE]]
  }
  
  extension [Self <: ComponentOptionsWithoutProps[?, ?, ?, ?, ?, ?, ?, ?, ?, ?], Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PE](x: Self & (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, PE])) {
    
    inline def setProps(value: Unit): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
