package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModalService extends StObject {
  
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[Any]
  
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService
}
object IModalService {
  
  inline def apply(getPromiseChain: CallbackTo[IPromise[Any]], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = getPromiseChain.toJsFn, open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
  
  extension [Self <: IModalService](x: Self) {
    
    inline def setGetPromiseChain(value: CallbackTo[IPromise[Any]]): Self = StObject.set(x, "getPromiseChain", value.toJsFn)
    
    inline def setOpen(value: IModalSettings => IModalInstanceService): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
