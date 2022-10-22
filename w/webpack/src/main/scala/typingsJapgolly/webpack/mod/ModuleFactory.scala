package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFactory extends StObject {
  
  def create(
    data: ModuleFactoryCreateData,
    callback: js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]
  ): Unit
}
object ModuleFactory {
  
  inline def apply(
    create: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Callback
  ): ModuleFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2((t0: ModuleFactoryCreateData, t1: js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => (create(t0, t1)).runNow()))
    __obj.asInstanceOf[ModuleFactory]
  }
  
  extension [Self <: ModuleFactory](x: Self) {
    
    inline def setCreate(
      value: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Callback
    ): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: ModuleFactoryCreateData, t1: js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => (value(t0, t1)).runNow()))
  }
}
