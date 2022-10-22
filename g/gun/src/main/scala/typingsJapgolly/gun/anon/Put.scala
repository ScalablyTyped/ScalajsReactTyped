package typingsJapgolly.gun.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.gun.mod.Gun.DisallowArray
import typingsJapgolly.gun.mod.Gun.Saveable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Put[DataType] extends StObject {
  
  def put(data: DisallowArray[Saveable[DataType]]): Unit
}
object Put {
  
  inline def apply[DataType](put: DisallowArray[Saveable[DataType]] => Callback): Put[DataType] = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction1((t0: DisallowArray[Saveable[DataType]]) => put(t0).runNow()))
    __obj.asInstanceOf[Put[DataType]]
  }
  
  extension [Self <: Put[?], DataType](x: Self & Put[DataType]) {
    
    inline def setPut(value: DisallowArray[Saveable[DataType]] => Callback): Self = StObject.set(x, "put", js.Any.fromFunction1((t0: DisallowArray[Saveable[DataType]]) => value(t0).runNow()))
  }
}
