package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeReanimated.anon.Now
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NestedObjectValues
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedMutableValueMod.default
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2JsReanimatedCommonTypesMod {
  
  trait JSReanimated extends StObject {
    
    var _frames: js.Array[js.Function1[/* timestamp */ Timestamp, Unit]]
    
    var _mapperRegistry: MapperRegistry[Any]
    
    def _onRender(timestampMs: Double): Unit
    
    var _renderRequested: Boolean
    
    var _valueSetter: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    def enableLayoutAnimations(): Unit
    
    def getTimestamp(): Double
    
    def installCoreFunctions(valueSetter: js.Function1[/* value */ Any, Unit]): Unit
    
    def makeMutable[T](value: T): default[T]
    
    def makeRemote[T](`object`: Record[String, Any]): T
    
    def makeShareable[T](value: T): T
    
    def maybeRequestRender(): Unit
    
    def pushFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit
    
    def registerEventHandler[T](_underscore: String, __ : js.Function1[/* event */ T, Unit]): String
    
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[NestedObjectValues[default[Any]]],
      outputs: js.Array[NestedObjectValues[default[Any]]]
    ): Double
    
    def stopMapper(mapperId: Double): Unit
    
    var timeProvider: Now
    
    def unregisterEventHandler(_underscore: String): Unit
  }
  object JSReanimated {
    
    inline def apply(
      _frames: js.Array[js.Function1[/* timestamp */ Timestamp, Unit]],
      _mapperRegistry: MapperRegistry[Any],
      _onRender: Double => Callback,
      _renderRequested: Boolean,
      enableLayoutAnimations: Callback,
      getTimestamp: CallbackTo[Double],
      installCoreFunctions: js.Function1[/* value */ Any, Unit] => Callback,
      makeMutable: Any => default[Any],
      makeRemote: Record[String, Any] => Any,
      makeShareable: Any => Any,
      maybeRequestRender: Callback,
      pushFrame: js.Function1[/* timestamp */ Timestamp, Unit] => Callback,
      registerEventHandler: (String, js.Function1[Any, Unit]) => String,
      startMapper: (js.Function0[Unit], js.Array[NestedObjectValues[default[Any]]], js.Array[NestedObjectValues[default[Any]]]) => Double,
      stopMapper: Double => Callback,
      timeProvider: Now,
      unregisterEventHandler: String => Callback
    ): JSReanimated = {
      val __obj = js.Dynamic.literal(_frames = _frames.asInstanceOf[js.Any], _mapperRegistry = _mapperRegistry.asInstanceOf[js.Any], _onRender = js.Any.fromFunction1((t0: Double) => _onRender(t0).runNow()), _renderRequested = _renderRequested.asInstanceOf[js.Any], enableLayoutAnimations = enableLayoutAnimations.toJsFn, getTimestamp = getTimestamp.toJsFn, installCoreFunctions = js.Any.fromFunction1((t0: js.Function1[/* value */ Any, Unit]) => installCoreFunctions(t0).runNow()), makeMutable = js.Any.fromFunction1(makeMutable), makeRemote = js.Any.fromFunction1(makeRemote), makeShareable = js.Any.fromFunction1(makeShareable), maybeRequestRender = maybeRequestRender.toJsFn, pushFrame = js.Any.fromFunction1((t0: js.Function1[/* timestamp */ Timestamp, Unit]) => pushFrame(t0).runNow()), registerEventHandler = js.Any.fromFunction2(registerEventHandler), startMapper = js.Any.fromFunction3(startMapper), stopMapper = js.Any.fromFunction1((t0: Double) => stopMapper(t0).runNow()), timeProvider = timeProvider.asInstanceOf[js.Any], unregisterEventHandler = js.Any.fromFunction1((t0: String) => unregisterEventHandler(t0).runNow()))
      __obj.asInstanceOf[JSReanimated]
    }
    
    extension [Self <: JSReanimated](x: Self) {
      
      inline def setEnableLayoutAnimations(value: Callback): Self = StObject.set(x, "enableLayoutAnimations", value.toJsFn)
      
      inline def setGetTimestamp(value: CallbackTo[Double]): Self = StObject.set(x, "getTimestamp", value.toJsFn)
      
      inline def setInstallCoreFunctions(value: js.Function1[/* value */ Any, Unit] => Callback): Self = StObject.set(x, "installCoreFunctions", js.Any.fromFunction1((t0: js.Function1[/* value */ Any, Unit]) => value(t0).runNow()))
      
      inline def setMakeMutable(value: Any => default[Any]): Self = StObject.set(x, "makeMutable", js.Any.fromFunction1(value))
      
      inline def setMakeRemote(value: Record[String, Any] => Any): Self = StObject.set(x, "makeRemote", js.Any.fromFunction1(value))
      
      inline def setMakeShareable(value: Any => Any): Self = StObject.set(x, "makeShareable", js.Any.fromFunction1(value))
      
      inline def setMaybeRequestRender(value: Callback): Self = StObject.set(x, "maybeRequestRender", value.toJsFn)
      
      inline def setPushFrame(value: js.Function1[/* timestamp */ Timestamp, Unit] => Callback): Self = StObject.set(x, "pushFrame", js.Any.fromFunction1((t0: js.Function1[/* timestamp */ Timestamp, Unit]) => value(t0).runNow()))
      
      inline def setRegisterEventHandler(value: (String, js.Function1[Any, Unit]) => String): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2(value))
      
      inline def setStartMapper(
        value: (js.Function0[Unit], js.Array[NestedObjectValues[default[Any]]], js.Array[NestedObjectValues[default[Any]]]) => Double
      ): Self = StObject.set(x, "startMapper", js.Any.fromFunction3(value))
      
      inline def setStopMapper(value: Double => Callback): Self = StObject.set(x, "stopMapper", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTimeProvider(value: Now): Self = StObject.set(x, "timeProvider", value.asInstanceOf[js.Any])
      
      inline def setUnregisterEventHandler(value: String => Callback): Self = StObject.set(x, "unregisterEventHandler", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def set_frames(value: js.Array[js.Function1[/* timestamp */ Timestamp, Unit]]): Self = StObject.set(x, "_frames", value.asInstanceOf[js.Any])
      
      inline def set_framesVarargs(value: (js.Function1[/* timestamp */ Timestamp, Unit])*): Self = StObject.set(x, "_frames", js.Array(value*))
      
      inline def set_mapperRegistry(value: MapperRegistry[Any]): Self = StObject.set(x, "_mapperRegistry", value.asInstanceOf[js.Any])
      
      inline def set_onRender(value: Double => Callback): Self = StObject.set(x, "_onRender", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def set_renderRequested(value: Boolean): Self = StObject.set(x, "_renderRequested", value.asInstanceOf[js.Any])
      
      inline def set_valueSetter(value: /* value */ Any => Callback): Self = StObject.set(x, "_valueSetter", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
      
      inline def set_valueSetterUndefined: Self = StObject.set(x, "_valueSetter", js.undefined)
    }
  }
  
  trait Mapper[T] extends StObject {
    
    var MAPPER_ID: js.UndefOr[Double] = js.undefined
    
    var dirty: Boolean
    
    def execute(): Unit
    
    def extractMutablesFromArray[T](array: NestedObjectValues[default[T]]): js.Array[default[T]]
    
    var id: Double
    
    var inputs: js.Array[default[T]]
    
    def mapper(): Unit
    
    var outputs: js.Array[default[T]]
  }
  object Mapper {
    
    inline def apply[T](
      dirty: Boolean,
      execute: Callback,
      extractMutablesFromArray: NestedObjectValues[default[Any]] => js.Array[default[Any]],
      id: Double,
      inputs: js.Array[default[T]],
      mapper: Callback,
      outputs: js.Array[default[T]]
    ): Mapper[T] = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], execute = execute.toJsFn, extractMutablesFromArray = js.Any.fromFunction1(extractMutablesFromArray), id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], mapper = mapper.toJsFn, outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapper[T]]
    }
    
    extension [Self <: Mapper[?], T](x: Self & Mapper[T]) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setExtractMutablesFromArray(value: NestedObjectValues[default[Any]] => js.Array[default[Any]]): Self = StObject.set(x, "extractMutablesFromArray", js.Any.fromFunction1(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[default[T]]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: default[T]*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setMAPPER_ID(value: Double): Self = StObject.set(x, "MAPPER_ID", value.asInstanceOf[js.Any])
      
      inline def setMAPPER_IDUndefined: Self = StObject.set(x, "MAPPER_ID", js.undefined)
      
      inline def setMapper(value: Callback): Self = StObject.set(x, "mapper", value.toJsFn)
      
      inline def setOutputs(value: js.Array[default[T]]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: default[T]*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
  
  trait MapperRegistry[T] extends StObject {
    
    var _module: JSReanimated
    
    def execute(): Unit
    
    var mappers: Map[Double, Mapper[T]]
    
    var sortedMappers: js.Array[Mapper[T]]
    
    def startMapper(mapper: Mapper[T]): Double
    
    def stopMapper(id: Double): Unit
    
    def updateOrder(): Unit
    
    var updatedSinceLastExecute: Boolean
  }
  object MapperRegistry {
    
    inline def apply[T](
      _module: JSReanimated,
      execute: Callback,
      mappers: Map[Double, Mapper[T]],
      sortedMappers: js.Array[Mapper[T]],
      startMapper: Mapper[T] => Double,
      stopMapper: Double => Callback,
      updateOrder: Callback,
      updatedSinceLastExecute: Boolean
    ): MapperRegistry[T] = {
      val __obj = js.Dynamic.literal(_module = _module.asInstanceOf[js.Any], execute = execute.toJsFn, mappers = mappers.asInstanceOf[js.Any], sortedMappers = sortedMappers.asInstanceOf[js.Any], startMapper = js.Any.fromFunction1(startMapper), stopMapper = js.Any.fromFunction1((t0: Double) => stopMapper(t0).runNow()), updateOrder = updateOrder.toJsFn, updatedSinceLastExecute = updatedSinceLastExecute.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapperRegistry[T]]
    }
    
    extension [Self <: MapperRegistry[?], T](x: Self & MapperRegistry[T]) {
      
      inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setMappers(value: Map[Double, Mapper[T]]): Self = StObject.set(x, "mappers", value.asInstanceOf[js.Any])
      
      inline def setSortedMappers(value: js.Array[Mapper[T]]): Self = StObject.set(x, "sortedMappers", value.asInstanceOf[js.Any])
      
      inline def setSortedMappersVarargs(value: Mapper[T]*): Self = StObject.set(x, "sortedMappers", js.Array(value*))
      
      inline def setStartMapper(value: Mapper[T] => Double): Self = StObject.set(x, "startMapper", js.Any.fromFunction1(value))
      
      inline def setStopMapper(value: Double => Callback): Self = StObject.set(x, "stopMapper", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdateOrder(value: Callback): Self = StObject.set(x, "updateOrder", value.toJsFn)
      
      inline def setUpdatedSinceLastExecute(value: Boolean): Self = StObject.set(x, "updatedSinceLastExecute", value.asInstanceOf[js.Any])
      
      inline def set_module(value: JSReanimated): Self = StObject.set(x, "_module", value.asInstanceOf[js.Any])
    }
  }
}
