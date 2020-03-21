package typingsJapgolly.vuex.mod.default

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.Record
import typingsJapgolly.vuex.helpersMod.ActionMethod
import typingsJapgolly.vuex.helpersMod.Computed
import typingsJapgolly.vuex.helpersMod.CustomVue
import typingsJapgolly.vuex.helpersMod.Mapper
import typingsJapgolly.vuex.helpersMod.MapperForAction
import typingsJapgolly.vuex.helpersMod.MapperForActionWithNamespace
import typingsJapgolly.vuex.helpersMod.MapperForMutation
import typingsJapgolly.vuex.helpersMod.MapperForMutationWithNamespace
import typingsJapgolly.vuex.helpersMod.MapperForState
import typingsJapgolly.vuex.helpersMod.MapperForStateWithNamespace
import typingsJapgolly.vuex.helpersMod.MapperWithNamespace
import typingsJapgolly.vuex.helpersMod.MutationMethod
import typingsJapgolly.vuex.helpersMod.NamespacedMappers
import typingsJapgolly.vuex.mod.Commit
import typingsJapgolly.vuex.mod.Dispatch
import typingsJapgolly.vuex.mod.StoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Store: Instantiable1[
    /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
    typingsJapgolly.vuex.mod.Store[js.Object]
  ] = js.native
  @JSName("createNamespacedHelpers")
  var createNamespacedHelpers_Original: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
  @JSName("install")
  var install_Original: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
    Unit
  ] = js.native
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  def install(Vue: /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ js.Any): Unit = js.native
  def mapActions[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
  def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapActions[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
  def mapActions[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapActions")
  def mapActions_Map_RecordStringString[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapGetters[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
  def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapMutations[Map /* <: Record[
    String, 
    js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
  ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
  def mapMutations[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapMutations")
  def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  def mapState[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: vuex.vuex/types/helpers.Computed}
    */ typingsJapgolly.vuex.vuexStrings.^  with js.Any = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
  @JSName("mapState")
  def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
    */ typingsJapgolly.vuex.vuexStrings.^  with Map = js.native
}

