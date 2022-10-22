package typingsJapgolly.jestWorker.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Jest farm (publicly called "Worker") is a class that allows you to queue
  * methods across multiple child processes, in order to parallelize work. This
  * is done by providing an absolute path to a module that will be loaded on each
  * of the child processes, and bridged to the main process.
  *
  * Bridged methods are specified by using the "exposedMethods" property of the
  * "options" object. This is an array of strings, where each of them corresponds
  * to the exported name in the loaded module.
  *
  * You can also control the amount of workers by using the "numWorkers" property
  * of the "options" object, and the settings passed to fork the process through
  * the "forkOptions" property. The amount of workers defaults to the amount of
  * CPUS minus one.
  *
  * Queueing calls can be done in two ways:
  *   - Standard method: calls will be redirected to the first available worker,
  *     so they will get executed as soon as they can.
  *
  *   - Sticky method: if a "computeWorkerKey" method is provided within the
  *     config, the resulting string of this method will be used as a key.
  *     Every time this key is returned, it is guaranteed that your job will be
  *     processed by the same worker. This is specially useful if your workers
  *     are caching results.
  */
trait Worker2 extends StObject {
  
  /* private */ var _bindExposedWorkerMethods: Any
  
  /* private */ var _callFunctionWithArgs: Any
  
  /* private */ var _ending: Any
  
  /* private */ val _farm: Any
  
  /* private */ val _options: Any
  
  /* private */ val _workerPool: Any
  
  def end(): js.Promise[PoolExitResult]
  
  def getStderr(): ReadableStream
  
  def getStdout(): ReadableStream
}
object Worker2 {
  
  inline def apply(
    _bindExposedWorkerMethods: Any,
    _callFunctionWithArgs: Any,
    _ending: Any,
    _farm: Any,
    _options: Any,
    _workerPool: Any,
    end: CallbackTo[js.Promise[PoolExitResult]],
    getStderr: CallbackTo[ReadableStream],
    getStdout: CallbackTo[ReadableStream]
  ): Worker2 = {
    val __obj = js.Dynamic.literal(_bindExposedWorkerMethods = _bindExposedWorkerMethods.asInstanceOf[js.Any], _callFunctionWithArgs = _callFunctionWithArgs.asInstanceOf[js.Any], _ending = _ending.asInstanceOf[js.Any], _farm = _farm.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _workerPool = _workerPool.asInstanceOf[js.Any], end = end.toJsFn, getStderr = getStderr.toJsFn, getStdout = getStdout.toJsFn)
    __obj.asInstanceOf[Worker2]
  }
  
  extension [Self <: Worker2](x: Self) {
    
    inline def setEnd(value: CallbackTo[js.Promise[PoolExitResult]]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setGetStderr(value: CallbackTo[ReadableStream]): Self = StObject.set(x, "getStderr", value.toJsFn)
    
    inline def setGetStdout(value: CallbackTo[ReadableStream]): Self = StObject.set(x, "getStdout", value.toJsFn)
    
    inline def set_bindExposedWorkerMethods(value: Any): Self = StObject.set(x, "_bindExposedWorkerMethods", value.asInstanceOf[js.Any])
    
    inline def set_callFunctionWithArgs(value: Any): Self = StObject.set(x, "_callFunctionWithArgs", value.asInstanceOf[js.Any])
    
    inline def set_ending(value: Any): Self = StObject.set(x, "_ending", value.asInstanceOf[js.Any])
    
    inline def set_farm(value: Any): Self = StObject.set(x, "_farm", value.asInstanceOf[js.Any])
    
    inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_workerPool(value: Any): Self = StObject.set(x, "_workerPool", value.asInstanceOf[js.Any])
  }
}
