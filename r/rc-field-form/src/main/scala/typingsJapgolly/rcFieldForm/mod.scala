package typingsJapgolly.rcFieldForm

import typingsJapgolly.rcFieldForm.anon.FnCall
import typingsJapgolly.rcFieldForm.anon.FnCallDependenciesForm
import typingsJapgolly.rcFieldForm.anon.FnCallForm
import typingsJapgolly.rcFieldForm.anon.Ref
import typingsJapgolly.rcFieldForm.esFieldMod.FieldProps
import typingsJapgolly.rcFieldForm.esFormContextMod.FormProviderProps
import typingsJapgolly.rcFieldForm.esFormMod.FormProps
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.InternalFormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esListContextMod.ListContextProps
import typingsJapgolly.rcFieldForm.esListMod.ListProps
import typingsJapgolly.rcFieldForm.esUseWatchMod.GetGeneric
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-field-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefFormType = js.native
  
  inline def Field[Values](hasNameRestProps: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(hasNameRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-field-form", "FieldContext")
  @js.native
  val FieldContext: Context[InternalFormInstance] = js.native
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  @JSImport("rc-field-form", "List")
  @js.native
  val List: FunctionComponent[ListProps] = js.native
  
  @JSImport("rc-field-form", "ListContext")
  @js.native
  val ListContext: Context[ListContextProps] = js.native
  
  inline def useForm[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")().asInstanceOf[js.Array[FormInstance[Values]]]
  inline def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any]): GetGeneric[TForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[GetGeneric[TForm]]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: js.Array[Any], form: TForm): GetGeneric[TForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[GetGeneric[TForm]]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useWatch[TForm /* <: FormInstance[Any] */](dependencies: NamePath, form: TForm): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useWatch[ValueType](dependencies: NamePath, form: FormInstance[Any]): ValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[ValueType]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */](dependencies: js.Tuple2[TDependencies1, TDependencies2], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */](dependencies: js.Tuple3[TDependencies1, TDependencies2, TDependencies3], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  inline def useWatch[TDependencies1 /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */, TDependencies2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1] */ js.Any */, TDependencies3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2] */ js.Any */, TDependencies4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3] */ js.Any */](
    dependencies: js.Tuple4[TDependencies1, TDependencies2, TDependencies3, TDependencies4],
    form: TForm
  ): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4] */ js.Any]
  
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: TDependencies, form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies]): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  inline def useWatch_TDependenciesTForm_Any[TDependencies /* <: /* keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm> */ String */, TForm /* <: FormInstance[Any] */](dependencies: js.Array[TDependencies], form: TForm): /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies] */ js.Any]
  
  inline def useWatch_ValueType_ValueType[ValueType](dependencies: NamePath): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("useWatch")(dependencies.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  @js.native
  trait InternalFormType extends StObject {
    
    def apply[Values](props: FormProps[Values] & Ref[Values]): japgolly.scalajs.react.facade.React.Element = js.native
  }
  
  @js.native
  trait RefFormType
    extends StObject
       with InternalFormType {
    
    var Field: FnCall = js.native
    
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    
    var List: FunctionComponent[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
    
    var useWatch: FnCallDependenciesForm = js.native
  }
}
