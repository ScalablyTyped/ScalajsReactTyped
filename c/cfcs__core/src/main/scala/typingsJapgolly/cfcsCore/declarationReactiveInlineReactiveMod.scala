package typingsJapgolly.cfcsCore

import typingsJapgolly.cfcsCore.declarationCoreTypesMod.ExtractNever
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveInlineReactiveMod {
  
  @JSImport("@cfcs/core/declaration/reactive/inlineReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reactive[Object /* <: Record[String, Any] */](setup: Object): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  inline def reactive[Object /* <: Record[String, Any] */](setup: js.Function0[Object]): ReactiveObject[Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(setup.asInstanceOf[js.Any]).asInstanceOf[ReactiveObject[Object]]
  
  /* Inlined {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? Type : Object[Key]} */
  trait ConvertValue[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
    
    @JSName("toLocaleString")
    var toLocaleString_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
    
    @JSName("toString")
    var toString_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
    
    @JSName("valueOf")
    var valueOf_FConvertValue: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
  }
  object ConvertValue {
    
    inline def apply[Object /* <: Record[String, Any] */](
      constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any,
      hasOwnProperty: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any,
      isPrototypeOf: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any,
      propertyIsEnumerable: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any,
      toLocaleString: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any,
      toString_ : /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any,
      valueOf: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
    ): ConvertValue[Object] = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = hasOwnProperty.asInstanceOf[js.Any], isPrototypeOf = isPrototypeOf.asInstanceOf[js.Any], propertyIsEnumerable = propertyIsEnumerable.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], valueOf = valueOf.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertValue[Object]]
    }
    
    extension [Self <: ConvertValue[?], Object /* <: Record[String, Any] */](x: Self & ConvertValue[Object]) {
      
      inline def setConstructor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any
      ): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setHasOwnProperty(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "hasOwnProperty", value.asInstanceOf[js.Any])
      
      inline def setIsPrototypeOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any
      ): Self = StObject.set(x, "isPrototypeOf", value.asInstanceOf[js.Any])
      
      inline def setPropertyIsEnumerable(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any
      ): Self = StObject.set(x, "propertyIsEnumerable", value.asInstanceOf[js.Any])
      
      inline def setToLocaleString(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
      ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToString_(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any
      ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setValueOf(
        value: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any
      ): Self = StObject.set(x, "valueOf", value.asInstanceOf[js.Any])
    }
  }
  
  type PickObverser[Object /* <: Record[String, Any] */] = ExtractNever[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof Object ]: Object[Key] extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type>? Type : never} */ js.Any
  ]
  
  /* Inlined @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.ConvertValue<Object> & @cfcs/core.@cfcs/core/declaration/reactive/ReactiveSubscribe.ReactiveSubscribe<@cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>> */
  @js.native
  trait ReactiveObject[Object /* <: Record[String, Any] */] extends StObject {
    
    var constructor: /* import warning: importer.ImportType#apply Failed type conversion: std.Function extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : std.Function */ js.Any = js.native
    
    @JSName("hasOwnProperty")
    var hasOwnProperty_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any = js.native
    
    @JSName("isPrototypeOf")
    var isPrototypeOf_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.Object): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.Object): boolean */ js.Any = js.native
    
    @JSName("propertyIsEnumerable")
    var propertyIsEnumerable_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (v : std.PropertyKey): boolean extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (v : std.PropertyKey): boolean */ js.Any = js.native
    
    def subscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("toLocaleString")
    var toLocaleString_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any = js.native
    
    @JSName("toString")
    var toString_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): string extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): string */ js.Any = js.native
    
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](name: Name): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Name,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def unsubscribe[Name /* <: /* keyof @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object> */ String */](
      name: Unit,
      callback: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @cfcs/core.@cfcs/core/declaration/reactive/inlineReactive.PickObverser<Object>[Name] */ /* value */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    
    @JSName("valueOf")
    var valueOf_FReactiveObject: /* import warning: importer.ImportType#apply Failed type conversion: (): std.Object extends @cfcs/core.@cfcs/core/declaration/reactive/Observer.Observer<infer Type> ? Type : (): std.Object */ js.Any = js.native
  }
}
