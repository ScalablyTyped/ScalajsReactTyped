package typingsJapgolly.jupyterlabObservables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.libObservablejsonMod.IObservableJSON.IChangedArgs
import typingsJapgolly.jupyterlabObservables.libObservablejsonMod.ObservableJSON.IOptions
import typingsJapgolly.jupyterlabObservables.libObservablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.libObservablemapMod.ObservableMap
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import typingsJapgolly.luminoCoreutils.typesJsonMod.PartialJSONObject
import typingsJapgolly.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typingsJapgolly.luminoMessaging.mod.Message
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObservablejsonMod {
  
  @JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
  @js.native
  /**
    * Construct a new observable JSON object.
    */
  open class ObservableJSON () extends ObservableMap[ReadonlyPartialJSONValue] {
    def this(options: IOptions) = this()
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): PartialJSONObject = js.native
  }
  object ObservableJSON {
    
    /**
      * An observable JSON change message.
      */
    @JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON.ChangeMessage")
    @js.native
    open class ChangeMessage protected () extends Message {
      /**
        * Create a new metadata changed message.
        */
      def this(`type`: String, args: IChangedArgs) = this()
      
      /**
        * The arguments of the change.
        */
      val args: IChangedArgs = js.native
    }
    
    /**
      * The options use to initialize an observable JSON object.
      */
    trait IOptions extends StObject {
      
      /**
        * The optional initial value for the object.
        */
      var values: js.UndefOr[JSONObject] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setValues(value: JSONObject): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      }
    }
  }
  
  trait IObservableJSON
    extends StObject
       with IObservableMap[js.UndefOr[ReadonlyPartialJSONValue]] {
    
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): PartialJSONObject
  }
  object IObservableJSON {
    
    inline def apply(
      changed: ISignal[
          IObservableJSON, 
          typingsJapgolly.jupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs[js.UndefOr[ReadonlyPartialJSONValue]]
        ],
      clear: Callback,
      delete: String => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      dispose: Callback,
      get: String => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      has: String => Boolean,
      isDisposed: Boolean,
      keys: CallbackTo[js.Array[String]],
      set: (String, js.UndefOr[ReadonlyPartialJSONValue]) => js.UndefOr[js.UndefOr[ReadonlyPartialJSONValue]],
      size: Double,
      toJSON: CallbackTo[PartialJSONObject],
      values: CallbackTo[js.Array[js.UndefOr[ReadonlyPartialJSONValue]]]
    ): IObservableJSON = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], clear = clear.toJsFn, delete = js.Any.fromFunction1(delete), dispose = dispose.toJsFn, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], keys = keys.toJsFn, set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, values = values.toJsFn)
      __obj.updateDynamic("type")("Map")
      __obj.asInstanceOf[IObservableJSON]
    }
    
    /**
      * A type alias for observable JSON changed args.
      */
    type IChangedArgs = typingsJapgolly.jupyterlabObservables.libObservablemapMod.IObservableMap.IChangedArgs[ReadonlyPartialJSONValue]
    
    extension [Self <: IObservableJSON](x: Self) {
      
      inline def setToJSON(value: CallbackTo[PartialJSONObject]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
}
