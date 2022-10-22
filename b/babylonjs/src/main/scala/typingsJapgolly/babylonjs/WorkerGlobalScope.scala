package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerGlobalScope extends StObject {
  
  def importScripts(args: String*): Unit
}
object WorkerGlobalScope {
  
  inline def apply(importScripts: /* repeated */ String => Callback): WorkerGlobalScope = {
    val __obj = js.Dynamic.literal(importScripts = js.Any.fromFunction1((t0: /* repeated */ String) => importScripts(t0).runNow()))
    __obj.asInstanceOf[WorkerGlobalScope]
  }
  
  extension [Self <: WorkerGlobalScope](x: Self) {
    
    inline def setImportScripts(value: /* repeated */ String => Callback): Self = StObject.set(x, "importScripts", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
  }
}
