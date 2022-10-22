package typingsJapgolly.vueRuntimeCore.mod

import typingsJapgolly.std.ThisType
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.B
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Props, Defaults]
  extends StObject
     with ComponentOptionsBase[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Defaults]
     with ThisType[
      CreateComponentPublicInstance[
        Props, 
        RawBindings, 
        D, 
        C, 
        M, 
        Mixin, 
        Extends, 
        E, 
        Props, 
        Defaults, 
        `false`, 
        IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
        (UnwrapMixinsType[IntersectionMixin[Mixin] & IntersectionMixin[Extends], P]) & EnsureNonVoid[Props], 
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
        (UnwrapMixinsType[
          IntersectionMixin[Mixin] & IntersectionMixin[Extends], 
          typingsJapgolly.vueRuntimeCore.vueRuntimeCoreStrings.Defaults
        ]) & EnsureNonVoid[Defaults]
      ]
    ] {
  
  var props: PropsOptions & ThisType[Unit]
}
object ComponentOptionsWithObjectProps {
  
  inline def apply[PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Props, Defaults](props: PropsOptions & ThisType[Unit]): ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, Props, Defaults] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, Props, Defaults]]
  }
  
  extension [Self <: ComponentOptionsWithObjectProps[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], PropsOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, Props, Defaults](x: Self & (ComponentOptionsWithObjectProps[PropsOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, Props, Defaults])) {
    
    inline def setProps(value: PropsOptions & ThisType[Unit]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
