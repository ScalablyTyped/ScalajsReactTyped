package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnlyRecordSourceProxy extends StObject {
  
  def get(dataID: DataID): js.UndefOr[ReadOnlyRecordProxy | Null]
  
  def getRoot(): ReadOnlyRecordProxy
}
object ReadOnlyRecordSourceProxy {
  
  inline def apply(get: DataID => js.UndefOr[ReadOnlyRecordProxy | Null], getRoot: CallbackTo[ReadOnlyRecordProxy]): ReadOnlyRecordSourceProxy = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getRoot = getRoot.toJsFn)
    __obj.asInstanceOf[ReadOnlyRecordSourceProxy]
  }
  
  extension [Self <: ReadOnlyRecordSourceProxy](x: Self) {
    
    inline def setGet(value: DataID => js.UndefOr[ReadOnlyRecordProxy | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetRoot(value: CallbackTo[ReadOnlyRecordProxy]): Self = StObject.set(x, "getRoot", value.toJsFn)
  }
}
