package typingsJapgolly.vueTestUtils

import typingsJapgolly.std.InstanceType
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.AllowedComponentProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsMixin
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentPropsOptions
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.Data
import typingsJapgolly.vueRuntimeCore.mod.DefineComponent_
import typingsJapgolly.vueRuntimeCore.mod.EmitsOptions
import typingsJapgolly.vueRuntimeCore.mod.EmitsToProps
import typingsJapgolly.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typingsJapgolly.vueRuntimeCore.mod.ExtractPropTypes
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import typingsJapgolly.vueTestUtils.anon.DefaultProps
import typingsJapgolly.vueTestUtils.anon.Instantiable
import typingsJapgolly.vueTestUtils.anon.RegisterHooks
import typingsJapgolly.vueTestUtils.anon.VccOpts
import typingsJapgolly.vueTestUtils.distTypesMod.MountingOptions
import typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMountMod {
  
  @JSImport("@vue/test-utils/dist/mount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    typingsJapgolly.vueRuntimeCore.mod.PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T): VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[InstanceType[T]]]
  inline def mount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    typingsJapgolly.vueRuntimeCore.mod.PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T, options: ComponentMountingOptions[T]): VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[InstanceType[T]]]
  inline def mount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */](
    originalComponent: RegisterHooks[V],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E]): VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[Props /* <: js.Object */, E /* <: EmitsOptions */](
    originalComponent: FunctionalComponent[Props, E],
    options: (MountingOptions[Props & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      ExtractPropTypes[PropsOptions] & EmitsToProps[Extends], 
      ExtractDefaultPropTypes[PropsOptions]
    ]
  ): VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      ExtractPropTypes[PropsOptions] & EmitsToProps[Extends], 
      ExtractDefaultPropTypes[PropsOptions]
    ],
    options: MountingOptions[ExtractPropTypes[PropsOptions] & PublicProps, D]
  ): VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, E, Mixin, Extends, EE, Props & EmitsToProps[Extends]]
  ): (VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any])]
  inline def mount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, E, Mixin, Extends, EE, Props & EmitsToProps[Extends]],
    options: MountingOptions[Props & PublicProps, D]
  ): (VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any])]
  inline def mount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, E, Mixin, Extends, EE, Props]
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, E, Mixin, Extends, EE, Props],
    options: MountingOptions[Props & PublicProps, D]
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def mount[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults],
    options: (MountingOptions[Partial[Defaults] & (Omit[Props & PublicProps, /* keyof Defaults */ String]), D]) & (Record[String, Any])
  ): VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  inline def mount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
  ): VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  inline def shallowMount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    typingsJapgolly.vueRuntimeCore.mod.PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T): VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[InstanceType[T]]]
  inline def shallowMount[T /* <: DefineComponent_[
    Any, 
    Any, 
    Any, 
    Any, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    typingsJapgolly.vueRuntimeCore.mod.PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T, options: ComponentMountingOptions[T]): VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[InstanceType[T]]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](
    originalComponent: RegisterHooks[V],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E]): VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[Props /* <: js.Object */, E /* <: EmitsOptions */](
    originalComponent: FunctionalComponent[Props, E],
    options: (MountingOptions[Props & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](
    originalComponent: DefaultProps[V],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[V /* <: js.Object */, P](
    originalComponent: Instantiable[V, P],
    options: (MountingOptions[P & PublicProps, js.Object]) & (Record[String, Any])
  ): VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      V, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      V, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      ExtractPropTypes[PropsOptions] & EmitsToProps[Extends], 
      ExtractDefaultPropTypes[PropsOptions]
    ]
  ): VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Mixin, 
      Extends, 
      EE, 
      ExtractPropTypes[PropsOptions] & EmitsToProps[Extends], 
      ExtractDefaultPropTypes[PropsOptions]
    ],
    options: MountingOptions[ExtractPropTypes[PropsOptions] & PublicProps, D]
  ): VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      ExtractPropTypes[PropsOptions], 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & ExtractPropTypes[PropsOptions], 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, E, Mixin, Extends, EE, Props & EmitsToProps[Extends]]
  ): (VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any])]
  inline def shallowMount[Props, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */](
    componentOptions: ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, E, Mixin, Extends, EE, Props & EmitsToProps[Extends]],
    options: MountingOptions[Props & PublicProps, D]
  ): (VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      VNodeProps & Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]) & (Record[String, Any])]
  inline def shallowMount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, E, Mixin, Extends, EE, Props]
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[PropNames /* <: String */, RawBindings, D /* <: js.Object */, C /* <: ComputedOptions */, M /* <: Record[String, js.Function] */, E /* <: EmitsOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, EE /* <: String */, Props /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any */](
    componentOptions: ComponentOptionsWithArrayProps[PropNames, RawBindings, D, C, M, E, Mixin, Extends, EE, Props],
    options: MountingOptions[Props & PublicProps, D]
  ): VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    ComponentPublicInstance[
      Props, 
      RawBindings, 
      D, 
      C, 
      M, 
      E, 
      Props, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]]
  inline def shallowMount[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults],
    options: (MountingOptions[Partial[Defaults] & (Omit[Props & PublicProps, /* keyof Defaults */ String]), D]) & (Record[String, Any])
  ): VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  inline def shallowMount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
  ): VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends @vue/runtime-core.@vue/runtime-core.DefineComponent<infer PropsOrPropOptions, any, infer D, any, any, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, string, @vue/runtime-core.@vue/runtime-core.PublicProps, std.Readonly<infer PropsOrPropOptions extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<infer PropsOrPropOptions> : infer PropsOrPropOptions> & {} extends {} ? {} : @vue/runtime-core.@vue/runtime-core.EmitsToProps<{}>, @vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<infer PropsOrPropOptions>> ? @vue/test-utils.@vue/test-utils/dist/types.MountingOptions<std.Partial<@vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<PropsOrPropOptions>> & std.Omit<std.Readonly<@vue/runtime-core.@vue/runtime-core.ExtractPropTypes<PropsOrPropOptions>> & @vue/test-utils.@vue/test-utils/dist/mount.PublicProps, keyof @vue/runtime-core.@vue/runtime-core.ExtractDefaultPropTypes<PropsOrPropOptions>>, D> & std.Record<string, any> : @vue/test-utils.@vue/test-utils/dist/types.MountingOptions<any, {}>
    }}}
    */
  @js.native
  trait ComponentMountingOptions[T] extends StObject
  
  trait PublicProps
    extends StObject
       with VNodeProps
       with AllowedComponentProps
       with ComponentCustomProps
  object PublicProps {
    
    inline def apply(): PublicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicProps]
    }
  }
}
