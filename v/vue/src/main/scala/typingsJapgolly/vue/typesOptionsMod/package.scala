package typingsJapgolly.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.std.HTMLElement
  import typingsJapgolly.std.Record
  import typingsJapgolly.std.ThisType
  import typingsJapgolly.vue.Anon_Component
  import typingsJapgolly.vue.Anon_Default
  import typingsJapgolly.vue.typesVnodeMod.VNode
  import typingsJapgolly.vue.typesVueMod.CombinedVueInstance
  import typingsJapgolly.vue.typesVueMod.Vue
  import typingsJapgolly.vue.typesVueMod.VueConstructor

  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typingsJapgolly.vue.vueStrings.Accessors with js.Any
  type ArrayPropsDefinition[T] = js.Array[String]
  type AsyncComponent[Data, Methods, Computed, Props] = (AsyncComponentPromise[Data, Methods, Computed, Props]) | (AsyncComponentFactory[Data, Methods, Computed, Props])
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[Anon_Component[Data, Methods, Computed, Props]]
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[/* component */ Component[Data, Methods, Computed, Props], Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
    (js.Promise[
      (Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]) | EsModuleComponent
    ]) | Unit
  ]
  type Component[Data, Methods, Computed, Props] = VueConstructor[Vue] | (FunctionalComponentOptions[Props, PropsDefinition[Props]]) | (ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props with V, Data])
  type DefaultComputed = StringDictionary[js.Any]
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = Record[String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ HTMLElement, 
    /* binding */ DirectiveBinding, 
    /* vnode */ VNode, 
    /* oldVnode */ VNode, 
    Unit
  ]
  type InjectKey = String | js.Symbol
  type InjectOptions = (StringDictionary[InjectKey | Anon_Default]) | js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - js.Function0[T]
    - typings.vue.Anon_Args[T]
    - typings.vue.Anon_ArgsFunction
  */
  type Prop[T] = _Prop[T] | js.Function0[T]
  type PropType[T] = Prop[T] | js.Array[Prop[T]]
  type PropValidator[T] = PropOptions[T] | PropType[T]
  type PropsDefinition[T] = ArrayPropsDefinition[T] | RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typingsJapgolly.vue.vueStrings.RecordPropsDefinition with T
  type ThisTypedComponentOptionsWithArrayProps[V /* <: Vue */, Data, Methods, Computed, PropNames /* <: String */] = js.Object with (ComponentOptions[
    V, 
    DataDef[Data, Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    Record[PropNames, _]
  ]) with (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Record[PropNames, _]]])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: Vue */, Data, Methods, Computed, Props] = js.Object with (ComponentOptions[V, DataDef[Data, Props, V], Methods, Computed, RecordPropsDefinition[Props], Props]) with (ThisType[CombinedVueInstance[V, Data, Methods, Computed, Props]])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, Unit]
}
