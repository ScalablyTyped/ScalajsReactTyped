package typingsJapgolly.vuex

import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vuex.mod.Commit
import typingsJapgolly.vuex.mod.Dispatch
import typingsJapgolly.vuex.vuexBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersMod {
  
  @JSImport("vuex/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNamespacedHelpers(namespace: String): NamespacedMappers = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespacedHelpers")(namespace.asInstanceOf[js.Any]).asInstanceOf[NamespacedMappers]
  
  @JSImport("vuex/types/helpers", "mapActions")
  @js.native
  val mapActions: Mapper[ActionMethod] & MapperWithNamespace[ActionMethod] & MapperForAction & MapperForActionWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapGetters")
  @js.native
  val mapGetters: Mapper[Computed] & MapperWithNamespace[Computed] = js.native
  
  @JSImport("vuex/types/helpers", "mapMutations")
  @js.native
  val mapMutations: Mapper[MutationMethod] & MapperWithNamespace[MutationMethod] & MapperForMutation & MapperForMutationWithNamespace = js.native
  
  @JSImport("vuex/types/helpers", "mapState")
  @js.native
  val mapState: Mapper[Computed] & MapperWithNamespace[Computed] & MapperForState & MapperForStateWithNamespace = js.native
  
  @js.native
  trait ActionMethod extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
  
  type Computed = js.Function0[Any]
  
  type CustomVue = (ComponentPublicInstance[
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
  ]) & (Record[String, Any])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : ...any): infer R ? (): R : never
    }}}
    */
  @js.native
  trait InlineComputed[T /* <: js.Function */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (fn : any, args : infer Args): infer R ? (args : Args): R : never
    }}}
    */
  @js.native
  trait InlineMethod[T /* <: js.Function2[/* fn */ Any, /* repeated */ Any, Any] */] extends StObject
  
  @js.native
  trait Mapper[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: R} */ js.Any = js.native
    def apply[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: R} */ js.Any = js.native
  }
  
  type MapperForAction = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>} */ js.Any
  ]
  
  type MapperForActionWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, dispatch : vuex.vuex.Dispatch, args : ...any): any>[K]>} */ js.Any
  ]
  
  type MapperForMutation = js.Function1[
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>} */ js.Any
  ]
  
  type MapperForMutationWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ Record[
      String, 
      js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ Any, Any]
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any> ]: vuex.vuex/types/helpers.InlineMethod<std.Record<string, (this : vuex.vuex/types/helpers.CustomVue, commit : vuex.vuex.Commit, args : ...any): any>[K]>} */ js.Any
  ]
  
  type MapperForState = js.Function1[
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>} */ js.Any
  ]
  
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ String, 
    /* map */ js.Object, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof {} ]: vuex.vuex/types/helpers.InlineComputed<{}[K]>} */ js.Any
  ]
  
  @js.native
  trait MapperWithNamespace[R] extends StObject {
    
    def apply[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: R} */ js.Any = js.native
    def apply[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: R} */ js.Any = js.native
  }
  
  @js.native
  trait MutationMethod extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait NamespacedMappers extends StObject {
    
    def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod} */ js.Any
    def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod} */ js.Any
    @JSName("mapActions")
    var mapActions_Original: Mapper[ActionMethod] & MapperForAction
    
    def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed} */ js.Any
    def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: vuex.vuex/types/helpers.Computed} */ js.Any
    @JSName("mapGetters")
    var mapGetters_Original: Mapper[Computed]
    
    def mapMutations[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod} */ js.Any
    def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod} */ js.Any
    @JSName("mapMutations")
    var mapMutations_Original: Mapper[MutationMethod] & MapperForMutation
    
    def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed} */ js.Any
    def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in Key ]: vuex.vuex/types/helpers.Computed} */ js.Any
    @JSName("mapState")
    var mapState_Original: Mapper[Computed] & MapperForState
    @JSName("mapState")
    def mapState_SMap[S, Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ Any, Any]
      ] */](map: Map): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>} */ js.Any
  }
  object NamespacedMappers {
    
    inline def apply(
      mapActions: Mapper[ActionMethod] & MapperForAction,
      mapGetters: Mapper[Computed],
      mapMutations: Mapper[MutationMethod] & MapperForMutation,
      mapState: Mapper[Computed] & MapperForState
    ): NamespacedMappers = {
      val __obj = js.Dynamic.literal(mapActions = mapActions.asInstanceOf[js.Any], mapGetters = mapGetters.asInstanceOf[js.Any], mapMutations = mapMutations.asInstanceOf[js.Any], mapState = mapState.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamespacedMappers]
    }
    
    extension [Self <: NamespacedMappers](x: Self) {
      
      inline def setMapActions(value: Mapper[ActionMethod] & MapperForAction): Self = StObject.set(x, "mapActions", value.asInstanceOf[js.Any])
      
      inline def setMapGetters(value: Mapper[Computed]): Self = StObject.set(x, "mapGetters", value.asInstanceOf[js.Any])
      
      inline def setMapMutations(value: Mapper[MutationMethod] & MapperForMutation): Self = StObject.set(x, "mapMutations", value.asInstanceOf[js.Any])
      
      inline def setMapState(value: Mapper[Computed] & MapperForState): Self = StObject.set(x, "mapState", value.asInstanceOf[js.Any])
    }
  }
}
