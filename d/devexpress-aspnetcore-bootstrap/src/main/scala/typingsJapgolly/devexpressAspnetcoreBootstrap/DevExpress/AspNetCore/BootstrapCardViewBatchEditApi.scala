package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapCardViewBatchEditApi extends StObject {
  
  def addNewCard(): Unit
  
  def deleteCard(visibleIndex: Double): Unit
  
  def deleteCardByKey(key: Any): Unit
  
  def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double]
  
  def getDeletedCardIndices(): js.Array[Double]
  
  def getInsertedCardIndices(): js.Array[Double]
  
  /* protected */ val instance: Any
  
  def isDeletedCard(visibleIndex: Double): Boolean
  
  def isNewCard(visibleIndex: Double): Boolean
  
  def recoverCard(visibleIndex: Double): Unit
  
  def recoverCardByKey(key: Any): Unit
  
  def validateCard(visibleIndex: Double): Boolean
  
  def validateCards(validateOnlyModified: Boolean): Boolean
}
object BootstrapCardViewBatchEditApi {
  
  inline def apply(
    addNewCard: Callback,
    deleteCard: Double => Callback,
    deleteCardByKey: Any => Callback,
    getCardVisibleIndices: Boolean => js.Array[Double],
    getDeletedCardIndices: CallbackTo[js.Array[Double]],
    getInsertedCardIndices: CallbackTo[js.Array[Double]],
    instance: Any,
    isDeletedCard: Double => Boolean,
    isNewCard: Double => Boolean,
    recoverCard: Double => Callback,
    recoverCardByKey: Any => Callback,
    validateCard: Double => Boolean,
    validateCards: Boolean => Boolean
  ): BootstrapCardViewBatchEditApi = {
    val __obj = js.Dynamic.literal(addNewCard = addNewCard.toJsFn, deleteCard = js.Any.fromFunction1((t0: Double) => deleteCard(t0).runNow()), deleteCardByKey = js.Any.fromFunction1((t0: Any) => deleteCardByKey(t0).runNow()), getCardVisibleIndices = js.Any.fromFunction1(getCardVisibleIndices), getDeletedCardIndices = getDeletedCardIndices.toJsFn, getInsertedCardIndices = getInsertedCardIndices.toJsFn, instance = instance.asInstanceOf[js.Any], isDeletedCard = js.Any.fromFunction1(isDeletedCard), isNewCard = js.Any.fromFunction1(isNewCard), recoverCard = js.Any.fromFunction1((t0: Double) => recoverCard(t0).runNow()), recoverCardByKey = js.Any.fromFunction1((t0: Any) => recoverCardByKey(t0).runNow()), validateCard = js.Any.fromFunction1(validateCard), validateCards = js.Any.fromFunction1(validateCards))
    __obj.asInstanceOf[BootstrapCardViewBatchEditApi]
  }
  
  extension [Self <: BootstrapCardViewBatchEditApi](x: Self) {
    
    inline def setAddNewCard(value: Callback): Self = StObject.set(x, "addNewCard", value.toJsFn)
    
    inline def setDeleteCard(value: Double => Callback): Self = StObject.set(x, "deleteCard", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDeleteCardByKey(value: Any => Callback): Self = StObject.set(x, "deleteCardByKey", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGetCardVisibleIndices(value: Boolean => js.Array[Double]): Self = StObject.set(x, "getCardVisibleIndices", js.Any.fromFunction1(value))
    
    inline def setGetDeletedCardIndices(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getDeletedCardIndices", value.toJsFn)
    
    inline def setGetInsertedCardIndices(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getInsertedCardIndices", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIsDeletedCard(value: Double => Boolean): Self = StObject.set(x, "isDeletedCard", js.Any.fromFunction1(value))
    
    inline def setIsNewCard(value: Double => Boolean): Self = StObject.set(x, "isNewCard", js.Any.fromFunction1(value))
    
    inline def setRecoverCard(value: Double => Callback): Self = StObject.set(x, "recoverCard", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRecoverCardByKey(value: Any => Callback): Self = StObject.set(x, "recoverCardByKey", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setValidateCard(value: Double => Boolean): Self = StObject.set(x, "validateCard", js.Any.fromFunction1(value))
    
    inline def setValidateCards(value: Boolean => Boolean): Self = StObject.set(x, "validateCards", js.Any.fromFunction1(value))
  }
}
