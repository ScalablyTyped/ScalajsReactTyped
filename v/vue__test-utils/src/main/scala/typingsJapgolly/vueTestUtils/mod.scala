package typingsJapgolly.vueTestUtils

import org.scalajs.dom.Node
import typingsJapgolly.std.InstanceType
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.AllowedComponentProps
import typingsJapgolly.vueRuntimeCore.mod.App
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProperties
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
import typingsJapgolly.vueRuntimeCore.mod.PublicProps
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import typingsJapgolly.vueTestUtils.anon.Custom
import typingsJapgolly.vueTestUtils.anon.CustomBoolean
import typingsJapgolly.vueTestUtils.anon.DefaultProps
import typingsJapgolly.vueTestUtils.anon.Emit
import typingsJapgolly.vueTestUtils.anon.Instantiable
import typingsJapgolly.vueTestUtils.anon.RegisterHooks
import typingsJapgolly.vueTestUtils.anon.VccOpts
import typingsJapgolly.vueTestUtils.distBaseWrapperMod.default
import typingsJapgolly.vueTestUtils.distConfigMod.GlobalConfigOptions
import typingsJapgolly.vueTestUtils.distMountMod.ComponentMountingOptions
import typingsJapgolly.vueTestUtils.distTypesMod.MountingOptions
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.$emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@vue/test-utils", "BaseWrapper")
  @js.native
  open class BaseWrapper[ElementType /* <: Node */] protected () extends default[ElementType] {
    def this(element: ElementType) = this()
  }
  
  @JSImport("@vue/test-utils", "DOMWrapper")
  @js.native
  open class DOMWrapper[NodeType /* <: Node */] protected ()
    extends typingsJapgolly.vueTestUtils.distDomWrapperMod.DOMWrapper[NodeType] {
    def this(element: NodeType) = this()
  }
  
  @JSImport("@vue/test-utils", "RouterLinkStub")
  @js.native
  val RouterLinkStub: DefineComponent_[
    Custom, 
    Any, 
    Any, 
    js.Object, 
    js.Object, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    VNodeProps & AllowedComponentProps & ComponentCustomProps, 
    js.Object, 
    CustomBoolean
  ] = js.native
  
  @JSImport("@vue/test-utils", "VueWrapper")
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
  ]) & Emit & ComponentCustomProperties */] protected ()
    extends typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[T] {
    def this(app: Null, vm: T) = this()
    def this(app: App[Any], vm: T) = this()
    def this(app: Null, vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    def this(app: App[Any], vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
  }
  
  @JSImport("@vue/test-utils", "config")
  @js.native
  val config: GlobalConfigOptions = js.native
  
  inline def createWrapperError[T /* <: js.Object */](
    wrapperType: typingsJapgolly.vueTestUtils.vueTestUtilsStrings.DOMWrapper | typingsJapgolly.vueTestUtils.vueTestUtilsStrings.VueWrapper
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapperError")(wrapperType.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def disableAutoUnmount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoUnmount")().asInstanceOf[Unit]
  
  inline def enableAutoUnmount(hook: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAutoUnmount")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flushPromises(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushPromises")().asInstanceOf[js.Promise[Any]]
  
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
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
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
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T, options: ComponentMountingOptions[T]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def mount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def mount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def mount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def mount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[P & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def mount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[P & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[
      ExtractPropTypes[PropsOptions] & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, 
      D
    ]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): (typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, D]
  ): (typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, D]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[
      Partial[Defaults] & (Omit[
        Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, 
        /* keyof Defaults */ String
      ]), 
      D
    ]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  inline def mount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
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
    PublicProps, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends @vue/runtime-core.@vue/runtime-core.ComponentPropsOptions<@vue/runtime-core.@vue/runtime-core.Data> ? @vue/runtime-core.@vue/runtime-core.ExtractPropTypes<any> : any */ js.Any, 
    ExtractDefaultPropTypes[Any]
  ] */](component: T, options: ComponentMountingOptions[T]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[InstanceType[T]]]
  inline def shallowMount[V /* <: js.Object */](originalComponent: RegisterHooks[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def shallowMount[V /* <: js.Object */](originalComponent: VccOpts[V], options: (MountingOptions[Any, js.Object]) & (Record[String, Any])): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def shallowMount[Props /* <: js.Object */, E /* <: EmitsOptions */](originalComponent: FunctionalComponent[Props, E]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: DefaultProps[V]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[P & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  inline def shallowMount[V /* <: js.Object */, P](originalComponent: Instantiable[V, P]): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[P & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, js.Object]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(originalComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[
      ExtractPropTypes[PropsOptions] & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, 
      D
    ]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): (typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ]) & (Record[String, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, D]
  ): (typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ]) & (Record[String, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: MountingOptions[Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, D]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(componentOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
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
    options: (MountingOptions[
      Partial[Defaults] & (Omit[
        Props & typingsJapgolly.vueTestUtils.distMountMod.PublicProps, 
        /* keyof Defaults */ String
      ]), 
      D
    ]) & (Record[String, Any])
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
  
  inline def shallowMount_PropsOrPropOptionsRawBindingsDCMMixinExtendsEEEPPPropsDefaults[PropsOrPropOptions, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */, PP, Props, Defaults /* <: js.Object */](
    component: DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
  ): typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowMount")(component.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper[
    InstanceType[
      DefineComponent_[PropsOrPropOptions, RawBindings, D, C, M, Mixin, Extends, E, EE, PP, Props, Defaults]
    ]
  ]]
}
