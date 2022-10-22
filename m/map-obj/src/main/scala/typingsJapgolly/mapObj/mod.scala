package typingsJapgolly.mapObj

import typingsJapgolly.mapObj.mapObjBooleans.`true`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("map-obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[SourceObjectType /* <: Record[String, Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in MappedObjectKeyType ]: MappedObjectValueType} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in MappedObjectKeyType ]: MappedObjectValueType} */ js.Any]
  inline def default[SourceObjectType /* <: Record[String, Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType](
    source: SourceObjectType,
    mapper: Mapper[SourceObjectType, MappedObjectKeyType, MappedObjectValueType],
    options: Options
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in MappedObjectKeyType ]: MappedObjectValueType} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in MappedObjectKeyType ]: MappedObjectValueType} */ js.Any]
  
  @JSImport("map-obj", "mapObjectSkip")
  @js.native
  val mapObjectSkip: js.Symbol = js.native
  
  trait DeepOptions
    extends StObject
       with Options {
    
    @JSName("deep")
    val deep_DeepOptions: `true`
  }
  object DeepOptions {
    
    inline def apply(): DeepOptions = {
      val __obj = js.Dynamic.literal(deep = true)
      __obj.asInstanceOf[DeepOptions]
    }
    
    extension [Self <: DeepOptions](x: Self) {
      
      inline def setDeep(value: `true`): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  type Mapper[SourceObjectType /* <: Record[String, Any] */, MappedObjectKeyType /* <: String */, MappedObjectValueType] = js.Function3[
    /* keyof SourceObjectType */ /* sourceKey */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: SourceObjectType[keyof SourceObjectType] */ /* sourceValue */ js.Any, 
    /* source */ SourceObjectType, 
    (js.Tuple3[
      /* targetKey */ MappedObjectKeyType, 
      /* targetValue */ MappedObjectValueType, 
      /* mapperOptions */ js.UndefOr[MapperOptions]
    ]) | js.Symbol
  ]
  
  trait MapperOptions extends StObject {
    
    /**
    	Whether `targetValue` should be recursed.
    	Requires `deep: true`.
    	@default true
    	*/
    val shouldRecurse: js.UndefOr[Boolean] = js.undefined
  }
  object MapperOptions {
    
    inline def apply(): MapperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapperOptions]
    }
    
    extension [Self <: MapperOptions](x: Self) {
      
      inline def setShouldRecurse(value: Boolean): Self = StObject.set(x, "shouldRecurse", value.asInstanceOf[js.Any])
      
      inline def setShouldRecurseUndefined: Self = StObject.set(x, "shouldRecurse", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Recurse nested objects and objects in arrays.
    	@default false
    	*/
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The target object to map properties on to.
    	@default {}
    	*/
    val target: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setTarget(value: Record[String, Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait TargetOptions[TargetObjectType /* <: Record[String, Any] */]
    extends StObject
       with Options {
    
    @JSName("target")
    val target_TargetOptions: TargetObjectType
  }
  object TargetOptions {
    
    inline def apply[TargetObjectType /* <: Record[String, Any] */](target: TargetObjectType): TargetOptions[TargetObjectType] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetOptions[TargetObjectType]]
    }
    
    extension [Self <: TargetOptions[?], TargetObjectType /* <: Record[String, Any] */](x: Self & TargetOptions[TargetObjectType]) {
      
      inline def setTarget(value: TargetObjectType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
