package typingsJapgolly.vueTestUtils

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.vueRuntimeCore.mod.ComponentInternalInstance
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptions
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsMixin
import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.CreateComponentPublicInstance
import typingsJapgolly.vueRuntimeCore.mod.EnsureNonVoid
import typingsJapgolly.vueRuntimeCore.mod.FunctionalComponent
import typingsJapgolly.vueRuntimeCore.mod.IntersectionMixin
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import typingsJapgolly.vueRuntimeCore.mod.UnwrapMixinsType
import typingsJapgolly.vueTestUtils.anon.OmitDOMWrapperElementexis
import typingsJapgolly.vueTestUtils.anon.OmitVueWrapperComponentPu
import typingsJapgolly.vueTestUtils.anon.VueNodeNode
import typingsJapgolly.vueTestUtils.distInterfacesWrapperLikeMod.WrapperLike
import typingsJapgolly.vueTestUtils.distTypesMod.NameSelector
import typingsJapgolly.vueTestUtils.distTypesMod.RefSelector
import typingsJapgolly.vueTestUtils.distTypesMod.VueNode
import typingsJapgolly.vueTestUtils.distVueWrapperMod.VueWrapper
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.B
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.Defaults
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseWrapperMod {
  
  /* note: abstract class */ @JSImport("@vue/test-utils/dist/baseWrapper", JSImport.Default)
  @js.native
  open class default[ElementType /* <: Node */] protected ()
    extends StObject
       with BaseWrapper[ElementType] {
    def this(element: ElementType) = this()
  }
  
  @js.native
  trait BaseWrapper[ElementType /* <: Node */]
    extends StObject
       with WrapperLike {
    
    @JSName("element")
    def element_MBaseWrapper: VueNode[ElementType] = js.native
    
    /* protected */ def findAllDOMElements(selector: String): js.Array[Element] = js.native
    
    def findComponent[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */](selector: ComponentOptions[Props, RawBindings, D, C, M, Any, Any, Any]): VueWrapper[
        CreateComponentPublicInstance[
          Props, 
          RawBindings, 
          D, 
          C, 
          M, 
          ComponentOptionsMixin, 
          ComponentOptionsMixin, 
          js.Object, 
          Props, 
          js.Object, 
          `false`, 
          IntersectionMixin[ComponentOptionsMixin], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], P]) & EnsureNonVoid[Props], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], B]) & EnsureNonVoid[RawBindings], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typingsJapgolly.vueTestUtils.vueTestUtilsStrings.D
          ]) & EnsureNonVoid[D], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typingsJapgolly.vueTestUtils.vueTestUtilsStrings.C
          ]) & EnsureNonVoid[C], 
          (UnwrapMixinsType[
            IntersectionMixin[ComponentOptionsMixin], 
            typingsJapgolly.vueTestUtils.vueTestUtilsStrings.M
          ]) & EnsureNonVoid[M], 
          (UnwrapMixinsType[IntersectionMixin[ComponentOptionsMixin], Defaults]) & EnsureNonVoid[js.Object]
        ]
      ] = js.native
    @JSName("findComponent")
    def findComponent_T_VueWrapper[T /* <: ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any] */](selector: String): VueWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends @vue/runtime-core.@vue/runtime-core.ComponentOptions<infer Props, infer RawBindings, infer D, infer C, infer M, any, any, any> ? @vue/runtime-core.@vue/runtime-core.CreateComponentPublicInstance<Props, RawBindings, D, C, M, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, Props, {}, false, @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'P'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<Props>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'B'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<RawBindings>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'D'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<D>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'C'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<C>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'M'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<M>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'Defaults'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>> : @vue/test-utils.@vue/test-utils/dist/vueWrapper.VueWrapper<@vue/runtime-core.@vue/runtime-core.CreateComponentPublicInstance<{}, {}, {}, {}, {}, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, @vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin, {}, {}, {}, false, @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'P'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'B'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'D'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'C'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'M'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>, @vue/runtime-core.@vue/runtime-core.UnwrapMixinsType<@vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin> & @vue/runtime-core.@vue/runtime-core.IntersectionMixin<@vue/runtime-core.@vue/runtime-core.ComponentOptionsMixin>, 'Defaults'> & @vue/runtime-core.@vue/runtime-core.EnsureNonVoid<{}>>> */ js.Any
      ] = js.native
    
    def getComponent[T /* <: scala.Nothing */](selector: NameSelector): OmitVueWrapperComponentPu = js.native
    def getComponent[T /* <: scala.Nothing */](selector: RefSelector): OmitVueWrapperComponentPu = js.native
    @JSName("getComponent")
    def getComponent_T_OmitDOMWrapperElementexis[T /* <: FunctionalComponent[js.Object, js.Object] */](selector: T): OmitDOMWrapperElementexis = js.native
    @JSName("getComponent")
    def getComponent_T_OmitDOMWrapperElementexis[T /* <: FunctionalComponent[js.Object, js.Object] */](selector: String): OmitDOMWrapperElementexis = js.native
    
    /* protected */ def getCurrentComponent(): ComponentInternalInstance | Unit = js.native
    
    /* protected */ def getRootNodes(): js.Array[VueNodeNode] = js.native
    
    /* protected */ def isDisabled(): Boolean = js.native
    
    def setValue(): js.Promise[Unit] = js.native
    
    /* protected */ val wrapperElement: VueNode[ElementType] = js.native
  }
}
