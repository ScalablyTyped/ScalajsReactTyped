package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksControlledMod {
  
  @JSImport("@uifabric/foundation/lib/hooks/controlled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlledDerivedProps")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], derivedValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any]
  
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  
  trait IControlledStateOptions[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] extends StObject {
    
    var defaultPropName: js.UndefOr[TDefaultProp] = js.undefined
    
    var defaultPropValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ] = js.undefined
  }
  object IControlledStateOptions {
    
    inline def apply[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](): IControlledStateOptions[TProps, TProp, TDefaultProp] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledStateOptions[TProps, TProp, TDefaultProp]]
    }
    
    extension [Self <: IControlledStateOptions[?, ?, ?], TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](x: Self & (IControlledStateOptions[TProps, TProp, TDefaultProp])) {
      
      inline def setDefaultPropName(value: TDefaultProp): Self = StObject.set(x, "defaultPropName", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropNameUndefined: Self = StObject.set(x, "defaultPropName", js.undefined)
      
      inline def setDefaultPropValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ): Self = StObject.set(x, "defaultPropValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropValueUndefined: Self = StObject.set(x, "defaultPropValue", js.undefined)
    }
  }
}
