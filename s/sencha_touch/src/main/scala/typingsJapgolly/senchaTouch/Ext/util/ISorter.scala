package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISorter
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of id
    * @returns Mixed
    */
  var getId: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of property
    * @returns String
    */
  var getProperty: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of root
    * @returns String
    */
  var getRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of sorterFn
    * @returns Function
    */
  var getSorterFn: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of transform
    * @returns Function
    */
  var getTransform: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Mixed) */
  var id: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of id
    * @param id Mixed The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of property
    * @param property String The new value.
    */
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of root
    * @param root String The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of sorterFn
    * @param sorterFn Function The new value.
    */
  var setSorterFn: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of transform
    * @param transform Function The new value.
    */
  var setTransform: js.UndefOr[js.Function1[/* transform */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[Any] = js.undefined
  
  /** [Method] Toggles the direction of this Sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var transform: js.UndefOr[Any] = js.undefined
}
object ISorter {
  
  inline def apply(): ISorter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISorter]
  }
  
  extension [Self <: ISorter](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setGetDirection(value: CallbackTo[String]): Self = StObject.set(x, "getDirection", value.toJsFn)
    
    inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setGetProperty(value: CallbackTo[String]): Self = StObject.set(x, "getProperty", value.toJsFn)
    
    inline def setGetPropertyUndefined: Self = StObject.set(x, "getProperty", js.undefined)
    
    inline def setGetRoot(value: CallbackTo[String]): Self = StObject.set(x, "getRoot", value.toJsFn)
    
    inline def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    
    inline def setGetSorterFn(value: CallbackTo[Any]): Self = StObject.set(x, "getSorterFn", value.toJsFn)
    
    inline def setGetSorterFnUndefined: Self = StObject.set(x, "getSorterFn", js.undefined)
    
    inline def setGetTransform(value: CallbackTo[Any]): Self = StObject.set(x, "getTransform", value.toJsFn)
    
    inline def setGetTransformUndefined: Self = StObject.set(x, "getTransform", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDirection", js.Any.fromFunction1((t0: /* direction */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    inline def setSetId(value: /* id */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setId", js.Any.fromFunction1((t0: /* id */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    
    inline def setSetProperty(value: /* property */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction1((t0: /* property */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPropertyUndefined: Self = StObject.set(x, "setProperty", js.undefined)
    
    inline def setSetRoot(value: /* root */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setRoot", js.Any.fromFunction1((t0: /* root */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
    
    inline def setSetSorterFn(value: /* sorterFn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSorterFn", js.Any.fromFunction1((t0: /* sorterFn */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetSorterFnUndefined: Self = StObject.set(x, "setSorterFn", js.undefined)
    
    inline def setSetTransform(value: /* transform */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTransform", js.Any.fromFunction1((t0: /* transform */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetTransformUndefined: Self = StObject.set(x, "setTransform", js.undefined)
    
    inline def setSorterFn(value: Any): Self = StObject.set(x, "sorterFn", value.asInstanceOf[js.Any])
    
    inline def setSorterFnUndefined: Self = StObject.set(x, "sorterFn", js.undefined)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
